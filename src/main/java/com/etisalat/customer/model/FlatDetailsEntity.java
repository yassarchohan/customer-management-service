package com.etisalat.customer.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@Entity
@Table(name = "FLAT_DETAILS")
public class FlatDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FLAT_DETAILS_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "NETWORK_DETAILS_ID")
    private NetworkDetailsEntity networkDetailsEntity;

    @Column(name = "FLAT_NO")
    private String flatNo;

    @Column(name = "ONT_REQUIRED_FLAG")
    private String ontRequiredFlag;

    @Column(name = "ONT_TYPE")
    private String ontType;

    @Column(name = "ONT_SERIAL_NO")
    private String ontSerialNo;

    @Column(name = "MDF_CODE")
    private String mdfCode;
}
