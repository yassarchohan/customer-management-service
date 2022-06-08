package com.etisalat.customer.controller;

import com.etisalat.customer.dto.common.RequestHandler;
import com.etisalat.customer.dto.common.ResponseGenericDTO;
import com.etisalat.customer.dto.common.ResponseHandler;
import com.etisalat.customer.dto.request.CustomerDetailsReqDto;
import com.etisalat.customer.dto.response.CustomerDetailsDto;
import com.etisalat.customer.service.CustomerMgmtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.etisalat.customer.constant.EcareContants.CUSTOMER_CONTROLLER_URL;

@RestController
@RequestMapping(CUSTOMER_CONTROLLER_URL)
public class CustomerController extends ParentController {

    @Autowired
    private CustomerMgmtService customerMgmtService;

    @PostMapping("/details")
    public ResponseGenericDTO<?> getCustomerDetails(@RequestBody String eid) {
        CustomerDetailsDto customerDetailsDto = customerMgmtService.getCustomerDetails(eid);
        return ResponseHandler.responseSuccessful(customerDetailsDto);
    }

    @PostMapping("/add-customer")
    public ResponseGenericDTO<?> addCustomerDetails(@RequestBody CustomerDetailsReqDto reqDto) {
        String response = customerMgmtService.addCustomerDetails(reqDto);
        return ResponseHandler.responseSuccessful(response);
    }
}
