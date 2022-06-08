package com.etisalat.customer.repository;

import com.etisalat.customer.model.TransactionLoggerBackEndModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionLoggerBackEndModelRepository extends JpaRepository<TransactionLoggerBackEndModel, String> {
}
