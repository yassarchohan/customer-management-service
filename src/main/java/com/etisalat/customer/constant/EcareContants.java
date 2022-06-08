package com.etisalat.customer.constant;

public class EcareContants {
    private static final String BASE_URL = "/api";
    private static final String BASE_ECARE_URL = BASE_URL + "/ecare";
    public static final String CUSTOMER_CONTROLLER_URL = BASE_ECARE_URL + "/customer";

    public static final String COMMON_ERROR_RESPONSE = "Something Went Wrong";
    public static final String NETWORK_RESOURCE_MGMT_CONFIG_KEY = "network_resource_mgmt_config_key";
    public static final String NETWORK_RESOURCE_MGMT_SYSTEM_NAME_CONFIG_KEY = "network_resource_mgmt_system_name_config_key";
    public static final String RESPONSE_SUCCESS_STATUS = "SUCCESS";
    public static final String CHANNEL_TIBCO = "TIBCO";
    public static final String CHANNEL_CUSTOMER_INQUIERY = "Customer Inquiry";

    public static final String SERVICE_OPERATION_RETRIEVE_CUSTOMER = "Retrieve Customer";
    public static final String SERVICE_OPERATION_NETWORK_AVAILABLITY = "opGetNetworkAvailability";

    public static final String DIGITAL_APP_WS_SUCCESS_RESPONSE_CODE = "0000000";
    public static final String DIGITAL_APP_WS_BACKEND_FAILURE_CODE = "0000001";
    public static final String DIGITAL_APP_BILL_LIMIT_FAILURE_CODE = "0009999";
    public static final String DIGITAL_APP_WS_AUTHENTICATION_FAILED_RESPONSE_CODE = "0001000";
    public static final String DIGITAL_APP_WS_AUTHENTICATION_FAILED_RETRY_RESPONSE_CODE = "0001001";
    public static final String VALIDATION_ERROR_USAGE_LIMIT_COUNT_EXCEEDED = "0101101";

    public static final String DIGITAL_APP_WS_RUNTIME_EXCEPTION_RESPONSE_CODE = "0001002";
    public static final String DIGITAL_APP_WS_RUNTIME_EXCEPTION_NO_ADDONS_CODE = "0011099";
    public static final String DIGITAL_APP_WS_INVALID_MSISDN_RESPONSE_CODE = "0001003";
    public static final String DIGITAL_APP_WS_BAD_REQUEST_RESPONSE_CODE = "0001004";
    public static final String DIGITAL_APP_WS_MISSING_MSISDN_RESPONSE_CODE = "0001005";
    public static final String DIGITAL_APP_WS_MISSING_LANG_RESPONSE_CODE = "0001006";
    public static final String DIGITAL_APP_WS_INVALID_PATH_RESPONSE_CODE = "0001007";
    public static final String DIGITAL_APP_WS_MISSING_SESSION_TOKEN_RESPONSE_CODE = "0001008";
    public static final String DIGITAL_APP_WS_INVALID_RESOURCE_RESPONSE_CODE = "0001009";

}
