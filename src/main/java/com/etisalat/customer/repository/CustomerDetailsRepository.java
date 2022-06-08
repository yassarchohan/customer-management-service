package com.etisalat.customer.repository;

import com.etisalat.customer.model.CustomerDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDetailsRepository extends JpaRepository<CustomerDetail, String> {

    CustomerDetail findByEid(String eid);
}
