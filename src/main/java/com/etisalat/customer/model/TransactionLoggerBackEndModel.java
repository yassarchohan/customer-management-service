package com.etisalat.customer.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "TRANSACTION_BACKEND_LOGGER")
@NoArgsConstructor
@EqualsAndHashCode
public class TransactionLoggerBackEndModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "SERVICE_ORDER")
	private Integer serviceOrder;

	@Column(name = "TRANSACTION_ID")
	private String transactionId;

	@Column(name = "SERVICE_INTERFACE")
	private String serviceInterface;

	@Column(name = "SERVICE_OPERATION")
	private String serviceOperation;

	@Column(name = "RESPONSE_CODE")
	private String responseCode;

	@Column(name = "RESPONSE_DESCRIPTION")
	private String responseDescription;

	@Column(name = "CHANNEL")
	private String channel;

	@Column(name = "REQUEST")
	private String request;

	@Column(name = "RESPONSE")
	private String response;

	@Column(name = "REQUEST_TIME_IN")
	private Date requestTimeIn;

	@Column(name = "RESPONSE_TIME_OUT")
	private Date responseTimeOut;
}