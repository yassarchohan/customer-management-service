package com.etisalat.customer.dto.request;

import lombok.Data;

@Data
public class CustomerDetailsReqDto {
    private Integer id;
    private String name;
    private String mobileNumber;
    private String address;
    private String eid;
}
