package com.hoona.zaid.uuidms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UuidController {

    private final UuidStoreService storeService;

    @Autowired
    public UuidController(UuidStoreService storeService) {
        this.storeService = storeService;
    }


    @RequestMapping("uuid")
    public String getUUID(@RequestParam(defaultValue = "") String name) {
        if (name.length() == 0) {
            return UUID.randomUUID().toString();
        } else {
            return storeService.getUuidFor(name);
        }
    }
}
