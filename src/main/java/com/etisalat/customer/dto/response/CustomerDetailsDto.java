package com.etisalat.customer.dto.response;

import lombok.Data;

@Data
public class CustomerDetailsDto {
    private Integer id;
    private String name;
    private String mobileNumber;
    private String address;
    private String eid;
}
