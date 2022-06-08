package com.etisalat.customer.service;

import com.etisalat.customer.dto.request.CustomerDetailsReqDto;
import com.etisalat.customer.dto.response.CustomerDetailsDto;
import com.etisalat.customer.mapper.CustomerDetailsMapper;
import com.etisalat.customer.model.CustomerDetail;
import com.etisalat.customer.repository.CustomerDetailsRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerMgmtService {

    @Autowired
    private CustomerDetailsRepository customerDetailsRepository;

    @Autowired
    private CustomerDetailsMapper customerDetailsMapper;

    public CustomerDetailsDto getCustomerDetails(String eid) {
        CustomerDetail customerDetails = customerDetailsRepository.findByEid(eid);
        return customerDetailsMapper.convertToDto(customerDetails);
    }

    public String addCustomerDetails(CustomerDetailsReqDto customerDetailsReqDto) {
        CustomerDetail customerDetail = customerDetailsMapper.convertToEntity(customerDetailsReqDto);
        if (customerDetailsRepository.findByEid(customerDetail.getEid()) == null) {
            customerDetailsRepository.save(customerDetail);
        }
        return "Customer Details saved successfully";
    }
}
