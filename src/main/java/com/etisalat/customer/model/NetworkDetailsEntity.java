package com.etisalat.customer.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@Entity
@Table(name = "NETWORK_DETAILS")
public class NetworkDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NETWORK_DETAILS_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID")
    private AccountEntity accountEntityId;

    @Column(name = "NETWORK_TYPE")
    private String networkType;

    @Column(name = "REGION_CODE")
    private String regionCode;

    @Column(name = "EMIRATE")
    private String emirate;

    @Column(name = "BUILDING_NUMBER")
    private String buildingNumber;

    @Column(name = "BUILDING_NAME")
    private String buildingName;

    @Column(name = "LOCATION_STATUS")
    private String locationStatus;

    @Column(name = "INSTALLATION_ADDRESS")
    private String installationAddress;

    @Column(name = "FDH_STATUS")
    private String fdhStatus;
}
