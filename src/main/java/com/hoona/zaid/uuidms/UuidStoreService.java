package com.hoona.zaid.uuidms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;
import java.util.UUID;

@Component
public class UuidStoreService {
    private UuidStoreRepository storeRepository;

    @Autowired
    public UuidStoreService(UuidStoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public String getUuidFor(String name) {
        UuidStoreRow row = null;
        row = storeRepository.getDistinctByServiceName(name.toUpperCase());

        if (row == null) {
            row = new UuidStoreRow();
            row.setServiceName(name.toUpperCase());
            row.setSequence(1);
            storeRepository.save(row);
        } else {
            row.setSequence(row.getSequence() + 1);
            storeRepository.save(row);
        }
        return createUuid(row);
    }

    private String createUuid(UuidStoreRow row) {
        return UUID.nameUUIDFromBytes((row.getId() + row.getSequence()).getBytes()).toString();
    }
}
