package com.hoona.zaid.uuidms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UuidStoreRepository extends JpaRepository<UuidStoreRow, String> {
    UuidStoreRow getDistinctByServiceName(String serviceName);
}
