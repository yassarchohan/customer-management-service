package com.etisalat.customer.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER_DETAILS")
public class CustomerDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_DETAILS_ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "EID")
    private String eid;
}
