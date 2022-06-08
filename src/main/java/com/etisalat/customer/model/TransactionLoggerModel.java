package com.etisalat.customer.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "TRANSACTION_LOGGER")
@NoArgsConstructor
@EqualsAndHashCode
public class TransactionLoggerModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "MSISDN")
	private String msisdn;

	@Column(name = "TRANSACTION_ID")
	private String transactionId;

	@Column(name = "OPERATION")
	private String operation;

	@Column(name = "SERVICE_NAME")
	private String serviceName;

	@Column(name = "SESSION_TOKEN")
	private String sessionToken;

	@Column(name = "GUEST_SESSION")
	private String guestSession;

	@Column(name = "OS_VERSION")
	private String osVersion;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "CHANNEL")
	private String channel;

	@Column(name = "REQUEST_TIME_IN")
	private Date requestTimeIn;

	@Column(name = "RESPONSE_TIME_OUT")
	private Date responseTimeOut;

	@Column(name = "REQUEST_PAYLOAD")
	private String requestPayLoad;

	@Column(name = "RESPONSE_PAYLOAD")
	private String responsePayLoad;

	@Column(name = "EXCEPTION_STACK_TRACE")
	private String exceptionStackTrace;

	@Column(name = "CUSTOMER_IP")
	private String customerIp;
}