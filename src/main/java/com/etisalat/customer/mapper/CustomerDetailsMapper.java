package com.etisalat.customer.mapper;

import com.etisalat.customer.dto.request.CustomerDetailsReqDto;
import com.etisalat.customer.dto.response.CustomerDetailsDto;
import com.etisalat.customer.model.CustomerDetail;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerDetailsMapper {
    
    CustomerDetailsDto convertToDto(CustomerDetail customerDetail);

    CustomerDetail convertToEntity(CustomerDetailsReqDto customerDetailsReqDto);
}
