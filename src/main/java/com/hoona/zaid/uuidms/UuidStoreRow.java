package com.hoona.zaid.uuidms;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "id_store")
public class UuidStoreRow implements Serializable {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "sequence")
    private int sequence;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}
