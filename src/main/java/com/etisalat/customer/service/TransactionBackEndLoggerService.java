package com.etisalat.customer.service;

import com.etisalat.customer.model.TransactionLoggerBackEndModel;
import com.etisalat.customer.repository.TransactionLoggerBackEndModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TransactionBackEndLoggerService {

    @Autowired
    private TransactionLoggerBackEndModelRepository backEndModelRepository;

    public void recordBackEndTransaction(String transactionId, String channel, String serviceInterface, String serviceOperation, Integer serviceOrder, Date timeIn, Date timeOut, String request, String response, String responseCode, String responseDescription) {
        TransactionLoggerBackEndModel backEndTransaction = new TransactionLoggerBackEndModel();
        backEndTransaction.setTransactionId(transactionId);
        backEndTransaction.setChannel(channel);
        backEndTransaction.setServiceInterface(serviceInterface);
        backEndTransaction.setServiceOperation(serviceOperation);
        backEndTransaction.setServiceOrder(serviceOrder);
        backEndTransaction.setRequestTimeIn(timeIn);
        backEndTransaction.setRequest(request);
        backEndTransaction.setResponseTimeOut(timeOut);
        backEndTransaction.setResponseCode(responseCode);
        backEndTransaction.setResponse(response);
        backEndTransaction.setResponseDescription(responseDescription);
        backEndModelRepository.save(backEndTransaction);
    }
}
