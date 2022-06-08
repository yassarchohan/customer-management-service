package com.etisalat.customer.repository;

import com.etisalat.customer.model.TransactionLoggerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionLoggerRepository extends JpaRepository<TransactionLoggerModel, String> {
}
