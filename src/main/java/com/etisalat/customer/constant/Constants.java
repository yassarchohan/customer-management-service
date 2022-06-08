package com.etisalat.customer.constant;


/**
 * @author Tarique Raheem
 *
 */
public interface Constants
{
	public static final String INVALID_WEB_SERVICE_URL_ERROR_MESSAGE = "INVALID_WEB_SERVICE_URL_ERROR_MESSAGE";
	public static final String INVALID_WEB_SERVICE_URL_ERROR_MESSAGE_AR = "INVALID_WEB_SERVICE_URL_ERROR_MESSAGE_AR";
	public static final String TIBCO_THROTTLING_HTTP_HEADER_KEY = "tibco_throttling_http_header_key";
	public static final String TIBCO_THROTTLING_HTTP_HEADER_VALUE = "tibco_throttling_http_header_value";
	
	public static final String RESOURCE_INVENTORY_MGMT_CUD_END_POINT = "resource_inventory_mgmt_cud_end_point";
	public static final String CUSTOMER_INFORMATION_MGMT_R_END_POINT = "customer_information_mgmt_r_end_point";
	
	public static final String FEATURED_PACKAGE_MINIMUM_SUBSCRIPTION_COUNT_KEY = "featured_package_minimum_subscription_count";
	public static final String FEATURED_PACKAGE_NEW_MAX_RESULT_KEY = "featured_package_new_max_result";
	public static final String FEATURED_PACKAGE_POPULAR_MAX_RESULT_KEY = "featured_package_popular_max_result";
	public static final String FEATURED_NEW_PACKAGES_DAYS_RANGE_KEY = "featured_new_packages_days_range";
	public static final String FEATURED_PACKAGE_FILTER_TRUE_COUNT_KEY = "featured_package_filter_true_count";

	public static final String PAYMENT_POSTING_PAYMENT_MODE_CODE = "payment_posting_payment_mode_code";
	
	public static final String RESPONSETEK_GENERATE_TOKEN_SRVC_ADDRESS_CONFIG_KEY = "responsetek_generate_token_srvc_address";
	public static final String RESPONSETEK_GENERATE_TOKEN_REQ_KEY = "responsetek_generate_token_request";
	public static final String RESPONSETEK_SUBMIT_SURVEY_SRVC_ADDRESS_CONFIG_KEY = "responsetek_submit_survey_srvc_address";
	public static final String RESPONSETEK_SUBMIT_SURVEY_API_KEY = "responsetek_submit_survey_api_key";
	
	public static final String DISPLAY_VAT_AR = "digital_app_resource_ar_display_vat";
	public static final String DISPLAY_VAT_EN = "digital_app_resource_en_display_vat";
	
	
	public static final String GET_BILL_DETAILS_SERVICE_VAT_AR_KEY = "get_bill_details_service_vat_ar"; // language
	
	public static final String GET_BILL_DETAILS_SERVICE_VAT_EN_KEY = "get_bill_details_service_vat_en"; // language = "get_bill_details_service_total_rental_amount_ar"; // language


	/* Digital App specific Error Codes start from here i.e. 0001000 */
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

	public static final String DIGITAL_APP_WS_USER_NOT_FOUND_RESPONSE_CODE = "0001010";
	public static final String DIGITAL_APP_WS_CONTACT_NOT_FOUND_RESPONSE_CODE = "0001011";
	public static final String DIGITAL_APP_WS_INVALID_OTP_RESPONSE_CODE = "0001012";
	public static final String DIGITAL_APP_WS_FAILED_TO_CHANGE_PASSWORD_RESPONSE_CODE = "0001013";
	public static final String DIGITAL_APP_WS_FORGOT_USERNAME_INVALID_USER_RESPONSE_CODE = "0001014";
	public static final String DIGITAL_APP_WS_PASSWORD_CHANGED_RESPONSE_CODE = "0001015";
	public static final String DIGITAL_APP_WS_NO_DATAT_RESPONSE_CODE = "0010000";

	// Do not add codes between 0001015 and 0001030
	public static final String DIGITAL_APP_WS_PAY_FOR_OTHERS_POSTPAID_MAX_LIMIT = "0001031";
	public static final String DIGITAL_APP_WS_SSO_PORTAL_LOGIN_FAILURE_RESPONSE_CODE = "0001032";
	public static final String DIGITAL_APP_WS_FAILED_ENABLE_FINGER_PRINT_RESPONSE_CODE = "0001033";
	public static final String DIGITAL_APP_WS_INVALID_SESSION_TOKEN_RESPONSE_CODE = "0001034";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_SERVICE_DBT_AVAILABLE_FOR_POSTPAID_ACCOUNTS_THAT_ARE_ATLEAST_3_MONTHS_WITH_WITH_ETISALAT = "0001035";
	public static final String DIGITAL_APP_WS_SET_BILL_LIMIT_BILL_LIMIT_NOT_ALLOWED = "0001036";
	public static final String DIGITAL_APP_WS_INVALID_LOGIN_TYPE_RESPONSE_CODE = "0001037";
	public static final String DIGITAL_APP_WS_INVALID_ACCOUNT_TYPE_RESPONSE_CODE = "0001038";
	public static final String DIGITAL_APP_WS_UNABLE_UPDATE_ACCOUNT_PICTURE_RESPONSE_CODE = "0001039";
	public static final String DIGITAL_APP_WS_SSO_PORTAL_LOGIN_FAILED_RESPONSE_CODE = "0001040";
	public static final String RESET_WRONG_PASSWORD_CRITERIA_ERROR_RESPONSE_CODE = "0001041";
	public static final String RESET_PASSWORD_INVALID_PASSWORD_ERROR_RESPONSE_CODE = "0001042";
	public static final String GET_REWARD_POINTS_ACCOUNT_NOT_FOUND_RESPONSE_CODE = "0001043";
	public static final String DIGITAL_APP_WS_CANCEL_SERVICE_ERROR_CODE_SUCCESS = "0001074";
	public static final String DIGITAL_APP_WS_ACCOUNT_INFORMATION_NOT_FOUND_RESPONSE_CODE = "0001044";
	public static final String DIGITAL_APP_WS_TRANSACTION_ID_RESPONSE_CODE = "0001045";
	public static final String DIGITAL_APP_WS_NO_OFFERS_FOUND_RESPONSE_CODE = "0001046";
	public static final String DIGITAL_APP_WS_FAILED_DELETE_NEWS_RESPONSE_CODE = "0001047";
	public static final String DIGITAL_APP_WS_FAILED_UPDATE_NEWS_RESPONSE_CODE = "0001048";
	public static final String DIGITAL_APP_WS_REQUEST_ALREADY_IN_PROGRESS_RESPONSE_CODE = "0001049";
	public static final String DIGITAL_APP_WS_NO_NEWS_FOUND_RESPONSE_CODE = "0001050";
	public static final String DIGITAL_APP_WS_NO_BILL_LIMIT_FOUND_ON_ACCOUNT = "0001051";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_INSUFFICIENT_BALANCE = "0001052";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_SERVICE_NOT_AVAILABLE_FOR_NUM = "0001053";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_SERVICE_AVAILABLE_FOR_ACTIVE_ACC = "0001054";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_SERVICE_ONLY_TRANSFER_TO_ACTIVE_ETISALAT_ACC = "0001055";
	public static final String DIGITAL_APP_WS_INTL_CREDIT_TX_FAILURE_INSUFFICIENT_FUNDS = "0001056";

	public static final String DIGITAL_APP_WS_SET_BILL_LIMIT_NO_MAPPING_FOUND_FOR_DEMAND_ID = "0001057";
	public static final String DIGITAL_APP_WS_SET_BILL_LIMIT_INVALID_ACCCOUNT = "0001058";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_SERVICE_MINIMUM_ALLOWED_AMOUNT_2_AED = "0001059";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_SERVICE_REACHED_MONTHLY_LIMIT = "0001060";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_SERVICE_DISABLED_ON_ACCOUNT = "0001061";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_SERVICE_AMOUNT_EXCEED_LIMIT = "0001062";
	public static final String DIGITAL_APP_WS_SET_BILL_LIMIT_REQUEST_ALREADY_IN_PROCCESS_FOR_ACCOUNT = "0001063";
	public static final String DIGITAL_APP_WS_SET_BILL_LIMIT_ERROR_CODE_REQUEST_ALREADY_IN_PROCCESS_FOR_ACCOUNT = "0001137";
	public static final String DIGITAL_APP_WS_SET_BILL_LIMIT_SUCCESS = "0001064";
	public static final String DIGITAL_APP_WS_CHECK_ELIGIBILITY_SERVICE_SUCCESS_ERROR_CODE = "0001065";
	public static final String DIGITAL_APP_WS_CHECK_ELIGIBILITY_SERVICE_EILIBILITY_FAILED_ERROR_CODE = "0001066";
	public static final String DIGITAL_APP_WS_MIGRATE_SERVICE_PENDING_ORDER_FOUND_ERROR_CODE = "0001067";
	public static final String DIGITAL_APP_WS_UNSUBSCRIBE_ADDON_SERVICE_PENDING_REQUEST_ERROR_CODE = "0001068";
	public static final String DIGITAL_APP_WS_LOYALTY_PAYMENT_FAILURE_ERROR_CODE = "0001069";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_SERVICE_YOUR_BALANCE_IS_NOT_ENOUGH = "0001070";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_DAILY_LIMIT_EXCEEDED = "0001071";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_MONTHLY_LIMIT_EXCEEDED = "0001072";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_ACCOUNT_TEMPORARY_BLOCKED = "0001073";
	// UNUSED 0001074
	public static final String DIGITAL_APP_WS_SUBSCRIBE_ADDON_SERVICE_ERROR_CODE_SUCCESS = "0001075";

	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_EXCEEDED_MAX_TRANSACTION_LIMIT = "0001076";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_MIN_TRANSACTION_LIMIT = "0001077";

	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_SERVICE_NOT_AVAILABLE = "0001078";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_FACING_PROBLEM = "0001079";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_ENTER_VALID_NUMBER = "0001080";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_ENTER_VALID_NUMBER2 = "0001081";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_SENDER_AND_RECIEVER_SAME = "0001082";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_ENTER_VALID_PREPAID_NUMBER = "0001083";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_EXCEEDED_MONTHLY_LIMIT = "0001084";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_NOT_ENOUGH_BALANCE = "0001085";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_ACCOUNT_IS_TOSSED = "0001086";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_SERVICE_NOT_AVAILABLE2 = "0001087";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_RECIPIENT_ACCOUNT_IS_NOT_ACTIVE = "0001088";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_ERROR_CODE_INVALID_ELIGIBLE_DATA_PLAN = "0001089";
	public static final String DIGITAL_APP_WS_COMS_ERROR_CODE_CONTRACT_PLAN_ALREADY_SUBSCRIBED = "0001090";
	public static final String DIGITAL_APP_WS_COMS_ERROR_CODE_CUSTOMER_IS_NOT_SUBSCRIBED_TO_REQUEST_SERVICE = "0001091";

	public static final String DIGITAL_APP_WS_COMS_ERROR_CODE_ORDER_LEVEL_MUTUAL_EXCLUSION = "0001092";
	public static final String DIGITAL_APP_WS_NO_BILL_INVOICE_FOUND = "0001093";
	public static final String DIGITAL_APP_WS_SUBSCRIBE_UN_SUBSCRIBE_SUCCESS = "0001094";
	public static final String DIGITAL_APP_WS_RTF_RESPONSE_VAL_00019 = "0000019";
	public static final String DIGITAL_APP_WS_INVALID_SCRATCH_CARD_NUMBER_ERROR_CODE = "0001095";
	public static final String DIGITAL_APP_WS_PAYMENT_RULE_LIMIT_EXCEED = "0001096";
	public static final String DIGITAL_APP_WS_TAB_NO_DATA_FOUND_FOR_ACTIVE_RATE_PLANS = "0001097";
	public static final String DIGITAL_APP_WS_FORGOT_USERNAME_INVALID_DETAILS = "0001098";
	public static final String DIGITAL_APP_WS_INVALID_EMIRATES_ID = "0001099";
	public static final String DIGITAL_APP_WS_SAME_PLAN_ID_ERROR = "0001100";
	public static final String DIGITAL_APP_WS_AUTH_OTP_NOT_ELIGIBLE_FOR_LOGIN = "0001101";
	public static final String DIGITAL_APP_WS_SET_BILL_LIMIT_TRIES_EXCEED = "0001102";
	public static final String DIGITAL_APP_WS_SET_BILL_LIMIT_SAME = "0001107";
	public static final String DIGITAL_APP_WS_GET_ACCOUNT_BILLS_BILL_NOT_GENERATED = "0001103";
	public static final String DIGITAL_APP_WS_RECHARGE_MIN = "0001104";
	public static final String DIGITAL_APP_WS_RECHARGE_MAX = "0001105";
	public static final String MAXIMUM_OTP_ATTEMPTS_RESPONSE_CODE = "0001106";
	
	public static final String DIGITAL_APP_WS_EPG_PAYMENT_DISABLE_ERROR_CODE = "0001132";
	
	public static final String DIGITAL_APP_WS_UPDATE_APP_FOR_MEGA_ADDON_ERROR_CODE = "0001135";
	public static final String DIGITAL_APP_WS_INVALID_REFERRAL_CODE = "0001145";
	public static final String DIGITAL_APP_WS_OWNED_REFERRAL_CODE = "0001155";
	public static final String DIGITAL_APP_WS_NOT_ELIGIBLE_FOR_OFFER_CODE = "0001165";
	public static final String DIGITAL_APP_WS_ACCOUNT_INFORMATION_IN_ACTIVE_CODE = "0001170";
	public static final String DIGITAL_APP_WS_ATG_MAX_NUM_OF_SUBS_ALLOWED_CODE = "0001171";
	public static final String DIGITAL_APP_WS_NOT_ELIGIBLE_FOR_OFFER_RESPONSE = "not_eligible_for_offer_response";
	public static final String DIGITAL_APP_WS_NOT_ELIGIBLE_FOR_OFFER_RESPONSE_AR = "not_eligible_for_offer_response_ar";
	
	public static final String UPDATE_APP_FOR_MEGA_ADDON_AR = "update_app_for_mega_addon_ar";
	public static final String UPDATE_APP_FOR_MEGA_ADDON_EN = "update_app_for_mega_addon_en";
	
	public static final String[] monthNames = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
		"November", "December" };
	public static final String[] monthNamesAr = { "يناير", "فبراير", "مارس", "ابريل", "مايو", "يونيو", "يوليو", "أغسطس", "سبتمبر", "أكتوبر",
			"نوفمبر", "ديسمبر" };
	
	
	public static final String DIGITAL_APP_WS_START_STOP_ADD_ON_NOT_ACTIVE_ERROR_CODE = "0001125";
	public static final String DIGITAL_APP_WS_START_STOP_BALANCE_NOT_ENOUGH_FOR_FEES_ERROR_CODE = "0001126";
	public static final String DIGITAL_APP_WS_START_STOP_ALREADY_ACTIVE_ERROR_CODE = "0001128";
	public static final String ESIM_RATE_PLANS = "esim_rate_plans";
	public static final String ESIM_ALREAY_ORDER_ERROR_CODE = "0001141";
	public static final String ESIM_ALREAY_ORDER_PENDING_AR = "esim_alreay_order_pending_ar";
	public static final String ESIM_ALREAY_ORDER_PENDING_EN = "esim_alreay_order_pending_en";
	
	public static final String SUBSCRIBE_ADDON_HOME_PROTECTION_SUCCESS_CONFIG_AR_KEY = "subscribe_addon_home_protection_success_ar"; // language
	// will
	// append
	// from
	// code
public static final String SUBSCRIBE_ADDON_HOME_PROTECTION_SUCCESS_CONFIG_EN_KEY = "subscribe_addon_home_protection_success_en"; // language
	// will
	// append
	// from
	// code


public static final String START_STOP_ADD_ON_NOT_ACTIVE_CONFIG_AR_KEY = "start_stop_add_on_not_active_ar"; // language
// will
// append
// from
// code
public static final String START_STOP_ADD_ON_NOT_ACTIVE_EN_KEY = "start_stop_add_on_not_active_en"; // language
// will
// append
// from
// code

public static final String START_STOP_BALANCE_NOT_ENOUGH_FOR_FEES_AR_KEY = "start_stop_balance_not_enough_for_fees_ar"; // language
public static final String START_STOP_BALANCE_NOT_ENOUGH_FOR_FEES_EN_KEY = "start_stop_balance_not_enough_for_fees_en"; // language



public static final String START_STOP_ALREADY_ACTIVE_AR_KEY = "start_stop_already_active_ar"; // language
public static final String START_STOP_ALREADY_ACTIVE_EN_KEY = "start_stop_already_active_en"; // language




	public static final String DIGITAL_APP_WS_DATA_VALID_DESTINATION_NUMBER = "1107";
	public static final String DIGITAL_APP_WS_DATA_REQUEST_COULD_NOT_BE_COMPLETED = "1108";
	public static final String DIGITAL_APP_WS_DATA_RECEIVED_SUCCESSFULLY = "1109";
	public static final String DIGITAL_APP_WS_DATA_DONT_HAVE_ENOUGH_BALANCE = "1110";
	public static final String INTL_CREDIT_TRANSFER_VALID_DESTINATION_NUMBER_AR = "intl_crd_trns_valid_destination_number_ar";
	public static final String INTL_CREDIT_TRANSFER_REQUEST_COULD_NOT_BE_COMPLETED_AR = "intl_crd_trns_request_could_not_be_completed_ar";
	public static final String INTL_CREDIT_TRANSFER_RECEIVED_SUCCESSFULLY_AR = "intl_crd_trns_received_successfully_ar";
	public static final String INTL_CREDIT_TRANSFER_DONT_HAVE_ENOUGH_BALANCE_AR = "intl_crd_trns_dont_have_enough_balance_ar";

	public static final String INTL_CREDIT_TRANSFER_VALID_DESTINATION_NUMBER_EN = "intl_crd_trns_valid_destination_number_en";
	public static final String INTL_CREDIT_TRANSFER_REQUEST_COULD_NOT_BE_COMPLETED_EN = "intl_crd_trns_request_could_not_be_completed_en";
	public static final String INTL_CREDIT_TRANSFER_RECEIVED_SUCCESSFULLY_EN = "intl_crd_trns_received_successfully_en";
	public static final String INTL_CREDIT_TRANSFER_DONT_HAVE_ENOUGH_BALANCE_EN = "intl_crd_trns_dont_have_enough_balance_en";

	public static final String INTL_CREDIT_TRANSFER_NUMBER_YOU_HAVE_ADDED_IS_NOT_ACTIVE_EN = "intl_crd_trns_number_you_have_added_is_not_active_en";

	public static final String INTL_CREDIT_TRANSFER_ENTERED_ISNT_A_VALID_NUMBER_EN = "intl_crd_trns_entered_isnt_a_valid_number_en";
	public static final String INTL_CREDIT_TRANSFER_NUMBER_YOU_HAVE_ENTERED_IS_NOT_ACTIVE_EN = "intl_crd_trns_number_you_have_entered_is_not_active_en";
	public static final String INTL_CREDIT_TRANSFER_SERVICE_DOESNT_SUPPORT_THE_DESTINATION_EN = "intl_crd_trns_service_doesnt_support_the_destination_en";
	public static final String INTL_CREDIT_TRANSFER_SELECTED_DOESNT_ACCEPT_THE_MONEY_IN_FILLS_EN = "intl_crd_trns_selected_doesnt_accept_the_money_in_fills_en";

	public static final String INTL_CREDIT_TRANSFER_CAN_NOT_BE_PROCESSED_AT_THE_MOMENT_EN = "intl_crd_trns_can_not_be_processed_at_the_moment_en";
	public static final String INTL_CREDIT_TRANSFER_REACHED_ITS_DAILY_MAXIMUM_LIMIT_EN = "intl_crd_trns_reached_its_daily_maximum_limit_en";
	public static final String INTL_CREDIT_TRANSFER_REACHED_ITS_WEEKLY_MAXIMUM_LIMIT_EN = "intl_crd_trns_reached_its_weekly_maximum_limit_en";
	public static final String INTL_CREDIT_TRANSFER_REACHED_ITS_MONTHLY_MAXIMUM_LIMIT_EN = "intl_crd_trns_reached_its_monthly_maximum_limit_en";

	public static final String INTL_CREDIT_TRANSFER_NUMBER_YOU_HAVE_ADDED_IS_NOT_ACTIVE_AR = "intl_crd_trns_number_you_have_added_is_not_active_ar";

	public static final String INTL_CREDIT_TRANSFER_ENTERED_ISNT_A_VALID_NUMBER_AR = "intl_crd_trns_entered_isnt_a_valid_number_ar";
	public static final String INTL_CREDIT_TRANSFER_NUMBER_YOU_HAVE_ENTERED_IS_NOT_ACTIVE_AR = "intl_crd_trns_number_you_have_entered_is_not_active_ar";
	public static final String INTL_CREDIT_TRANSFER_SERVICE_DOESNT_SUPPORT_THE_DESTINATION_AR = "intl_crd_trns_service_doesnt_support_the_destinationï¿½_ar";
	public static final String INTL_CREDIT_TRANSFER_SELECTED_DOESNT_ACCEPT_THE_MONEY_IN_FILLS_AR = "intl_crd_trns_selected_doesnt_accept_the_money_in_fills_ar";

	public static final String INTL_CREDIT_TRANSFER_CAN_NOT_BE_PROCESSED_AT_THE_MOMENT_AR = "intl_crd_trns_can_not_be_processed_at_the_moment_ar";
	public static final String INTL_CREDIT_TRANSFER_REACHED_ITS_DAILY_MAXIMUM_LIMIT_AR = "intl_crd_trns_reached_its_daily_maximum_limit_ar";
	public static final String INTL_CREDIT_TRANSFER_REACHED_ITS_WEEKLY_MAXIMUM_LIMIT_AR = "intl_crd_trns_reached_its_weekly_maximum_limit_ar";
	public static final String INTL_CREDIT_TRANSFER_REACHED_ITS_MONTHLY_MAXIMUM_LIMIT_AR = "intl_crd_trns_reached_its_monthly_maximum_limit_ar";

	public static final String INTL_CREDIT_TRANSFER_PREPAID_SENDER_REACHED_DAILY_COUNT_LIMIT_EN = "intl_credit_transfer_prepaid_sender_reached_daily_count_limit_en";
	public static final String INTL_CREDIT_TRANSFER_PREPAID_SENDER_REACHED_DAILY_AMOUNT_LIMIT_EN = "intl_credit_transfer_prepaid_sender_reached_daily_amount_limit_en";
	
	public static final String INTL_CREDIT_TRANSFER_POSTPAID_SENDER_REACHED_DAILY_COUNT_LIMIT_EN = "intl_credit_transfer_postpaid_sender_reached_daily_count_limit_en";
	public static final String INTL_CREDIT_TRANSFER_POSTPAID_SENDER_REACHED_DAILY_AMOUNT_LIMIT_EN = "intl_credit_transfer_postpaid_sender_reached_daily_amount_limit_en";

	
	public static final String INTL_CREDIT_TRANSFER_PREPAID_SENDER_REACHED_DAILY_COUNT_LIMIT_AR = "intl_credit_transfer_prepaid_sender_reached_daily_count_limit_ar";
	public static final String INTL_CREDIT_TRANSFER_PREPAID_SENDER_REACHED_DAILY_AMOUNT_LIMIT_AR = "intl_credit_transfer_prepaid_sender_reached_daily_amount_limit_ar";
	
	public static final String INTL_CREDIT_TRANSFER_POSTPAID_SENDER_REACHED_DAILY_COUNT_LIMIT_AR = "intl_credit_transfer_postpaid_sender_reached_daily_count_limit_ar";
	public static final String INTL_CREDIT_TRANSFER_POSTPAID_SENDER_REACHED_DAILY_AMOUNT_LIMIT_AR = "intl_credit_transfer_postpaid_sender_reached_daily_amount_limit_ar";

	
	public static final String DIGITAL_APP_WS_DATA_NUMBER_YOU_HAVE_ADDED_IS_NOT_ACTIVE = "1111";
	public static final String DIGITAL_APP_WS_DATA_ENTERED_ISNT_A_VALID_NUMBER = "1112";
	public static final String DIGITAL_APP_WS_DATA_NUMBER_YOU_HAVE_ENTERED_IS_NOT_ACTIVE = "1113";
	public static final String DIGITAL_APP_WS_DATA_SERVICE_DOESNT_SUPPORT_THE_DESTINATION = "1114";
	public static final String DIGITAL_APP_WS_DATA_SELECTED_DOESNT_ACCEPT_THE_MONEY_IN_FILLS = "1115";

	public static final String DIGITAL_APP_WS_DATA_CAN_NOT_BE_PROCESSED_AT_THE_MOMENT = "1116";
	public static final String DIGITAL_APP_WS_DATA_REACHED_ITS_DAILY_MAXIMUM_LIMIT = "1117";

	public static final String DIGITAL_APP_WS_DATA_REACHED_ITS_WEEKLY_MAXIMUM_LIMIT = "1118";
	public static final String DIGITAL_APP_WS_DATA_REACHED_ITS_MONTHLY_MAXIMUM_LIMIT = "1119";

	public static final String DIGITAL_APP_WS_DATA_PREPAID_SENDER_REACHED_DAILY_COUNT_LIMIT = "1120";
	public static final String DIGITAL_APP_WS_DATA_PREPAID_SENDER_REACHED_DAILY_AMOUNT_LIMIT = "1121";
	
	public static final String DIGITAL_APP_WS_DATA_POSTPAID_SENDER_REACHED_DAILY_COUNT_LIMIT = "1122";
	public static final String DIGITAL_APP_WS_DATA_POSTPAID_SENDER_REACHED_DAILY_AMOUNT_LIMIT = "1123";
	
	
	public static final String ONE_GB_PROMO_IN_DEAL_OF_THE_DAY = "one_gb_promo_in_deal_of_the_day";

	
	
	public static final int VERIFY_APP_VERSION_HARD_UPDATE_CODE_KEY = 0;
	public static final int VERIFY_APP_VERSION_SOFT_UPDATE_CODE_KEY = 1;
	public static final int VERIFY_APP_VERSION_NO_UPDATED_REQUIRED_CODE_KEY = 2;

	public static final String EMIRATES_ID_PATTERN_KEY = "emirates_id_pattern";

	public static final String OCR_PROCCESS_ID_KOFAX_URL_KEY = "ocr_proccess_id_kofax_url";

	public static final String VERIFY_APP_VERSION_HARD_UPDATE_MESSAGE_AR_KEY = "verify_app_version_hard_update_message_ar";

	public static final String VERIFY_APP_VERSION_HARD_UPDATE_MESSAGE_EN_KEY = "verify_app_version_hard_update_message_en";

	public static final String VERIFY_APP_VERSION_SOFT_UPDATE_MESSAGE_EN_KEY = "verify_app_version_soft_update_message_en";

	public static final String VERIFY_APP_VERSION_SOFT_UPDATE_MESSAGE_AR_KEY = "verify_app_version_soft_update_message_ar";

	public static final String VERIFY_APP_VERSION_NO_UPDATED_REQUIRED_MESSAGE_AR_KEY = "verify_app_version_no_updated_required_message_ar";

	public static final String VERIFY_APP_VERSION_NO_UPDATED_REQUIRED_MESSAGE_EN_KEY = "verify_app_version_no_updated_required_message_en";

	public static final String VERIFY_APP_VERSION_DOWNLOAD_URL_IOS = "verify_app_version_download_url_ios";
	public static final String VERIFY_APP_VERSION_DOWNLOAD_URL_ANDROID = "verify_app_version_download_url_android";

	public static final String GET_ACTIVE_ADDON_LIST_ANDR_VERSION_CONFIG_KEY = "get_active_addon_list_andr_version";
	public static final String GET_ACTIVE_ADDON_LIST_IOS_VERSION_CONFIG_KEY = "get_active_addon_list_ios_version";

	public static final String VERIFY_APP_VERSION_HARD_UPDATE_VERSION_KEY_IOS = "verify_app_version_hard_update_version_ios";
	public static final String VERIFY_APP_VERSION_HARD_UPDATE_VERSION_KEY_ANDROID = "verify_app_version_hard_update_version_android";
	public static final String MEGA_ADDON_ANDROID_VERSION = "mega_addon_android_version";

	public static final String VERIFY_APP_VERSION_SOFT_UPDATE_VERSION_KEY_IOS = "verify_app_version_soft_update_version_ios";
	public static final String VERIFY_APP_VERSION_SOFT_UPDATE_VERSION_KEY_ANDROID = "verify_app_version_soft_update_version_android";

	public static final String OUT_OF_BUNDLE_TOT_DESC_MESSAGE_EN_KEY = "out_of_bundle_tot_desc_message_en";
	public static final String OUT_OF_BUNDLE_TOT_DESC_MESSAGE_AR_KEY = "out_of_bundle_tot_desc_message_ar";

	public static final String USAGE_GET_DATA_TAB_MIN_DAYS_FOR_EXPIRY_DESC_VIEW_KEY = "usage_get_data_tab_min_days_for_expiry_desc_view";
	
	public static final String USAGE_GET_DATA_TAB_LAST_UPDATED_DESC_MESSAGE_AR_KEY = "usage_get_data_tab_last_uget_calls_tab_min_left_arpdated_desc_message_ar";
	public static final String USAGE_GET_DATA_TAB_LAST_UPDATED_DESC_MESSAGE_EN_KEY = "usage_get_data_tab_last_updated_desc_message_en";

	public static final String HOME_GET_DATA_TAB_LAST_UPDATED_DESC_MESSAGE_AR_KEY = "home_get_data_tab_last_updated_desc_message_ar";
	public static final String HOME_GET_DATA_TAB_LAST_UPDATED_DESC_MESSAGE_EN_KEY = "home_get_data_tab_last_updated_desc_message_en";

	public static final String TAB_LAST_UPDATED_DESC_DATE_TIME_FORMAT_KEY = "tab_last_updated_desc_date_time_format_key";

	public static final String AVAILABLE_BALANCE_REMAINING_DESC_AR_KEY = "available_balance_remaining_desc_ar";
	public static final String AVAILABLE_BALANCE_REMAINING_DESC_EN_KEY = "available_balance_remaining_desc_en";

	public static final String AVAILABLE_BALANCE_LAST_RECHARGE_DESC_AR_KEY = "available_balance_last_recharge_desc_ar";
	public static final String AVAILABLE_BALANCE_LAST_RECHARGE_DESC_EN_KEY = "available_balance_last_recharge_desc_en";

	public static final String PROMO_QUANTITY_TEXT = "promo_quantity_text";
	public static final String PROMO_QUANTITY_TEXT_AR = "promo_quantity_text_ar";
	
	public static final String AVAILABLE_BALANCE_LAST_UPDATED_DESC_AR_KEY = "available_balance_last_updated_desc_ar";
	public static final String AVAILABLE_BALANCE_LAST_UPDATED_DESC_EN_KEY = "available_balance_last_updated_desc_en";

	public static final String OUT_OF_BUNDLE_TOTAL_DESC_MESSAGE_AR_KEY = "out_of_bundle_total_desc_message_ar";
	public static final String OUT_OF_BUNDLE_TOTAL_DESC_MESSAGE_EN_KEY = "out_of_bundle_total_desc_message_en";

	public static final String HOME_GET_MESSAGE_TAB_LAST_UPDATED_DESC_MESSAGE_AR_KEY = "home_get_message_tab_last_updated_desc_message_ar";
	public static final String HOME_GET_MESSAGE_TAB_LAST_UPDATED_DESC_MESSAGE_EN_KEY = "home_get_message_tab_last_updated_desc_message_en";

	public static final String HOME_GET_CALLS_TAB_LAST_UPDATED_DESC_MESSAGE_AR_KEY = "home_get_calls_tab_last_updated_desc_message_ar";
	public static final String HOME_GET_CALLS_TAB_LAST_UPDATED_DESC_MESSAGE_EN_KEY = "home_get_calls_tab_last_updated_desc_message_en";

	public static final String USAGE_GRAPH_SRVC_CALLS_LAST_UPDATED_DESC_MESSAGE_EN_KEY = "usage_graph_srvc_calls_last_updated_desc_message_en";
	public static final String USAGE_GRAPH_SRVC_CALLS_LAST_UPDATED_DESC_MESSAGE_AR_KEY = "usage_graph_srvc_calls_last_updated_desc_message_ar";

	public static final String USAGE_GRAPH_SRVC_DATA_LAST_UPDATED_DESC_MESSAGE_EN_KEY = "usage_graph_srvc_data_last_updated_desc_message_en";
	public static final String USAGE_GRAPH_SRVC_DATA_LAST_UPDATED_DESC_MESSAGE_AR_KEY = "usage_graph_srvc_data_last_updated_desc_message_ar";

	public static final String USAGE_GRAPH_SRVC_MSG_LAST_UPDATED_DESC_MESSAGE_EN_KEY = "usage_graph_srvc_msg_last_updated_desc_message_en";
	public static final String USAGE_GRAPH_SRVC_MSG_LAST_UPDATED_DESC_MESSAGE_AR_KEY = "usage_graph_srvc_msg_last_updated_desc_message_ar";

	public static final String GET_ACCOUNT_BILLS_BILL_NOT_GENERATED_AR_KEY = "get_account_bills_bill_not_generated_ar";
	public static final String GET_ACCOUNT_BILLS_BILL_NOT_GENERATED_EN_KEY = "get_account_bills_bill_not_generated_en";

	public static final String UNIFIED_BILL_INQUIRY_SRVC_ADDRESS_CONFIG_KEY = "unified_bill_inquiry_srvc_address_config";
public static final String CUSTOMER_BILLING_INFO_SRVC_URL = "customer_billing_info_srvc_url";
	
	
	
	public static final String BILL_LANDING_MULTI_ACCOUNT = "ALL";
	
	public static final String BILLING_2020_BILL_NOT_READY_YET = "billing_2020_bill_not_ready_yet";
	public static final String BILLING_2020_BILL_NOT_READY_YET_AR = "billing_2020_bill_not_ready_yet_ar";
	
	public static final String BILLING_2020_BILL_NOT_READY_YET_SUBTITLE = "billing_2020_bill_not_ready_yet_subtitle";
	public static final String BILLING_2020_BILL_NOT_READY_YET_SUBTITLE_AR = "billing_2020_bill_not_ready_yet_subtitle_ar";
	
	public static final String RED = "#FF0000";
	public static final String ORANGE = "#FF8900";
	
	
	public static final String BILLING_2020_PAY_FIRST_BILL = "billing_2020_pay_first_bill";
	public static final String BILLING_2020_PAY_FIRST_BILL_AR = "billing_2020_pay_first_bill_ar";
	public static final String BILLING_2020_FIRST_BILL_AVAILABLE = "billing_2020_first_bill_available";
	public static final String BILLING_2020_FIRST_BILL_AVAILABLE_AR = "billing_2020_first_bill_available_ar";
	public static final String BILLING_2020_FIRST_BILL_PARTIALLY_PAID = "billing_2020_first_bill_partially_paid";
	public static final String BILLING_2020_FIRST_BILL_PARTIALLY_PAID_AR = "billing_2020_first_bill_partially_paid_ar";
	public static final String BILLING_2020_FIRST_BILL_FULLY_PAID = "billing_2020_first_bill_fully_paid";
	public static final String BILLING_2020_FIRST_BILL_FULLY_PAID_AR = "billing_2020_first_bill_fully_paid_ar";
	
	public static final String BILL_OVERDUE = "bill_overdue";
	public static final String BILL_OVERDUE_AR = "bill_overdue_ar";
	
	public static final String PAY_NOW = "pay_now";
	public static final String PAY_NOW_AR = "pay_now_ar";
	public static final String PAY_BEFORE = "pay_before";
	public static final String PAY_BEFORE_AR = "pay_before_ar";
	
	public static final String AUTOPAY_ENABLED_ON = "autopay_enabled_on";
	public static final String AUTOPAY_ENABLED_ON_AR = "autopay_enabled_on_ar";
	
	public static final String AUTOPAY_ENABLED_ON_SUBTITLE = "autopay_enabled_on_subtitle";
	public static final String AUTOPAY_ENABLED_ON_SUBTITLE_AR = "autopay_enabled_on_subtitle_ar";
	
	public static final String CHARGES_FOR_ACCOUNTS = "charges_for_accounts";
	public static final String CHARGES_FOR_ACCOUNTS_AR = "charges_for_accounts_ar";
	
	public static final String MAKE_ADVANCE_PAYMENT = "make_advance_payment";
	public static final String MAKE_ADVANCE_PAYMENT_AR = "make_advance_payment_ar";
	
	public static final String BILLS_NOT_READY = "bills_not_ready";
	public static final String BILLS_NOT_READY_AR = "bills_not_ready_ar";
	
	public static final String BILLS_NOT_READY_SUBTITLE = "bills_not_ready_subtitle";
	public static final String BILLS_NOT_READY_SUBTITLE_AR = "bills_not_ready_subtitle_ar";
	
	public static final String YOU_NEED_TO_PAY_YOUR_BILLS = "you_need_to_pay_your_bills";
	public static final String YOU_NEED_TO_PAY_YOUR_BILLS_AR = "you_need_to_pay_your_bills_ar";
	
	public static final String YOUR_BILLS_HAVE_BEEN_PAID = "your_bills_have_been_paid";
	public static final String YOUR_BILLS_HAVE_BEEN_PAID_AR = "your_bills_have_been_paid_ar";
	
	public static final String FULL_PAYMENT_RECEIVED_ON_BILLS = "full_payment_received_on_bills";
	public static final String FULL_PAYMENT_RECEIVED_ON_BILLS_AR = "full_payment_received_on_bills_ar";
	
	public static final String BILLS_PARTIALLY_PAID = "bills_partially_paid";
	public static final String BILLS_PARTIALLY_PAID_AR = "bills_partially_paid_ar";
	
	public static final String BILLS_WILL_BE_FULLY_PAID_AUTOPAY = "bills_will_be_fully_paid_autopay";
	public static final String BILLS_WILL_BE_FULLY_PAID_AUTOPAY_AR = "bills_will_be_fully_paid_autopay_ar";
	
	public static final String BILLS_WILL_BE_PARTLY_PAID_AUTOPAY = "bills_will_be_partly_paid_autopay";
	public static final String BILLS_WILL_BE_PARTLY_PAID_AUTOPAY_AR = "bills_will_be_partly_paid_autopay_ar";
	
	public static final String BILLS_AVAILABLE = "bills_available";
	public static final String BILLS_AVAILABLE_AR = "bills_available_ar";
	
	public static final String AUTOPAY_FAILURE_TITLE = "autopay_failure_title";
	public static final String AUTOPAY_FAILURE_TITLE_AR = "autopay_failure_title_ar";
	
	public static final String SEE_MORE_DETAILS = "see_more_details";
	public static final String SEE_MORE_DETAILS_AR = "see_more_details_ar";
	
	public static final String AUTOPAY_FAILURE_DESCRIPTION = "autopay_failure_description";
	public static final String AUTOPAY_FAILURE_DESCRIPTION_AR = "autopay_failure_description_ar";
	
	public static final String AUTOPAY_FAILURE_PAY_FULL_OUTSTANDING_AMOUNT = "autopay_failure_pay_full_outstanding_amount";
	public static final String AUTOPAY_FAILURE_PAY_FULL_OUTSTANDING_AMOUNT_AR = "autopay_failure_pay_full_outstanding_amount_ar";
	
	public static final String ADD_NEW_CARD = "add_new_card";
	public static final String ADD_NEW_CARD_AR = "add_new_card_ar";
	
	public static final String BILLING_2020_PAY_BILL = "billing_2020_pay_bill";
	public static final String BILLING_2020_PAY_BILL_AR = "billing_2020_pay_bill_ar";
	public static final String BILLING_2020_BILL_AVAILABLE = "billing_2020_bill_available";
	public static final String BILLING_2020_BILL_AVAILABLE_AR = "billing_2020_bill_available_ar";
	public static final String BILLING_2020_BILL_PARTIALLY_PAID = "billing_2020_bill_partially_paid";
	public static final String BILLING_2020_BILL_PARTIALLY_PAID_AR = "billing_2020_bill_partially_paid_ar";
	public static final String BILLING_2020_BILL_FULLY_PAID = "billing_2020_bill_fully_paid";
	public static final String BILLING_2020_BILL_FULLY_PAID_AR = "billing_2020_bill_fully_paid_ar";
	
	
	
	
	public static final String BILLING_2020_FIRST_BILL_FULLY_PAID_AUTOPAY = "billing_2020_first_bill_fully_paid_autopay";
	public static final String BILLING_2020_FIRST_BILL_FULLY_PAID_AUTOPAY_AR = "billing_2020_first_bill_fully_paid_autopay_ar";
	public static final String BILLING_2020_FIRST_BILL_PARTLY_PAID_AUTOPAY = "billing_2020_first_bill_partly_paid_autopay";
	public static final String BILLING_2020_FIRST_BILL_PARTLY_PAID_AUTOPAY_AR = "billing_2020_first_bill_partly_paid_autopay_ar";
	public static final String BILLING_2020_BILL_FULLY_PAID_AUTOPAY = "billing_2020_bill_fully_paid_autopay";
	public static final String BILLING_2020_BILL_FULLY_PAID_AUTOPAY_AR = "billing_2020_bill_fully_paid_autopay_ar";
	public static final String BILLING_2020_BILL_PARTLY_PAID_AUTOPAY = "billing_2020_bill_partly_paid_autopay";
	public static final String BILLING_2020_BILL_PARTLY_PAID_AUTOPAY_AR = "billing_2020_bill_partly_paid_autopay_ar";

	public static final String BILL_DETAILS_CALLS_TAB_COLOR_KEY = "bill_details_calls_tab_color";
	public static final String BILL_DETAILS_DATA_TAB_COLOR_KEY = "bill_details_data_tab_color";
	public static final String BILL_DETAILS_MESSAGE_TAB_COLOR_KEY = "bill_details_message_tab_color";
	public static final String BILL_DETAILS_EXTRA_TAB_COLOR_KEY = "bill_details_extra_tab_color";

	public static final String PAYMENT_POINTS_SUCCESS_AR_KEY = "payment_points_success_ar";
	public static final String PAYMENT_POINTS_SUCCESS_EN_KEY = "payment_points_success_en";
	public static final String BILL_DETAILS_RENTALS_TAB_COLOR_KEY = "bill_details_rentals_tab_color";

	public static final String GET_CALLS_TAB_MIN_LEFT_AR_KEY = "get_calls_tab_min_left_ar";
	public static final String GET_CALLS_TAB_MIN_LEFT_EN_KEY = "get_calls_tab_min_left_en";
	public static final String GET_CALLS_TAB_TOT_DES_LOCAL_EN_KEY = "get_calls_tab_tot_des_local_en";
	public static final String GET_CALLS_TAB_TOT_DES_LOCAL_AR_KEY = "get_calls_tab_tot_des_local_ar";
	public static final String GET_CALLS_TAB_TOT_DES_INTL_EN_KEY = "get_calls_tab_tot_des_intl_en";
	public static final String GET_CALLS_TAB_TOT_DES_INTL_AR_KEY = "get_calls_tab_tot_des_intl_ar";

	public static final String BILL_DETAILS_CALLS_TAB_TITLE_EN_KEY = "bill_details_calls_tab_title_en";
	public static final String BILL_DETAILS_DATA_TAB_TITLE_EN_KEY = "bill_details_data_tab_title_en";
	public static final String BILL_DETAILS_MESSAGE_TAB_TITLE_EN_KEY = "bill_details_message_tab_title_en";
	public static final String BILL_DETAILS_EXTRA_TAB_TITLE_EN_KEY = "bill_details_extra_tab_title_en";
	public static final String BILL_DETAILS_RENTALS_TAB_TITLE_EN_KEY = "bill_details_rentals_tab_title_en";

	public static final String BILL_DETAILS_CALLS_TAB_TITLE_AR_KEY = "bill_details_calls_tab_title_ar";
	public static final String BILL_DETAILS_DATA_TAB_TITLE_AR_KEY = "bill_details_data_tab_title_ar";
	public static final String BILL_DETAILS_MESSAGE_TAB_TITLE_AR_KEY = "bill_details_message_tab_title_ar";
	public static final String BILL_DETAILS_EXTRA_TAB_TITLE_AR_KEY = "bill_details_extra_tab_title_ar";
	public static final String BILL_DETAILS_RENTALS_TAB_TITLE_AR_KEY = "bill_details_rentals_tab_title_ar";

	/*
	 * ########################################### Scheduler Job timing constant
	 * ################################################
	 */

	public static final String ENABLED = "1";
	public static final String SCHEDULER_JOB_PUSH_NOTIFICATION_TIME_EXPR_KEY = "scheduler_job_push_notification_time_expr";
	public static final String JOB_PUSH_NOTIFICATION_ENABLED_KEY = "job_push_notification_enabled";

	/*
	 * ########################################### General Constants
	 * ################################################
	 */
	public static final String CRM_GW_URL = "crm_gw_url";
	public static final String CODE_URL = "code_url";
	public static final int INTEGRATION_CONFIG_MAP_INDICATOR = 1;
	public static final int GENERAL_CONFIG_MAP_INDICATOR = 2;

	public static final String ERROR_CODE_SUCCESS = "00";

	public static final String MSISDN_PATTERN = "05\\p{Digit}{8,8}";
	public static final String NUMERIC_PATTERN = "\\p{Digit}*\\.?\\p{Digit}*";

	public static final class BarcodeType
	{
		public static final String CODE_39 = "code39";
		public static final String EAN_128 = "ean128";
	}

	public static final String DATA_UNIT_GB_KEY = "GB";
	public static final String DATA_UNIT_MB_KEY = "MB";
	public static final String USAGE_TYPE_CALL = "1";
	public static final String USAGE_TYPE_SMS = "2";
	public static final String USAGE_TYPE_DATA = "3";

	public static final String USAGE_TYPE_CALL_VALUE = "VOICE";
	public static final String USAGE_TYPE_CALL_VAL = "CALL";
	public static final String USAGE_TYPE_SMS_VALUE = "SMS";
	public static final String USAGE_TYPE_DATA_VALUE = "DATA";
	public static final String USAGE_TYPE_EXTRA_VALUE = "ALL";
	public static final String USAGE_TYPE_ALL_VALUE = "ALL";

	/*
	 * ########################################### WsConstantsIfc
	 * ################################################
	 */
	/*
	 * Application Headers
	 */

	public static final String RESPONSE_STATUS_HEADER_NAME = "DIGITAL-APP-STATUS";
	public static final String HEADER_PARAM_MESSAGE = "MESSAGE";
	public static final String HEADER_PARAM_ORDER_NUMBER = "orderNumber";
	public static final String IS_REWARDED_HEADER = "isRewarded";
	public static final String EVENT_ID_HEADER = "eventId";
	public static final String GIFT_ID_HEADER = "giftId";
	public static final String ACTION_RESPONSE_HEADER = "actionResponse";
	public static final String ACTION_RESPONSE_AR_HEADER = "actionResponseAr";
	public static final String ACTION_HEADER = "actionHeader";
	public static final String ACTION_HEADER_AR = "actionHeaderAr";

	/*
	 * Response details
	 */
	public static final String RESPONSE_SUCCESS_STATUS = "SUCCESS";
	public static final String RESPONSE_ERROR_STATUS = "ERROR";
	public static final String RESPONSE_FAILURE_STATUS = "FAILURE";
	public static final int RESPONSE_DEFAULT_STATUS_CODE = 200;
	public static final String RESET_PASSWORD_SUCCESS_CODE = "SCP_RESET_PWD_00";
	public static final String RESET_WRONG_PASSWORD_CRITERIA_ERROR_CODE = "SCP_RESET_PWD_05";
	public static final String RESET_PASSWORD_INVALID_PASSWORD_ERROR_CODE = "02";

	public static final String RESET_PASSWORD_SERVICE_USER_NAME = "reset_password_srvc_user_name";
	public static final String RESET_PASSWORD_SERVICE_PASSWORD = "reset_password_srvc_password";
	public static final String ATG_ADDONS_URL = "ATG_ADDONS_URL";
	public static final String ENGLISH_LANGUAGE_TEXT = "en";
	public static final String ARABIC_LANGUAGE_TEXT = "ar";
	public static final String caramel_how_to_use_text_ = "caramel_how_to_use_text_";
	

	public static final String home_wireless_oos_ = "home_wireless_oos_";
	
	public static final String caramel_get_voucher_code_text_ = "caramel_get_voucher_code_text_";
	public static final String DIGITAL_APP_WS_SUBSCRIBE_SUBSCRIBER_NOT_ELIGIBLE_ERROR_CODE = "0001201";
	public static final String SUBSCRIBE_SUBSCRIBER_NOT_ELIGIBLE_EN_KEY = "subscribe_subscriber_not_eligible_en";
	public static final String SUBSCRIBE_SUBSCRIBER_NOT_ELIGIBLE_AR_KEY = "subscribe_subscriber_not_eligible_ar";
	public static final String CBCM_CODE_TIB_NECSO_4086 = "TIB-NECSO-4086";


	public static final String UPDATE_MY_ACCOUNT_DETAILS_LANG_EN_CONFIG_KEY = "update_my_account_details_lang_en";
	public static final String UPDATE_MY_ACCOUNT_DETAILS_LANG_AR_CONFIG_KEY = "update_my_account_details_lang_ar";
	
	public static final String SUBSCRIBE_ADDON_ELIGIBILITY_CHECK_ACTION = "BOD_ELIGIBILITY";
	
	public static final String SUBSCRIBE_ADDON_SERVICE_CBCM_FOR_MULTIPLE_REQUEST_CONFIG_KEY = "subscribe_addon_service_cbcm_for_multiple_request";
	public static final String CUSTOMER_ORDER_MGT_SUCCESS_ERROR_CODE = "TIB-000";


	/*
	 * ########################################### DatePatternContstantsIfc
	 * ################################################
	 */

	public static final String ORACLE_DATE_PATTERN = "dd-MMM-yyyy";
	public static final String REST_DATE_FORMAT = "dd-MM-yyyy";// dd-MM-yyyy
	public static final String REST_DATE_TIME_FORMAT = "dd-MM-yyyy'T'hh:mm a";// dd-MM-yyyy
	public static final String COMS_DATE_FORMAT = "dd/MM/yyyy";// dd-MM-yyyy
	public static final String REST_TIME_12_HOUR_CYCLE_FORMAT = "hh:mm a";// REST AM PM FORMAT FOR TIME
																				// a
	public static final String IN_COMMUNICATION_SOAP_DATE_FORMAT = "in_communication_soap_date_format";

	public static final String SOAP_DATE_FORMAT = "dd/MM/yyyy";// dd/MM/yyyy
	public static final String SOAP_DATE_TIME_FORMAT = "yyyyMMddHHmmss";// dd/MM/yyyy
	public static final String OUT_OF_BUNDLE_SOAP_DATE_TIME_FORMAT = "yyyyMMdd";// dd/MM/yyyy
	public static final String TIBCO_CRM_ACCOUNT_DETAILS_INQUIRY_SOAP_DATE_FORMAT = "yyyy-MM-dd";// yyyy-MM-dd

	/*
	 * ########################################### DbConstantsIfc
	 * ################################################
	 */

	public static final String COLOR_GREEN_KEY = "color_green";
	public static final String COLOR_ORANGE_KEY = "color_orange";
	public static final String COLOR_RED_KEY = "color_red";
	public static final String COLOR_SILVER_KEY = "color_silver";
	public static final String COLOR_WHITE_KEY = "color_white";
	public static final String COLOR_BLACK_KEY = "color_black";
	public static final String COLOR_GREY_KEY = "color_grey";
	public static final String START_STOP_IN_LIST_OF_BUNDLE_OFFER_ID = "start_stop_in_list_of_bundle_offer_id";
	public static final String MEGA_ADDON_IDS = "mega_addon_ids";
	
	public static final String START_STOP_FIRST_TIME_WITH_NO_CHARGER_SUCCESS_AR = "start_stop_first_time_with_no_charger_success_ar";
	public static final String START_STOP_FIRST_TIME_WITH_NO_CHARGER_SUCCESS_EN = "start_stop_first_time_with_no_charger_success_en";
	public static final String START_STOP_ACTIVE_SINCE_AR_KEY = "start_stop_active_since_ar";
	public static final String START_STOP_ACTIVE_SINCE_EN_KEY = "start_stop_active_since_en";
	public static final String START_STOP_STOP_SUCCESS_EN_KEY = "start_stop_stop_success_en";
	public static final String START_STOP_STOP_SUCCESS_AR_KEY = "start_stop_stop_success_ar";
	
	
	public static final String MINIMUM_APP_VERSION_IOS = "minimum_app_version_ios";
	public static final String MINIMUM_APP_VERSION_ANDROID = "minimum_app_version_android";
	
	public static final String MINIMUM_APP_VERSION_ECHO_IOS = "MINIMUM_APP_VERSION_ECHO_IOS";
	public static final String MINIMUM_APP_VERSION_ECHO_ANDROID = "MINIMUM_APP_VERSION_ECHO_ANDROID";
	
	public static final String DIAL_UP_SERVICE_TYPE = "dial_up_service_type";
	
	public static final String HOME_USAGE_TDB_DESC_AR_KEY = "home_usage_tdb_desc_ar";
	public static final String HOME_USAGE_TDB_DESC_EN_KEY = "home_usage_tdb_desc_en";
	public static final String TBD_SERVICE_ACTIVATE_DESC_EN_KEY = "tbd_service_activate_desc_en";
	public static final String TBD_SERVICE_ACTIVATE_DESC_AR_KEY = "tbd_service_activate_desc_ar";

	public static final String CREDIT_CARD_ALREADY_USED_MESSAGE_EN_KEY = "credit_card_already_used_message_en";

	public static final String TOTAL_DESC_FOR_USAGE_DATA_TAB_KEY = "total_desc_for_usage_data_tab";
	public static final String AED_USED = "aed_used";

	public static final String USAGE_AGGREGATED_BLACK_LIST_DATA = "usage_aggregated_black_list_data";

	// TODO Remove it after deploymenent
	public static final String REMAINING_DESC_FOR_USAGE_DATA_TAB_KEY = "remaining_desc_for_usage_data_tab";

	public static final String REMAINING_DESC_FOR_USAGE_DATA_TAB_GB_LEFT_EN_KEY = "remaining_desc_for_usage_data_tab_gb_left_en";
	public static final String REMAINING_DESC_FOR_USAGE_DATA_TAB_GB_LEFT_AR_KEY = "remaining_desc_for_usage_data_tab_gb_left_ar";

	public static final String REMAINING_DESC_FOR_USAGE_DATA_TAB_MB_LEFT_EN_KEY = "remaining_desc_for_usage_data_tab_mb_left_en";
	public static final String REMAINING_DESC_FOR_USAGE_DATA_TAB_MB_LEFT_AR_KEY = "remaining_desc_for_usage_data_tab_mb_left_ar";

	/**
	 * Define weblogic username key, using this key username will be retrieved
	 * from CONFIGUIRATION table.
	 */
	public static final String WEBLOGIC_USER_NAME_KEY = "weblogic_user_name";

	/**
	 * Define weblogic password key, using this key password will be retrieved
	 * from CONFIGUIRATION table.
	 */
	public static final String WEBLOGIC_PASSWORD_KEY = "weblogic_password";

	/**
	 * Define weblogic queue name key, on this queue MS C system will put their
	 * message and Digital App queue listener will read that from message, using
	 * this key queue name will be retrieved from CONFIGUIRATION table.
	 */
	public static final String WEBLOGIC_QUEUE_NAME_KEY = "weblogic_queue_name";

	/**
	 * Define weblogic queue url key, using this key queue url will be retrieved
	 * from CONFIGUIRATION table.
	 */
	public static final String WEBLOGIC_QUEUE_URL_KEY = "weblogic_queue_url";

	public static final String LEARN_MORE_TITLE_EN_KEY = "learn_more_title";
	public static final String LEARN_MORE_TITLE_AR_KEY = "learn_more_title_ar";

	public static final String LEARN_MORE_SUB_TITLE_EN_KEY = "learn_more_sub_title";
	public static final String LEARN_MORE_SUB_TITLE_AR_KEY = "learn_more_sub_title_ar";

	public static final String LEARN_MORE_DESCRIPTION_EN_KEY = "learn_more_description";
	public static final String LEARN_MORE_DESCRIPTION_AR_KEY = "learn_more_description_ar";

	public static final Integer ACCOUNT_TYPE_PREPAID = 1;
	public static final Integer ACCOUNT_TYPE_POSTPAID = 2;
	public static final Integer ACCOUNT_TYPE_VISITOR = 3;
	public static final Integer ACCOUNT_TYPE_ELIFE = 4;
	public static final Integer ACCOUNT_TYPE_FIXED = 5;

	public static final String NOT_ENROLLED_TITLE_EN_KEY = "not_enrolled_title";
	public static final String NOT_ENROLLED_FOOTER_TEXT_EN_KEY = "not_enrolled_footer_text";
	public static final String NOT_ENROLLED_DESCRIPTION_EN_KEY = "not_enrolled_description";

	public static final String NOT_ENROLLED_TITLE_AR_KEY = "not_enrolled_title_ar";
	public static final String NOT_ENROLLED_FOOTER_TEXT_AR_KEY = "not_enrolled_footer_text_ar";
	public static final String NOT_ENROLLED_DESCRIPTION_AR_KEY = "not_enrolled_description_ar";
	public static final String TRANSACTION_HISTORY_SORTING_PROPERTY_KEY = "transaction_history_sorting_property";
	public static final String TRANSACTION_HISTORY_SORTING_ORDER_KEY = "transaction_history_order";
	public static final String TRANSACTION_HISTORY_PAYMENT_DATE_FORMAT_KEY = "transaction_history_payment_date_format";
	public static final String TRANSACTION_HISTORY_TITLE_TYPE_1_EN_KEY = "transaction_history_title_type_1_en";
	public static final String TRANSACTION_HISTORY_TITLE_TYPE_1_AR_KEY = "transaction_history_title_type_1_ar";
	public static final String TRANSACTION_HISTORY_TITLE_TYPE_2_EN_KEY = "transaction_history_title_type_2_en";
	public static final String TRANSACTION_HISTORY_TITLE_TYPE_2_AR_KEY = "transaction_history_title_type_2_ar";
	public static final String TRANSACTION_HISTORY_TITLE_TYPE_3_EN_KEY = "transaction_history_title_type_3_en";
	public static final String TRANSACTION_HISTORY_TITLE_TYPE_3_AR_KEY = "transaction_history_title_type_3_ar";
	public static final String TRANSACTION_HISTORY_TITLE_TYPE_4_EN_KEY = "transaction_history_title_type_4_en";
	public static final String TRANSACTION_HISTORY_TITLE_TYPE_4_AR_KEY = "transaction_history_title_type_4_ar";
	public static final String TRANSACTION_HISTORY_TITLE_TYPE_5_EN_KEY = "transaction_history_title_type_5_en";
	public static final String TRANSACTION_HISTORY_TITLE_TYPE_5_AR_KEY = "transaction_history_title_type_5_ar";
	public static final String TRANSACTION_HISTORY_TITLE_TYPE_6_EN_KEY = "transaction_history_title_type_6_en";
	public static final String TRANSACTION_HISTORY_TITLE_TYPE_6_AR_KEY = "transaction_history_title_type_6_ar";

	public static final String FMS_REQUEST_XML_KEY = "fms_request_xml";

	public static final Integer ASCENDING_ORDER = 1;
	public static final Integer DESCENDING_ORDER = 2;

	public static final String IMAGE_BASE_URL_KEY = "image_base_url";

	public static final String STORE_IMAGE_URL_ANDROID = "storeImageUrlAndroid";
	public static final String STORE_IMAGE_URL_IOS = "storeImageUrlIOS";
	public static final String ANDROID_APP_STORE_URL = "andriod_app_store_url";
	public static final String IOS_APP_STORE_URL = "ios_app_store_url";

	public static final String REWARD_POINTS_NOT_ENROLLED_FOOTERIMAGEURL = "reward_points_not_enrolled_footerImageUrl";
	public static final String REWARD_POINTS_LEARN_MORE_TITLE_HEADERIMAGEURL = "reward_points_learn_more_title_headerImageUrl";

	public static final String SSO_LINK_REGISTRATION_URL_KEY = "sso_link_registration_url";
	public static final String SSO_LINK_DELINK_URL_KEY = "sso_link_delink_url";
	public static final String SSO_LINK_URL_KEY = "sso_link_url";
	public static final String SSO_LINK_URL_DIGITAL_APP_RESOURCE_EN_REGISTRATION_URL_KEY = "digital_app_resource_en_registration_url";
	public static final String SSO_LINK_URL_DIGITAL_APP_RESOURCE_AR_REGISTRATION_URL_KEY = "digital_app_resource_ar_registration_url";

	public static final String PACKAGES_CATEGORIES_ROAMING_CATEGORY_ID_KEY = "packages_categories_roaming_category_id";

	public static final String LIVE_CHAT_URL_KEY = "live_chat_url";

	public static final String EPG_PAYMENT_TYPE_PAYBILL = "Pay Bill";
	public static final String EPG_PAYMENT_TYPE_RECHARGE = "Recharge";

	public static final String EPG_PAY_FOR_OTHERS_POSTPAID_MAX_LIMIT_CONFIG_KEY = "epg_pay_for_others_postpaid_max_limit_config_key";
	public static final String EPG_CREATE_PAYMENT_RETURN_PATH_CONFIG_KEY = "epg_create_payment_return_path";//
	public static final String EPG_PAY_FOR_OTHERS_RETURN_PATH_CONFIG_KEY = "epg_pay_for_others_return_path";
	public static final String EPG_MEGA_AUTO_PAY_REGISTRATION_RETURN_PATH_CONFIG_KEY = "epg_mega_auto_pay_registration_return_path";

	public static final String EPG_PAY_FOR_MULTIPLE_ACCOUNTS_RETURN_PATH_CONFIG_KEY = "epg_pay_for_multiple_accounts_return_path";
	public static final String EPG_PAY_FOR_MULTIPLE_ACCOUNTS_PARTIAL_RETURN_PATH_CONFIG_KEY = "epg_pay_for_multiple_accounts_partial_return_path";

	public static final String EPG_CHANGE_PLAN_RETURN_PATH_CONFIG_KEY = "epg_change_plan_return_path";
	public static final String OS_VERSION_ANDROID_KEY = "os_version_android";
	public static final String OS_VERSION_IOS_KEY = "os_version_ios";

	public static final String ETISALAT_APP_OS_TYPE_ANDROID_KEY = "Android"; // TODO
																				// :
																				// Discuss
																				// OSTYPE
																				// in
																				// ELISALAT
																				// APP
																				// Table
	public static final String ETISALAT_APP_OS_TYPE_IPHONE_KEY = "iOS"; // TODO
																		// :
																		// Discuss
																		// OSTYPE
																		// in
																		// ELISALAT
																		// APP
																		// Table
	public static final String ETISALAT_APP_OS_TYPE_IPAD_KEY = "iPad"; // TODO :
																		// Discuss
																		// OSTYPE
																		// in
																		// ELISALAT
																		// APP
																		// Table

	public static final String MIGRTATION_TO_PRIMARY_PACKAGE_CONFIG_KEY = "migrtation_to_primary_package";

	public static final String ETISALAT_APPS_LIST_TITLE_FOR_IPHONE_EN_KEY = "etisalat_app_title_for_iphone";
	public static final String ETISALAT_APPS_LIST_TITLE_FOR_IPHONE_AR_KEY = "etisalat_app_title_for_iphone_ar";
	public static final String ETISALAT_APPS_LIST_TITLE_FOR_ANDRIOD_EN_KEY = "etisalat_app_title_for_andriod";
	public static final String ETISALAT_APPS_LIST_TITLE_FOR_ANDRIOD_AR_KEY = "etisalat_app_title_for_andriod_ar";
	public static final String ETISALAT_APPS_LIST_TITLE_FOR_IPAD_EN_KEY = "etisalat_app_title_for_ipad";
	public static final String ETISALAT_APPS_LIST_TITLE_FOR_IPAD_AR_KEY = "etisalat_app_title_for_ipad_ar";
	public static final String AUTH_OTP_PRIMARY_SERVICE_CODE_KEY = "auth_otp_primary_service_code";
	public static final String AUTH_OTP_NOT_ELIGIBLE_FOR_LOGIN_EN_KEY = "auth_otp_not_eligible_for_login_en";
	public static final String AUTH_OTP_NOT_ELIGIBLE_FOR_LOGIN_AR_KEY = "auth_otp_not_eligible_for_login_ar";
	public static final String NO_BILL_LIMIT_FOUND_FOR_ACCOUNT_EN_KEY = "no_bill_limit_found_for_account_en";
	public static final String NO_BILL_LIMIT_FOUND_FOR_ACCOUNT_AR_KEY = "no_bill_limit_found_for_account_ar";
	public static final String DATA_TRANSFER_INFO_CHARGES_PER_MB_CONFIG_KEY = "data_transfer_info_charges_per_mb";
	public static final String DATA_TRANSFER_INFO_MINIMUM_DATA_CONFIG_KEY = "data_transfer_info_minimum_data";
	public static final String DATA_TRANSFER_INFO_MINIMUM_DATA_UNIT_CONFIG_KEY = "data_transfer_info_minimum_data_unit";
	public static final String DATA_TRANSFER_INFO_MAXIMUM_DATA_CONFIG_KEY = "data_transfer_info_maximum_data";
	public static final String DATA_TRANSFER_INFO_MAXIMUM_DATA_UNIT_CONFIG_KEY = "data_transfer_info_maximum_data_unit";
	public static final String DATA_TRANSFER_INFO_DAYS_LEFT_CONFIG_KEY = "data_transfer_info_days_left";
	public static final String DATA_TRANSFER_INSUFFICENT_BALANCE_EN_KEY = "data_transfer_insufficent_balance_en";
	public static final String DATA_TRANSFER_INSUFFICENT_BALANCE_AR_KEY = "data_transfer_insufficent_balance_ar";
	public static final String DATA_TRANSFER_SERVICE_NOT_AVAILABLE_FOR_NUM_EN_KEY = "data_transfer_service_not_available_for_num_en";
	public static final String DATA_TRANSFER_SERVICE_NOT_AVAILABLE_FOR_NUM_AR_KEY = "data_transfer_service_not_available_for_num_ar";

	public static final String DATA_TRANSFER_SERVICE_NOT_AVAILABLE_FOR_NUM_DBT_EN_KEY = "data_transfer_service_not_available_for_num_dbt_en";
	public static final String DATA_TRANSFER_SERVICE_NOT_AVAILABLE_FOR_NUM_DBT_AR_KEY = "data_transfer_service_not_available_for_num_dbt_ar";

	public static final String DATA_TRANSFER_SERVICE_AVAILABLE_FOR_ACTIVE_ACC_EN_KEY = "data_transfer_service_available_for_active_acc_en";
	public static final String DATA_TRANSFER_SERVICE_AVAILABLE_FOR_ACTIVE_ACC_AR_KEY = "data_transfer_service_available_for_active_acc_ar";

	public static final String DATA_TRANSFER_SERVICE_AVAILABLE_FOR_ACTIVE_ACC_DBT_EN_KEY = "data_transfer_service_available_for_active_acc_dbt_en";
	public static final String DATA_TRANSFER_SERVICE_AVAILABLE_FOR_ACTIVE_ACC_DBT_AR_KEY = "data_transfer_service_available_for_active_acc_dbt_ar";

	public static final String BALANCE_TRANSFER_SERVICE_MINIMUM_AMOUNT_LIMIT_KEY = "balance_transfer_service_minimum_amount_limit";
	public static final String BALANCE_TRANSFER_SERVICE_REMAINING_DAILY_LIMIT_KEY = "balance_transfer_service_remaining_daily_limit";
	public static final String BALANCE_TRANSFER_SERVICE_REMAINING_MONTHLY_LIMIT_KEY = "balance_transfer_service_remaining_monthly_limit";
	public static final String BALANCE_TRANSFER_SERVICE_TRANSFER_FEE_PERCENTAGE_KEY = "balance_transfer_service_transfer_fee_percentage";

	public static final String DATA_TRANSFER_SERVICE_ONLY_TRANSFER_TO_ACTIVE_ETISALAT_ACC_EN_KEY = "data_transfer_service_only_transfer_to_active_etisalat_acc_en";
	public static final String DATA_TRANSFER_SERVICE_ONLY_TRANSFER_TO_ACTIVE_ETISALAT_ACC_AR_KEY = "data_transfer_service_only_transfer_to_active_etisalat_acc_ar";

	public static final String DATA_TRANSFER_SERVICE_MINIMUM_ALLOWED_AMOUNT_2_AED_AR_KEY = "data_transfer_service_minimum_allowed_amount_2_aed_ar";
	public static final String DATA_TRANSFER_SERVICE_MINIMUM_ALLOWED_AMOUNT_2_AED_EN_KEY = "data_transfer_service_minimum_allowed_amount_2_aed_en";

	public static final String DIGITAL_APP_WS_DATA_TRANSFER_SERVICE_REACHED_MONTHLY_LIMIT_AR_KEY = "data_transfer_service_reached_monthly_limit_ar";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_SERVICE_REACHED_MONTHLY_LIMIT_EN_KEY = "data_transfer_service_reached_monthly_limit_en";

	public static final String DIGITAL_APP_WS_DATA_TRANSFER_SERVICE_REACHED_MONTHLY_LIMIT_DBT_AR_KEY = "data_transfer_service_reached_monthly_limit_dbt_ar";
	public static final String DIGITAL_APP_WS_DATA_TRANSFER_SERVICE_REACHED_MONTHLY_LIMIT_DBT_EN_KEY = "data_transfer_service_reached_monthly_limit_dbt_en";

	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_DISABLED_ON_ACCOUNT_AR_KEY = "data_transfer_error_code_service_disabled_on_account_ar";
	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_DISABLED_ON_ACCOUNT_EN_KEY = "data_transfer_error_code_service_disabled_on_account_en";

	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_AMOUNT_EXCEED_LIMIT_AR_KEY = "amount_is_axceeding_limit_ar";
	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_AMOUNT_EXCEED_LIMIT_EN_KEY = "amount_is_axceeding_limit_en";
	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_YOUR_BALANCE_IS_NOT_ENOUGH_AR_KEY = "data_transfer_error_code_service_your_balance_is_not_enough_ar";
	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_YOUR_BALANCE_IS_NOT_ENOUGH_EN_KEY = "data_transfer_error_code_service_your_balance_is_not_enough_en";

	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_DAILY_LIMIT_EXCEEDED_AR_KEY = "data_transfer_error_code_service_daily_limit_exceeded_ar";
	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_DAILY_LIMIT_EXCEEDED_EN_KEY = "data_transfer_error_code_service_daily_limit_exceeded_en";

	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_MONTHLY_LIMIT_EXCEEDED_AR_KEY = "data_transfer_error_code_service_monthly_limit_exceeded_ar";
	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_MONTHLY_LIMIT_EXCEEDED_EN_KEY = "data_transfer_error_code_service_monthly_limit_exceeded_en";

	public static final String GRAPH_SERVICE_USAGE_DARK_GREEN_IMAGE_URL_KEY = "graph_service_usage_dark_green_image_url";
	public static final String GRAPH_SERVICE_USAGE_LIGHT_GREEN_IMAGE_URL_KEY = "graph_service_usage_light_green_image_url";
	public static final String GRAPH_SERVICE_USAGE_COLOR_NUMBER_EXPRESSION = "graph_service_usage_color_";

	public static final String GRAPH_SERVICE_USAGE_CALL_LOCAL_CALLS_COLOR_KEY = "graph_service_usage_call_local_calls_color";
	public static final String GRAPH_SERVICE_USAGE_CALL_INTL_CALLS_COLOR_KEY = "graph_service_usage_call_intl_calls_color";
	public static final String GRAPH_SERVICE_USAGE_CALL_INCOMING_ROAMING_CALLS_COLOR_KEY = "graph_service_usage_call_incoming_roaming_calls_color";
	public static final String GRAPH_SERVICE_USAGE_CALL_OUT_GOING_ROAMING_CALLS_COLOR_KEY = "graph_service_usage_call_out_going_roaming_calls_color";
	public static final String GRAPH_SERVICE_USAGE_CALL_VIDEO_CALLS_COLOR_KEY = "graph_service_usage_call_video_calls_color";
	public static final String GRAPH_SERVICE_USAGE_CALL_OTHER_CALLS_COLOR_KEY = "graph_service_usage_call_other_calls_color";

	public static final String GRAPH_SERVICE_USAGE_MESSAGE_LOCAL_MSG_COLOR_KEY = "graph_service_usage_message_local_msg_color";
	public static final String GRAPH_SERVICE_USAGE_MESSAGE_INTL_MSG_COLOR_KEY = "graph_service_usage_message_intl_msg_color";
	public static final String GRAPH_SERVICE_USAGE_MESSAGE_OTHER_MSG_COLOR_KEY = "graph_service_usage_message_other_msg_color";

	public static final String GRAPH_SERVICE_USAGE_DATA_LOCAL_DATA_COLOR_KEY = "graph_service_usage_data_local_data_color";
	public static final String GRAPH_SERVICE_USAGE_DATA_ROAMING_DATA_COLOR_KEY = "graph_service_usage_data_roaming_data_color";

	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_ACCOUNT_TEMPORARY_BLOCKED_AR_KEY = "data_transfer_error_code_service_account_temporary_blocked_ar";
	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_ACCOUNT_TEMPORARY_BLOCKED_EN_KEY = "data_transfer_error_code_service_account_temporary_blocked_en";

	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_DBT_AVAILABLE_FOR_POSTPAID_ACCOUNTS_THAT_ARE_ATLEAST_3_MONTHS_WITH_WITH_ETISALAT_EN_KEY = "data_transfer_error_code_service_dbt_available_for_postpaid_accounts_that_are_atleast_3_months_with_with_etisalat_en";
	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_DBT_AVAILABLE_FOR_POSTPAID_ACCOUNTS_THAT_ARE_ATLEAST_3_MONTHS_WITH_WITH_ETISALAT_AR_KEY = "data_transfer_error_code_service_dbt_available_for_postpaid_accounts_that_are_atleast_3_months_with_with_etisalat_ar";

	public static final String CREDIT_TRANSFER_ERROR_CODE_EXCEEDED_MAX_TRANSACTION_LIMIT_EN_KEY = "credit_transfer_error_code_exceeded_max_transaction_limit_en";
	public static final String CREDIT_TRANSFER_ERROR_CODE_EXCEEDED_MAX_TRANSACTION_LIMIT_AR_KEY = "credit_transfer_error_code_exceeded_max_transaction_limit_ar";

	public static final String DATA_TRANSFER_ERROR_CODE_EXCEEDED_MAX_TRANSACTION_LIMIT_EN_KEY = "data_transfer_error_code_exceeded_max_transaction_limit_en";
	public static final String DATA_TRANSFER_ERROR_CODE_EXCEEDED_MAX_TRANSACTION_LIMIT_AR_KEY = "data_transfer_error_code_exceeded_max_transaction_limit_ar";

	public static final String CREDIT_TRANSFER_ERROR_CODE_EXCEEDED_MIN_TRANSACTION_LIMIT_EN_KEY = "credit_transfer_error_code_exceeded_min_transaction_limit_en";
	public static final String CREDIT_TRANSFER_ERROR_CODE_EXCEEDED_MIN_TRANSACTION_LIMIT_AR_KEY = "credit_transfer_error_code_exceeded_min_transaction_limit_ar";

	public static final String DATA_TRANSFER_ERROR_CODE_EXCEEDED_MIN_TRANSACTION_LIMIT_EN_KEY = "data_transfer_error_code_exceeded_min_transaction_limit_en";
	public static final String DATA_TRANSFER_ERROR_CODE_EXCEEDED_MIN_TRANSACTION_LIMIT_AR_KEY = "data_transfer_error_code_exceeded_min_transaction_limit_ar";

	public static final String CREDIT_TRANSFER_ERROR_CODE_SERVICE_NOT_AVAILABLE_EN_KEY = "credit_transfer_error_code_service_not_available_en";
	public static final String CREDIT_TRANSFER_ERROR_CODE_SERVICE_NOT_AVAILABLE_AR_KEY = "credit_transfer_error_code_service_not_available_ar";

	public static final String CREDIT_TRANSFER_ERROR_CODE_FACING_PROBLEM_EN_KEY = "credit_transfer_error_code_facing_problem_en";
	public static final String CREDIT_TRANSFER_ERROR_CODE_FACING_PROBLEM_AR_KEY = "credit_transfer_error_code_facing_problem_ar";

	public static final String CREDIT_TRANSFER_ERROR_CODE_ENTER_VALID_NUMBER_EN_KEY = "credit_transfer_error_code_enter_valid_number_en";
	public static final String CREDIT_TRANSFER_ERROR_CODE_ENTER_VALID_NUMBER_AR_KEY = "credit_transfer_error_code_enter_valid_number_ar";

	public static final String CREDIT_TRANSFER_ERROR_CODE_ENTER_VALID_NUMBER2_EN_KEY = "credit_transfer_error_code_enter_valid_number2_en";
	public static final String CREDIT_TRANSFER_ERROR_CODE_ENTER_VALID_NUMBER2_AR_KEY = "credit_transfer_error_code_enter_valid_number2_ar";

	public static final String CREDIT_TRANSFER_ERROR_CODE_SENDER_AND_RECIEVER_SAME_EN_KEY = "credit_transfer_error_code_sender_and_reciever_same_en";
	public static final String CREDIT_TRANSFER_ERROR_CODE_SENDER_AND_RECIEVER_SAME_AR_KEY = "credit_transfer_error_code_sender_and_reciever_same_ar";

	public static final String CREDIT_TRANSFER_ERROR_CODE_ENTER_VALID_PREPAID_NUMBER_EN_KEY = "credit_transfer_error_code_enter_valid_prepaid_number_en";
	public static final String CREDIT_TRANSFER_ERROR_CODE_ENTER_VALID_PREPAID_NUMBER_AR_KEY = "credit_transfer_error_code_enter_valid_prepaid_number_ar";

	public static final String CREDIT_TRANSFER_ERROR_CODE_EXCEEDED_MONTHLY_LIMIT_EN_KEY = "credit_transfer_error_code_exceeded_monthly_limit_en";
	public static final String CREDIT_TRANSFER_ERROR_CODE_EXCEEDED_MONTHLY_LIMIT_AR_KEY = "credit_transfer_error_code_exceeded_monthly_limit_ar";

	public static final String CREDIT_TRANSFER_ERROR_CODE_NOT_ENOUGH_BALANCE_EN_KEY = "credit_transfer_error_code_not_enough_balance_en";
	public static final String CREDIT_TRANSFER_ERROR_CODE_NOT_ENOUGH_BALANCE_AR_KEY = "credit_transfer_error_code_not_enough_balance_ar";

	public static final String CREDIT_TRANSFER_ERROR_CODE_ACCOUNT_IS_TOSSED_EN_KEY = "credit_transfer_error_code_account_is_tossed_en";
	public static final String CREDIT_TRANSFER_ERROR_CODE_ACCOUNT_IS_TOSSED_AR_KEY = "credit_transfer_error_code_account_is_tossed_ar";

	public static final String CREDIT_TRANSFER_ERROR_CODE_SERVICE_NOT_AVAILABLE2_EN_KEY = "credit_transfer_error_code_service_not_available2_en";
	public static final String CREDIT_TRANSFER_ERROR_CODE_SERVICE_NOT_AVAILABLE2_AR_KEY = "credit_transfer_error_code_service_not_available2_ar";

	public static final String CREDIT_TRANSFER_ERROR_CODE_RECIPIENT_ACCOUNT_IS_NOT_ACTIVE_EN_KEY = "credit_transfer_error_code_recipient_account_is_not_active_en";
	public static final String CREDIT_TRANSFER_ERROR_CODE_RECIPIENT_ACCOUNT_IS_NOT_ACTIVE_AR_KEY = "credit_transfer_error_code_recipient_account_is_not_active_ar";

	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_NOT_AVAILABLE_EN_KEY = "data_transfer_error_code_service_not_available_en";
	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_NOT_AVAILABLE_AR_KEY = "data_transfer_error_code_service_not_available_ar";

	public static final String DATA_TRANSFER_ERROR_CODE_FACING_PROBLEM_EN_KEY = "data_transfer_error_code_facing_problem_en";
	public static final String DATA_TRANSFER_ERROR_CODE_FACING_PROBLEM_AR_KEY = "data_transfer_error_code_facing_problem_ar";

	public static final String DATA_TRANSFER_ERROR_CODE_ENTER_VALID_NUMBER_EN_KEY = "data_transfer_error_code_enter_valid_number_en";
	public static final String DATA_TRANSFER_ERROR_CODE_ENTER_VALID_NUMBER_AR_KEY = "data_transfer_error_code_enter_valid_number_ar";

	public static final String DATA_TRANSFER_ERROR_CODE_ENTER_VALID_NUMBER2_EN_KEY = "data_transfer_error_code_enter_valid_number2_en";
	public static final String DATA_TRANSFER_ERROR_CODE_ENTER_VALID_NUMBER2_AR_KEY = "data_transfer_error_code_enter_valid_number2_ar";

	public static final String DATA_TRANSFER_ERROR_CODE_SENDER_AND_RECIEVER_SAME_EN_KEY = "data_transfer_error_code_sender_and_reciever_same_en";
	public static final String DATA_TRANSFER_ERROR_CODE_SENDER_AND_RECIEVER_SAME_AR_KEY = "data_transfer_error_code_sender_and_reciever_same_ar";

	public static final String DATA_TRANSFER_ERROR_CODE_ENTER_VALID_PREPAID_NUMBER_EN_KEY = "data_transfer_error_code_enter_valid_prepaid_number_en";
	public static final String DATA_TRANSFER_ERROR_CODE_ENTER_VALID_PREPAID_NUMBER_AR_KEY = "data_transfer_error_code_enter_valid_prepaid_number_ar";

	public static final String DATA_TRANSFER_ERROR_CODE_EXCEEDED_MONTHLY_LIMIT_EN_KEY = "data_transfer_error_code_exceeded_monthly_limit_en";
	public static final String DATA_TRANSFER_ERROR_CODE_EXCEEDED_MONTHLY_LIMIT_AR_KEY = "data_transfer_error_code_exceeded_monthly_limit_ar";

	public static final String DATA_TRANSFER_ERROR_CODE_NOT_ENOUGH_BALANCE_EN_KEY = "data_transfer_error_code_not_enough_balance_en";
	public static final String DATA_TRANSFER_ERROR_CODE_NOT_ENOUGH_BALANCE_AR_KEY = "data_transfer_error_code_not_enough_balance_ar";

	public static final String DATA_TRANSFER_ERROR_CODE_ACCOUNT_IS_TOSSED_EN_KEY = "data_transfer_error_code_account_is_tossed_en";
	public static final String DATA_TRANSFER_ERROR_CODE_ACCOUNT_IS_TOSSED_AR_KEY = "data_transfer_error_code_account_is_tossed_ar";

	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_NOT_AVAILABLE2_EN_KEY = "data_transfer_error_code_service_not_available2_en";
	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_NOT_AVAILABLE2_AR_KEY = "data_transfer_error_code_service_not_available2_ar";

	public static final String DATA_TRANSFER_ERROR_CODE_RECIPIENT_ACCOUNT_IS_NOT_ACTIVE_EN_KEY = "data_transfer_error_code_recipient_account_is_not_active_en";
	public static final String DATA_TRANSFER_ERROR_CODE_RECIPIENT_ACCOUNT_IS_NOT_ACTIVE_AR_KEY = "data_transfer_error_code_recipient_account_is_not_active_ar";

	public static final String DATA_TRANSFER_ERROR_CODE_INVALID_ELIGIBLE_DATA_PLAN_EN_KEY = "data_transfer_error_code_invalid_eligible_data_plan_en";
	public static final String DATA_TRANSFER_ERROR_CODE_INVALID_ELIGIBLE_DATA_PLAN_AR_KEY = "data_transfer_error_code_invalid_eligible_data_plan_ar";

	public static final String FORGOT_USERNAME_ERROR_CODE_INVALID_DETAILS_AR_KEY = "forgot_username_error_code_invalid_details_ar";
	public static final String FORGOT_USERNAME_ERROR_CODE_INVALID_DETAILS_EN_KEY = "forgot_username_error_code_invalid_details_en";

	public static final String RE_REGISTRATION_ERROR_CODE_INVALID_EMIRATES_ID_EN_KEY = "re_registration_error_code_invalid_emirates_id_en";
	public static final String RE_REGISTRATION_ERROR_CODE_INVALID_EMIRATES_ID_AR_KEY = "re_registration_error_code_invalid_emirates_id_ar";

	public static final String CANCEL_SERVICE_SUCCESS_ERROR_CODE_AR_KEY = "cancel_service_success_error_code_ar";
	public static final String CANCEL_SERVICE_SUCCESS_ERROR_CODE_EN_KEY = "cancel_service_success_error_code_en";

	public static final int DATA_TRANSFER_INFO_ATTEMPTS_LEFT_CONFIG_KEY = 2;
	public static final String SET_BILL_LIMIT_NO_LIMIT_ID_CONFIG_KEY = "set_bill_limit_no_limit_id";

	public static final String SET_BILL_LIMIT_SERVICE_NO_MAPPING_FOUND_FOR_DEMAND_ID_AR_KEY = "set_bill_limit_service_no_mapping_found_for_demand_id_ar";
	public static final String SET_BILL_LIMIT_SERVICE_NO_MAPPING_FOUND_FOR_DEMAND_ID_EN_KEY = "set_bill_limit_service_no_mapping_found_for_demand_id_en";
	public static final String SET_BILL_LIMIT_SERVICE_INVALID_ACCCOUNT_AR_KEY = "set_bill_limit_service_invalid_acccount_ar";
	public static final String SET_BILL_LIMIT_SERVICE_INVALID_ACCCOUNT_EN_KEY = "set_bill_limit_service_invalid_acccount_en";

	public static final String SET_BILL_LIMIT_SERVICE_REQUEST_ALREADY_IN_PROCCESS_FOR_ACCOUNT_AR_KEY = "set_bill_limit_service_request_already_in_proccess_for_account_ar";
	public static final String SET_BILL_LIMIT_SERVICE_REQUEST_ALREADY_IN_PROCCESS_FOR_ACCOUNT_EN_KEY = "set_bill_limit_service_request_already_in_proccess_for_account_en";
	public static final String SET_BILL_LIMIT_ERROR_CODE_RESTRICTED_FOR_ACCOUNT_AR_KEY = "set_bill_limit_error_code_restricted_for_account_ar";
	public static final String SET_BILL_LIMIT_ERROR_CODE_RESTRICTED_FOR_ACCOUNT_EN_KEY = "set_bill_limit_error_code_restricted_for_account_en";

	public static final String SET_BILL_LIMIT_SERVICE_BILL_LIMIT_NOT_ALLOWED_AR_KEY = "set_bill_limit_service_bill_limit_not_allowed_ar";
	public static final String SET_BILL_LIMIT_SERVICE_BILL_LIMIT_NOT_ALLOWED_EN_KEY = "set_bill_limit_service_bill_limit_not_allowed_en";

	public static final String GET_EXIT_CHARGES_SERVICE_CURRENT_RENTAL_CHARGE_AR_KEY = "get_exit_charges_service_current_rental_charge_ar";
	public static final String GET_EXIT_CHARGES_SERVICE_CURRENT_RENTAL_CHARGE_EN_KEY = "get_exit_charges_service_current_rental_charge_en";

	public static final String GET_EXIT_CHARGES_SERVICE_OUTSTANDING_AMOUNT_AR_KEY = "get_exit_charges_service_outstanding_amount_ar";
	public static final String GET_EXIT_CHARGES_SERVICE_OUTSTANDING_AMOUNT_EN_KEY = "get_exit_charges_service_outstanding_amount_en";

	public static final String GET_EXIT_CHARGES_SERVICE_ONLINE_DUES_AR_KEY = "get_exit_charges_service_online_dues_ar";
	public static final String GET_EXIT_CHARGES_SERVICE_ONLINE_DUES_EN_KEY = "get_exit_charges_service_online_dues_en";

	public static final String GET_EXIT_CHARGES_SERVICE_EXIT_DUES_AR_KEY = "get_exit_charges_service_exit_dues_ar";
	public static final String GET_EXIT_CHARGES_SERVICE_EXIT_DUES_EN_KEY = "get_exit_charges_service_exit_dues_en";

	public static final String CHECK_ELIGIBILITY_SERVICE_SUCCESS_ERROR_CODE_AR_KEY = "check_eligibility_service_success_error_code_ar";
	public static final String CHECK_ELIGIBILITY_SERVICE_SUCCESS_ERROR_CODE_EN_KEY = "check_eligibility_service_success_error_code_en";
	public static final String CHECK_ELIGIBILITY_SERVICE_EILIBILITY_FAILED_ERROR_CODE_AR_KEY = "check_eligibility_service_eilibility_failed_error_code_ar";
	public static final String CHECK_ELIGIBILITY_SERVICE_EILIBILITY_FAILED_ERROR_CODE_EN_KEY = "check_eligibility_service_eilibility_failed_error_code_en";

	public static final String MIGRATE_SERVICE_PENDING_ORDER_FOUND_ERROR_CODE_AR_KEY = "migrate_service_pending_order_found_error_code_ar";
	public static final String MIGRATE_SERVICE_PENDING_ORDER_FOUND_ERROR_CODE_EN_KEY = "migrate_service_pending_order_found_error_code_en";
	public static final String UNSUBSCRIBE_ADDON_SERVICE_PENDING_REQUEST_ERROR_CODE_EN_KEY = "unsubscribe_addon_service_pending_request_error_code_en";
	public static final String UNSUBSCRIBE_ADDON_SERVICE_PENDING_REQUEST_ERROR_CODE_AR_KEY = "unsubscribe_addon_service_pending_request_error_code_ar";
	
	public static final String GET_ADDON_DETAILS_PREFERED_NUMBER_AR_KEY = "get_addon_details_prefered_number_ar";
	public static final String GET_ADDON_DETAILS_PREFERED_NUMBER_EN_KEY = "get_addon_details_prefered_number_en";
	public static final String TRANSACTION_LOGGING_ENABLED_KEY = "transaction_logging_enabled";
	public static final String TRANSACTION_LOGGING_BACK_END_ENABLED_KEY = "transaction_logging_back_end_enabled";
	public static final String UNSUBSCRIBE_ADDON_SERVICE_CBCM_ADDITIONAL_INFO_REQUEST_CONFIG_KEY = "unsubscribe_addon_service_cbcm_additional_info_request";
	public static final String SUBSCRIBE_ADDON_SERVICE_CBCM_ADDITIONAL_INFO_REQUEST_CONFIG_KEY = "subscribe_addon_service_cbcm_additional_info_request";
	public static final String SUBSCRIBE_HOMEZONE_SERVICE_CBCM_ADDITIONAL_INFO_REQUEST_CONFIG_KEY = "subscribe_homezone_service_cbcm_additional_info_request";

	/*
	 * DELETE FROM DB public static final String
	 * CANCEL_SERVICE_SUCCESS_ERROR_CODE_AR_KEY =
	 * "cancel_service_success_error_code_ar"; public static final String
	 * CANCEL_SERVICE_SUCCESS_ERROR_CODE_EN_KEY =
	 * "cancel_service_success_error_code_en";
	 */public static final String UNSUBSCRIBE_ADDON_SERVICE_SUCCESS_ERROR_CODE_EN_KEY = "unsubscribe_addon_service_success_error_code_en";
	public static final String EPG_PAY_FOR_OTHERS_POSTPAID_MAX_LIMIT_ERROR_CODE_AR_KEY = "epg_pay_for_others_postpaid_max_limit_error_code_ar";
	public static final String EPG_PAY_FOR_OTHERS_POSTPAID_MAX_LIMIT_ERROR_CODE_EN_KEY = "epg_pay_for_others_postpaid_max_limit_error_code_en";
	public static final String UNSUBSCRIBE_ADDON_SERVICE_SUCCESS_ERROR_CODE_AR_KEY = "unsubscribe_addon_service_success_error_code_ar";

	public static final String COMS_ERROR_CODE_CONTRACT_PLAN_ALREADY_SUBSCRIBED_EN_KEY = "coms_error_code_contract_plan_already_subscribed_en";
	public static final String COMS_ERROR_CODE_CONTRACT_PLAN_ALREADY_SUBSCRIBED_AR_KEY = "coms_error_code_contract_plan_already_subscribed_ar";

	public static final String COMS_ERROR_CODE_CUSTOMER_IS_NOT_SUBSCRIBED_TO_REQUEST_SERVICE_AR_KEY = "coms_error_code_customer_is_not_subscribed_to_request_service_ar";
	public static final String COMS_ERROR_CODE_CUSTOMER_IS_NOT_SUBSCRIBED_TO_REQUEST_SERVICE_EN_KEY = "coms_error_code_customer_is_not_subscribed_to_request_service_en";

	public static final String COMS_ERROR_CODE_ORDER_LEVEL_MUTUAL_EXCLUSION_AR_KEY = "coms_error_code_order_level_mutual_exclusion_ar";
	public static final String COMS_ERROR_CODE_ORDER_LEVEL_MUTUAL_EXCLUSION_EN_KEY = "coms_error_code_order_level_mutual_exclusion_en";

	public static final String SUBSCRIBE_ADDON_UN_SUBSCRIBE_SUCCESS_CONFIG_KEY = "subscribe_addon_un_subscribe_success_"; // language
																															// will
																															// append
																															// from
	public static final String DIGITAL_APP_WS_RTF_RESPONSE_VAL_00019_CONFIG_KEY = "digital_app_ws_rtf_response_val_00019_config_key_";																														// code
	
	public static final String MINIMUM_PREPAID_RECHARGE_AMOUNT_KEY = "minimum_prepaid_recharge_amount";
	public static final String MAXIMUM_PREPAID_RECHARGE_AMOUNT_KEY = "maximum_prepaid_recharge_amount";
	
	public static final String EPG_PAYMENT_DISABLE_CONFIG_KEY = "epg_disable_payment";
	public static final String smart_living_enable = "smart_living_enable";
	public static final String elife_change_plan_enable = "elife_change_plan_enable";
	
	public static final String planChangeMigrationEnable = "planChangeMigrationEnable";
	public static final String FAMLIY_PACK_USAGE_UPATED_DATE_FLAG = "family_pack_usage_upated_date_flag";
	public static final String PAYMENT_LIMIT_0_LIMIT_EXCEED_FLAG = "payment_limit_0_limit_exceed_flag";
	public static final String PAYMENT_LIMIT_USER_NAME_TO_LOWERCASE_FLAG = "payment_limit_user_name_to_lowercase_flag";
	
	public static final String AUTO_PAY_FIN_EX_STOR_ENABLE = "auto_pay_fin_ex_stor_enable";
	public static final String EPG_PAYMENT_DISABLE_MESSAGE_EN_KEY = "epg_payment_disable_message_en";
	public static final String EPG_PAYMENT_DISABLE_MESSAGE_AR_KEY = "epg_payment_disable_message_ar";
	
	
	public static final String CATALOG_MANAGEMENT_SERVICE_URL = "catalog_management_service_url";
	public static final String VATABLE_CONFIGURATION_EXCLUDED= "vatable_configuration_excluded";
	public static final String VATABLE_CONFIGURATION_INCLUDED= "vatable_configuration_included";
	
	
	public static final String WHERE_MY_DATA_GO_DISABLE_AR = "where_my_data_go_disable_ar";
	public static final String WHERE_MY_DATA_GO_DISABLE_EN = "where_my_data_go_disable_en";
	
	
	// GUEST ACCESS
	public static final Integer GUEST_ACCESS = 0;

	
	
	
	public static final String PAYMENT_RULE_LIMIT_EXCEED_AR_KEY = "payment_rule_exceed_ar";
	public static final String PAYMENT_RULE_LIMIT_EXCEED_EN_KEY = "payment_rule_exceed_en";
	public static final String TAB_SERVICE_NO_DATA_FOUND_FOR_ACTIVE_RATE_PLANS_EN_KEY = "tab_service_no_data_found_for_active_rate_plans_en";
	public static final String TAB_SERVICE_NO_DATA_FOUND_FOR_ACTIVE_RATE_PLANS_AR_KEY = "tab_service_no_data_found_for_active_rate_plans_ar";

	// DIGITAL_APP_WS_PAYMENT_RULE_LIMIT_EXCEED

	/*
	 * public static final String
	 * COMS_ERROR_CODE_CONTRACT_PLAN_ALREADY_SUBSCRIBED = "E150";
	 * 
	 * public static final String
	 * COMS_ERROR_CODE_CUSTOMER_IS_NOT_SUBSCRIBED_TO_REQUEST_SERVICE = "E07";
	 */
	/*
	 * ########################################### MessageControllerConstantsIfc
	 * ################################################
	 */

	public static final String DIGITAL_APP_SYSTEM_NAME = "DigitalApp";

	public static final String BILL_INVOICE_URL_TEMPLATE_CONFIG_KEY = "bill_invoice_url_template";

	public static final String DIGITAL_APP_OTP_EXPIRY_SECONDS_CONFIG_KEY = "otp_expiry_seconds";
	public static final String DIGITAL_APP_OTP_TEXT_CONFIG_KEY = "otp_text";
	public static final String DIGITAL_APP_ROAMING_OPTION_ID_CONFIG_KEY = "roaming_option_id";

	/*
	 * Loyalty APP Services
	 */
	public static final String LOYALTY_APP_SRVC_ADDRESS_CONFIG_KEY = "loyalty_app_srvc_address";
	public static final String LOYALTY_APP_SRVC_CHANNEL_CONFIG_KEY = "loyalty_app_srvc_channel_config_key";
	public static final String LOYALTY_APP_SRVC_PARTNER_TYPE_CONFIG_KEY = "loyalty_app_srvc_partner_type_config_key";
	public static final String LOYALTY_APP_SRVC_PARTNER_FILTER_FLAG_CONFIG_KEY = "loyalty_app_srvc_partner_filter_flag_config_key";
	public static final String LOYALTY_APP_SRVC_GET_OFFER_DETAILS_FILTER_FLAG = "OFFER";
	public static final String LOYALTY_APP_SRVC_GET_ALL_OFFERS_FILTER_FLAG = "ALL";
	public static final String LOYALTY_APP_SRVC_PARTNER_DETAILS_FILTER_FLAG_CONFIG_KEY = "loyalty_app_srvc_partner_details_filter_flag_config_key";
	public static final String LOYALTY_APP_PAYMENT_BILL_CONFIG_KEY = "loyalty_app_payment_bill";
	public static final String LOYALTY_APP_PAYMENT_RECHARGE_CONFIG_KEY = "loyalty_app_payment_recharge";
	public static final String LOYALTY_APP_PRIMARY_PACKAGE_CONFIG_KEY = "loyalty_app_primary_package";

	/**
	 * 
	 * CBCM
	 * 
	 * */

	public static final String CBCM_UPDATE_INVOICE_DETAIL_WEB_SERVICE_ADDRESS_CONFIG_KEY = "cbcm_update_invoice_detail_web_service_address";
	public static final String CBCM_INS_TEL_DETAILS_SERVICE_ADDRESS_CONFIG_KEY = "cbcm_ins_tel_details_service_address";
	public static final String CBCM_EBILL_REGISTRATION_SERVICE_ADDRESS_CONFIG_KEY = "cbcm_ebill_registration_service_address";

	/*
	 * Loyalty Services
	 */
	public static final String LOYALTY_SRVC_ADDRESS_CONFIG_KEY = "loyalty_srvc_address";
	public static final String LOYALTY_SRVC_CHANNEL_CONFIG_KEY = "loyalty_srvc_channel_config_key";
	public static final String LOYALTY_SRVC_USERNAME_CONFIG_KEY = "loyalty_srvc_username";
	public static final String LOYALTY_SRVC_PASSWORD_CONFIG_KEY = "loyalty_srvc_password";
	public static final String LOYALTY_SRVC_ACCRUAL_PARTNER_CODE_CONFIG_KEY = "loyalty_accrual_partner_code";
	public static final String LOYALTY_SRVC_ACCRUAL_SHOP_CODE_CONFIG_KEY = "loyalty_accrual_shop_code";
	public static final String LOYALTY_SRVC_ENROLL_ACTION = "ENROLL";
	public static final String LOYALTY_ACCRUAL_AMOUNT_CONFIG_KEY = "loyalty_accrual_amount";
	public static final String LOYALTY_PAYMENT_ACCRUAL_AMOUNT_CONFIG_KEY = "loyalty_payment_accrual_amount";
	public static final String LOYALTY_PAYMENT_RESERVATION_TIME_CONFIG_KEY = "loyalty_payment_reservation_time";

	/*
	 * Unified Marketing Services
	 */

	public static final String UNIFIED_MARKETING_SRVC_ADDRESS_CONFIG_KEY = "unified_marketing_srvc_address";
	public static final String CRM_ACCOUNT_DETAILS_ADDRESS_CONFIG_KEY = "crm_account_details_inquiry_address";
	public static final String GENERIC_SMS_SERVICE_ADDRESS_CONFIG_KEY = "generic_sms_service_address";
	public static final String PAYMENT_SERVICE_CONFIG_KEY = "payment_service_url";

	/**
	 * TIBCO Services
	 * **/

	public static final String TIBCO_USAGE_INQUIRY_SERVICE_ADDRESS_CONFIG_KEY = "tibco_usage_inquiry_service_address";
	public static final String TIBCO_GENRIC_PAYMENT_SERVICE_ADDRESS_CONFIG_KEY = "tibco_genric_payment_service_address";
	public static final String TIBCO_BILL_INQUIRY_SERVICE_CONFIG_KEY = "tibco_bill_inquiry_service";
	public static final String TIBCO_RECHARGE_BY_SCRATCH_CARD_SERVICE_CONFIG_KEY = "tibco_recharge_by_scratch_card_service";

	/**
	 * ATG Services
	 */
	public static final String ATG_RE_REGISTRATION_SERVICE_CONFIG_KEY = "atg_re_registration_service";
	public static final String ATG_RE_REGISTRATION_SERVICE_USER_NAME_CONFIG_KEY = "atg_re_registration_service_username";
	public static final String ATG_RE_REGISTRATION_SERVICE_PASSWORD_CONFIG_KEY = "atg_re_registration_service_password";
	public static final String ATG_RE_REGISTRATION_SERVICE_SUCCESS_RESPONSE_CODE = "SCP_RE_RGST_00";
	public static final String ATG_RE_REGISTRATION_CHANNEL_NAME = "atg_re_registration_channel_name";

	/**
	 * Services
	 * 
	 * */

	public static final String EMCAIS_MCPS_SERVICE_ADDRESS_CONFIG_KEY = "emcais_mcps_service_address";
	public static final String BALANCE_TRANSFER_SERVICE_ADDRESS_CONFIG_KEY = "balance_transfer_service_address";
	public static final String SEND_NOTIFICATION_SERVICE_ADDRESS_CONFIG_KEY = "send_notification_service_address";
	public static final String CANVAS_PAY_FOR_ME_CALL_SERVICE_ADDRESS_CONFIG_KEY = "canvas_pay_for_me_call_service_address";
	public static final String EMCAIS_COMS_SELF_CARE_SERVICE_ADDRESS_CONFIG_KEY = "emcais_coms_self_care_service_address";

	/**
	 * International Credit Transfer WSDL
	 */
	public static final String GLOTRANSFER_INTERNATIONAL_CREDIT_TX_SRVC_ADDRESS_CONFIG_KEY = "glotransfer_international_credit_tx_srvc_address";
	public static final String GLOTRANSFER_INTERNATIONAL_CREDIT_TX_SRVC_USER_ID_CONFIG_KEY = "glotransfer_international_credit_tx_srvc_user_id";
	public static final String GLOTRANSFER_INTERNATIONAL_CREDIT_TX_SRVC_PASSWORD_CONFIG_KEY = "glotransfer_international_credit_tx_srvc_password";

	/**
	 * Etisalat_GloTransferSoapStub
	 */
	public static final String GLOTRANSFER_REQUEST_RELOAD_SRVC_ADDRESS_CONFIG_KEY = "glotransfer_request_reload_srvc_address";
	public static final String GLOTRANSFER_REQUEST_RELOAD_SRVC_USER_ID_CONFIG_KEY = "glotransfer_request_reload_srvc_user_id";
	public static final String GLOTRANSFER_REQUEST_RELOAD_SRVC_PASSWORD_CONFIG_KEY = "glotransfer_request_reload_srvc_password";

	/**
	 * COMS Service
	 */
	public static final String COMS_CREATE_BUNDLE_ORDER_SERVICE_ADDRESS_CONFIG_KEY = "coms_create_bundle_order_service_address";

	/**
	 * CIMHUB Service
	 */
	public static final String CIMHUB_POSTPAID_MIGRATION_USAGE_INQUIRY_SERVICE_ADDRESS_CONFIG_KEY = "cimhub_postpaid_migration_usage_inquiry_service_address";

	/**
	 * TIBCO INCommunicateManagement
	 */

	public static final String IN_COMMUNICATTION_MANAGEMENT_SERVICE_ADDRESS_CONFIG_KEY = "in_communicattion_management_service_address_config_key";

	/*
	 * ########################################### ErrorCodesIfc
	 * ################################################
	 */
	public static final String TIBCO_USAGE_INQUIRY_NO_BILL_LIMIT_FOUND_ON_ACCOUNT = "TIB_1001";
	public static final String TIBCO_ERROR_CODE_TIB_999 = "TIB-999";
	public static final String TIBCO_ERROR_CODE_ODS_1 = "ODS-1";
	public static final String TIBCO_USAGE_INQUIRY_NO_BILL_LIMIT_STR_ERROR = "No Limit";

	public static final String DIGITAL_APP_VALIDATION_MESSAGES_BUNDLE_NAME = "ae.digital.app.web.resources";

	public static final String BASE_RESPONSE_CODE = "digital.app.error.";

	public static final String DIGITAL_APP_WS_MISSING_AUTH_TOKEN_RESPONSE_CODE = "token_001";

	public static final String DIGITAL_APP_WS_MISSING_IMAGE_URL = "http://www.illuminessensce.com/wp-content/uploads/2012/12/Image-Coming-Soon-Placeholder.png";

	public static final String SSO_PORTAL_LOGIN_SERVICE_URL_CONFIG_KEY = "sso_portal_login_srvc_url";
	public static final String CUSTOMER_INQUIRY_SERVICE_URL_CONFIG_KEY = "customer_inquiry_srvc_url";
	public static final String IN_COMMUNICATION_MANAGEMENT_SERVICE_URL_CONFIG_KEY = "in_communication_management_srvc_url";
	public static final String GENERIC_INQUIRY_SERVICE_URL_CONFIG_KEY = "generic_inquiry_srv_url";
	public static final String USAGES_INQUIRY_SERVICE_URL_CONFIG_KEY = "usage_inquiry_service_url";
	public static final String RE_REGISTRATION_ELIGIBILITY_SERVICE_URL_CONFIG_KEY = "re_registration_eligibility_service_url";
	public static final String LOYALTY_SERVICE_URL_CONFIG_KEY = "loyalty_srvc_url";
	public static final String RESET_PROFILE_PASSWORD_SERVICE_URL_CONFIG_KEY = "reset_profile_password_srvc_url";
	public static final String CUSTOMER_IMFORMATION_MANAGEMANT_SERVICE_URL_CONFIG_KEY = "customer_information_management_srvc_url";
	public static final String CUSTOMER_BILLING_INFORMATION_SERVICE_URL_CONFIG_KEY = "customer_billing_information_mgmt_srvc_url";
	public static final String GENERATE_SSO_TOKEN_SERVICE_URL_CONFIG_KEY = "generate_sso_token_srvc_url";
	public static final String NBA_OFFERS_SERVICE_URL_CONFIG_KEY = "nba_offers_srvc_url";
	public static final String REST_CANCEL_SERVICE_NEW_ALTITUDE_CONTACT_URL_CONFIG_KEY = "rest_cancel_service_new_altitude_contact_url";
	public static final String REST_HOME_MOVING_PLAN_CHANGE_SERVICE_NEW_ALTITUDE_CONTACT_URL_CONFIG_KEY = "rest_home_moving_plan_change_service_new_altitude_contact_url";
	public static final String REST_SERVICE_RTF_URL_CONFIG_KEY = "rest_service_rtf_url";
	public static final String REST_SERVICE_TDB_PROCCESS_URL_KEY = "rest_service_tdb_proccess_url";
	public static final String TBD_CHANNEL_KEY = "tbd_channel";
	public static final String TBD_SERVICE_TYPE_VIDEO_KEY = "tbd_service_type_video";
	
	
	public static final String LMS_CREATE_LEAD_URL = "lms_create_lead_url";
	public static final String ATG_CATALOGUE_FREQUENCY_UNIT_MONTHLY = "atg_catalogue_frequency_unit_monthly";
	public static final String ATG_CATALOGUE_FREQUENCY_UNIT_MONTHLY_AR = "atg_catalogue_frequency_unit_monthly_ar";
	public static final String LMS_CALL_BACK_MESSAGE = "lms_call_back_message";
	public static final String LMS_CALL_BACK_MESSAGE_AR = "lms_call_back_message_ar";
	


	

	public static final String HOME_MOVING_REST_SERVICE_SUCCESS_RESPONSE_CODE = "00";

	public static final String GET_WEB_TV_USERS_SERVICE_URL_CONFIG_KEY = "get_web_tv_users_srvc_url";
	public static final String ELIFE_RESET_PASSWORD_SERVICE_URL_CONFIG_KEY = "elife_reset_password_srvc_url";

	public static final String GENERATE_SSO_TOKEN_SRVC_USER_NAME_CONFIG_KEY = "generate_sso_token_srvc_user_name";
	public static final String GENERATE_SSO_TOKEN_SRVC_PASSWORD_CONFIG_KEY = "generate_sso_token_srvc_password";

	public static final String GENERATE_SSO_TOKEN_SRVC_SUCCESS_CODE = "SCP_TOKEN_GEN_00";

	
	public static final String GUEST_FULFILLMENT_ACCOUNT_NUMBER = "guest_fulfillment_account_number";
	public static final String GUEST_FULFILLMENT_PARTY_ID = "guest_fulfillment_party_id";
	public static final String ATG_GET_CATEGORIES_URL = "atg_get_categories_url";
	public static final String ATG_GET_PLANS_URL = "atg_get_plans_url";
	public static final String ATG_PLANS_TEMPORAL_UNIT_KEY_WEEK = "atg_plans_temporal_unit_key_week";
	public static final String ATG_PLANS_TEMPORAL_UNIT_KEY_MONTH = "atg_plans_temporal_unit_key_month";
	public static final String ATG_PLANS_TEMPORAL_UNIT_WEEK = "atg_plans_temporal_unit_week";
	public static final String ATG_PLANS_TEMPORAL_UNIT_WEEK_AR = "atg_plans_temporal_unit_week_ar";
	public static final String ATG_PLANS_TEMPORAL_UNIT_MONTH = "atg_plans_temporal_unit_month";
	public static final String ATG_PLANS_TEMPORAL_UNIT_MONTH_AR = "atg_plans_temporal_unit_month_ar";
	public static final String ATG_CATALOGUE_PRICE_UNIT_AED = "atg_catalogue_price_unit_aed";
	public static final String ATG_CATALOGUE_PRICE_UNIT_AED_AR = "atg_catalogue_price_unit_aed_ar";
	public static final String ELIFE_PLANS_PREVIEW_LIMIT = "elife_plans_preview_limit";
	public static final String ELIFE_PLANS_CATEGORY_ID = "elife_plans_category_id";
	public static final String PLANS_CATEGORY_ID = "plans_category_id";
	public static final String ELIFE_PLANS_FREQUENCY_UNIT = "elife_plans_frequency_unit";
	public static final String ELIFE_PLANS_FREQUENCY_UNIT_AR = "elife_plans_frequency_unit_ar";
	public static final String DEVICES_PREVIEW_LIMIT = "devices_preview_limit";
	public static final String SAVE_DELIVERY_DETAILS = "1";
	public static final String UPDATE_DELIVERY_DETAILS = "2";
	public static final String DELETE_DELIVERY_DETAILS = "3";

	
	public static final String SELF_CARE_MOTIVE_MOBILE_URL_CONFIG_KEY = "selfcare_motive_mobile_token_url";
	public static final String SELF_CARE_MOTIVE_FIXED_URL_CONFIG_KEY = "selfcare_motive_fixed_token_url";
	public static final String SELF_CARE_MOTIVE_URL_CONFIG_KEY = "selfcare_motive_url_token_url";
	public static final String SELF_CARE_MOTIVE_URL_NON_MOBILE_CONFIG_KEY = "selfcare_motive_url_token_non_mobile_url";

	public static final String SELF_CARE_MOTIVE_TOKEN_ID_PLACE_HOLDER = "{{motive_token}}";
	public static final String SELF_CARE_MOTIVE_LANG_PLACE_HOLDER = "{{lang}}";

	public static final String SSO_PORTAL_LOGIN_SERVICE_USERNAME_CONFIG_KEY = "sso_portal_login_srvc_username";
	public static final String SSO_PORTAL_LOGIN_SERVICE_PASSWORD_CONFIG_KEY = "sso_portal_login_srvc_password";

	// -Minimum allowed amount is 2 AED

	public static final String DIGITAL_APP_WS_SSO_PORTAL_LOGIN_FAILURE_EN_CONFIG_KEY = "login_failure_en";
	public static final String DIGITAL_APP_WS_SSO_PORTAL_LOGIN_FAILURE_AR_CONFIG_KEY = "login_failure_ar";

	public static final String DIGITAL_APP_WS_FORGOT_USERNAME_INVALID_CONTACT_INFO_EN_CONFIG_KEY = "invalid_contact_info_en";
	public static final String DIGITAL_APP_WS_FORGOT_USERNAME_INVALID_CONTACT_INFO_AR_CONFIG_KEY = "invalid_contact_info_ar";

	public static final String DIGITAL_APP_WS_USER_NOT_FOUND_TEXT_EN_CONFIG_KEY = "user_not_found_en";
	public static final String DIGITAL_APP_WS_USER_NOT_FOUND_TEXT_AR_CONFIG_KEY = "user_not_found_ar";

	public static final String DIGITAL_APP_WS_CONTACT_NOT_FOUND_TEXT_EN_CONFIG_KEY = "contact_not_found_en";
	public static final String DIGITAL_APP_WS_CONTACT_NOT_FOUND_TEXT_AR_CONFIG_KEY = "contact_not_found_ar";

	public static final String DIGITAL_APP_WS_GENERATE_OTP_TIMEOUT_CONFIG_KEY = "generate_otp_time_out";
	public static final String DIGITAL_APP_WS_SYSTEM_NAME_CONFIG_KEY = "system_name";
	
	public static final String DIGITAL_APP_WS_SYSTEM_NAME_MOBILE_APP_CONFIG_KEY = "digital_app_ws_system_name_mobile_app_config_key";
	public static final String DIGITAL_APP_WS_DEPLOYMENT_BASE_URL_CONFIG_KEY = "deployment_base_url";
	public static final String OTP_AUTHENTICATION_FAILURE_TEXT_AR_CONFIG_KEY = "otp_authentication_failure_text_ar";
	public static final String OTP_AUTHENTICATION_FAILURE_TEXT_EN_CONFIG_KEY = "otp_authentication_failure_text_en";

	public static final String TOUCH_ID_ENABLED = "Y";
	public static final String TOUCH_ID_DISABLED = "N";
	public static final String TIBCO_SUCCESS_CODE = "TIB_000";
	public static final String FORGOT_USERNAME_SUCCESS_CODE_FROM_TIBCO = "TIB_000";
	public static final String FORGOT_USERNAME_FAILURE_CODE_FROM_TIBCO = "B2C_PMG_04";
	public static final String SSO_PORTAL_LOGIN_FAILURE_CODE_FROM_ATG = "SCP_004";
	public static final String SSO_PORTAL_LOGIN_FAILURE_USER_NOT_FOUND = "SCP_008";
	public static final String SSO_PORTAL_LOGIN_FAILURE_INVALID_USER_NAME_OR_PASSWORD = "01";
	public static final String TIBCO_ERROR_CODE_B2C_PMG_07 = "B2C_PMG_07";

	public static final String DATA_TRANSFER_ERROR_CODE_EXCEEDED_MAX_TRANSACTION_LIMIT = "TIB-DBT-20";
	public static final String DATA_TRANSFER_ERROR_CODE_MIN_TRANSACTION_LIMIT = "TIB-DBT-21";
	public static final String DATA_TRANSFER_ERROR_CODE_DAILY_LIMIT_EXCEEDED = "TIB-DBT-22";
	public static final String DATA_TRANSFER_ERROR_CODE_MONTHLY_LIMIT_EXCEEDED = "TIB-DBT-23";
	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_NOT_AVAILABLE = "TIB-DBT-25";
	public static final String DATA_TRANSFER_ERROR_CODE_YOUR_BALANCE_IS_NOT_ENOUGH = "TIB-DBT-26";
	public static final String DATA_TRANSFER_ERROR_CODE_GENERAL = "TIB-DBT-27";
	public static final String DATA_TRANSFER_SERVICE_NOT_AVAILABLE_FOR_NUM_ERROR_CODE = "TIB-DBT-28";
	public static final String DATA_TRANSFER_SERVICE_ERROR_CODE_29 = "TIB-DBT-29";
	public static final String DATA_TRANSFER_SERVICE_ERROR_CODE_30 = "TIB-DBT-30";
	public static final String DATA_TRANSFER_SERVICE_ERROR_CODE_31 = "TIB-DBT-31";
	public static final String DATA_TRANSFER_SERVICE_ERROR_CODE_35 = "TIB-DBT-35";
	public static final String DATA_TRANSFER_SERVICE_ERROR_CODE_36 = "TIB-DBT-36";
	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_REACHED_MONTHLY_LIMIT = "TIB-DBT-37";
	public static final String DATA_TRANSFER_SERVICE_ERROR_CODE_38 = "TIB-DBT-38";
	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_DISABLED_ON_ACCOUNT = "TIB-DBT-39";
	public static final String DATA_TRANSFER_SERVICE_ERROR_CODE_50 = "TIB-DBT-50";
	public static final String DATA_TRANSFER_SERVICE_ERROR_CODE_51 = "TIB-DBT-51";
	public static final String DATA_TRANSFER_SERVICE_ERROR_CODE_52 = "TIB-DBT-52";
	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_AVAILABLE_FOR_ACTIVE_ACC = "TIB-DBT-53";
	public static final String DATA_TRANSFER_ERROR_CODE_DBT_AVAILABLE_FOR_POSTPAID_ACCOUNTS_THAT_ARE_ATLEAST_3_MONTHS_WITH_WITH_ETISALAT = "TIB-DBT-54";
	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_ONLY_TRANSFER_TO_ACTIVE_ETISALAT_ACC = "TIB-DBT-55";
	public static final String DATA_TRANSFER_SERVICE_ERROR_CODE_56 = "TIB-DBT-56";
	public static final String DATA_TRANSFER_SERVICE_ERROR_CODE_57 = "TIB-DBT-57";
	public static final String DATA_TRANSFER_INSUFFICENT_BALANCE_ERROR_CODE = "TIB-DBT-59";
	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_AMOUNT_EXCEED_LIMIT = "TIB-DBT-65";
	public static final String DATA_TRANSFER_ERROR_CODE_SERVICE_MINIMUM_ALLOWED_AMOUNT_2_AED = "TIB-DBT-66";
	public static final String DATA_TRANSFER_SERVICE_NOT_AVAILABLE_FOR_NUM_ERROR_CODE_2 = "TIB-DBT-67";
	public static final String DATA_TRANSFER_SERVICE_ERROR_CODE_71 = "TIB-DBT-71";
	public static final String DATA_TRANSFER_ERROR_CODE_ACCOUNT_TEMPORARY_BLOCKED = "TIB-DBT-72";
	public static final String DATA_TRANSFER_SERVICE_ERROR_CODE_73 = "TIB-DBT-73";

	public static final String COMS_ERROR_CODE_CONTRACT_PLAN_ALREADY_SUBSCRIBED = "E150";

	public static final String COMS_ERROR_CODE_CUSTOMER_IS_NOT_SUBSCRIBED_TO_REQUEST_SERVICE = "E07";

	public static final String COMS_ERROR_CODE_ORDER_LEVEL_MUTUAL_EXCLUSION = "E05";

	public static final String SET_BILL_LIMIT_ERROR_CODE_NO_MAPPING_FOUND_FOR_DEMAND_ID = "E49";
	public static final String SET_BILL_LIMIT_ERROR_CODE_INVALID_ACCCOUNT = "E16";
	public static final String SET_BILL_LIMIT_ERROR_CODE_TRIES_EXEEDS = "E23";
	public static final String SET_BILL_LIMIT_ERROR_CODE_REQUEST_ALREADY_IN_PROCCESS_FOR_ACCOUNT = "E09";
	public static final String SET_BILL_LIMIT_ERROR_CODE_RESTRICTED_FOR_ACCOUNT = "E215";
	public static final String SET_BILL_LIMIT_ERROR_CODE_BILL_LIMIT_NOT_ALLOWED = "E07";
	public static final String SET_BILL_LIMIT_ERROR_CODE_NEW_AND_OLD_LIMITS_ARE_SAME = "E06";
	public static final String MIGRATE_SERVICE_ERROR_CODE_PENDING_ORDER_FOUND = "E09";

	public static final String PREPAID_MIGRATION_PLAN_ID_KEY = "prepaid_migration_plan_id";
	public static final Integer PREPAID_MIGRATION = 1;
	public static final Integer PLAN_CHANGE = 2;
	public static final Integer INDIVIDUAL_ACCESS = 1;
	public static final String INDIVIDUAL_ACCESS_STR = "I";
	public static final String ACCOUNT_MENU_MY_INFO = "My Info";
	public static final String INDIVIDUAL_ACCESS_SUB_TITLE_CONFIG_KEY = "individual_access_sub_title_";
	public static final Integer FULL_ACCESS_TYPE_2 = 2;
	public static final Integer FULL_ACCESS_TYPE_3 = 3;
	public static final String INVALID_SCRATCH_CARD_NUMBER_ERROR_CODE = "119";
	public static final String INVALID_SCRATCH_CARD_NUMBER_ERROR_MSG_CONFIG_KEY = "invalid_scratch_card_number_error_msg_";

	public static final String LOYALTY_ACCOUNT_NOT_FOUND_ERROR_CODE = "TIB-LOYALTY-1";

	public static final String TIER_IMAGE_URL_GOLD = "tier_image_url_gold";
	public static final String TIER_IMAGE_URL_SILVER = "tier_image_url_silver";
	public static final String TIER_IMAGE_URL_BRONZE = "tier_image_url_bronze";

	public static final String TIER_LEVEL_GOLD = "1";
	public static final String TIER_LEVEL_SILVER = "2";
	public static final String TIER_LEVEL_BRONZE = "3";

	public static final String START_DATE_DAYS_FOR_TRANSACTION_HISTORY_SERVICE_CONFIG_KEY = "days_count_deduct_from_start_date";

	public static final String END_DATE_DAYS_FOR_TRANSACTION_HISTORY_SERVICE_CONFIG_KEY = "days_count_add_in_end_date";

	public static final String DIGITAL_APP_RESOURCE_BASE = "digital_app_resource_";
	public static final String SMART_PAY_CONFIRMATION_TITLE = "smart_pay_confirmation_title";
	public static final String SMART_PAY_CONFIRMATION_BODY = "smart_pay_confirmation_body";

	public static final String FORGOT_USERNAME_PREFER_MEDIUM_EMAIL = "Email";
	public static final String FORGOT_USERNAME_PREFER_MEDIUM_SMS = "SMS";

	public static final String LANGAUGE_ENGLISH_TEXT = "English";
	public static final String LANGAUGE_ARABIC_TEXT = "Arabic";
	public static final String CUSTOMER_INQUIRY_CONTACT_TYPE_E_BILL = "E_BILL";
	public static final String CUSTOMER_INQUIRY_CONTACT_TYPE_MINI_BILL_SMS = "MINI_BILL_SMS";
	public static final String CUSTOMER_INQUIRY_CONTACT_TYPE_MOBILE = "MOBILE";
	public static final String CUSTOMER_INQUIRY_CONTACT_TYPE_EMAIL = "EMAIL";
	public static final String CUSTOMER_INQUIRY_CONTACT_CATEGORY = "LATEST_BILLING_ADDRESS";
	public static final String CUSTOMER_INQUIRY_ERROR_CODE = "TIB-CIM-001";
	public static final String CUSTOMER_INQUIRY_BASE_PLAN_ERROR_CODE = "TIB-CRM-1";
	public static final String ENABLE_TRANSACTION_ID_CHECK = "enable_transaction_id_check";
	public static final String YES = "yes";

	public static final String ACTIVE_ADDON_LIST_CLICK_ABLE_FLAG_KEY = "active_addon_list_click_able_flag";
	public static final String ACTIVE_ADDON_LIST_MANAGE_PLAN_FLAG_KEY = "active_addon_list_manage_plan_flag";
	public static final String ACTIVE_ADDON_LIST_CHANGE_PLAN_FLAG_KEY = "active_addon_list_change_plan_flag";
	public static final String ACTIVE_ADDON_LIST_MIGRATE_FLAG_KEY = "active_addon_list_migrate_flag";
	public static final String ACTIVE_ADDON_LIST_CNCL_SRVC_FLAG_KEY = "active_addon_list_cncl_srvc_flag";

	/* #################### M PARKING ########################## */

	
	public static final String START_STOP_TOTAL_CHARGES_AR_KEY = "start_stop_total_charges_ar";
	public static final String START_STOP_TOTAL_CHARGES_EN_KEY = "start_stop_total_charges_en";
	
	
	public static final String MPARKING_DXB_TEMPLATE_CONFIG_KEY = "mparking_dxb_template";
	public static final String MPARKING_AUD_TEMPLATE_CONFIG_KEY = "mparking_aud_template";
	public static final String MPARKING_SHJ_REGISTER_TEMPLATE_CONFIG_KEY = "mparking_shj_register_template";
	public static final String MPARKING_AJM_REGISTER_TEMPLATE_CONFIG_KEY = "mparking_ajm_register_template";
	public static final String MPARKING_SHJ_NOT_REGISTER_TEMPLATE_CONFIG_KEY = "mparking_shj_not_register_template";
	public static final String MPARKING_AJM_NOT_REGISTER_TEMPLATE_CONFIG_KEY = "mparking_ajm_not_register_template";

	public static final String MPARKING_NICKNAME_OR_PLATE_NO_PLACE_HOLDER = "{{nicknameOrplateno}}";
	public static final String MPARKING_PARKING_ZONE_PLACE_HOLDER = "{{parkingZone}}";
	public static final String MPARKING_NO_OF_HOURS_PLACE_HOLDER = "{{noOfHours}}";
	public static final String MPARKING_PLATE_NO_SOURCE_PLACE_HOLDER = "{{plateNoSource}}";

	public static final String MPARKING_DXB_MSG_CODE_CONFIG_KEY = "mparking_dxb_msg_code";
	public static final String MPARKING_AUD_MSG_CODE_CONFIG_KEY = "mparking_aud_msg_code";
	public static final String MPARKING_SHJ_MSG_CODE_CONFIG_KEY = "mparking_shj_msg_code";
	public static final String MPARKING_AJM_MSG_CODE_CONFIG_KEY = "mparking_ajm_msg_code";
	public static final String TOP_CALLED_NUMBERS_VIEWABLE_COUNT_KEY = "top_called_numbers_viewable_count";

	public static final String ARAMEX_LPID_KEY = "device_aramex_lpid";
	public static final String FLEET_LPID_KEY = "device_fleet_lpid";
	public static final String RETAIL_LPID_KEY = "device_retail_lpid";
	
	public static final String MPARKING_DUBAI_CITY_CODE = "DXB";
	public static final String MPARKING_ABU_DHABI_CITY_CODE = "AUD";
	public static final String MPARKING_SHARJAH_CITY_CODE = "SHJ";
	public static final String MPARKING_AJMAN_CITY_CODE = "AJM";
	
	public static final String DUBAI_CITY_CODE = "DXB";
	public static final String ABU_DHABI_CITY_CODE = "AUH";
	public static final String SHARJAH_CITY_CODE = "SHJ";
	public static final String AJMAN_CITY_CODE = "AJM";
	public static final String RAK_CITY_CODE = "RAK";
	public static final String UAQ_CITY_CODE = "UAQ";
	public static final String FUJEIRAH_CITY_CODE = "FUJ";
	public static final String AL_AIN_CITY_CODE = "AIN";

	/* #################### M PARKING ########################## */

	/* ################### Home Moving ########################### */
	public static final String SHIFTING_TYPE = "shiftingType";
	public static final String INTERNAL_SHIFT = "INTSHIFT";
	public static final String EXTERNAL_SHIFT = "EXTSHIFT";
	public static final String CHANNEL = "MobileApp";
	public static final String HOME_MOVING_PLAN_CHANGE_HOME_MOVING_CAMPAIGN_NAME_KEY = "home_moving_plan_change_home_moving_campaign_name";
	public static final String HOME_MOVING_PLAN_CHANGE_ELIFE_PLAN_CAMPAIGN_NAME_KEY = "home_moving_plan_change_elife_plan_campaign_name";
	/* ################### Home Moving ########################### */

	/* ################### Cancel Service ########################### */

	public static final String CANCEL_SERVICE_CAMPAIGN_NAME_KEY = "cancel_service_campaign_name"; // 101NVRetention_UAT
	public static final String CANCEL_SERVICE_ADDITIONAL_INFO_CESSATION_REASON_KEY = "CESSATION_REASON";
	/* ################### Home Moving ########################### */

	/*
	 * ########################################### PaymentConstantsIfc
	 * ################################################
	 */
	// Nothing for now

	// ####################################### Payment Constants 16/05/2017
	// #######################################
	/*
	 * Order id parameter
	 */
	public static final String EPG_PRE_PAYMENT_RETURN_PATH = "epg_pre_payment_return_path";
	public static final String EPG_PAY_FOR_DEVICE_STANDALONE_RETURN_PATH = "epg_pay_for_device_standalone_return_path";
	public static final String EPG_PAY_FOR_DEVICE_STANDALONE_NS_RETURN_PATH = "epg_pay_for_device_standalone_ns_return_path";
	public static final String EPG_PAY_FOR_DEVICE_SMART_PAY_RETURN_PATH = "epg_pay_for_device_smart_pay_return_path";
	public static final String EPG_PAY_FOR_DEVICE_SMART_PAY_NS_RETURN_PATH = "epg_pay_for_device_smart_pay_ns_return_path";
	public static final String EPG_PAY_FOR_DEVICE_MIXED_RETURN_PATH = "epg_pay_for_device_mixed_return_path";
	public static final String EPG_PAY_FOR_DEVICE_SMART_PAY_POINTS_RETURN_PATH = "epg_pay_for_device_smart_pay_points_return_path";
	public static final String EPG_PAY_FOR_DEVICE_SMART_PAY_MIXED_RETURN_PATH = "epg_pay_for_device_smart_pay_mixed_return_path";
	public static final String URL_AMPERSAND_SIGN = "&";
	public static final String URL_EQUAL_SIGN = "=";
	public static final String LANG_PARAMETER = "lang";//
	public static final String EPG_TRANSACTION_ID_PARAMETER = "epgTransactionId";//
	public static final String ORDER_ID_PARAMETER = "orderId";//
	public static final String PAYMENT_TYPE_PARAMETER = "paymentType";
	public static final String TRACKING_TRANSACTION_ID_PARAMETER = "trackingTransactionId";//
	public static final String TRACKING_LANGUAGE_PARAMETER = "lang";//

	public static final String EPG_MISSING_PROPERTY = "does not exist";
	
	public static final String DEVICE_CATALOGUE_MIN_PRICE = "device_catalogue_min_price";
	public static final String DEVICE_CATALOGUE_CATEGORY_ID = "device_catalogue_category_id";
	public static final String DEVICE_CATALOGUE_CATEGORY_PREFIX = "device_catalogue_category_";
	public static final String DEVICE_ARAMEX_ID = "device_aramex_id";
	public static final String DEVICE_FLEET_ID = "device_fleet_id";
	public static final String DEVICE_PREORDER_STARTING_FROM = "device_preorder_starting_from";
	
	public static final String NOTIFY_ME_EMAIL_TO_KEY = "notify_me_email_to_key";
	public static final String NOTIFY_ME_EMAIL_CC_KEY = "notify_me_email_cc_key";
	public static final String NOTIFY_ME_TEMPLATE_ID_KEY = "notify_me_template_id_key";
	public static final String NOTIFY_ME_TITLE_KEY = "notify_me_title_key";
	public static final String NOTIFY_ME_NOTIFICATION_CODE_KEY = "notify_me_notification_code";
	
	/*
	 * Payment transaction types
	 */
	public static final String EPG_REGISTRATION_TRANSACTION_TYPE = "Registration";//
	public static final String EPG_FINALIZATION_TRANSACTION_TYPE = "Finalization";//
	public static final String EPG_QUERY_TRANSACTION_TYPE = "QueryTransaction";//
	public static final String EPG_CAPTURE_TRANSACTION_TYPE = "Capture";// EPG_CAPTURE_TRANSACTION_TYPE
	public static final String EPG_REVERSAL_TRANSACTION_TYPE = "Reversal";// EPG_REVERSAL_TRANSACTION_TYPE
	/*
	 * Payment transaction property
	 */
	
	public static final String WASEL_FALXI_PRODUCT_CATEGORY_CODE = "WASEL_FALXI_PRODUCT_CATEGORY_CODE";
	public static final String WASEL_FALXI_PREFERRED_NUMBER_PRODUCT_CODE = "WASEL_X_PREFERRED_NUMBER_PRODUCT_CODE";
	public static final String EPG_CUSTOMER_TRANSACTION_PROPERTY = "Customer";//
	public static final String EPG_AMOUNT_TRANSACTION_PROPERTY = "Amount";//
	public static final String EPG_ORDER_NAME_TRANSACTION_PROPERTY = "OrderName";//
	public static final String EPG_ORDER_INFO_TRANSACTION_PROPERTY = "OrderInfo";//
	public static final String EPG_CURRENCY_TRANSACTION_PROPERTY = "Currency";//
	public static final String EPG_EXTRADATA_RECCURENCE_ID_PROPERTY = "ExtraData/RecurrenceID";//
	public static final String EPG_RECURRENCE_TYPE_PROPERTY = "Recurrence/Type";//
	public static final String EPG_ORDER_ID_TRANSACTION_PROPERTY = "OrderID";//
	public static final String EPG_TRANSACTION_HINT_TRANSACTION_PROPERTY = "TransactionHint"; //
	public static final String EPG_STORE_TRANSACTION_PROPERTY = "Store";//
	public static final String EPG_RETURN_PATH_TRANSACTION_PROPERTY = "ReturnPath";//

	public static final String EPG_TRANSACTION_ID_TRANSACTION_PROPERTY = "TransactionID";//
	public static final String EPG_CHANNEL_TRANSACTION_PROPERTY = "Channel";//
	public static final String EPG_CHANNEL_CONFIG_KEY = "epg_channel";//

	public static final String EPG_PAYMENT_PAGE_TRANSACTION_PROPERTY = "PaymentPage";//
	public static final String EPG_APPROVAL_CODE_TRANSACTION_PROPERTY = "ApprovalCode";//
	public static final String EPG_FEES_TRANSACTION_PROPERTY = "Fees";//
	public static final String EPG_DISCOUNT_TRANSACTION_PROPERTY = "Discount";//
	public static final String EPG_ACCOUNT_TRANSACTION_PROPERTY = "Account";
	/*
	 * Payment operations
	 */
	public static final int EPG_REGISTRATION_PAYMENT_OPERATION_TYPE = 1;
	public static final int EPG_RECHARGE_PAYMENT_OPERATION_TYPE = 2;
	public static final int EPG_MIGRATION_PAYMENT_OPERATION_TYPE = 3;
	public static final String BANK_CODE = "2345";
	
	/*
	 * Payment transaction status
	 */
	public static final int EPG_PENDING_AUTHORIZATION_PAYMENT_TRANSACTION_STATUS = -2;
	public static final int EPG_AUTHORIZATION_FAILED_PAYMENT_TRANSACTION_STATUS = 0;
	public static final int EPG_AUTHORIZATION_SUCCEEDED_PAYMENT_TRANSACTION_STATUS = 1;
	public static final String EPG_TRANSACTION_ALREADY_FINALIZED_ERROR_CODE = "5054";
	/*
	 * Payment configuration map
	 */
	public static final String EPG_STORE_CONFIG_KEY = "epg_store";//
	public static final String EPG_ONLINE_STORE_CONFIG_KEY = "epg_house_online_store";
	public static final String EPG_CURRENCY_CONFIG_CONFIG_KEY = "epg_currency"; //
	public static final String EPG_CONFIG_FILE_CONFIG_KEY = "epg_config_file"; //
	public static final String EPG_REGISTRATION_ORDER_INFO_CONFIG_KEY = "epg_house_registration_order_info";
	public static final String EPG_RECHARGE_ORDER_INFO_CONFIG_KEY = "epg_recharge_order_info";//
	public static final String EPG_MIGRATION_ORDER_INFO_CONFIG_KEY = "epg_house_migration_order_info";
	public static final String EPG_CUSTOMER_NAME_CONFIG_KEY = "epg_customer_name"; //
	public static final String AUTOPAY_EPG_CUSTOMER_NAME = "autopay_epg_customer_name"; //
	public static final String EPG_ONLINE_PAYMENT_HINT_CONFIG_KEY = "epg_online_hint";//
	public static final String EPG_EXTRA_ONLINE_PAYMENT_HINT_DELIMITER_CONFIG_KEY = "epg_house_extra_online_hint_delimiter";
	public static final String EPG_EXTRA_ONLINE_PAYMENT_HINT_CONFIG_KEY = "epg_house_extra_online_hint";
	public static final String EPG_SUCCESS_RETURN_PATH_CONFIG_KEY = "epg_success_return_path";//
	public static final String EPG_HOUSE_FAILURE_RETURN_PATH_CONFIG_KEY = "epg_house_failure_return_path";
	public static final String EPG_HOUSE_USE_CONFIGURED_UNIT_FLAG_CONFIG_KEY = "epg_house_use_configured_unit_flag";
	public static final String EPG_HOUSE_SUPPORT_EMAIL_CONFIG_KEY = "epg_house_support_email";
	public static final String EPG_TRAIL_NO_CONFIG_KEY = "epg_house_trail_count";

	public static final String EPG_REGISTRATION_FINALIZATION_SUCCESS_MESSAGE_CONFIG_KEY = "epg_house_reg_finalization_success_message";
	public static final String EPG_REGISTRATION_FINALIZATION_FAILURE_MESSAGE_CONFIG_KEY = "epg_house_reg_finalization_failure_message";
	public static final String EPG_RECHARGE_FINALIZATION_SUCCESS_MESSAGE_CONFIG_KEY = "epg_house_recharge_finalization_success_message";
	public static final String EPG_RECHARGE_FINALIZATION_FAILURE_MESSAGE_CONFIG_KEY = "epg_house_recharge_finalization_failure_message";
	public static final String EPG_MIGRATION_FINALIZATION_SUCCESS_MESSAGE_CONFIG_KEY = "epg_house_migration_finalization_success_message";
	public static final String EPG_MIGRATION_FINALIZATION_FAILURE_MESSAGE_CONFIG_KEY = "epg_house_migration_finalization_failure_message";
	public static final String RECHARGE_HOUSE_MAXIMUM_CC_RECHARGE_AMOUNT = "recharge_house_maximum_cc_recharge_amount";

	public static final String SET_BILL_LIMIT_SUCCESS_EN_RESPONSE_MSG_CONFIG_KEY = "set_bill_limit_response_msg_en";
	public static final String SET_BILL_LIMIT_SUCCESS_AR_RESPONSE_MSG_CONFIG_KEY = "set_bill_limit_response_msg_ar";

	public static final String SET_BILL_LIMIT_TRIES_EXCEED_EN_KEY = "set_bill_limit_tries_exceeded_en";
	public static final String SET_BILL_LIMIT_TRIES_EXCEED_AR_KEY = "set_bill_limit_tries_exceeded_ar";
	
	public static final String SET_BILL_LIMIT_SAME_KEY = "set_bill_limit_same_en";
	public static final String SET_BILL_LIMIT_SAME_AR_KEY = "set_bill_limit_same_ar";

	public static final String EPG_REGISTRATION_ORDER_NAME_CONFIG_KEY = "epg_registration_order_info"; //
	// ####################################### Payment Constants 16/05/2017
	// #######################################

	/*
	 * ############################# PushNotification Constants 17/05/2017
	 * ####################################
	 */

	public static final String ANDROID_NOTIFICATION_URL = "android_notification_url";
	public static final String RE_REGISTR_NO_ACCOUNTS_FOUND_SENT_TO_ATG = "0001169";
    
    public static final String RE_REGISTR_NO_ACCOUNTS_FOUND_SENT_TO_ATG_EN = "re_registr_no_accounts_found_sent_to_atg_en";
    public static final String RE_REGISTR_NO_ACCOUNTS_FOUND_SENT_TO_ATG_AR = "re_registr_no_accounts_found_sent_to_atg_en";

	public static final String DIGITAL_APP_ETISALAT_PROXY_HOST_CONFIG_KEY = "digitalapp_etisalat_proxy_host";
	public static final String DIGITAL_APP_ETISALAT_PROXY_PORT_CONFIG_KEY = "digitalapp_etisalat_proxy_port";

	public static final String DIGITAL_APP_PROJECT_STAGE_CONFIG_VAL = "digitalapp_environment";
	public static final String DIGITAL_APP_PROJECT_STAGE_PROD_VAL = "production";

	public static final String ANDROID_PUSH_NOTIFICATION_SERVER_ID_CONFIG_KEY = "android_notification_server_id";
	public static final String APPLE_PUSH_NOTIFICATION_SERVER_ID_CONFIG_KEY = "apple_notification_server_id";

	public static final String APPLE_CERT_PATH_CONFIG_KEY = "apple_certificate_path";
	public static final String APPLE_CERT_PASSWORD_CONFIG_KEY = "apple_certificate_password";

	/*
	 * ############################# PushNotification Constants 17/05/2017
	 * ####################################
	 */

	/*
	 * ############################ DONT TOUCH IT PLEASE PAYMENT CONSTANTS
	 * #####################################
	 */

	// Payment Bundle
	public static final String DIGITAL_APP_PAYMENT_MESSAGES_BUNDLE_NAME_AR = "ae.digital.app.web.resources.payment_ar";
	public static final String DIGITAL_APP_PAYMENT_MESSAGES_BUNDLE_NAME_EN = "ae.digital.app.web.resources.payment";
	public static final String DIGITAL_APP_PAYMENT_DUPLICATE_PLAN_ID = "payment_duplicate_plan_id_";

	// General Error
	public static final String ERROR_MESSAGE_GENERAL_PAYMENT_ERROR = "0000025";
	public static final String ERROR_MESSAGE_ERROR_CODE = "0000026";
	public static final String ERROR_MISSING_PARAMS = "-1";

	// CARD RESTRICTIONS ERROR (C00 - C99)
	public static final String ERROR_MESSAGE_CARD_RESTRICTION = "0000027";

	// Bank Errors
	public static final String ERROR_MESSAGE_BANK_ERROR = "0000028";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_CERTIFICATE_ISSUE = "0000029";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_SUPPLIED_DATA = "0000030";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_EMPTY_SUPPLIED_DATA = "0000031";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_NOT_ALLOWED_SUPPLIED_DATA = "0000032";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_SUPPLIED_DATA_FORMAT = "0000033";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_CUSTOMER_AND_PONIT_OF_SALE_PROPERTIES = "0000034";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_CUSTOMER_IDENTIFIER = "0000035";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_CUSTOMER_NOT_ACTIVE = "0000036";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_STORE = "0000037";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_DEFAULT_STORE_IS_NOT_CONFIGURED_FOR_SPECIFIED_MERCHANT = "0000038";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_TERMINAL = "0000039";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_DEFAULT_TERMINAL_NOT_CONFIGURED = "0000040";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_REQUESTED_CHANNEL_NOT_ALLOWED = "0000041";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_TRANSACTION_DETAILS = "0000042";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_TRANSACTION_ID_FORMAT = "0000043";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_TRANSACTION_ID_NOT_RECOGNIZED = "0000044";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_TRANSACTION_ALREADY_FINALIZED = "0000045";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_TRANSACTION_AUTHENTICATION_FAILED = "0000046";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_PAYMENT_DATA_IS_MISSING = "0000047";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_MAX_NO_OF_OPERATIONS_PER_TRANSACTION_REACHED = "0000048";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_AMOUNT_OR_CURRENCY_DETAILS = "0000049";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_CURRENCY_FORMAT = "0000050";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_CURRENCY_NOT_ALLOWED_BY_BANK = "0000051";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_CURRENCY_DIFFERS_FROM_PREVIOUSLY_SUPPLIED = "0000052";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_AMOUNT_FORMAT = "0000053";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_AMOUNT_AND_CURRENCY_MUST_BE_SUPPLIED_BOTH_OR_NONE = "0000054";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_TRANSACTION_ALREADY_CLOSED = "0000055";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_PROVIDED_AMOUNT_EXCEEDS_BALANCE = "0000056";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_CARD_DETAILS = "0000057";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_CARD_NO_NOT_FOUND = "0000058";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_CARD_NO = "0000059";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_CARD_BRAND_NOT_ACCEPTED_FOR_TRANSACTION = "0000060";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_VERIFICATION_CODE_CVV2_NOT_FOUND = "0000061";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_ORDER_DETAILS = "0000062";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_ORDER_NAME = "0000063";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_TRANSACTION_PROCESSING = "0000064";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_TRANSACTION_HINT = "0000065";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_TRANSACTION_SCENARIO = "0000066";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_RETURN_PATH_FORMAT = "0000067";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INTERNAL = "0000068";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_MISSING_FREQUENCY_OF_RECURRENCE = "0000069";;
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_INVALID_FREQUENCY_OF_RECURRENCE = "0000070";
	public static final String ERROR_MESSAGE_CONFIGURATIONS_ERROR_TRANSACTION_ID_DOES_NOT_REFERE_TO_RECURRING_PAYMENT = "0000071";

	// IPG Internal Errors
	public static final String ERROR_MESSAGE_IPG_INTERNAL_ERROR_IPG_INTERNAL = "0000072";
	public static final String ERROR_MESSAGE_IPG_INTERNAL_ERROR_AUTHORIZATION_NOT_ACCEPTED_OR_BANK_NOT_AVAILABLE = "0000073";
	public static final String ERROR_MESSAGE_IPG_INTERNAL_ERROR_INTERNAL_BANK_TOOK_TOO_MUCH_TIME_TO_RESPOND = "0000074";
	public static final String ERROR_MESSAGE_IPG_INTERNAL_ERROR_GENERIC_DB_ERROR = "0000075";
	public static final String ERROR_MESSAGE_IPG_INTERNAL_ERROR_INTERNAL_TIME_OUT = "0000076";
	public static final String ERROR_MESSAGE_IPG_INTERNAL_ERROR_BANK_OR_IPG_TOOK_TOO_MUCH_TIME_TO_RESPOND = "0000077";

	// SPI Configuration Errors
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_SPI_CONFIGURATION_ERROR = "0000078";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_INVALID_RESPONSE_FROM_SERVER = "0000079";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_SERVER_COULD_NOT_UNDERSTND_THE_REQUEST = "0000080";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_CONNECTION_TIME_OUT = "0000081";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_UNABLE_TO_ESTABLISH_CONNECTION_TO_SERVER = "0000082";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_UNABLE_TO_READ_CERTIFICATE_FILE = "0000083";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_INITIALIZE_CALL_HAS_NOT_BEEN_CALLED_BEFORE_EXECUTE_CALL = "0000084";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_EXECUTE_HAS_NOT_BEEN_CALLED = "0000085";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_AN_ATTEMPT_WAS_MADE_TO_SET_A_READ_ONLY_PROPERTY = "0000086";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_INVALID_FORMAT_FOR_SECOND_PARAMETER_IN_INITIALIZE_CALL = "0000087";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_INVALID_PROPERTY_NAME = "0000088";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_CERTIFICATE_DOES_NOT_EXIST_OR_USER_DOES_NOT_HAVE_PERMISSION_TO_ACCESS_IT = "0000089";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_CLIENT_CERTIFICATE_VERIFICATION_FAILED = "0000090";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_ACQUIRING_CREDENTIAL_HANDLE = "0000091";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_SERVER_NAME_NOT_RESOLVED = "0000092";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_CERTIFCATE_CHAIN_NOT_FOUND = "0000093";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_COMMUNICATING_AT_HTTP_LEVEL = "0000094";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_UNABLE_TO_REACH_IPG_SERVER = "0000095";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_INVALID_CERTIFICATE_PASSWORD = "0000096";
	public static final String ERROR_MESSAGE_SPI_CONFIGURATIONS_ERROR_PROCESSING_REQUEST = "0000097";

	// #################################### ACCOUNT CATEGORIES
	// #####################################

	public static final String ZERO_P = "0p";
	public static final String ONE_P = "1p";
	public static final String TWO_P = "2p";
	public static final String THREE_P = "3p";
	public static final String AL_SHAMIL = "ElShamel";
	public static final String DEL = "Del";
	public static final String PREPAID = "Prepaid";
	public static final String POSTPAID = "Postpaid";
	public static final String VISITOR = "Visitor";

	// #################################### ACCOUNT CATEGORIES
	// #####################################

	public static final String SPINNER_SERVICE_INPUT_TYPE = "Spinner";
	public static final String NUMBER_SERVICE_INPUT_TYPE = "Number";
	public static final String INCREMENTER_SERVICE_INPUT_TYPE = "Incrementer";

	// ########################ReRegistration
	// constants##########################
	public static final String RE_REGISTRATION_PENDING_STATUS_CODE = "0";
	public static final String RE_REGISTRATION_APPROVED_STATUS_CODE = "1";
	public static final String RE_REGISTRATION_REJECTED_STATUS_CODE = "2";

	public static final String RE_REGISTRATION_PENDING_STATUS = "Pending";
	public static final String RE_REGISTRATION_APPROVED_STATUS = "Approved";
	public static final String RE_REGISTRATION_REJECTED_STATUS = "Rejected";

	public static final String DAYS_FOR_RE_REGISTRATION_SERVICE_CONFIG_KEY = "re_registration_days_count_deduct_from_current_date";
	// ########################ReRegistration
	// constants##########################

	/*** LOYALTY APP POINTS CALCULATOR CONSTANTS */
	public static final String LOYALTY_APP_POINTS_CALC_PAYMENT_TYPE_1_TOPUP = "TopUp";
	public static final String LOYALTY_APP_POINTS_CALC_PAYMENT_TYPE_2_PAYBILL = "PayBill";

	// #################Proxy Settings#######################
	public static final String PROXY_SETTING_DISABLED = "proxy_setting_disabled";
	public static final String PROXY_SETTING_HOST = "proxy_setting_host";
	public static final String PROXY_SETTING_PORT = "proxy_setting_port";
	public static final String PROXY_SETTING_NON_PROXY_HOSTS = "proxy_setting_non_proxy_hosts";
	// #################Proxy Settings#######################

	// #################Loyalty WS#######################
	public static final String LOYALTY_WS_COMMIT = "COMMIT";
	public static final String LOYALTY_WS_SYSTEM_ID = "loyalty_ws_system_id";
	public static final String LOYALTY_WS_SYSTEM_PASSWORD = "loyalty_ws_system_password";
	public static final String LOYALTY_WS_SUCCESS = "000";

	// #################Loyalty WS#######################
	// #################CNS_SMS_TEMPALTE_OTP#######################
	public static final String CNS_SMS_TEMPALTE_OTP_TEMPLATE_ID = "Cns_sms_tempalte_otp_template_id";
	public static final String CNS_SMS_TEMPALTE_OTP_SYSTEM_NAME = "Cns_sms_tempalte_otp_system_name";
	public static final String CNS_SMS_TEMPALTE_OTP_NOTIFICATION_ID = "Cns_sms_tempalte_otp_notification_id";

	public static final String CNS_SMS_TEMPALTE_OTP_NOTIFICATION_CODE = "Cns_sms_tempalte_otp_notification_code";
	public static final String CNS_SMS_TEMPALTE_OTP_LANGUAGE = "Cns_sms_tempalte_otp_language";
	public static final String CNS_SMS_TEMPALTE_OTP_DELIVERY_TYPE = "Cns_sms_tempalte_otp_delivery_type";
	public static final String CNS_SMS_TEMPALTE_OTP_INTERACTION_REASON = "Cns_sms_tempalte_otp_interaction_reason";
	public static final String SMS_MIGRATION_NOTIFICATION_ID_KEY = "sms_migration_notification_id";

	public static final String SMS_MIGRATION_NOTIFICATION_CODE_KEY = "sms_migration_notification_code";

	public static final String SMS_MIGRATION_NOTIFICATION_TEMPLATE_ID_KEY = "sms_migration_notification_template_id";

	// ################NOTIFY ME###################################
	
	public static final String NOTIFY_ME_NOTIFICATION_ID_KEY = "notify_me_notification_id";
	public static final String DEVICE_NOTIFICATION_ID_KEY = "device_notification_id_key";
		
	// #################CNS_SMS_TEMPALTE_OTP#######################

	public static final String EMAIL_TEMPLATE_TEMPLATE_ID_KEY = "email_template_template_id";
	public static final String EMAIL_TEMPLATE_NOTIFICATION_ID_KEY = "email_template_notification_id";
	public static final String EMAIL_TEMPLATE_NOTIFICATION_CODE_KEY = "email_template_notification_code";
	public static final String EMAIL_TEMPLATE_INTERACTION_REASON_KEY = "email_template_interaction_reason";
	public static final String EMAIL_TEMPLATE_SUBJECT_KEY = "email_template_subject";
	public static final String UN_SUBSCRIBE_ADDON_SERVICE_SUCCESS_AR_KEY = "un_subscribe_addon_success_ar"; // language
																											// will
																											// append
																											// from
																											// code
	public static final String UN_SUBSCRIBE_ADDON_SERVICE_SUCCESS_EN_KEY = "un_subscribe_addon_success_en"; // language
																											// will
																											// append
																											// from
																											// code

	public static final String GET_BILL_DETAILS_SERVICE_TOTAL_RENTAL_AMOUNT_AR_KEY = "get_bill_details_service_total_rental_amount_ar"; // language
																																		// will
																																		// append
																																		// from
																																		// code
	public static final String GET_BILL_DETAILS_SERVICE_TOTAL_RENTAL_AMOUNT_EN_KEY = "get_bill_details_service_total_rental_amount_en"; // language
																																		// will
																																		// append
																																		// from
																																		// code

	public static final String GET_BILL_DETAILS_SERVICE_TOTAL_ONE_TIME_AR_KEY = "get_bill_details_service_total_one_time_ar"; // language
																																// will
																																// append
																																// from
																																// code
	public static final String GET_BILL_DETAILS_SERVICE_TOTAL_ONE_TIME_EN_KEY = "get_bill_details_service_total_one_time_en"; // language
																																// will
																																// append
																																// from
																																// code

	public static final String GET_BILL_DETAILS_SERVICE_TOTAL_DISCOUNT_AMOUNT_AR_KEY = "get_bill_details_service_total_discount_amount_ar"; // language
																																			// will
																																			// append
																																			// from
																																			// code
	public static final String GET_BILL_DETAILS_SERVICE_TOTAL_DISCOUNT_AMOUNT_EN_KEY = "get_bill_details_service_total_discount_amount_en"; // language
																																			// will
																																			// append
																																			// from
																																			// code

	public static final String GET_EXTRA_OOB_SERVICE_TOTAL_RENTAL_AMOUNT_AR_KEY = "get_extra_oob_service_total_rental_amount_ar"; // language
																																	// will
																																	// append
																																	// from
																																	// code
	public static final String GET_EXTRA_OOB_SERVICE_TOTAL_RENTAL_AMOUNT_EN_KEY = "get_extra_oob_service_total_rental_amount_en"; // language
																																	// will
																																	// append
																																	// from
																																	// code

	public static final String GET_EXTRA_OOB_SERVICE_TOTAL_ONE_TIME_AR_KEY = "get_extra_oob_service_total_one_time_ar"; // language
																														// will
																														// append
																														// from
																														// code
	public static final String GET_EXTRA_OOB_SERVICE_TOTAL_ONE_TIME_EN_KEY = "get_extra_oob_service_total_one_time_en"; // language
																														// will
																														// append
																														// from
																														// code

	public static final String GET_EXTRA_OOB_SERVICE_TOTAL_DISCOUNT_AMOUNT_AR_KEY = "get_extra_oob_service_total_discount_amount_ar"; // language
																																		// will
																																		// append
																																		// from
																																		// code
	public static final String GET_EXTRA_OOB_SERVICE_TOTAL_DISCOUNT_AMOUNT_EN_KEY = "get_extra_oob_service_total_discount_amount_en"; // language
																																		// will
																																		// append
																																		// from
																																		// code

	public static final String MINIMUM_RECHARGE_LIMIT_EN_KEY = "minimum_recharge_limit_en_key";
	public static final String MINIMUM_RECHARGE_LIMIT_AR_KEY = "minimum_recharge_limit_ar_key";

	public static final String MAXIMUM_RECHARGE_LIMIT_EN_KEY = "maximum_recharge_limit_en_key";
	public static final String MAXIMUM_RECHARGE_LIMIT_AR_KEY = "maximum_recharge_limit_ar_key";

	public static final String MAXIMUM_OTP_ATTEMPTS_LIMIT_EN_KEY = "maximum_otp_attempts_limit_en_key";
	public static final String MAXIMUM_OTP_ATTEMPTS_LIMIT_AR_KEY = "maximum_otp_attempts_limit_ar_key";

	public static final String MINIMUM_RECHARGE_LIMIT_SWITCHER_KEY = "minimum_recharge_limit_switcher_key";

	// ####################Usage Out of Bundle Titles ###############
	public static final String FIXED_USAGETITLE_VOD = "fixed_usageTitle_vod";
	public static final String FIXED_USAGETITLE_VOICE = "fixed_usageTitle_voice";

	// ####################Usage Out of Bundle Titles ###############

	public static final String MAXIMUM_OTP_ATTEMPTS_COUNT = "maximum_otp_attempts_count";
	public static final String MAXIMUM_OTP_ATTEMPTS_TIME_MINUTES = "maximum_otp_attempts_time_minutes";
	
	
	public static final String GET_MY_ACCOUNT_SURVEY_MENU_ID_KEY = "get_my_account_survey_menu_id";
	
	// ********************************************* FUNCTIONALITY ENABLE DISABLE FLAGS********************************************************
	
	public static final String CFM_ENABLE_FLAG_KEY = "cfm_enable_flag";
	
	
	
	// ********************************************* FUNCTIONALITY ENABLE DISABLE FLAGS********************************************************
	
	
	
	// ********************************* SURVEY ***********************************
	
	
	/*
	 * 
	 * 1	Local transfer
2	Payment of bill
3	Data credit transfer
4	Change password
5	Generic
6	International transfer
7	Update Profile
8	Register EID
9	Unsubscribe Package
10	Purchase
11	Home Shifting Request
12	View bill
13	Set bill limit
	 * 
	 * */
	
	
	public static final String SURVEY_NO_OF_DAYS_FOR_SURVEY_ELIGIBILITY_KEY = "60";
	
	public static final String SURVEY_PAYMENT_OF_BILL_KEY = "2";
	public static final String SURVEY_MIGRATE_LINE_KEY = "15";
	public static final String SURVEY_CHANGE_LINE_KEY = "14";
	public static final String SURVEY_CHECK_USAGE_KEY = "16";
	public static final String SURVEY_MOTIVE_SELF_CARE_KEY = "17";
	public static final String SURVEY_RECHARGE_KEY = "18";
	// ********************************* SURVEY ***********************************
	
	//**************** Push Notifications **************************************
	
	
	public static final String PUSH_NOTIFICATIONS_NEWS_EXPIRY_DAYS = "push_notifications_news_expiry_days";
	
	


	public static final String CFM_MENU_SURVEY_ID_KEY = "CFM_MENU_SURVEY_ID";
	
	
	
	public static final String CFM_ENABLE_SURVEY_AFTER_DAYS_COUNT_KEY = "cfm_enable_survey_after_days_count";

	
	public static final String GET_ACTIVE_ADDON_LIST_WHITELIST_IOS_VERSION_CONFIG_KEY = "get_active_addon_list_whitelist_ios_version_config_key";
	public static final String GET_ACTIVE_ADDON_LIST_WHITELIST_ANDR_VERSION_CONFIG_KEY = "get_active_addon_list_whitelist_andr_version_config_key";
	public static final String GET_ACTIVE_ADDON_LIST_NEW_LOGIC = "get_active_addon_list_new_logic";
	public static final String MEGA_ADDON_LOGIC_ACTIVE = "mega_addon_logic_active";
	
	public static final String GET_ACTIVE_ADDON_LIST_LATEST_LOGIC = "get_active_addon_list_latest_logic";
	public static final String PAYMENT_OPT_2_SOURCE_DES_NEW_LOGIC = "payment_opt_2_source_des_new_logic";
	
	
	// WASEL-X
	
	public static final String WASEL_X_MESSAGE = "wasel_x_message";
	public static final String WASEL_X_MESSAGE_AR = "wasel_x_message_ar";
	public static final String WASEL_X_NEW_FLAG = "wasel_x_new_flag";
	public static final String WASEL_X_IS_CLICKABLE = "wasel_x_is_clickable";
	
	public static final String WASEL_X_MORE_DETAILS = "wasel_x_more_details";
	public static final String WASEL_X_MORE_DETAILS_AR = "wasel_x_more_details_ar";
	
	public static final String WASEL_X_PLAN_DETAIL_RENEWS_ON = "wasel_x_plan_detail_renews_on";
	public static final String WASEL_X_PLAN_DETAIL_RENEWS_ON_AR = "wasel_x_plan_detail_renews_on_ar";
	public static final String WASEL_X_PLAN_DETAIL_EXPIRES_ON = "wasel_x_plan_detail_expires_on";
	public static final String WASEL_X_PLAN_DETAIL_EXPIRES_ON_AR = "wasel_x_plan_detail_expires_on_ar";
	
	public static final String WASEL_X_PLAN_DETAIL_RENEWS = "wasel_x_plan_detail_renews";
	public static final String WASEL_X_PLAN_DETAIL_RENEWS_AR = "wasel_x_plan_detail_renews_ar";
	public static final String WASEL_X_PLAN_DETAIL_EXPIRES = "wasel_x_plan_detail_expires";
	public static final String WASEL_X_PLAN_DETAIL_EXPIRES_AR = "wasel_x_plan_detail_expires_ar";
	
	public static final String WASEL_X_GRACE_SUBTITLE = "wasel_x_grace_subtitle";
	public static final String WASEL_X_GRACE_SUBTITLE_AR = "wasel_x_grace_subtitle_ar";
	
	public static final String WASEL_X_STATUS_SECTION_NAME = "wasel_x_status_section_name";
	public static final String WASEL_X_STATUS_SECTION_NAME_AR = "wasel_x_status_section_name_ar";
	
	public static final String WASEL_X_PACKAGE_SECTION_NAME = "wasel_x_package_section_name";
	public static final String WASEL_X_PACKAGE_SECTION_NAME_AR = "wasel_x_package_section_name_ar";
	
	public static final String WASEL_X_ACTIONS_SECTION_NAME = "wasel_x_actions_section_name";
	public static final String WASEL_X_ACTIONS_SECTION_NAME_AR = "wasel_x_actions_section_name_ar";
	
	public static final String WASEL_X_RENEWAL_FREQUENCY_MESSAGE = "wasel_x_renewal_frequency_message";
	public static final String WASEL_X_RENEWAL_FREQUENCY_MESSAGE_AR = "wasel_x_renewal_frequency_message_ar";
	
	public static final String WASEL_X_RENEWAL_NON_FREQUENCY_MESSAGE = "wasel_x_renewal_non_frequency_message";
	public static final String WASEL_X_RENEWAL_NON_FREQUENCY_MESSAGE_AR = "wasel_x_renewal_non_frequency_message_ar";
	
	public static final String WASEL_X_PLAN_NAME = "wasel_x_plan_name";
	public static final String WASEL_X_PLAN_NAME_AR = "wasel_x_plan_name_ar";
	
	public static final String WASEL_X_NO_PLAN_NAME = "wasel_x_no_plan_name";
	public static final String WASEL_X_NO_PLAN_NAME_AR = "wasel_x_no_plan_name_ar";
	
	public static final String WASEL_X_FLEXI_MINS = "wasel_x_flexi_mins";
	public static final String WASEL_X_FLEXI_MINS_AR = "wasel_x_flexi_mins_ar";
	
	public static final String WASEL_X_DATA = "wasel_x_data";
	public static final String WASEL_X_DATA_AR = "wasel_x_data_ar";
		
	public static final String WASEL_X_PREFERRED_NUMBER_HEADER_TEXT = "wasel_x_preferred_number_header_text";
	public static final String WASEL_X_PREFERRED_NUMBER_HEADER_TEXT_AR = "wasel_x_preferred_number_header_text_ar";
	
	public static final String WASEL_X_DIMMED_SLOT_1 = "wasel_x_dimmed_slot_1";
	public static final String WASEL_X_DIMMED_SLOT_1_AR = "wasel_x_dimmed_slot_1_ar";

	public static final String WASEL_X_DIMMED_SLOT_2 = "wasel_x_dimmed_slot_2";
	public static final String WASEL_X_DIMMED_SLOT_2_AR = "wasel_x_dimmed_slot_2_ar";

	public static final String WASEL_X_DIMMED_SLOT_3 = "wasel_x_dimmed_slot_3";
	public static final String WASEL_X_DIMMED_SLOT_3_AR = "wasel_x_dimmed_slot_3_ar";

	public static final String WASEL_X_DIMMED_SLOT_4 = "wasel_x_dimmed_slot_4";
	public static final String WASEL_X_DIMMED_SLOT_4_AR = "wasel_x_dimmed_slot_4_ar";
	
	public static final String WASEL_X_ACTIVATION_SUCCESS_MESSAGE = "wasel_x_activation_success_message";
	public static final String WASEL_X_ACTIVATION_SUCCESS_MESSAGE_AR = "wasel_x_activation_success_message_ar";
	
	public static final String WASEL_X_RECHARGE_MESSAGE = "wasel_x_recharge_message";
	public static final String WASEL_X_RECHARGE_MESSAGE_AR = "wasel_x_recharge_message_ar";

	public static final String WASEL_X_FAF_VALIDATION_MESSAGE = "wasel_x_faf_validation_message";
	public static final String WASEL_X_FAF_VALIDATION_MESSAGE_AR = "wasel_x_faf_validation_message_ar";
	
	public static final String WASEL_X_FAF_VALIDATION_MESSAGE_NO_CHARGE = "wasel_x_faf_validation_message_no_charge";
	public static final String WASEL_X_FAF_VALIDATION_MESSAGE_NO_CHARGE_AR = "wasel_x_faf_validation_message_no_charge_ar";

	public static final String WASEL_X_FAF_CHARGE = "wasel_x_faf_charge";
	public static final String WASEL_X_SAME_SLOT_ALREADY_BUSY_CODE = "VAL-00162";
	
	public static final String WASEL_X_SAME_SLOT_ALREADY_BUSY_MESSAGE = "wasel_x_same_slot_already_busy_message";
	public static final String WASEL_X_SAME_SLOT_ALREADY_BUSY_MESSAGE_AR = "wasel_x_same_slot_already_busy_message_ar";
	
	public static final String WASEL_X_SAME_SLOT_ALREADY_BUSY_RESPONSE_CODE = "0000191";
	



	
	
	
	// ########################## Device Care Info ##########################################
	public static final String DEVICE_CARE_INFO_URL = "device_care_info_url";
	public static final String DEVICE_CARE_INFO_CHANNEL_NAME = "device_care_info_channel_name";
	public static final String DEVICE_CARE_INFO_EXPIRY_DATE = "device_care_info_expiry_date";
	public static final String DEVICE_CARE_INFO_ENCRYPTION_KEY = "device_care_info_encryption_key";	
	

	
	public static final String DEVICE_CATALOGUE_ATG_ENDPOINT_URL = "device_catalogue_atg_endpoint_url";
	public static final String CUSTOMER_ORDER_MGMT_ENDPOINT_URL_KEY = "customer_order_mgmt_endpoint_url";
	public static final String SERVICE_ORDER_MGMT_ENDPOINT_URL_KEY = "service_order_mgmt_endpoint_url";
	public static final String CSS_BEAN_SERVICE_ENDPOINT_URL = "css_bean_service_endpoint_url";
	public static final String SERVICE_ORDER_MGMT_CUD_ENDPOINT_URL_KEY = "service_order_mgmt_cud_endpoint_url";
	public static final String USER_PROFILE_SERVICE_IVR_ENDPOINT_URL_KEY = "user_profile_service_ivr_endpoint_url";
	public static final String IVR_CHANNEL_KEY = "ivr_channel";
	public static final String IVR_SUB_CHANNEL_KEY = "ivr_sub_channel";
	public static final String IVR_SYSTEM_NAME_KEY = "ivr_system_name";
	
	public static final String CSS_REST_URL = "CSS_REST_URL";

	public static final String CSS_USER_NAME = "css_user_name";
	
	public static final String CSS_PASSWORD = "css_password";
	
	public static final String EXECUTE_EVENT_SERVICE_IVR_ENDPOINT_URL_KEY = "execute_event_service_ivr_endpoint_url";
	
	
	
	public static final String CBCM_AUTH_USERNAME_KEY = "cbcm_auth_username";
	public static final String CBCM_AUTH_PASSWORD_KEY = "cbcm_auth_password";

	
	
	public static final String SERVICE_ORDER_MGMT_REQUESTED_SYSTEM = "MobileApp";
	
	public static final String BANDWIDTH_ON_DEMAND_TYPE_KEY = "bandwidth_on_demand_type";
	
	// ################## CBCM ERROR CODES ################################
	
	
	
	
	// ################### MISE ############################
	
	public static final String ACTION_1 = "1";
	public static final String ACTION_2 = "2";
	public static final String ACTION_3 = "3";
	public static final String ACTION_4 = "4";
	public static final String ACTION_5 = "5";
	
	
	
	//############### AUTO PAY ####################
	
	//OutstandingAmount/FixedAmount/ WeeklyRecharge/MonthlyRecharge/ AsNeededRecharge
	
/*	public static final String AUTO_PAY_OUTSTANDING_AMOUNT_MIN_KEY = "auto_pay_outstanding_amount_min";
	public static final String AUTO_PAY_OUTSTANDING_AMOUNT_MAX_KEY = "auto_pay_outstanding_amount_max";
	
	
	public static final String AUTO_PAY_FIXED_AMOUNT_MIN_KEY = "auto_pay_fixed_amount_min";
	public static final String AUTO_PAY_FIXED_AMOUNT_MAX_KEY = "auto_pay_fixed_amount_max";
	
	
	public static final String AUTO_PAY_WEEKLY_RECHARGE_AMOUNT_MIN_KEY = "auto_pay_weekly_recharge_amount_min";
	public static final String AUTO_PAY_WEEKLY_RECHARGE_AMOUNT_MAX_KEY = "auto_pay_weekly_recharge_amount_max";
	
	
	public static final String AUTO_PAY_MONTHLY_RECHARGE_AMOUNT_MIN_KEY = "auto_pay_monthly_recharge_amount_min";
	public static final String AUTO_PAY_MONTHLY_RECHARGE_AMOUNT_MAX_KEY = "auto_pay_monthly_recharge_amount_max";
	
	
	public static final String AUTO_PAY_AS_NEEDED_RECHARGE_AMOUNT_MIN_KEY = "auto_pay_as_needed_recharge_amount_min";
	public static final String AUTO_PAY_AS_NEEDED_RECHARGE_AMOUNT_MAX_KEY = "auto_pay_as_needed_recharge_amount_max";*/



	public static final String START_STOP_DEFAULT_AMOUNT_KEY = "start_stop_default_amount_key";
	public static final String START_STOP_DEFAULT_DURATION_KEY = "start_stop_default_duration_key";
	
	
	public static final String START_STOP_STOP_SUCCESS_ONLY_AMOUNT_AR = "start_stop_stop_success_only_amount_ar";
	public static final String START_STOP_STOP_SUCCESS_ONLY_AMOUNT_EN = "start_stop_stop_success_only_amount_en";
	public static final String START_STOP_STOP_SUCCESS_ONLY_MIN_AR = "start_stop_stop_success_only_min_ar";
	public static final String START_STOP_STOP_SUCCESS_ONLY_MINT_EN = "start_stop_stop_success_only_mint_en";
	public static final String START_STOP_STOP_SUCCESS_NO_BOTH_AR = "start_stop_stop_success_no_both_ar";
	public static final String START_STOP_STOP_SUCCESS_NO_BOTH_EN = "start_stop_stop_success_no_both_en";

	public static final String START_STOP_OUT_OF_BUNDLE_OFFER_ID_KEY = "start_stop_out_of_bundle_offer_id";
	public static final String START_STOP_IN_BUNDLE_OFFER_ID_KEY = "start_stop_in_bundle_offer_id";
	

	//**************************************** NBA ****************************************************
	//App
		public static final String DEAL_NBA_CHANNEL = "deal_nba_channel";
		//Deal_APP
		public static final String DEAL_DOD_CHANNEL = "deal_dod_channel";
		
		//**************************************** NBA ****************************************************
		
		// **************************************** AUTO PAY ****************************************************
		public static final String CUSTOMER_INQUIRY_DOCUMENT_TYPE_EMIRATES_ID = "UAE Identity card";
		
		public static final String DIGITAL_APP_WS_AUTO_PAY_REG_EMIRATE_ID_OR_EMAIL_MISSING_ERROR_CODE = "0001119";
		
		
		public static final String AUTO_PAY_REG_EMIRATE_ID_OR_EMAIL_MISSING_EN_KEY = "auto_pay_reg_emirate_id_or_email_missing_en";
		public static final String AUTO_PAY_REG_EMIRATE_ID_OR_EMAIL_MISSING_AR_KEY = "auto_pay_reg_emirate_id_or_email_missing_ar";
		
		public static final String AUTO_PAY_REG_EMIRATE_ID_EN_KEY = "auto_pay_reg_emirate_id_en";
		public static final String AUTO_PAY_REG_EMIRATE_ID_AR_KEY = "auto_pay_reg_emirate_id_ar";
		public static final String EPG_AUTO_PAY_REGISTRATION_RETURN_PATH_CONFIG_KEY = "epg_auto_pay_registration_return_path";
		public static final String EPG_AUTO_PAY_AMOUNT_KEY = "epg_auto_pay_amount"; //
		public static final String EPG_AUTO_PAY_STORE_ENABLE_CONFIG_KEY = "epg_auto_pay_store_enable";
		public static final String EPG_AUTO_PAY_STORE_CONFIG_KEY = "epg_auto_pay_store";
		public static final String EPG_AUTO_PAY_TERMINAL_ENABLE_CONFIG_KEY = "epg_auto_pay_terminal_enable";
		public static final String EPG_AUTO_PAY_TERMINAL_CONFIG_KEY = "epg_auto_pay_terminal";
		public static final String EPG_AUTO_PAY_HINT_CONFIG_KEY = "epg_auto_pay_hint";//
		public static final String EPG_AUTO_PAY_ONLY_HINT_CONFIG_KEY = "epg_auto_pay_only_hint";//
		public static final String EPG_AUTO_PAY_HINT_1_REV = "epg_auto_pay_hint_1_rev";//
		public static final String EPG_AUTO_PAY_TYPE_CONFIG_KEY = "epg_auto_pay_type";//
		public static final String EPG_AUTO_PAY_TYPE_FOR_1_REV = "epg_auto_pay_type_for_1_rev";//
		public static final String EPG_AUTO_PAY_TYPE_AND_PAYMENT_TYPE = "epg_auto_pay_type_and_payment_type";//
		public static final String EPG_AUTO_PAY_BUSINESS_CHANNEL_CONFIG_KEY = "epg_auto_pay_business_channel";
		public static final String  AUTO_PAY_OUT_STANDING = "1";
		public static final String REST_SERVICE_TDB_VALIDATE_URL = "rest_service_tdb_validate_url";
		public static final String  AUTO_PAY_FIXED_AMOUNT = "2";
		public static final String  AUTO_PAY_RECHARGE_WEEKLY = "3";
		public static final String  AUTO_PAY_RECHARGE_MONTHLY = "4";
		public static final String  AUTO_PAY_AS_NEEDED = "5";
		public static final String  AUTO_PAY_OUT_STANDING_UPTO = "6";
		public static final String CBCM_AUTO_PAY_URL_CONFIG_KEY = "cbcm_auto_pay_url";
		public static final String EPG_AUTO_PAY_TRANSACTION_KEY = "AutoPayInquiry";//
		public static final String EPG_BUSINESS_CHANNEL_KEY = "BusinessChannel";//
		
		public static final String AUTO_PAY_OUTSTANDING_AMOUNT_MIN_KEY = "auto_pay_outstanding_amount_min";
		public static final String AUTO_PAY_AUTO_PAY_GENRAL_INFO_DES_AR_KEY = "auto_pay_genral_info_des_ar";
		public static final String AUTO_PAY_AUTO_PAY_GENRAL_INFO_DES_EN_KEY = "auto_pay_genral_info_des_en";
		public static final String AUTO_PAY_SER_TERM_WEEK_DES_AR_KEY = "auto_pay_ser_term_week_des_ar";
		public static final String AUTO_PAY_SER_TERM_WEEK_DES_EN = "auto_pay_ser_term_week_des_en";
		public static final String AUTO_PAY_SER_TERM_MONTH_DES_AR = "auto_pay_ser_term_month_des_ar";
		public static final String AUTO_PAY_SER_TERM_MONTH_DES_EN = "auto_pay_ser_term_month_des_en";
		public static final String AUTO_PAY_SER_TERM_AS_NEEDED_DES_AR = "auto_pay_ser_term_as_needed_des_ar";
		public static final String AUTO_PAY_SER_TERM_AS_NEEDED_DES_EN = "auto_pay_ser_term_as_needed_des_en";
		public static final String AUTO_PAY_OUTSTANDING_AMOUNT_MAX_KEY = "auto_pay_outstanding_amount_max";
		public static final String AUTO_PAY_SER_TERMS_MIN_OUTSTANDING_AMOUNT_KEY = "auto_pay_ser_terms_min_outstanding_amount";
		public static final String AUTO_PAY_SER_TERMS_MIN_FIXED_AMOUNT_KEY = "auto_pay_ser_terms_min_fixed_amount";
		public static final String AUTO_PAY_SER_TERMS_AUTO_RECHARGE_TOPUP_MIN_AMOUNT_KEY = "auto_pay_ser_terms_auto_recharge_topup_min_amount";
		
		
		public static final String AUTO_PAY_OUTSTANDING_AMOUNT_MAX_DAILY_KEY = "auto_pay_outstanding_amount_max_daily";
		public static final String AUTO_PAY_OUTSTANDING_AMOUNT_MAX_MONTH_KEY = "auto_pay_outstanding_amount_max_monthly";
		
		
		public static final String AUTO_PAY_FIXED_AMOUNT_MIN_KEY = "auto_pay_fixed_amount_min";
		public static final String AUTO_PAY_FIXED_AMOUNT_MAX_KEY = "auto_pay_fixed_amount_max";
		public static final String AUTO_PAY_FIXED_AMOUNT_MAX_DAILY_KEY = "auto_pay_fixed_amount_max_daily";
		public static final String AUTO_PAY_FIXED_AMOUNT_MAX_MONTH_KEY = "auto_pay_fixed_amount_max_monthly";
		
																		  
		public static final String AUTO_PAY_WEEKLY_RECHARGE_AMOUNT_MIN_KEY = "auto_pay_weekly_recharge_amount_min";
		public static final String AUTO_PAY_WEEKLY_RECHARGE_AMOUNT_MAX_KEY = "auto_pay_weekly_recharge_amount_max";
		public static final String AUTO_PAY_WEEKLY_RECHARGE_AMOUNT_MAX_DAILY_KEY = "auto_pay_weekly_recharge_amount_max_daily";
		public static final String AUTO_PAY_WEEKLY_RECHARGE_AMOUNT_MAX_MONTHLY_KEY = "auto_pay_weekly_recharge_amount_max_monthly";
		
		
		public static final String AUTO_PAY_MONTHLY_RECHARGE_AMOUNT_MIN_KEY = "auto_pay_monthly_recharge_amount_min";
		public static final String AUTO_PAY_MONTHLY_RECHARGE_AMOUNT_MAX_KEY = "auto_pay_monthly_recharge_amount_max";
		public static final String AUTO_PAY_MONTHLY_RECHARGE_AMOUNT_MAX_DAILY_KEY = "auto_pay_monthly_recharge_amount_max_daily";
		public static final String AUTO_PAY_MONTHLY_RECHARGE_AMOUNT_MAX_MONTHLY_KEY = "auto_pay_monthly_recharge_amount_max_monthly";
		
		
		public static final String AUTO_PAY_AS_NEEDED_RECHARGE_AMOUNT_MIN_KEY = "auto_pay_as_needed_recharge_amount_min";
		public static final String AUTO_PAY_AS_NEEDED_RECHARGE_AMOUNT_MAX_KEY = "auto_pay_as_needed_recharge_amount_max";

		
		public static final String AUTO_PAY_AS_NEEDED_RECHARGE_AMOUNT_MAX_DAILY_KEY = "auto_pay_as_needed_recharge_amount_max_daily";
		public static final String AUTO_PAY_AS_NEEDED_RECHARGE_AMOUNT_MAX_MONTHLY_KEY = "auto_pay_as_needed_recharge_amount_max_monthly";
		
		
		/// FAMILY PACK
		
		public static final String FAMILY_PACK_USAGE_MEMBER_COLOR = "family_pack_usage_member_color_";
		public static final String REST_SERVICE_RTF_VALIDATE_URL_CONFIG_KEY = "rest_service_rtf_validate_url";
		public static final String RTF_FAILURE_STATUS = "FAILED";
		public static final String DIGITAL_APP_WS_CHECK_MEMBER_ALREADY_MEMBER_STATUS_CODE = "0001107";
		public static final String CHECK_MEMBER_STATUS_ALREADY_MEMBER_EN_KEY = "check_member_status_already_member_en";
		public static final String CHECK_MEMBER_STATUS_ALREADY_MEMBER_AR_KEY = "check_member_status_already_member_ar";
		
		public static final String DIGITAL_APP_WS_CHECK_MEMBER_STATUS_KIDS_ALREADY_MEMBER_CODE = "0001109";
		public static final String DIGITAL_APP_WS_CHECK_MEMBER_STATUS_KIDS_NOT_ETISALAT_NUMBER_CODE = "0001110";
		public static final String DIGITAL_APP_WS_SUBSCRIBE_ADDON_ADD_MEMEBER_ERROR_CODE = "0001111";
		public static final String DIGITAL_APP_WS_SUBSCRIBE_SUBCRIBER_NOT_FOUND_ERROR_CODE = "0001112";
		
		

		public static final String DIGITAL_APP_WS_CHECK_MEMBER_STATUS_NOT_ETISALAT_NUMBER_CODE = "0001108";
		public static final String DIGITAL_APP_WS_CHECK_ALREADY_SUBSCRIBED = "0001134";
		public static final String DIGITAL_APP_WS_SUBSCRIBE_SUBCRIBER_NOT_ELIGIBLE_ERROR_CODE = "0001113";
		public static final String DIGITAL_APP_WS_SUBSCRIBE_SELECTED_BOD_NOT_AVAILABLE_ERROR_CODE = "0001114";
		public static final String DIGITAL_APP_WS_SUBSCRIBE_ANOTHER_BOD_EXIST_ERROR_CODE = "0001115";
		public static final String DIGITAL_APP_WS_DEL_GROUP_KIDS_PACK_OFR_NOT_EXIST_ERROR_CODE = "0001116";
		public static final String DIGITAL_APP_WS_KIDS_PLAN_MONTHLY_LIMIT_EXCCEDD_ERROR_CODE = "0001117";
		public static final String DIGITAL_APP_WS_KIDS_PLAN_KIDS_NUMBER_ALREADY_USED_ERROR_CODE = "0001118";

	    public static final String DIGITAL_APP_WS_MONTHLY_LIMIT_EXCEEDED_ERROR_CODE = "0001119";

		
		public static final String DIGITAL_APP_WS_SUBSCRIPTION_ADDON_ALREADY_SUBSCRIBED_ERROR_CODE = "0001120";
		public static final String DIGITAL_APP_WS_SET_LIMIT_LIMIT_EXCCEDD_ERROR_CODE = "0001121";
		

		
		public static final String DIGITAL_APP_WS_KIDS_LINE_INDIVIDUAL_ACCESS_LOGIN_ERROR_CODE = "0001122";
		public static final String DIGITAL_APP_WS_RTF_IN_SUFFICENT_BALANCE_ERROR_CODE = "0001123";
		public static final String DIGITAL_APP_WS_RTF_ADDON_NOT_ELIGIBLE_FOR_ACCOUNT_ERROR_CODE = "0001124";
			

		public static final String DIGITAL_APP_WS_PACKAGE_SUB_UN_SUB_LIMIT_EXCCED_ERROR_CODE = "0001127";
		
		
		


		
		public static final String DIGITAL_APP_WS_UNABLE_TO_GET_INFO_SUBSCR_ERROR_CODE = "0001129";
		public static final String DIGITAL_APP_WS_EXCEED_NUM_OF_MOVES_PER_MONTH_ERROR_CODE = "0001130";
		
		public static final String DIGITAL_APP_WS_NUMBER_NOT_ELIGIBLE_ERROR_CODE = "0001131";
		public static final String DIGITAL_APP_WS_SUBSCRIBE_ADDON_SERVICE_MUTUAL_ERROR_CODE = "0001132";
		public static final String DIGITAL_APP_WS_MEGA_AUTOPAY_INVALID_AMOUNT = "0001133";
		
		public static final String DEL_GROUP_KIDS_PACK_OFR_NOT_EXIST_AR_KEY = "del_group_kids_pack_ofr_not_exist_ar";
		public static final String DEL_GROUP_KIDS_PACK_OFR_NOT_EXIST_EN_KEY = "del_group_kids_pack_ofr_not_exist_en";
		public static final String UPDATE_MEMBER_EXCEED_NUM_OF_MOVES_PER_MONTH_EN_KEY = "update_member_exceed_num_of_moves_per_month_en";
		public static final String UPDATE_MEMBER_EXCEED_NUM_OF_MOVES_PER_MONTH_AR_KEY = "update_member_exceed_num_of_moves_per_month_ar";
		
		
		
		
		public static final String UPDATE_MEMBER_UNABLE_TO_GET_INFO_SUBSCR_AR_KEY = "update_member_unable_to_get_info_subscr_ar";
		public static final String UPDATE_MEMBER_UNABLE_TO_GET_INFO_SUBSCR_EN_KEY = "update_member_unable_to_get_info_subscr_en";
		
		public static final String SUBSCRIBE_ADDON_SUBSCRIBER_NOT_FOUND_AR_KEY = "subscribe_addon_subscriber_not_found_ar";
		public static final String SUBSCRIBE_ADDON_SUBSCRIBER_NOT_FOUND_EN_KEY = "subscribe_addon_subscriber_not_found_en";
		
		
		public static final String NUMBER_NOT_ELIGIBLE_AR_KEY = "number_not_eligible_ar"; // language
		
		public static final String NUMBER_NOT_ELIGIBLE_EN_KEY = "number_not_eligible_en"; // language
		
		public static final String CHECK_MEMBER_STATUS_NOT_ETISALAT_NUMBER_EN_KEY = "check_member_status_not_etisalat_number_en";
		public static final String CHECK_MEMBER_STATUS_NOT_ETISALAT_NUMBER_AR_KEY = "check_member_status_not_etisalat_number_ar";
		
		public static final String CHECK_ALREADY_SUBSCRIBE_FOR_SAME_OFFER_EN_KEY = "check_already_subscribe_for_same_offer_en_key";
		public static final String CHECK_ALREADY_SUBSCRIBE_FOR_SAME_OFFER_AR_KEY = "check_already_subscribe_for_same_offer_ar_key";

		public static final String PAY_FOR_DEVICE_STANDALONE_PLAN = "1";
		public static final String PAY_FOR_DEVICE_SMARTPAY_PLAN = "2";
		public static final String PAY_FOR_DEVICE_CC_OPTION = "1";
		public static final String PAY_FOR_DEVICE_POINTS_OPTION = "2";
		public static final String PAY_FOR_DEVICE_COD_OPTION = "3";
		public static final String PAY_FOR_DEVICE_MIXED_OPTION = "4";
		public static final String PAY_FOR_DEVICE_EWALLET_OPTION = "5";
		
		public static final String CHECK_MEMBER_STATUS_MEMBER_EXCEED_NUMBER_OF_MONTHLY_MOVES_EN_KEY = "check_member_status_member_exceed_number_of_monthly_moves_en";
		public static final String CHECK_MEMBER_STATUS_MEMBER_EXCEED_NUMBER_OF_MONTHLY_MOVES_AR_KEY = "check_member_status_member_exceed_number_of_monthly_moves_ar";

		public static final String RTF_ADDON_NOT_ELIGIBLE_FOR_ACCOUNT_EN_KEY = "kids_plan_rtf_addon_not_eligible_for_account_en";
		public static final String RTF_ADDON_NOT_ELIGIBLE_FOR_ACCOUNT_AR_KEY = "kids_plan_rtf_addon_not_eligible_for_account_ar";
		public static final String SUBSCRIBE_ADDON_ADD_MEMEBER_AR_KEY = "subscribe_addon_add_memeber_ar";
		public static final String SUBSCRIBE_ADDON_ADD_MEMEBER_EN_KEY = "subscribe_addon_add_memeber_en";
		public static final String SET_LIMIT_LIMIT_EXCCEDD_ERROR_CODE_AR_KEY = "set_limit_limit_exccedd_error_code_ar";
		public static final String SET_LIMIT_LIMIT_EXCCEDD_ERROR_CODE_EN_KEY = "set_limit_limit_exccedd_error_code_en";
		
		//error text changes for epg
		
		public static final int ERROR_CODE_AUTHORIZED_CHANNEL = 102;
		/*public static final int ERROR_CODE_SESSION_EXPIRE = 1116;*/
		public static final int ERROR_CODE_PROVIDED_CARD_EXPIRED = 113;
		public static final int ERROR_CODE_CREDIT_CARD_OR_IBAN_1117 = 1117;
		public static final int ERROR_CODE_CREDIT_CARD_OR_IBAN_474 = 474;
		public static final int ERROR_CODE_EMIRATES_ID_1116 = 1116;
		public static final int ERROR_CODE_EMIRATES_ID_475 = 475;
		
		public static final String COMS_ERROR_CODE_NOT_ELIGIBLE = "E11";
		public static final String DIGITAL_APP_WS_CHECK_ELIGIBILITY_SERVICE_NOT_ELIGIBLE = "0001134";
		public static final String DIGITAL_APP_WS_DELIVERY_ADDRESS_MISSING_CITY = "0001135";
		public static final String DIGITAL_APP_WS_CHECK_ELIGIBILITY_SERVICE_NOT_ELIGIBLE_AR_KEY = "check_eligibility_service_not_eligible_error_code_ar";
		public static final String DIGITAL_APP_WS_CHECK_ELIGIBILITY_SERVICE_NOT_ELIGIBLE_EN_KEY = "check_eligibility_service_not_eligible_error_code_en";
		
		public static final String ERROR_MESSAGE_CONFIGURATIONS_EPG_SUCCESS_EN_KEY = "set_epg_success_en";
		public static final String ERROR_MESSAGE_CONFIGURATIONS_EPG_SUCCESS_AR_KEY = "set_epg_success_ar";
		public static final String ERROR_MESSAGE_CONFIGURATIONS_AUTHORIZED_CHANNEL_EN_KEY = "set_epg_autorized_channel_en";
		public static final String ERROR_MESSAGE_CONFIGURATIONS_AUTHORIZED_CHANNEL_AR_KEY = "set_epg_autorized_channel_ar";
		/*public static final String ERROR_MESSAGE_CONFIGURATIONS_SESSION_EXPIRE_AR_KEY = "set_epg_session_expire_ar";
		public static final String ERROR_MESSAGE_CONFIGURATIONS_SESSION_EXPIRE_ER_KEY = "set_epg_session_expire_er";*/
		public static final String ERROR_MESSAGE_CONFIGURATIONS_PROVIDED_CARD_EXPIRED_AR_KEY = "set_epg_provided_card_expired_ar";
		public static final String ERROR_MESSAGE_CONFIGURATIONS_PROVIDED_CARD_EXPIRED_EN_KEY = "set_epg_provided_card_expired_en";
		public static final String ERROR_MESSAGE_CONFIGURATIONS_CREDIT_CARD_OR_IBAN_1117_AR_KEY = "set_epg_credit_card_or_iban_1117_ar";
		public static final String ERROR_MESSAGE_CONFIGURATIONS_CREDIT_CARD_OR_IBAN_1117_EN_KEY = "set_epg_credit_card_or_iban_1117_en";
		public static final String ERROR_MESSAGE_CONFIGURATIONS_CREDIT_CARD_OR_IBAN_474_AR_KEY = "set_epg_credit_card_or_iban_474_ar";
		public static final String ERROR_MESSAGE_CONFIGURATIONS_CREDIT_CARD_OR_IBAN_474_EN_KEY = "set_epg_credit_card_or_iban_474_en";
		public static final String ERROR_MESSAGE_CONFIGURATIONS_EMIRATES_ID_1116_AR_KEY = "set_epg_emirates_id_1116_ar";
		public static final String ERROR_MESSAGE_CONFIGURATIONS_EMIRATES_ID_1116_EN_KEY = "set_epg_emirates_id_1116_en";
		public static final String ERROR_MESSAGE_CONFIGURATIONS_EMIRATES_ID_475_AR_KEY = "set_epg_emirates_id_475_ar";
		public static final String ERROR_MESSAGE_CONFIGURATIONS_EMIRATES_ID_475_EN_KEY = "set_epg_emirates_id_475_en";
		
		public static final String ERROR_MESSAGE_CONFIGURATIONS_SOMETHING_WENT_WRONG_AR_KEY = "set_epg_something_went_wrong_ar";
		public static final String ERROR_MESSAGE_CONFIGURATIONS_SOMETHING_WENT_WRONG_EN_KEY = "set_epg_something_went_wrong_en";
		
		
		// hybrid
		
		public static final String HYBRID_SERVICE_REQUESTED_SYSTEM_KEY = "hybrid_service_request_system";
		public static final String HYBRID_SERVICE_COLLECTION_LOCATION_CODE_KEY = "hybrid_service_collection_location_code";
		public static final String HYBRID_SERVICE_REGION_CODE_KEY = "hybrid_service_region_code";
		public static final String HYBRID_SERVICE_ADJ_TYPE_KEY = "hybrid_service_adj_type";
		public static final String HYBRID_SERVICE_ADJ_TRANS_TYPE_KEY = "hybrid_service_adj_trans_type";
		public static final String HYBRID_SERVICE_ADJ_CHARGE_CODE_KEY = "hybrid_service_adj_charge_code";
		public static final String HYBRID_SERVICE_ACCOUNT_TYPE_KEY = "hybrid_service_account_type_code";
		public static final String HYBRID_BILLPAY_VIA_TOPUP_KEY = "billpay_via_topup";
		public static final String HYBRID_USER_NAME_KEY = "hybrid_user_name";
		public static final String ESIM_COMS_CHANNEL = "esim_coms_channel";
		public static final String COMS_CHANNEL = "coms_channel";
		public static final String COMS_SUB_CHANNEL = "coms_sub_channel";
		public static final String MEGA_COMS_USER_ID = "mega_coms_user_id";
		public static final String MEGA_COMS_CASHIER_ID = "mega_coms_cashier_id";
		
		public static final String DIGITAL_APP_PRODUCT_CODE_POSTPAID = "digital_app_product_code_postpaid";
		public static final String DIGITAL_APP_SERVICE_CODE = "digital_app_service_codes";
		public static final String DIGITAL_APP_SERVICE_CODE_WS = "digital_app_service_code_ws";
		public static final String DIGITAL_APP_DEAL_STATUS = "digital_app_deal_status";
		
		public static final String PRODUCT_RECURRENCE_ONE_TIME = "product_recurrence_one_time";
		public static final String PRODUCT_RECURRENCE_DAILY = "product_recurrence_daily";
		public static final String PRODUCT_RECURRENCE_MONTHLY = "product_recurrence_monthly";
		public static final String PRODUCT_RECURRENCE_WEEKLY = "product_recurrence_weekly";
		
		public static final String PRODUCT_RECURRENCE_DAYS_LEFT = "product_recurrence_days_left";
		
		public static final String PACKAGE_RECURRENCE_ONE_TIME = "package_recurrence_one_time";
		public static final String PACKAGE_RECURRENCE_DAILY = "package_recurrence_daily";
		public static final String PACKAGE_RECURRENCE_MONTHLY = "package_recurrence_monthly";
		public static final String PACKAGE_RECURRENCE_WEEKLY = "package_recurrence_weekly";
		
		//hibernate batch size from cfg
		public static final int DIGITAL_APP_BATCH_SIZE = 20;
		
		public static final String DIGITAL_APP_CONFIG_DEVICE_ENABLED = "digital_app_config_device_enabled";
		public static final String DIGITAL_APP_CONFIG_PROMO_ENABLED = "digital_app_config_promo_enabled";
		public static final String DIGITAL_APP_CONFIG_DISPLAY_VAT = "digital_app_config_display_vat";
		public static final String DIGITAL_APP_CONFIG_SMART_PAY_ENABLED = "digital_app_config_smart_pay_enabled";
		
		public static final String DIGITAL_APP_WS_SMART_PAY_NOT_ELIGIBLE = "0001136";
		
		public static final String DIGITAL_APP_WS_DEVICE_PAYMENT_SUCCESS_CC = "device_payment_success_cc";
		public static final String DIGITAL_APP_WS_DEVICE_PAYMENT_SUCCESS_COD = "device_payment_success_cod";
		public static final String DIGITAL_APP_WS_DEVICE_PAYMENT_SUCCESS_SMART_PAY = "device_payment_success_smart_pay";
		public static final String DIGITAL_APP_WS_DEVICE_PAYMENT_SUCCESS_POINTS = "device_payment_success_points";
		public static final String DIGITAL_APP_WS_DEVICE_PAYMENT_SUCCESS_PREORDER = "device_payment_success_preorder";
		
		public static final String DIGITAL_APP_NO_DATA_FOUND = "TIB-005";
		
		public static final String DEVICE_COMS_ACCOUNT_NUMBER = "device_coms_account_number";
		
		public static final String DEVICE_PURCHASE_COMS_ACCOUNT_NUMBER = "device_purchase_coms_account_number";
		
		public static final String USE_OLD_CSS_STOCK_SERVICE = "use_old_css_stock_service";
		
		//Enhanced for Sending email notification
		public static final String DEVICE_ORDER_PROCESSED = "device_order_processed";
		public static final String DEVICE_DELIVERY_METHOD = "device_delivery_method";
		public static final String DEVICE_PURCHASE_NOTIFY_DISABLED = "device_purchase_notify_disabled";
		public static final String CB_ENV_COOKIE_NAME = "cb_env_cookie_name";
		
		public static final String DEVICE_PURCHASE_TEMPLATE_ID = "device_purchase_template_id";

		
		public static final String POSTPAID_ENHANCEMENTS_LOCAL_CATEGORY = "postpaid_enhancements_local_category";
		public static final String POSTPAID_ENHANCEMENTS_LOCAL_CATEGORY_AR = "postpaid_enhancements_local_category_ar";
		
		public static final String POSTPAID_ENHANCEMENTS_FLEXI_CATEGORY = "postpaid_enhancements_flexi_category";
		public static final String POSTPAID_ENHANCEMENTS_FLEXI_CATEGORY_AR = "postpaid_enhancements_flexi_category_ar";
		
		// RAFFLE DRAW

		public static final String TOP_PARTICIPATIONS_COUNT = "top_answers_count";
		public static final String EVENTS_PRIORITY = "events_priority";
		public static final String VOICE_DEAL_OF_THE_DAY_PRIORITY = "voice_deal_of_the_day_priority";
		public static final String MESSAGES_DEAL_OF_THE_DAY_PRIORITY = "messages_deal_of_the_day_priority";
		public static final String DATA_DEAL_OF_THE_DAY_PRIORITY = "data_deal_of_the_day_priority";

		public static final String DIGITAL_APP_RAFFLE_ALREADY_ANSWERED = "digital_app_raffle_already_answered";
		public static final String DIGITAL_APP_RAFFLE_ALREADY_ANSWERED_AR = "digital_app_raffle_already_answered_ar";
		public static final String DIGITAL_APP_RAFFLE_SUCCESS = "digital_app_raffle_success";
		public static final String DIGITAL_APP_RAFFLE_UN_SUCCESS = "digital_app_raffle_un_success";
		public static final String DIGITAL_APP_RAFFLE_CONGRATULATIONS = "digital_app_raffle_congratulations";
		public static final String DIGITAL_APP_RAFFLE_CONGRATULATIONS_AR = "digital_app_raffle_congratulations_ar";
		public static final String DIGITAL_APP_RAFFLE_BETTER_LUCK_NEXT_TIME = "digital_app_raffle_better_luck_next_time";
		public static final String DIGITAL_APP_RAFFLE_BETTER_LUCK_NEXT_TIME_AR = "digital_app_raffle_better_luck_next_time_ar";

		// Free 1 GB offer
		public static final String FREE_1_GB_OFFER_ID = "FreeGBOffer";
		public static final String DIGITAL_APP_WS_UAE_APP_CONFIG_KEY = "uae_app";
		public static final String DIGITAL_APP_AED_USED = "digital_app_aed_used";
		public static final String DIGITAL_APP_AED_USED_AR = "digital_app_aed_used_ar";
		public static final String DIGITAL_APP_MINS = "digital_app_mins";
		public static final String DIGITAL_APP_MINS_AR = "digital_app_mins_ar";
		public static final String VAT_TEXT = "vat_text";
		public static final String VAT_TEXT_AR = "vat_text_ar";
		public static final String CHARGES_TEXT = "charges_text";
		public static final String CHARGES_TEXT_AR = "charges_text_ar";
		public static final String BILL_REMAINS_TEXT = "bill_remains_text";
		public static final String BILL_REMAINS_TEXT_AR = "bill_remains_text_ar";
		public static final String PAYMENTS_RECEIVED_TEXT = "payments_received_text";
		public static final String PAYMENTS_RECEIVED_TEXT_AR = "payments_received_text_ar";
		
		public static final String PAYMENT_OPTION_TITLE_1 = "payment_option_title_1";
		public static final String PAYMENT_OPTION_TITLE_1_AR = "payment_option_title_1_ar";
		public static final String PAYMENT_OPTION_SUBTITLE_1 = "payment_option_subtitle_1";
		public static final String PAYMENT_OPTION_SUBTITLE_1_AR = "payment_option_subtitle_1_ar";
		public static final String PAYMENT_OPTION_ICON_1 = "payment_option_icon_1";
		
		public static final String PAYMENT_OPTION_TITLE_2 = "payment_option_title_2";
		public static final String PAYMENT_OPTION_TITLE_2_AR = "payment_option_title_2_ar";
		public static final String PAYMENT_OPTION_SUBTITLE_2 = "payment_option_subtitle_2";
		public static final String PAYMENT_OPTION_SUBTITLE_2_AR = "payment_option_subtitle_2_ar";
		public static final String PAYMENT_OPTION_ICON_2 = "payment_option_icon_2";
		
		public static final String PAYMENT_OPTION_TITLE_3 = "payment_option_title_3";
		public static final String PAYMENT_OPTION_TITLE_3_AR = "payment_option_title_3_ar";
		public static final String PAYMENT_OPTION_SUBTITLE_3 = "payment_option_subtitle_3";
		public static final String PAYMENT_OPTION_SUBTITLE_3_AR = "payment_option_subtitle_3_ar";
		public static final String PAYMENT_OPTION_ICON_3 = "payment_option_icon_3";
		
		public static final String NEVER_MISS_A_BILL = "never_miss_a_bill";
		public static final String NEVER_MISS_A_BILL_AR = "never_miss_a_bill_ar";
		public static final String SETUP_AUTOPAY = "setup_autopay";
		public static final String SETUP_AUTOPAY_AR = "setup_autopay_ar";
		public static final String SET_IT_UP_NOW = "set_it_up_now";
		public static final String SET_IT_UP_NOW_AR = "set_it_up_now_ar";
		public static final String SAVE_TIME_AND_HASSLE = "save_time_and_hassle";
		public static final String SAVE_TIME_AND_HASSLE_AR = "save_time_and_hassle_ar";
		public static final String ENOUGH_BILL_REMINDERS = "enough_bill_reminders";
		public static final String ENOUGH_BILL_REMINDERS_AR = "enough_bill_reminders_ar";
		
		// freebies keys.
		public static final String DIGITAL_APP_FREEBIES_MESSAGE = "digital_app_freebies_message";
		public static final String DIGITAL_APP_FREEBIES_MESSAGE_AR = "digital_app_freebies_message_ar";
		public static final String DIGITAL_APP_CLOSEST_EXPIRY_FREEBIES = "digital_app_closest_expiry_freebies";
		public static final String DIGITAL_APP_CLOSEST_EXPIRY_DATE = "digital_app_closest_expiry_date";
		
		//Where_Did_My_Data_Go Rest-Service Implementation
		public static final String WHERE_DATA_GO_PASSWORD = "digital_app_where_data_go_password";
		public static final String WHERE_DATA_GO_USERNAME = "digital_app_where_data_go_username";
		public static final String WHERE_DATA_GO_COUNTER = "where_data_go_counter";
		
		public static final String PAYMENT_RULE_AMOUNT_IS_LESS_THAN_MIN_AMOUNT_AR = "payment_rule_amount_is_less_than_min_amount_ar";
		public static final String PAYMENT_RULE_AMOUNT_IS_LESS_THAN_MIN_AMOUNT_EN = "payment_rule_amount_is_less_than_min_amount_en";
		
		
		
		public static final String PAYMENT_RULE_AMOUNT_IS_GREATER_THAN_MAX_AMOUNT_AR = "payment_rule_amount_is_greater_than_max_amount_ar";
		public static final String PAYMENT_RULE_AMOUNT_IS_GREATER_THAN_MAX_AMOUNT_EN = "payment_rule_amount_is_greater_than_max_amount_en";
		
		
		// Wi-fi Home Zone
		public static final String HOME_ZONE_PACKAGE_ID = "home_zone_package_id";
		public static final String CONFIRMATION_TITLE = "home_zone_confirmation_title";
		public static final String CONFIRMATION_TITLE_AR = "home_zone_confirmation_title_ar";
		public static final String CONFIRMATION_DESCRIPTION = "home_zone_confirmation_description";
		public static final String CONFIRMATION_DESCRIPTION_AR = "home_zone_confirmation_description_ar";
		public static final String SUCCESS_MESSAGE = "home_zone_success_message";
		public static final String SUCCESS_MESSAGE_AR = "home_zone_success_message_ar";
		public static final String SUCCESS_HEADER = "home_zone_success_header";
		public static final String SUCCESS_HEADER_AR = "home_zone_success_header_ar";
		public static final String ERROR_TITLE = "home_zone_error_title";
		public static final String ERROR_TITLE_AR = "home_zone_error_title_ar";
		public static final String ERROR_DESCRIPTION = "home_zone_error_description";
		public static final String ERROR_DESCRIPTION_AR = "home_zone_error_description_ar";
		
		public static final String HOME_ZONE_ELIGIBILITY_ERROR_DESCRIPTION = "home_zone_eligibility_error_description";
		public static final String HOME_ZONE_ELIGIBILITY_ERROR_DESCRIPTION_AR = "home_zone_eligibility_error_description_ar";
		public static final String HOME_ZONE_PENDING_REQUEST_ERROR_DESCRIPTION = "home_zone_pending_request_error_description";
		public static final String HOME_ZONE_PENDING_REQUEST_ERROR_DESCRIPTION_AR = "home_zone_pending_request_error_description_ar";
		public static final String HOME_ZONE_MAXIMUM_REQUEST_ERROR_DESCRIPTION = "home_zone_maximum_request_error_description";
		public static final String HOME_ZONE_MAXIMUM_REQUEST_ERROR_DESCRIPTION_AR = "home_zone_maximum_request_error_description_ar";

		
		/****************** PAYMENT RULES ****************************/
		public static final String DIGITAL_APP_WS_AMOUNT_IS_LESS_THAN_MIN_AMOUNT = "0001138";
		public static final String DIGITAL_APP_WS_AMOUNT_IS_GREATER_THAN_MAX_AMOUNT = "0001139";
		public static final String DIGITAL_APP_WS_AMOUNT_IS_GREATER_THAN_MONTH_CAP = "0001143";
		public static final String DIGITAL_APP_WS_AMOUNT_IS_GREATER_DUE_AMOUNT = "0001144";
		public static final String DIGITAL_APP_WS_AMOUNT_IS_GREATER_THAN_MONTHLY_DUE_AMOUNT = "0001142";
		public static final String DIGITAL_APP_WS_MONTHLY_LIMIT_EXCCED = "0001140";
		
		
		
		public static final String PAYMENT_RULE_AMOUNT_IS_GREATER_THAN_MONTH_CAP_AR = "payment_rule_amount_is_greater_than_month_cap_ar";
		public static final String PAYMENT_RULE_AMOUNT_IS_GREATER_THAN_MONTH_CAP_EN = "payment_rule_amount_is_greater_than_month_cap_en";
		
		public static final String PAYMENT_RULE_AMOUNT_IS_GREATER_THAN_MONTHLY_DUE_AMOUNT_AR = "payment_rule_amount_is_greater_than_monthly_due_amount_ar";
		public static final String PAYMENT_RULE_AMOUNT_IS_GREATER_THAN_MONTHLY_DUE_AMOUNT_EN = "payment_rule_amount_is_greater_than_monthly_due_amount_en";
		public static final String PAYMENT_RULE_AMOUNT_IS_GREATER_DUE_AMOUNT_EN = "payment_rule_amount_is_greater_due_amount_en";
		public static final String PAYMENT_RULE_AMOUNT_IS_GREATER_DUE_AMOUNT_AR = "payment_rule_amount_is_greater_due_amount_ar";

		/****************** PAYMENT RULES ****************************/

		public static final String TIME_AT_AR= "time_at_ar";
		public static final String TIME_AT_EN= "time_at_en";
		public static final String DIGITAL_APP_FROM = "digital_app_from";
		public static final String DIGITAL_APP_TO = "digital_app_to";

		public static final String SUBSCRIBE_ADDON_SERVICE_FOR_UNLIMITED_CALLS_CBCM_ADDITIONAL_INFO_REQUEST = "subscribe_addon_service_for_unlimited_calls_cbcm_additional_info_request";
		public static final String SUBSCRIPTION_ADDON_ALREADY_SUBSCRIBED_AR_KEY = "subscription_addon_already_subscribed_ar"; // language
		public static final String SUBSCRIPTION_ADDON_ALREADY_SUBSCRIBED_EN_KEY = "subscription_addon_already_subscribed_en"; // language
		public static final String SUBSCRIBE_COUNTRY_IDD_MUTUAL_ERROR_CODE = "subscribe_country_idd_mutual_error_code";
		public static final String SUBSCRIBE_ADDON_SERVICE_MUTUAL_ERROR_CODE_AR = "subscribe_addon_service_mutual_error_code_ar";
		public static final String SUBSCRIBE_ADDON_SERVICE_MUTUAL_ERROR_CODE_EN = "subscribe_addon_service_mutual_error_code_en";
		public static final String UN_SUBSCRIBE_ADDON_SERVICE_FOR_UNLIMITED_CALLS_CBCM_ADDITIONAL_INFO_REQUEST = "un_subscribe_addon_service_for_unlimited_calls_cbcm_additional_info_request";
		public static final String UNLIMITED_COUNTRY_CALL_COUNTRY_CODE_KEY = "unlimited_country_call_country_code_key";

		public static final String BILL_SUMMARY_GRAND_TOTAL_TITLE = "bill_summary_grand_total_title";
		public static final String BILL_SUMMARY_GRAND_TOTAL_TITLE_AR = "bill_summary_grand_total_title_ar";
		
		public static final String BILL_SUMMARY_GRAND_TOTAL_SUBTITLE = "bill_summary_grand_total_subtitle";
		public static final String BILL_SUMMARY_GRAND_TOTAL_SUBTITLE_AR = "bill_summary_grand_total_subtitle_ar";
		
		public static final String BILL_SUMMARY_GRAND_TOTAL_VAT_TEXT = "bill_summary_grand_total_vat_text";
		public static final String BILL_SUMMARY_GRAND_TOTAL_VAT_TEXT_AR = "bill_summary_grand_total_vat_text_ar";

		
		/**************** MINI STATEMENT *******************************/
		public static final String CUSTOMER_BILLING_EVENTS_MGMT_ENDPOINT_URL = "customer_billing_events_Mgmt_endpoint_url";
		/**************** MINI STATEMENT *******************************/

		
		public static final String DIGITAL_APP_WS_INVALID_AMOUNT = "0001146";
		
		public static final String INVALID_AMOUNT_AR = "invalid_amount_ar";
		public static final String INVALID_AMOUNT_EN = "invalid_amount_en";
		
		public static final String ACCOUNT_DOCUMENT_TC = "ACCOUNT_DOCUMENT_TC";
		public static final String ACCOUNT_DOCUMENT_TC_AR = "ACCOUNT_DOCUMENT_TC_AR";
		
		
		public static final String DIGITAL_APP_WS_INVALID_POINTS = "0001147";
		public static final String INVALID_POINTS_AR = "invalid_points_ar";
		public static final String INVALID_POINTS_EN = "invalid_points_en";

		public static final String ROAMING_ADDON_URL = "roaming_addon_url";
		
		public static final String KAFKA_BAR_SEPARATION = "kafka_bar_separation";
		public static final String BOOTSTRAP_SERVERS = "bootstrap_servers";
		
		public static final String DATE_FORMATTER = "date_formatter";
		


		
		// Invite a friend
		public static final String PUSH_NOTIFICATION_REQUEST_BODY_INVITE_A_FRIEND = "push_notification_request_body_invite_a_friend";
		public static final String PUSH_NOTIFICATION_SERVICE_URL = "push_notification_service_url";

		public static final String INVITE_A_FRIEND_REWARD = "invite_a_friend_reward";
		public static final String INVITE_A_FRIEND_INVITE_COUNT_FOR_REWARD = "invite_a_friend_invite_count_for_reward";
		public static final String INVITE_A_FRIEND_NO_OFFER_TITLE = "invite_a_friend_no_offer_title";
		public static final String INVITE_A_FRIEND_NO_OFFER_TITLE_AR = "invite_a_friend_no_offer_title_ar";
		public static final String INVITE_A_FRIEND_NO_OFFER_SUB_OFFER_TITLE = "invite_a_friend_no_offer_sub_title";
		public static final String INVITE_A_FRIEND_NO_OFFER_SUB_OFFER_TITLE_AR = "invite_a_friend_no_offer_sub_title_ar";
		public static final String INVITE_A_FRIEND_NO_OFFER_REFERRAL_TEXT = "invite_a_friend_no_offer_referral_text";
		public static final String INVITE_A_FRIEND_NO_OFFER_REFERRAL_TEXT_AR = "invite_a_friend_no_offer_referral_text_ar";
		
		public static final String INVITE_A_FRIEND_HASH_SALT = "D!G!T@L@PP";
		
		public static final String INVITE_A_FRIEND_TITLE = "invite_a_friend_title";
		public static final String INVITE_A_FRIEND_TITLE_AR = "invite_a_friend_title_ar";
		public static final String INVITE_A_FRIEND_SUB_OFFER_TITLE = "invite_a_friend_sub_offer_title";
		public static final String INVITE_A_FRIEND_SUB_OFFER_TITLE_AR = "invite_a_friend_sub_offer_title_ar";
		public static final String INVITE_A_FRIEND_REFERRAL_TEXT = "invite_a_friend_referral_text";
		public static final String INVITE_A_FRIEND_REFERRAL_TEXT_AR = "invite_a_friend_referral_text_ar";
		public static final String INVITE_A_FRIEND_REWARD_DESCRIPTION = "invite_a_friend_reward_description";
		public static final String INVITE_A_FRIEND_REWARD_DESCRIPTION_AR = "invite_a_friend_reward_description_ar";
		public static final String INVITE_A_FRIEND_REWARD_DESCRIPTION_OFFER = "invite_a_friend_reward_description_offer";
		public static final String INVITE_A_FRIEND_REWARD_DESCRIPTION_OFFER_AR = "invite_a_friend_reward_description_offer_ar";
		public static final String INVITE_A_FRIEND_IMAGE_URL = "invite_a_friend_image_url";
		public static final String INVITE_A_FRIEND_ICON_URL = "invite_a_friend_icon_url";
		public static final String INVITE_A_FRIEND_TERM_AND_CONDITIONS = "invite_a_friend_term_and_conditions";
		public static final String INVITE_A_FRIEND_TERM_AND_CONDITIONS_AR = "invite_a_friend_term_and_conditions_ar";
		
		public static final String INVITE_A_FRIEND_REWARD_LIMIT = "invite_a_friend_reward_limit";
		public static final String INVITE_A_FRIEND_NOTIFICATION_EXPIRY_DATE = "invite_a_friend_notification_expiry_date";
		
		public static final String INVITE_A_FRIEND_REWARD_NOTIFICATION_TITLE = "invite_a_friend_reward_notification_title";
		public static final String INVITE_A_FRIEND_REWARD_NOTIFICATION_TITLE_AR = "invite_a_friend_reward_notification_title_ar";
		public static final String INVITE_A_FRIEND_REWARD_NOTIFICATION_SHORT_DESC = "invite_a_friend_reward_notification_short_desc";
		public static final String INVITE_A_FRIEND_REWARD_NOTIFICATION_SHORT_DESC_AR = "invite_a_friend_reward_notification_short_desc_ar";
		public static final String INVITE_A_FRIEND_REWARD_NOTIFICATION_FULL_DESC = "invite_a_friend_reward_notification_full_desc";
		public static final String INVITE_A_FRIEND_REWARD_NOTIFICATION_FULL_DESC_AR = "invite_a_friend_reward_notification_full_desc_ar";
		public static final String INVITE_A_FRIEND_REWARD_NOTIFICATION_LINK_ACTION = "invite_a_friend_reward_notification_link_action";
		public static final String INVITE_A_FRIEND_REWARD_NOTIFICATION_LINK_TEXT = "invite_a_friend_reward_notification_link_text";
		public static final String INVITE_A_FRIEND_REWARD_NOTIFICATION_LINK_TEXT_AR = "invite_a_friend_reward_notification_link_text_ar";
		public static final String INVITE_A_FRIEND_REWARD_NOTIFICATION_LINK_URL = "invite_a_friend_reward_notification_link_url";
		public static final String INVITE_A_FRIEND_REWARD_NOTIFICATION_IMAGE_URL = "invite_a_friend_reward_notification_image_url";
		public static final String INVITE_A_FRIEND_REWARD_NOTIFICATION_ACTION_ID = "invite_a_friend_reward_notification_action_id";
		public static final String INVITE_A_FRIEND_REWARD_NOTIFICATION_CATEGORY = "invite_a_friend_reward_notification_category";
		
		public static final String INVITE_A_FRIEND_CONFIRMATION_NOTIFICATION_TITLE = "invite_a_friend_confirmation_notification_title";
		public static final String INVITE_A_FRIEND_CONFIRMATION_NOTIFICATION_TITLE_AR = "invite_a_friend_confirmation_notification_title_ar";
		public static final String INVITE_A_FRIEND_CONFIRMATION_NOTIFICATION_SHORT_DESC = "invite_a_friend_confirmation_notification_short_desc";
		public static final String INVITE_A_FRIEND_CONFIRMATION_NOTIFICATION_SHORT_DESC_AR = "invite_a_friend_confirmation_notification_short_desc_ar";
		public static final String INVITE_A_FRIEND_CONFIRMATION_NOTIFICATION_FULL_DESC = "invite_a_friend_confirmation_notification_full_desc";
		public static final String INVITE_A_FRIEND_CONFIRMATION_NOTIFICATION_FULL_DESC_AR = "invite_a_friend_confirmation_notification_full_desc_ar";
		public static final String INVITE_A_FRIEND_CONFIRMATION_NOTIFICATION_LINK_ACTION = "invite_a_friend_confirmation_notification_link_action";
		public static final String INVITE_A_FRIEND_CONFIRMATION_NOTIFICATION_LINK_TEXT = "invite_a_friend_confirmation_notification_link_text";
		public static final String INVITE_A_FRIEND_CONFIRMATION_NOTIFICATION_LINK_TEXT_AR = "invite_a_friend_confirmation_notification_link_text_ar";
		public static final String INVITE_A_FRIEND_CONFIRMATION_NOTIFICATION_LINK_URL = "invite_a_friend_confirmation_notification_link_url";
		public static final String INVITE_A_FRIEND_CONFIRMATION_NOTIFICATION_IMAGE_URL = "invite_a_friend_confirmation_notification_image_url";
		public static final String INVITE_A_FRIEND_CONFIRMATION_NOTIFICATION_ACTION_ID = "invite_a_friend_confirmation_notification_action_id";
		public static final String INVITE_A_FRIEND_CONFIRMATION_NOTIFICATION_CATEGORY = "invite_a_friend_confirmation_notification_category";
		
		public static final String INVITE_A_FRIEND_F2_CONFIRMATION_NOTIFICATION_TITLE = "invite_a_friend_f2_confirmation_notification_title";
		public static final String INVITE_A_FRIEND_F2_CONFIRMATION_NOTIFICATION_TITLE_AR = "invite_a_friend_f2_confirmation_notification_title_ar";
		public static final String INVITE_A_FRIEND_F2_CONFIRMATION_NOTIFICATION_SHORT_DESC = "invite_a_friend_f2_confirmation_notification_short_desc";
		public static final String INVITE_A_FRIEND_F2_CONFIRMATION_NOTIFICATION_SHORT_DESC_AR = "invite_a_friend_f2_confirmation_notification_short_desc_ar";
		public static final String INVITE_A_FRIEND_F2_CONFIRMATION_NOTIFICATION_FULL_DESC = "invite_a_friend_f2_confirmation_notification_full_desc";
		public static final String INVITE_A_FRIEND_F2_CONFIRMATION_NOTIFICATION_FULL_DESC_AR = "invite_a_friend_f2_confirmation_notification_full_desc_ar";
		public static final String INVITE_A_FRIEND_F2_CONFIRMATION_NOTIFICATION_LINK_ACTION = "invite_a_friend_f2_confirmation_notification_link_action";
		public static final String INVITE_A_FRIEND_F2_CONFIRMATION_NOTIFICATION_LINK_TEXT = "invite_a_friend_f2_confirmation_notification_link_text";
		public static final String INVITE_A_FRIEND_F2_CONFIRMATION_NOTIFICATION_LINK_TEXT_AR = "invite_a_friend_f2_confirmation_notification_link_text_ar";
		public static final String INVITE_A_FRIEND_F2_CONFIRMATION_NOTIFICATION_LINK_URL = "invite_a_friend_f2_confirmation_notification_link_url";
		public static final String INVITE_A_FRIEND_F2_CONFIRMATION_NOTIFICATION_IMAGE_URL = "invite_a_friend_f2_confirmation_notification_image_url";
		public static final String INVITE_A_FRIEND_F2_CONFIRMATION_NOTIFICATION_ACTION_ID = "invite_a_friend_f2_confirmation_notification_action_id";
		public static final String INVITE_A_FRIEND_F2_CONFIRMATION_NOTIFICATION_CATEGORY = "invite_a_friend_f2_confirmation_notification_category";

		
//		public static final String INVITE_A_FRIEND_NORMAL_NOTIFICATION_TITLE = "invite_a_friend_normal_notification_title";
//		public static final String INVITE_A_FRIEND_NORMAL_NOTIFICATION_TITLE_AR = "invite_a_friend_normal_notification_title_ar";
//		public static final String INVITE_A_FRIEND_NORMAL_NOTIFICATION_SHORT_DESC = "invite_a_friend_normal_notification_short_desc";
//		public static final String INVITE_A_FRIEND_NORMAL_NOTIFICATION_SHORT_DESC_AR = "invite_a_friend_normal_notification_short_desc_ar";
//		public static final String INVITE_A_FRIEND_NORMAL_NOTIFICATION_FULL_DESC = "invite_a_friend_normal_notification_full_desc";
//		public static final String INVITE_A_FRIEND_NORMAL_NOTIFICATION_FULL_DESC_AR = "invite_a_friend_normal_notification_full_desc_ar";
//		public static final String INVITE_A_FRIEND_NORMAL_NOTIFICATION_LINK_ACTION = "invite_a_friend_normal_notification_link_action";
//		public static final String INVITE_A_FRIEND_NORMAL_NOTIFICATION_LINK_TEXT = "invite_a_friend_normal_notification_link_text";
//		public static final String INVITE_A_FRIEND_NORMAL_NOTIFICATION_LINK_TEXT_AR = "invite_a_friend_normal_notification_link_text_ar";
//		public static final String INVITE_A_FRIEND_NORMAL_NOTIFICATION_LINK_URL = "invite_a_friend_normal_notification_link_url";
//		public static final String INVITE_A_FRIEND_NORMAL_NOTIFICATION_IMAGE_URL = "invite_a_friend_normal_notification_image_url";
		
		public static final String LOGIN_NOTIFICATION_TITLE = "login_notification_title";
		public static final String LOGIN_NOTIFICATION_TITLE_AR = "login_notification_title_ar";
		public static final String LOGIN_NOTIFICATION_SHORT_DESC = "login_notification_short_desc";
		public static final String LOGIN_NOTIFICATION_SHORT_DESC_AR = "login_notification_short_desc_ar";
		public static final String LOGIN_NOTIFICATION_FULL_DESC = "login_notification_full_desc";
		public static final String LOGIN_NOTIFICATION_FULL_DESC_AR = "login_notification_full_desc_ar";
		public static final String LOGIN_NOTIFICATION_LINK_ACTION = "login_notification_link_action";
		public static final String LOGIN_NOTIFICATION_LINK_TEXT = "login_notification_link_text";
		public static final String LOGIN_NOTIFICATION_LINK_TEXT_AR = "login_notification_link_text_ar";
		public static final String LOGIN_NOTIFICATION_LINK_URL = "login_notification_link_url";
		public static final String LOGIN_NOTIFICATION_IMAGE_URL = "login_notification_image_url";
		public static final String LOGIN_NOTIFICATION_ACTION_ID = "login_notification_action_id";
		public static final String LOGIN_NOTIFICATION_CATEGORY = "login_notification_category";
		
		public static final String INVITE_A_FRIEND_RESPONSE_REWARD_TITLE = "invite_a_friend_response_reward_title";
		public static final String INVITE_A_FRIEND_RESPONSE_REWARD_TITLE_AR = "invite_a_friend_response_reward_title_ar";
		public static final String INVITE_A_FRIEND_RESPONSE_REWARD_DESCRIPTION = "invite_a_friend_response_reward_description";
		public static final String INVITE_A_FRIEND_RESPONSE_REWARD_DESCRIPTION_AR = "invite_a_friend_response_reward_description_ar";
		public static final String INVITE_A_FRIEND_RESPONSE_REWARD_IMAGE_URL = "invite_a_friend_response_reward_image_url";
		
		public static final String INVITE_A_FRIEND_RESPONSE_SUBSCRIPTION_TITLE = "invite_a_friend_response_subscription_title";
		public static final String INVITE_A_FRIEND_RESPONSE_SUBSCRIPTION_TITLE_AR = "invite_a_friend_response_subscription_title_ar";
		public static final String INVITE_A_FRIEND_RESPONSE_SUBSCRIPTION_DESCRIPTION = "invite_a_friend_response_subscription_description";
		public static final String INVITE_A_FRIEND_RESPONSE_SUBSCRIPTION_DESCRIPTION_AR = "invite_a_friend_response_subscription_description_ar";
		public static final String INVITE_A_FRIEND_RESPONSE_SUBSCRIPTION_NOTE = "invite_a_friend_response_subscription_note";
		public static final String INVITE_A_FRIEND_RESPONSE_SUBSCRIPTION_NOTE_AR = "invite_a_friend_response_subscription_note_ar";
		
		public static final String INVITE_A_FRIEND_F2_RESPONSE_REWARD_TITLE = "invite_a_friend_f2_response_reward_title";
		public static final String INVITE_A_FRIEND_F2_RESPONSE_REWARD_TITLE_AR = "invite_a_friend_f2_response_reward_title_ar";
		public static final String INVITE_A_FRIEND_F2_RESPONSE_REWARD_DESCRIPTION = "invite_a_friend_f2_response_reward_description";
		public static final String INVITE_A_FRIEND_F2_RESPONSE_REWARD_DESCRIPTION_AR = "invite_a_friend_f2_response_reward_description_ar";
		public static final String INVITE_A_FRIEND_F2_RESPONSE_REWARD_IMAGE_URL = "invite_a_friend_f2_response_reward_image_url";
		
		public static final String INVITE_A_FRIEND_ACCEPTED_STATUS = "invite_a_friend_accepted_status";
		public static final String INVITE_A_FRIEND_ACCEPTED_STATUS_AR = "invite_a_friend_accepted_status_ar";

		
		public static final String DIGITAL_APP_WS_ESIM_ELIGIBILITY_FAILURE = "0011145";
		public static final String DIGITAL_APP_WS_WHERE_MY_DATA_GO_DISABLE = "0011146";
		
		public static final String ESIM_ELIGIBILTY_FAILED_AR = "esim_eligibilty_failed_ar";
		public static final String ESIM_ELIGIBILTY_FAILED_EN = "esim_eligibilty_failed_en";
		
		public static final String WHERE_MY_DATA_GO_DISABLE = "where_my_data_go_disable";
		
		public static final String EMAIL_FORMAT_VALIDATION = "0001166";
		public static final String INVALID_ADDRESS_ID = "0001167";
		
		public static final String EMAIL_NOT_FOUND = "0001168";
		
		public static final String INVALID_ADDRESS_ID_AR = "invalid_address_id_ar";
		public static final String INVALID_ADDRESS_ID_EN = "invalid_address_id_en";
		
		public static final String EMAIL_FORMAT_VALIDATION_AR = "email_format_validation_ar";
		public static final String EMAIL_FORMAT_VALIDATION_EN = "email_format_validation_en";
		
		public static final String EMAIL_NOT_FOUND_AR = "email_not_found_ar";
		
		public static final String EMAIL_NOT_FOUND_EN = "email_not_found_en";
		
		public static final String EMAIL_FORMAT_VALIDATOR = "email_format_validator";

		public static final String MONTHSDURATION24 = "24 Months";
		public static final String MONTHSDURATION12 = "12 Months";
		public static final String SOURCE_CHANNEL = "MOBAPP";
		public static final String ELIFE_SERVICE_CAMPAIGN_NAME_KEY = "elife_service_campaign_name"; // 101NVRetention_UAT
		public static final String REST_ELIFE_SERVICE_NEW_ALTITUDE_CONTACT_URL_CONFIG_KEY = "rest_elife_service_new_altitude_contact_url";
		
		public static final String START_STOP_SUB_TITLE_SUCCESS_AR = "start_stop_sub_title_success_ar";
		public static final String START_STOP_SUB_TITLE_SUCCESS_EN = "start_stop_sub_title_success_en";
		

		
		//TOOLBAR
		public static final String TOOLBAR_ENCRYPTION_KEY = "toolbar_encryption_key";
		public static final String RETRIEVE_ACCOUNT_URL = "retrieve_account_url";
		public static final String TOOLBAR_SEGMENTS = "toolbar_segments";
		public static final String TOOLBAR_SUBTYPES = "toolbar_subtypes";
		public static final String TOOLBAR_PRIMARY_SUBSCRIPTIONS = "toolbar_primary_subscriptions";
		public static final String TOOLBAR_VISIBLE_CONFIGURABLE = "toolbar_visible_configurable";
		public static final Integer TOOLBAR_VISIBLE = 1;
		public static final String TOOLBAR_WS_RUNTIME_EXCEPTION_RESPONSE_CODE = "0002001";
		public static final String CHANNEL_TOOLBAR = "ToolBar";
		public static final String TOOLBAR_STATUS_CHECK_URL = "toolbar_status_check_url";
		public static final String AVAILABLE_BALANCE_NOTIFICATION_RANGE = "available_balance_notification_range";
		public static final String AVAILABLE_BALANCE_NOTIFICATION_PREPAID = "available_balance_notification_prepaid";
		public static final String AVAILABLE_BALANCE_NOTIFICATION_POSTPAID_RANGE = "available_balance_notification_postpaid_range";
		public static final String AVAILABLE_BALANCE_NOTIFICATION_POSTPAID_MINIMUM_RANGE = "available_balance_notification_postpaid_minimum_range";
		public static final String AVAILABLE_BALANCE_NOTIFICATION_TEXT_TODAY_POSTPAID = "available_balance_notification_text_today_postpaid";
		public static final String AVAILABLE_BALANCE_NOTIFICATION_POSTPAID_TEXT_RANGE = "available_balance_notification_text_postpaid";
		public static final String TOOLBAR_USAGE_NOTIFICATION_TEXT = "toolbar_usage_notification_text";

		public static final String RESPONSE_SUCCESS_STATUS_419 = "419";
		public static final String RESPONSE_SUCCESS_STATUS_1 = "1";
		
		public static final String DIGITAL_APP_WS_ACCOUNT_INFORMATION_IN_ACTIVE_RESPONSE_EN = "digital_app_ws_account_information_in_active_response_en";
		public static final String DIGITAL_APP_WS_ACCOUNT_INFORMATION_IN_ACTIVE_RESPONSE_AR = "digital_app_ws_account_information_in_active_response_ar";
		public static final String DEVICE_RESERVER_ORDER_CSS_061 = "device_reserver_order_css_061";
		public static final String DEVICE_RESERVER_ORDER_MESSAGE_AR_CSS_061 = "device_reserver_order_message_ar_css_061";
		public static final String DEVICE_RESERVER_ORDER_MESSAGE_CSS_061 = "device_reserver_order_message_css_061";
		
		


		public static final String ONE_TIME_PACKAGE = "1";
		public static final String AUTO_RENEW_PACKAGE = "2";
		public static final String DIGITAL_APP_DEAL_CATEGORY_NAME_VOICE_AR = "digital_app_deal_category_name_voice_ar";
		public static final String DIGITAL_APP_DEAL_CATEGORY_NAME_VOICE_EN = "digital_app_deal_category_name_voice_en";
		public static final String DIGITAL_APP_DEAL_CATEGORY_NAME_MESSAGE_AR = "digital_app_deal_category_name_message_ar";
		public static final String DIGITAL_APP_DEAL_CATEGORY_NAME_MESSAGE_EN = "digital_app_deal_category_name_message_en";
		public static final String DIGITAL_APP_DEAL_CATEGORY_NAME_DATA_AR = "digital_app_deal_category_name_data_ar";
		public static final String DIGITAL_APP_DEAL_CATEGORY_NAME_DATA_EN = "digital_app_deal_category_name_data_en";
		public static final String DIGITAL_APP_DEAL_CATEGORY_NAME_1_GB_AR = "digital_app_deal_category_name_1_gb_ar";
		public static final String DIGITAL_APP_DEAL_CATEGORY_NAME_1_GB_EN = "digital_app_deal_category_name_1_gb_en";
		public static final String DIGITAL_APP_RATE_PLAN_CODES_FOR_OMEGA = "digital_app_rate_plan_codes_for_omega";
		public static final String ERROR_ELIGIBILITY_CODE = "E321";
		public static final String ERROR_ELIGIBILITY_CODE_RESPONSE_CODE = "0011147";
		public static final String ERROR_ELIGIBILITY_MESSAGE_E321_AR = "error_eligibility_message_e321_ar";
		public static final String ERROR_ELIGIBILITY_MESSAGE_E321_EN = "error_eligibility_message_e321_en";
		public static final String ERROR_ELIGIBILITY_MESSAGE_AR = "error_eligibility_message_ar";
		public static final String ERROR_ELIGIBILITY_MESSAGE_EN = "error_eligibility_message_en";
		public static final String ERROR_ELIGIBILITY_SUB_TITLE_MESSAGE_AR = "error_eligibility_sub_title_message_ar";
		public static final String ERROR_ELIGIBILITY_SUB_TITLE_MESSAGE_EN = "error_eligibility_sub_title_message_en";
		
		
		
		public static final String CB_ATG_PACKAGE_USAGE_SUMMARY_URL = "cb_atg_package_usage_summary_url";
		public static final String CB_ATG_CALL_USAGE_URL = "cb_atg_call_usage_url";
		public static final String CB_ATG_DATA_USAGE_URL = "cb_atg_data_usage_url";
		public static final String CB_ATG_SMS_USAGE_URL = "cb_atg_sms_usage_url";
		public static final String CB_ATG_MANAGE_EXTRAS_URL = "cb_atg_manage_extras_url";
		public static final String CB_ATG_ALL_ACCOUNTS_URL = "cb_atg_all_accounts_url";
		public static final String CB_ATG_DELETE_ADDON_URL = "cb_atg_delete_addon_url";
		
		public static final String CB_ATG_INDIVIDUAL_LOGIN_URL = "cb_atg_individual_login_url";
		public static final String CB_ATG_APPLICATION_USER_NAME = "cb_atg_application_user_name";
		public static final String CB_ATG_APPLICATION_PASSWORD = "cb_atg_application_password";
		public static final String CB_CHANNEL_NAME = "cb_channel_name";
		public static final String DIGITAL_APP_PARTY_SEGMENT = "digital_app_party_segment";
		public static final String DIGITAL_APP_PARTY_SEGMENT_ERROR_CODE = "0001171";
		public static final String DIGITAL_APP_PARTY_SEGMENT_MESSAGE_AR = "digital_app_party_segment_message_ar";
		public static final String DIGITAL_APP_PARTY_SEGMENT_MESSAGE_EN = "digital_app_party_segment_message_en";
		public static final String SMB_APP_URL_IOS = "smb_app_url_ios";
		public static final String SMB_APP_URL_ANDRIOD = "smb_app_url_andriod";
		public static final String DEVICE_TYPE_ANDRIOD = "ANDROID";
		public static final String DEVICE_TYPE_IOS = "iPhone";
		public static final String DIGITAL_APP_NO_CALL_LOGS_FOUND = "digital_app_no_call_logs_found";
		public static final String DIGITAL_APP_NO_CALL_LOGS_FOUND_AR = "digital_app_no_call_logs_found_ar";		
		public static final String DIGITAL_APP_ACCOUNT_CATEOGRY_MOBILE = "digital_app_account_cateogry_mobile";
		public static final String DIGITAL_APP_ACCOUNT_CATEOGRY_LANDLINE = "digital_app_account_cateogry_landline";
		public static final String DIGITAL_APP_NON_ETISALAT_NO_CODE = "0001172";
		public static final String DIGITAL_APP_NON_ETISALAT_NO_MSG = "digital_app_non_etisalat_no";
		public static final String DIGITAL_APP_CREATE_PARTY_CODE = "0001173";
		public static final String DIGITAL_APP_CREATE_PARTY_MSG = "digital_app_create_party_msg";
		
		public static final String UAE_PASS_INITIALIZATION_URL = "uae_pass_initialization_url";
		public static final String UAE_PASS_AUTHORIZE_URL = "uae_pass_authorize_url";
		public static final String UAE_PASS_CURRENT_USER_URL = "uae_pass_current_user_url";
		public static final String UAE_PASS_CLIENT_ID = "uae_pass_client_id";
		public static final String UAE_PASS_RETURN_ANDROID_URL = "uae_pass_return_android_url";
		public static final String UAE_PASS_RETURN_IOS_URL = "uae_pass_return_ios_url";
		public static final String UAE_PASS_RETURN_URL = "uae_pass_return_url";
		public static final String UAE_PASS_CHANNEL_ID = "uae_pass_channel_id";
		public static final String UAE_PASS_USER_NAME = "uae_pass_user_name";
		
		public static final String AVAILABLE_BALANCE_NOTIFICATION_POSTPAID_TEXT_RANGE_AR = "available_balance_notification_text_postpaid_ar";
		public static final String AVAILABLE_BALANCE_NOTIFICATION_TEXT_TODAY_POSTPAID_AR = "available_balance_notification_text_today_postpaid_ar";
		public static final String AVAILABLE_BALANCE_NOTIFICATION_DUE_BILL = "available_balance_notification_due_bill";
		public static final String AVAILABLE_BALANCE_NOTIFICATION_DUE_BILL_AR = "available_balance_notification_due_bill_ar";
		public static final String TOOLBAR_USAGE_NOTIFICATION_TEXT_AR = "toolbar_usage_notification_text_ar";

		

			

		
		public static final String ATG_DEVICES_ADDON_PRODUCT_CODE_URL = "atg_devices_addon_product_code_url";
		public static final String ATG_DEVICES_PRODUCT_URL = "atg_devices_product_url";
		public static final String ATG_DEVICES_SKU_URL = "atg_devices_sku_url";
		public static final String ATG_DEVICES_VAT_PERCENTAGE= "atg_devices_vat_percentage";
		
		
		// ###### Payment filters.
		public static final String PAYMENT_HISTORY_TO_DATE_CONFIG = "payment_history_to_date_config";
		public static final String PAYMENT_HISTORY_FROM_DATE_CONFIG = "payment_history_from_date_config";
		public static final String PAYMENT_HISTORY_PAYMENT_METHOD_CONFIG = "payment_history_payment_method_config";
		public static final String PAYMENT_HISTORY_PAYMENT_CHANNEL_CONFIG = "payment_history_payment_channel_config";
		public static final String PAYMENT_HISTORY_PAYMENT_DEFAULT_ICON = "payment_history_payment_default_icon";

		public static final String DIGITAL_APP_DEVICE_UP_FRONT_TITLE = "digital_app_device_up_front_title";
		public static final String DIGITAL_APP_DEVICE_PAYMENT = "digital_app_device_payment";
		public static final String DIGITAL_APP_DEVICE_PAYMENT_DESCRIPTION = "digital_app_device_payment_description";
		public static final String DIGITAL_APP_DEVICE_REGISTRATION = "digital_app_device_registration";
		public static final String DIGITAL_APP_DEVICE_REG_DESCRIPTION = "digital_app_device_reg_description";
		public static final String DIGITAL_APP_DEVICE_CUSTOMER_NAME = "digital_app_device_customer_name";
		public static final String DIGITAL_APP_DEVICE_CR_DESCRIPTION = "digital_app_device_cr_description";
		public static final String DIGITAL_APP_DEVICE_UP_FRONT_DESCRIPTION = "digital_app_device_up_front_description";
		
		public static final String EPG_PAY_FOR_DEVICE_STANDALONE_NS_V2_RETURN_PATH = "epg_pay_for_device_standalone_ns_v2_return_path";
		public static final String EPG_PAY_FOR_DEVICE_SMART_PAY_NS_V2_RETURN_PATH = "epg_pay_for_device_smart_pay_ns_v2_return_path";
		public static final String EPG_PAY_FOR_DEVICE_MIXED_NS_V2_RETURN_PATH = "epg_pay_for_device_mixed_ns_v2_return_path";
		
		public static final String CHANGE_COUNTRY_IN_PLAN_EN = "change_country_in_plan_en";
		public static final String CHANGE_COUNTRY_IN_PLAN_AR = "change_country_in_plan_ar";
		public static final String CHANGE_COUNTRY_LIMITE_EXCEED_CODE = "0001149";
		public static final String CHANGE_COUNTRY_LIMITE_EXCEED_EN = "change_country_limite_exceed_en";
		public static final String CHANGE_COUNTRY_LIMITE_EXCEED_AR = "change_country_limite_exceed_ar";
		
		//************ TIMEOUT ***********************//
		
				public static final String CUSTOMER_INQUIRY_TIMEOUT_IN_SECOND = "customer_inquiry_timeout_in_second";
				public static final String TIMEOUT_RESPONSETEK_GENERATETOKEN_IN_SECOND = "timeout_responsetek_generatetoken_in_second";
				public static final String TIMEOUT_RESPONSETEK_SUBMIT_SURVEY_IN_SECOND = "timeout_responsetek_submit_survey_in_second";
				public static final String TIMEOUT_LMS_CREATE_LEAD_IN_SECOND = "timeout_lms_create_lead_in_second";
				public static final String TIMEOUT_ATG_GET_PLANS_IN_SECOND = "timeout_atg_get_plans_in_second";
				public static final String TIMEOUT_ATG_GET_CATEGORIES_IN_SECOND = "timeout_atg_get_categories_in_second";
				public static final String TIMEOUT_OCR_PROCCESS_ID_KOFAX_IN_SECOND = "timeout_ocr_proccess_id_kofax_in_second";
				public static final String TIMEOUT_UAE_PASS_INITIALIZATION_IN_SECOND = "timeout_uae_pass_initialization_in_second";
				public static final String TIMEOUT_CB_ATG_INDIVIDUAL_LOGIN_IN_SECOND = "timeout_cb_atg_individual_login_in_second";
				public static final String TIMEOUT_CB_ATG_ALL_ACCOUNTS_IN_SECOND = "timeout_cb_atg_all_accounts_in_second";
				
				public static final String TIMEOUT_RTF_VALIDATE_PROCESS_IN_SECOND = "timeout_rtf_validate_process_in_second";
				public static final String TIMEOUT_ROAMING_ADDON_IN_SECOND = "timeout_roaming_addon_in_second";
				public static final String TIMEOUT_RETRIEVE_ACCOUNT_IN_SECOND = "timeout_retrieve_account_in_second";
				public static final String TIMEOUT_REST_SERVICE_TDB_IN_SECOND = "timeout_rest_service_tdb_in_second";
				public static final String TIMEOUT_CANCEL_SERVICE_NEW_ALTITUDE_CONTACT_IN_SECOND = "timeout_cancel_service_new_altitude_contact_in_second";
				public static final String TIMEOUT_REST_HOME_MOVING_PLAN_CHANGE_SERVICE_NEW_ALTITUDE_CONTACT_IN_SECOND = "timeout_rest_home_moving_plan_change_service_new_altitude_contact_in_second";
				public static final String TIMEOUT_CB_ATG_MANAGE_EXTRAS_IN_SECOND = "timeout_cb_atg_manage_extras_in_second";
				public static final String TIMEOUT_CB_ATG_DELETE_ADDON_IN_SECOND = "timeout_cb_atg_delete_addon_in_second";
				public static final String TIMEOUT_CB_ATG_SMS_USAGE_IN_SECOND = "timeout_cb_atg_sms_usage_in_second";
				public static final String TIMEOUT_CB_ATG_DATA_USAGE_IN_SECOND = "timeout_cb_atg_data_usage_in_second";
				public static final String TIMEOUT_CB_ATG_CALL_USAGE_IN_SECOND = "timeout_cb_atg_call_usage_in_second";
				public static final String TIMEOUT_CB_ATG_PACKAGE_USAGE_SUMMARY_IN_SECOND = "timeout_cb_atg_package_usage_summary_in_second";
				public static final String TIMEOUT_CRM_GW_MODIFY_SUBSCRIPTION_IN_SECOND = "TIMEOUT_CRM_GW_MODIFY_SUBSCRIPTION_IN_SECOND";
				
				//************ TIMEOUT SOAP SERVICES ***********************//
				public static final String TIMEOUT_BALANCE_TRANSFER_IN_SECOND = "timeout_balance_transfer_in_second";
				public static final String TIMEOUT_TIBCO_BILL_INQUIRY_SERVICE_SECOND = "timeout_tibco_bill_inquiry_service_second";
				public static final String TIMEOUT_CANVAS_PAY_FOR_ME_CALL_SERVICE_IN_SECOND = "timeout_canvas_pay_for_me_call_service_in_second";
				public static final String TIMEOUT_DEVICE_CATALOGUE_ATG_IN_SECOND = "timeout_device_catalogue_atg_in_second";
				public static final String TIMEOUT_RESOURCE_INVENTORY_MGMT_CUDIN_SECOND = "timeout_resource_inventory_mgmt_cudin_second";
				public static final String TIMEOUT_RESET_PROFILE_PASSWORD_IN_SECOND ="timeout_reset_profile_password_in_second";
				public static final String TIMEOUT_COMS_CREATE_BUNDLE_ORDER_IN_SECOND="timeout_coms_create_bundle_order_in_second";
				public static final String TIMEOUT_CBCM_EBILL_REGISTRATION_IN_SECOND="timeout_cbcm_ebill_registration_in_second";
				public static final String TIMEOUT_CRM_ACCOUNT_DETAILS_ADDRESS_IN_SECOND="timeout_crm_account_details_address_in_second";
				public static final String TIMEOUT_EXECUTE_EVENT_SERVICE_IVR_IN_SECOND="timeout_execute_event_service_ivr_in_second";
				public static final String TIMEOUT_GENERATE_SSO_TOKEN_IN_SECOND="timeout_generate_sso_token_in_second";
				public static final String TIMEOUT_CUSTOMER_BILLING_EVENTS_MGMT_IN_SECOND="timeout_customer_billing_events_mgmt_in_second";
				public static final String TIMEOUT_GENERIC_INQUIRY_IN_SECOND="timeout_generic_inquiry_in_second";
				public static final String TIMEOUT_CUSTOMER_BILLING_INFORMATION_SERVICE_IN_SECOND="timeout_customer_billing_information_service_in_second";
				public static final String TIMEOUT_TIBCO_RECHARGE_BY_SCRATCH_CARD_IN_SECOND="timeout_tibco_recharge_by_scratch_card_in_second";
				public static final String TIMEOUT_CUSTOMER_IMFORMATION_MANAGEMANT_SERVICE_IN_SECOND="timeout_customer_imformation_managemant_service_in_second";
				public static final String TIMEOUT_RE_REGISTRATION_ELIGIBILITY_IN_SECOND="timeout_re_registration_eligibility_in_second";
				public static final String TIMEOUT_CUSTOMER_INFORMATION_MGMT_IN_SECOND="timeout_customer_information_mgmt_in_second";
				public static final String TIMEOUT_USER_PROFILE_SERVICE_IVR_IN_SECOND="timeout_user_profile_service_ivr_in_second";
				public static final String TIMEOUT_USAGES_INQUIRY_SERVICE_IN_SECOND="timeout_usages_inquiry_service_in_second";
				public static final String TIMEOUT_TIBCO_GENRIC_PAYMENT_IN_SECOND="timeout_tibco_genric_payment_in_second";
				public static final String TIMEOUT_CBCM_UPDATE_INVOICE_DETAIL_IN_SECOND="timeout_cbcm_update_invoice_detail_in_second";
				public static final String TIMEOUT_UNIFIED_BILL_INQUIRY_IN_SECOND="timeout_unified_bill_inquiry_in_second";
				public static final String TIMEOUT_GENERIC_SMS_IN_SECOND="timeout_generic_sms_in_second";
				public static final String TIMEOUT_NBA_OFFERS_SERVICE_IN_SECOND="timeout_nba_offers_service_in_second";
				public static final String TIMEOUT_GET_WEB_TV_USERS_IN_SECOND="timeout_get_web_tv_users_in_second";
				public static final String TIMEOUT_IN_COMMUNICATION_MANAGEMENT_IN_SECOND="timeout_in_communication_management_in_second";
				public static final String TIMEOUT_CBCM_INS_TEL_DETAILS_IN_SECOND="timeout_cbcm_ins_tel_details_in_second";
				public static final String TIMEOUT_GLOTRANSFER_INTERNATIONAL_CREDIT_IN_SECOND="timeout_glotransfer_international_credit_in_second";
				public static final String TIMEOUT_LOYALTY_APP_IN_SECOND="timeout_loyalty_app_in_second";
				public static final String TIMEOUT_LOYALTY_SERVICE_IN_SECOND="timeout_loyalty_service_in_second";
				public static final String TIMEOUT_LOYALTY_SRVC_IN_SECOND="timeout_loyalty_srvc_in_second";
				public static final String TIMEOUT_EMCAIS_MCPS_IN_SECOND="timeout_emcais_mcps_in_second";
				public static final String TIMEOUT_PAYMENT_SERVICE_IN_SECOND="timeout_payment_service_in_second";
				public static final String TIMEOUT_CIMHUB_POSTPAID_MIGRATION_USAGE_INQUIRY_IN_SECOND="timeout_cimhub_postpaid_migration_usage_inquiry_in_second";
				public static final String TIMEOUT_ATG_RE_REGISTRATION_IN_SECOND="timeout_atg_re_registration_in_second";
				public static final String TIMEOUT_SEND_NOTIFICATION_IN_SECOND="timeout_send_notification_in_second";
				public static final String TIMEOUT_TOOLBAR_STATUS_CHECK_IN_SECOND="timeout_toolbar_status_check_in_second";
				public static final String TIMEOUT_SERVICE_ORDER_MGMT_CUD_IN_SECOND="timeout_service_order_mgmt_cud_in_second";
				public static final String TIMEOUT_SERVICE_ORDER_MGMT_IN_SECOND="timeout_service_order_mgmt_in_second";
				public static final String TIMEOUT_SSO_PORTAL_LOGIN_IN_SECOND="timeout_sso_portal_login_in_second";
				public static final String TIMEOUT_CBCM_AUTO_PAY_IN_SECOND="timeout_cbcm_auto_pay_in_second";
				public static final String TIMEOUT_CSS_BEAN_SERVICE_IN_SECOND="timeout_css_bean_service_in_second";
				public static final String TIMEOUT_CUSTOMER_ORDER_MGMT_IN_SECOND="timeout_customer_order_mgmt_in_second";
				public static final String TIMEOUT_ELIFE_RESET_PASSWORD_IN_SECOND="timeout_elife_reset_password_in_second";
				public static final String TIMEOUT_EMCAIS_COMS_SELF_CARE_SERVICE_IN_SECOND="timeout_emcais_coms_self_care_service_in_second";
				public static final String GREEN_FRIDAY_START_TIMESTAMP = "green_friday_start_timestamp";
				public static final String GREEN_FRIDAY_END_TIMESTAMP = "green_friday_end_timestamp";
				public static final String GREEN_FRIDAY_EVENT_ON_TITLE = "green_friday_event_on_title";
				public static final String GREEN_FRIDAY_EVENT_ON_BANNER = "green_friday_event_on_banner";
				public static final String GREEN_FRIDAY_PRE_EVENT_TITLE = "green_friday_pre_event_title";
				public static final String GREEN_FRIDAY_PRE_EVENT_BANNER = "green_friday_pre_event_banner";
				public static final String GREEN_FRIDAY_EVENT_ON_TITLE_AR = "green_friday_event_on_title_ar";
				public static final String GREEN_FRIDAY_EVENT_ON_BANNER_AR = "green_friday_event_on_banner_ar";
				public static final String GREEN_FRIDAY_PRE_EVENT_TITLE_AR = "green_friday_pre_event_title_ar";
				public static final String GREEN_FRIDAY_PRE_EVENT_BANNER_AR = "green_friday_pre_event_banner_ar";
				public static final String DIGITAL_APP_TOOL_BAR_CHANNEL = "digital_app_tool_bar_channel";
				public static final String TOOLBAR_USAGE_NOTIFICATION_100_PERCENT_TEXT = "toolbar_usage_notification_100_percent_text";
				public static final String TOOLBAR_USAGE_NOTIFICATION_100_PERCENT_TEXT_AR = "toolbar_usage_notification_100_percent_text_ar";
				public static final String TOOLBAR_USAGE_NOTIFICATION_80_PERCENT_TEXT = "toolbar_usage_notification_80_percent_text";
				public static final String TOOLBAR_USAGE_NOTIFICATION_80_PERCENT_TEXT_AR = "toolbar_usage_notification_80_percent_text_ar";
				public static final String DIGITAL_APP_ACTIVE_NON_ACTIVE_ACCOUNTS = "digital_app_active_non_active_accounts";
				public static final String DIGITAL_APP_INDIVIDUAL_ACCESS_MULTIPLE_ACCOUNTS = "digital_app_individual_access_multiple_accounts";
				public static final String DIGITAL_APP_INDIVIDUAL_ACCESS_MULTIPLE_ACCOUNTS_AR = "digital_app_individual_access_multiple_accounts_ar";
				public static final String DIGITAL_APP_FULL_ACCESS_MULTIPLE_PARTY_ID = "digital_app_full_access_multiple_party_id";
				public static final String DIGITAL_APP_FULL_ACCESS_MULTIPLE_PARTY_ID_AR = "digital_app_full_access_multiple_party_id_ar";
				public static final String GET_MAX_PURCHASE_BILL_LIMIT_EN_KEY = "get_max_purchase_bill_limit_en_key";
				public static final String GET_MIN_PURCHASE_BILL_LIMIT_AR_KEY = "get_min_purchase_bill_limit_ar_key";
				public static final String GET_POSTPAID_OFFER_ID = "get_postpaid_offer_id";
				public static final String GET_PREPAID_OFFER_ID = "get_prepaid_offer_id";
				public static final String DIGITAL_APP_PURCHASE_LIMIT_CODE = "0001174";
				public static final String DIGITAL_APP_PURCHASE_LIMIT_MSG_AR = "digital_app_purchase_limit_msg_ar";
				public static final String DIGITAL_APP_PURCHASE_LIMIT_MSG_EN = "digital_app_purchase_limit_msg_en";
				public static final String ELIFE_HOME_PROTECTIONS_CONFIG_KEY = "elife_home_protections_config_key";
				
				// CNS
				public static final String CNS_PLATFORM_ANDROID = "cns_platform_android";
				public static final String CNS_PLATFORM_IOS = "cns_platform_ios";
				public static final String AUTH_USER_KEY = "cns_rest_auth_user";
				public static final String AUTH_PWD_KEY = "cns_rest_auth_pwd";
				public static final String CHANNEL_KEY = "cns_rest_channel";
				public static final String SUB_CHANNEL_KEY = "cns_rest_sub_channel";
				public static final String SYSTEM_NAME_KEY = "cns_rest_system_name";
				public static final String OS_TYPE_ANDROID = "android";
				public static final String OS_TYPE_IOS = "ios";
				public static final String CNS_DEVICE_TOKEN_AUTH_USERNAME = "cns_device_token_auth_username";
				public static final String CNS_DEVICE_TOKEN_AUTH_PASSWORD = "cns_device_token_auth_password";
				public static final String CNS_DEVICE_TOKEN_REGISTRATION_END_POINT = "cns_device_token_registration_end_point";
				public static final String GET = "GET";
				public static final String POST = "POST";
				public static final String SET_BILL_LIMIT_ERROR_CODE_SET_LIMIT_LESS_THAN_USAGE_AMOUNT = "E02";
				public static final String SET_BILL_LIMIT_ERROR_CODE_SET_LIMIT_LESS_THAN_USAGE_AMOUNT_MSG = "set_bill_limit_error_code_set_limit_less_than_usage_amount_msg";
				public static final String SET_BILL_LIMIT_ERROR_CODE_SET_LIMIT_LESS_THAN_USAGE_AMOUNT_MSG_AR = "set_bill_limit_error_code_set_limit_less_than_usage_amount_msg_ar";
				public static final String IVR_PIN_EPIN1_EN = "ivr_pin_epin1_en";
				public static final String IVR_PIN_EPIN1_AR = "ivr_pin_epin1_ar";

				
				public static final String IS_LOYALTY_REDEMPTION_ENABLE = "is_loyalty_redemption_enable";
				public static final String IS_LOYALTY_REDEMPTION_ENABLE_ANDRIOD = "is_loyalty_redemption_enable_andriod";
				public static final String IS_LOYALTY_REDEMPTION_ENABLE_IOS = "is_loyalty_redemption_enable_ios";
				public static final String MIX_PAYMENT_AMOUNT_MISMATCH = "0001150";
				public static final String MIX_PAYMENT_NEGATIVE_POINTS = "0001151";
				public static final String MIX_PAYMENT_NEGATIVE_AMOUNT = "0001152";
				// eLife mShop
				public static final String ELIFE_FREE_INSTALLATION_TEXT = "elife_free_installation_text";
				public static final String ELIFE_NON_REACHABLE_LOCATION_TEXT = "elife_non_reachable_location_text";
				public static final String ELIFE_NETWORK_TYPE_GPON = "elife_network_type_gpon";
				public static final String ELIFE_NETWORK_TYPE_BITSTREAM = "elife_network_type_bitstream";
				public static final String ELIFE_OTHER_PACKAGES_CATEGORY = "elife_other_packages_category";
				
				// Order Tracking
				public static final String OT_ITEM_IMAGE_BASE_URL = "ot_item_image_base_url";
				public static final String OT_TRACKING_URL = "ot_tracking_url";
				
				// ATG Login
				public static final String ATG_LOGIN_CHANNEL_ID = "atg_login_channel_id";
				public static final String ATG_LOGIN_APP_USERNAME = "atg_login_app_username";
				public static final String ATG_LOGIN_APP_PASSWORD = "atg_login_app_password";
				public static final String ATG_LOGIN_CHANNEL_ID_2 = "atg_login_channel_id_2";
				
				
				//%%%%%%%%%%%%% DROP 1 2 3 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
				
				public static final Integer USAGE_TYPE_IN_BUNDLE = 1;
				public static final Integer USAGE_TYPE_OUT_OF_BUNDLE = 2;
				public static final Integer USAGE_TYPE_TBD = 3;

				public static final String subscriptions_txt = "subscriptions_txt";
				public static final String subscriptions_txt_ar = "subscriptions_txt_ar";
				public static final String third_party_subscriptions = "third_party_subscriptions";
				public static final String third_party_subscriptions_ar = "third_party_subscriptions_ar";
				public static final String subscription_txt = "subscription_txt";
				public static final String subscription_txt_ar = "subscription_txt_ar";
				public static final String adjustment_txt = "adjustment_txt";
				public static final String adjustment_txt_ar = "adjustment_txt_ar";
				public static final String other_outgoing = "other_outgoing";
				public static final String other_outgoing_ar = "other_outgoing_ar";
				
				
				public static final String GET_AN_ADDON = "GET_AN_ADDON";
				public static final String GET_AN_ADDON_AR = "GET_AN_ADDON_AR";
				
				public static final String data_txt = "data_txt";
				public static final String data_txt_ar ="data_txt_ar";
				public static final String calls_txt_ar ="calls_txt_ar";
				public static final String calls_txt="calls_txt";
				public static final String messages_txt= "messages_txt";
				public static final String messages_txt_ar= "messages_txt_ar";
				public static final String other_outgoing_credit = "other_outgoing_credit";
				public static final String recharge_and_incoming_credit ="recharge_and_incoming_credit";
				public static final String other_outgoing_credit_ar = "other_outgoing_credit_ar";
				public static final String recharge_and_incoming_credit_ar= "recharge_and_incoming_credit_ar";
				
				
				public static final String USAGE_UNIT_SMS = "usage_unit_sms";
				public static final String USAGE_UNIT_MIN = "usage_unit_min";
				public static final String USAGE_UNIT_MIN_AR = "usage_unit_min_ar";
				public static final String USAGE_UNIT_MB = "usage_unit_mb";
				public static final String USAGE_UNIT_GB = "usage_unit_gb";
				public static final String USAGE_UNIT_AED = "usage_unit_aed";
				public static final String USAGE_UNIT_AED_AR = "usage_unit_aed_ar";
				public static final String smiles_point_txt = "smiles_point_txt";
				public static final String smiles_point_txt_ar = "smiles_point_txt_ar";
				public static final String recharges_txt = "recharges_txt";
				public static final String recharges_txt_ar = "recharges_txt_ar";
				public static final String bills = "bills";
				public static final String bills_ar = "bills_ar";
				
				public static final String other = "other";
				public static final String other_ar = "other_ar";
				public static final String LWC_GET_PRODUCT_OFFER_SRVC_URL = "lwc_get_product_offer_srvc_url";
				
				
				public static final String subscriptions_and_rentals = "subscriptions_and_rentals";
				public static final String subscriptions_and_rentals_ar = "subscriptions_and_rentals_ar";
				
				
				
				public static final String ELIFE_UNLIMITED_CAP = "elife_unlimited_cap";
				
				public static final String STATEMENT_DISCLAIMER_SHORT_DESC = "statement_disclaimer_short_desc";
				public static final String STATEMENT_DISCLAIMER_SHORT_DESC_AR = "statement_disclaimer_short_desc_ar";
				public static final String PLAY_ON_DEMAND_DISCLAIMER = "play_on_demand_disclaimer";
				public static final String PLAY_ON_DEMAND_DISCLAIMER_AR = "play_on_demand_disclaimer_ar";

				public static final String GRADIENT_COLOR_START_GREEN = "gradient_color_start_green";
				public static final String GRADIENT_COLOR_END_GREEN = "gradient_color_end_green";
				public static final String GRADIENT_COLOR_START_ORANGE = "gradient_color_start_orange";
				public static final String GRADIENT_COLOR_END_ORANGE = "gradient_color_end_orange";
				public static final String GRADIENT_COLOR_START_RED = "gradient_color_start_red";
				public static final String GRADIENT_COLOR_END_RED = "gradient_color_end_red";

				
				
				public static final String AED_USED_AR = "aed_used_ar";

				public static final String payment_and_incoming_credit = "payment_and_incoming_credit";
				public static final String payment_and_incoming_credit_ar = "payment_and_incoming_credit_ar";
				
				public static final String CUSTOM_LINKS_MIN = "CUSTOM_LINKS_MIN";
				public static final String CUSTOM_LINKS_MAX = "CUSTOM_LINKS_MAX";
				
				public static final String DEFAULT_ADJ_TITLE_EN = "DEFAULT_ADJ_TITLE_EN";
				public static final String DEFAULT_ADJ_TITLE_AR = "DEFAULT_ADJ_TITLE_AR";

				public static final String MOVIE_ON_DEMAND_SUBSCRIBED_ON_EN = "MOVIE_ON_DEMAND_SUBSCRIBED_ON_EN";
				public static final String MOVIE_ON_DEMAND_SUBSCRIBED_ON_AR = "MOVIE_ON_DEMAND_SUBSCRIBED_ON_AR";

				public static final String CALL_DURATION_EN = "CALL_DURATION_EN";
				public static final String CALL_DURATION_AR = "CALL_DURATION_AR";
				
				public static final String MB_OOB_EN = "MB_OOB_EN";
				public static final String MB_OOB_AR = "MB_OOB_AR";
				
				public static final String SMS_OOB_EN = "SMS_OOB_EN";
				public static final String SMS_OOB_AR = "SMS_OOB_AR";
				
				public static final String MIN_OOB_EN = "MIN_OOB_EN";
				public static final String MIN_OOB_AR = "MIN_OOB_AR";

				public static final String TRANSACTION_ID_EN = "TRANSACTION_ID_EN";
				public static final String TRANSACTION_ID_AR = "TRANSACTION_ID_AR";
				
				public static final String TIBCO_GET_BILL_DETAILS_URL = "TIBCO_GET_BILL_DETAILS_URL";
				public static final String TIBCO_BILL_USAGE_INQUIRY_URL = "TIBCO_BILL_USAGE_INQUIRY_URL";
				public static final String TIBCO_GET_AVG_INVOICE_CONSUMPTION_URL = "TIBCO_GET_AVG_INVOICE_CONSUMPTION_URL";
				public static final String TIBCO_GET_AVG_INVOICE_CAT_CONSUMPTION_URL = "TIBCO_GET_AVG_INVOICE_CAT_CONSUMPTION_URL";
				public static final String TIBCO_BILL_USAGE_SUMMARY = "tibco_bill_usage_summary";
				public static final String TIBCO_VOD_DETAILS_URL = "tibco_vod_details_url";
				public static final String TIBCO_GET_COUNTRY_NAME = "tibco_get_country_name";
				public static final String TIBCO_REST_DIGITAL_BILL_INQUIRY = "tibco_rest_digital_bill_inquiry";

				public static final String TIBCO_RETERIVE_PAY_AND_ALLOCATION_URL = "tibco_reterive_pay_and_allocation_url";
				public static final String STATEMENT_DISCLAIMER_LONG_DESC = "statement_disclaimer_long_desc";
				public static final String STATEMENT_DISCLAIMER_LONG_DESC_AR = "statement_disclaimer_long_desc_ar";

				public static final String BILL_SPIKE_DEFAULT = "bill_spike_default";
				public static final String BILL_LIMIT_REMARK = "bill_limit_remark";
				public static final String BILL_LIMIT_TITLE = "BILL_LIMIT_TITLE";
				public static final String BILL_LIMIT_TITLE_AR = "BILL_LIMIT_TITLE_AR";
				
				public static final String SPC_TITLE_AR = "SPC_TITLE_AR";
				
				public static final String SPC_TITLE = "SPC_TITLE";
				
				public static final String SELECT_PREF_COUNTRY_EN = "SELECT_PREF_COUNTRY_EN";
				public static final String SELECT_PREF_COUNTRY_AR = "SELECT_PREF_COUNTRY_AR";

				public static final String MAKE_UNLIM_CALLS_EN = "MAKE_UNLIM_CALLS_EN";
				public static final String MAKE_UNLIM_CALLS_AR = "MAKE_UNLIM_CALLS_AR";

				
				public static final String GTS_TITLE = "GTS_TITLE";
				public static final String GTS_TITLE_AR = "GTS_TITLE_AR";
				
				public static final String BILL_LIMIT_REMARK_AR = "bill_limit_remark_ar";
				
				
				
				public static final String ENABLE_RESERVE_CREDIT_REMARK_TITLE_1 = "enable_reserve_credit_remark_title_1";
				public static final String ENABLE_RESERVE_CREDIT_REMARK_TITLE_1_AR = "enable_reserve_credit_remark_title_1_ar";
				
				public static final String ENABLE_RESERVE_CREDIT_REMARK_1 = "enable_reserve_credit_remark_1";
				public static final String ENABLE_RESERVE_CREDIT_REMARK_1_AR = "enable_reserve_credit_remark_1_ar";

				public static final String ENABLE_RESERVE_CREDIT_REMARK_TITLE_2 = "enable_reserve_credit_remark_title_2";
				public static final String ENABLE_RESERVE_CREDIT_REMARK_TITLE_2_AR = "enable_reserve_credit_remark_title_2_ar";
				
				public static final String ENABLE_RESERVE_CREDIT_REMARK_2 = "enable_reserve_credit_remark_2";
				public static final String ENABLE_RESERVE_CREDIT_REMARK_2_AR = "enable_reserve_credit_remark_2_ar";
				
				public static final String RECHARGE_REMARK_TITLE_1 = "recharge_remark_title_1";
				public static final String RECHARGE_REMARK_TITLE_1_AR = "recharge_remark_title_1_ar";
				public static final String RECHARGE_ACTION_TITLE_1 = "recharge_action_title_1";
				public static final String RECHARGE_ACTION_TITLE_1_AR = "recharge_action_title_1_ar";
				public static final String RECHARGE_REMARK_1 = "recharge_remark_1";
				public static final String RECHARGE_REMARK_1_AR = "recharge_remark_1_ar";

				public static final String RECHARGE_REMARK_TITLE_2 = "recharge_remark_title_2";
				public static final String RECHARGE_REMARK_TITLE_2_AR = "recharge_remark_title_2_ar";

				public static final String RECHARGE_REMARK_TITLE_3 = "recharge_remark_title_3";
				public static final String RECHARGE_REMARK_TITLE_3_AR = "recharge_remark_title_3_ar";
				
				public static final String RECHARGE_REMARK_2 = "recharge_remark_2";
				public static final String RECHARGE_REMARK_2_AR = "recharge_remark_2_ar";
				
				public static final String RECHARGE_REMARK_3 = "recharge_remark_3";
				public static final String RECHARGE_REMARK_3_AR = "recharge_remark_3_ar";

				
				public static final String BILLING_2020_BILL_HIGHER_THAN_USUAL = "BILLING_2020_BILL_HIGHER_THAN_USUAL";
				public static final String BILLING_2020_BILL_HIGHER_THAN_USUAL_AR = "BILLING_2020_BILL_HIGHER_THAN_USUAL_AR";

				public static final String BILLING_2020_BILL_HIGHER_THAN_USUAL_MULTI = "BILLING_2020_BILL_HIGHER_THAN_USUAL_MULTI";
				public static final String BILLING_2020_BILL_HIGHER_THAN_USUAL_MULTI_AR = "BILLING_2020_BILL_HIGHER_THAN_USUAL_MULTI_AR";
				
				public static final String BILLING_2020_BILL_HIGHER_THAN_MONTHLY_AVG = "BILLING_2020_BILL_HIGHER_THAN_MONTHLY_AVG";
				public static final String BILLING_2020_BILL_HIGHER_THAN_MONTHLY_AVG_AR = "BILLING_2020_BILL_HIGHER_THAN_MONTHLY_AVG_AR";

				public static final String BILL_SPIKE_SEE_DETAILS = "BILL_SPIKE_SEE_DETAILS";
				public static final String BILL_SPIKE_SEE_DETAILS_AR = "BILL_SPIKE_SEE_DETAILS_AR";

				public static final String BILL_SPIKE_IMAGE_URL = "BILL_SPIKE_IMAGE_URL";
				public static final String BILL_SPIKE_COLOR = "BILL_SPIKE_COLOR";

				
				public static final String GREEN = "#719e19";

				public static final String BILLING_2020_AUTOPAY_ENABLED_CARD = "billing_2020_autopay_enabled_card";
				public static final String BILLING_2020_AUTOPAY_ENABLED_CARD_AR = "billing_2020_autopay_enabled_card_ar";

				public static final String BILLING_2020_AED_AUTO_PAID = "billing_2020_aed_auto_paid";
				public static final String BILLING_2020_AED_AUTO_PAID_AR = "billing_2020_aed_auto_paid_ar";
				
				public static final String PAYMENT_HISTORY_STATUS_PAID = "payment_history_status_paid";
				public static final String PAYMENT_HISTORY_STATUS_PAID_AR = "payment_history_status_paid_ar";
				
				public static final String PAYMENT_HISTORY_PAID_VIA = "payment_history_paid_via";
				public static final String PAYMENT_HISTORY_PAID_VIA_AR = "payment_history_paid_via_ar";
				
							
				public static final String CURRENT_AMOUNT_DUE = "current_amount_due";
				public static final String CURRENT_AMOUNT_DUE_AR = "current_amount_due_ar";

				public static final String ERC_REMARK_TITLE = "ERC_REMARK_TITLE";
				public static final String ERC_REMARK_TITLE_AR = "ERC_REMARK_TITLE_AR";
				
				public static final String ERC_REMARK = "ERC_REMARK";
				public static final String ERC_REMARK_AR = "ERC_REMARK_AR";
				public static final String ERC_ACTION_TITLE = "ERC_ACTION_TITLE";
				public static final String ERC_ACTION_TITLE_AR = "ERC_ACTION_TITLE_AR";
				
				public static final String OUT_OF_BUNDLE_CALLS = "OUT_OF_BUNDLE_CALLS";
				public static final String OUT_OF_BUNDLE_CALLS_AR = "OUT_OF_BUNDLE_CALLS_AR";

				public static final String OUT_OF_BUNDLE_SMS = "OUT_OF_BUNDLE_SMS";
				public static final String OUT_OF_BUNDLE_SMS_AR = "OUT_OF_BUNDLE_SMS_AR";

				public static final String OUT_OF_BUNDLE_DATA = "OUT_OF_BUNDLE_DATA";
				public static final String OUT_OF_BUNDLE_DATA_AR = "OUT_OF_BUNDLE_DATA_AR";

				public static final String LAST_RECHARGE_TEXT = "LAST_RECHARGE_TEXT";
				public static final String LAST_RECHARGE_TEXT_AR = "LAST_RECHARGE_TEXT_AR";

				public static final String PREPAID_RESERVE_CREDIT_DISPLAY_TEXT_AR = "prepaid_reserve_credit_display_text_ar";
				public static final String PREPAID_RESERVE_CREDIT_DISPLAY_TEXT  = "prepaid_reserve_credit_display_text";
				public static final String PREPAID_RESERVE_BALANCE_COLOR = "prepaid_reserve_balance_color";
				public static final String PREPAID_CREDIT_DISPLAY_TEXT_AR =  "prepaid_credit_display_text_ar";
				public static final String PREPAID_CREDIT_DISPLAY_TEXT =  "prepaid_credit_display_text";
				
				public static final String TOTAL_AGG_REMAINING = "total_agg_remaining";
				public static final String TOTAL_AGG_REMAINING_AR = "total_agg_remaining_ar";
				public static final String TBD_ACTIVE_SINCE_DATE_FORMAT = "dd-MM hh:mm a";
				public static final String REMAINING_DESC_FOR_USAGE_SMS_TAB = "remaining_desc_for_usage_sms_tab";
				public static final String REMAINING_DESC_FOR_USAGE_SMS_TAB_AR = "remaining_desc_for_usage_sms_tab_ar";
				public static final String UNLIMITED = "UNLIMITED";
				public static final String UNLIMITED_AR = "UNLIMITED_AR";
				
				public static final String USAGE_BASE_PLAN = "usage_base_plan";
				public static final String USAGE_BASE_PLAN_AR = "usage_base_plan_ar";
				public static final String		USAGE_GRAPH_SRVC_CALLS_VOLUME_AGGERGATED																					= "usage_graph_srvc_calls_volume_aggergated";
				public static final String		USAGE_GRAPH_SRVC_CALLS_VOLUME_AGGERGATED_AR																					= "usage_graph_srvc_calls_volume_aggergated_ar";
				public static final String		USAGE_GRAPH_SRVC_SMS_VOLUME_AGGERGATED																						= "usage_graph_srvc_sms_volume_aggergated";
				public static final String		USAGE_GRAPH_SRVC_SMS_VOLUME_AGGERGATED_AR																					= "usage_graph_srvc_sms_volume_aggergated_ar";
			
				public static final String		USAGE_GRAPH_SRVC_DATA_MB_VOLUME_AGGERGATED																					= "usage_graph_srvc_data_mb_volume_aggergated";
				public static final String		USAGE_GRAPH_SRVC_DATA_MB_VOLUME_AGGERGATED_AR																				= "usage_graph_srvc_data_mb_volume_aggergated_ar";
			
				public static final String		USAGE_GRAPH_SRVC_DATA_GB_VOLUME_AGGERGATED																					= "usage_graph_srvc_data_gb_volume_aggergated";
				public static final String		USAGE_GRAPH_SRVC_DATA_GB_VOLUME_AGGERGATED_AR																				= "usage_graph_srvc_data_gb_volume_aggergated_ar";
			
				public static final String		USAGE_GRAPH_SRVC_AVG_CALLS_VOLUME_AGGERGATED																				= "usage_graph_srvc_avg_calls_volume_aggergated";
				public static final String		USAGE_GRAPH_SRVC_AVG_CALLS_VOLUME_AGGERGATED_AR																				= "usage_graph_srvc_avg_calls_volume_aggergated_ar";
				public static final String		USAGE_GRAPH_SRVC_AVG_SMS_VOLUME_AGGERGATED																					= "usage_graph_srvc_avg_sms_volume_aggergated";
				public static final String		USAGE_GRAPH_SRVC_AVG_SMS_VOLUME_AGGERGATED_AR																				= "usage_graph_srvc_avg_sms_volume_aggergated_ar";
			
				public static final String		USAGE_GRAPH_SRVC_AVG_DATA_MB_VOLUME_AGGERGATED																				= "usage_graph_srvc_avg_data_mb_volume_aggergated";
				public static final String		USAGE_GRAPH_SRVC_AVG_DATA_MB_VOLUME_AGGERGATED_AR																			= "usage_graph_srvc_avg_data_mb_volume_aggergated_ar";
			
				public static final String		USAGE_GRAPH_SRVC_AVG_DATA_GB_VOLUME_AGGERGATED																				= "usage_graph_srvc_avg_data_gb_volume_aggergated";
				public static final String		USAGE_GRAPH_SRVC_AVG_DATA_GB_VOLUME_AGGERGATED_AR																			= "usage_graph_srvc_avg_data_gb_volume_aggergated_ar";

				public static final String PRE_ORDER_SERVICE_ENDPOINT_URL = "pre_order_service_endpoint_url";
				public static final String DIGITAL_APP_WS_NO_DATA_FOUND = "DIGITAL_APP_WS_NO_DATA_FOUND";
				public static final String DIGITAL_APP_WS_NO_DATA_FOUND_AR = "DIGITAL_APP_WS_NO_DATA_FOUND_AR";
				
				
				public static final String DIGITAL_APP_WS_NO_DATA_FOUND_CODE = "0000002";
				

				public static final String DIGITAL_APP_NO_SMS_LOGS_FOUND = "digital_app_no_sms_logs_found";
				public static final String DIGITAL_APP_NO_SMS_LOGS_FOUND_AR = "digital_app_no_sms_logs_found_ar";		
				public static final String ADVANCE_PAYMENTS_SINGLE = "ADVANCE_PAYMENTS_SINGLE";
				public static final String ADVANCE_PAYMENTS_SINGLE_AR = "ADVANCE_PAYMENTS_SINGLE_AR";
				public static final String ADVANCE_PAYMENTS_MULTI = "ADVANCE_PAYMENTS_MULTI";		
				public static final String ADVANCE_PAYMENTS_MULTI_AR = "ADVANCE_PAYMENTS_MULTI_AR";		
				public static final String AUTOPAY_ENABLED_ICON = "autopay_enabled_icon";
				public static final String AUTOPAY_FAILED_ICON = "autopay_failed_icon";
				public static final String LANDING_ACTION_MANAGE_AUTOPAY = "landing_action_manage_autopay";
				public static final String LANDING_ACTION_MANAGE_AUTOPAY_AR = "landing_action_manage_autopay_ar";
				public static final String AUTOPAY_ENABLED_ON_1 = "autopay_enabled_on_1";
				public static final String AUTOPAY_ENABLED_ON_1_AR = "autopay_enabled_on_1_ar";

				public static final String ATG_CATALOGUE_ROAMING_RATE = "atg_catalogue_roaming_rate";
				public static final String ATG_CATALOGUE_ROAMING_RATE_AR = "atg_catalogue_roaming_rate_ar";
				public static final String ATG_CATALOGUE_ELG_COUNTRY = "atg_catalogue_elg_country";
				public static final String ATG_CATALOGUE_ELG_COUNTRY_AR = "atg_catalogue_elg_country_ar";
			public static final String ATG_CATALOGUE_ROAMING_IDS = "atg_catalogue_roaming_ids";
				public static final String ATG_CATALOGUE_PROMO_IDS = "atg_catalogue_promo_ids";
				public static final String ATG_CATALOGUE_SUBSCRIBE_BUTTON = "atg_catalogue_subscribe_button";
				public static final String ATG_CATALOGUE_SUBSCRIBE_BUTTON_AR = "atg_catalogue_subscribe_button_ar";
				
				public static final String ATG_CATALOGUE_PREFERRED_NUMBER_PLACEHOLDER_AR = "atg_catalogue_preferred_number_placeholder_ar";
				public static final String ATG_CATALOGUE_PREFERRED_NUMBER_PLACEHOLDER = "atg_catalogue_preferred_number_placeholder";
				public static final String ATG_CATALOGUE_PREFERRED_NUMBER_INDENTIFIER = "atg_catalogue_preferred_number_indentifier";
				
				

				
				
				public static final String atg_category_id_url = "atg_category_id_url";
				public static final String atg_subscribe_addon_url = "atg_subscribe_addon_url";
				public static final String atg_un_subscribe_addon_url = "atg_un_subscribe_addon_url";
				public static final String DIGITAL_APP_WS_ATG_MAX_NUM_OF_SUBS_ALLOWED_AR = "digital_app_ws_atg_max_num_of_subs_allowed_ar";																														// code
				public static final String DIGITAL_APP_WS_ATG_MAX_NUM_OF_SUBS_ALLOWED = "digital_app_ws_atg_max_num_of_subs_allowed";																														// code
				//web plans
				public static final String WEB_SHOP_INDIVIDUAL_LOGIN_URL = "web_shop_individual_login_url";
				public static final String LOGIN_INDIVIDUAL_FLAG = "login_individual_flag";
				public static final String LOGIN_INDIVIDUAL_CHANNEL = "login_individual_channel";
				public static final String ATG_APPLICATION_USERNAME = "atg_application_username";
				public static final String ATG_APPLICATION_PASSWORD = "atg_application_password";
				public static final String INDIVIUAL_LOGIN = "indiviual_login";
				public static final String WEB_SHOP_BASE_URL = "web_shop_base_url";
				
				public static final String ATG_PARTIAL_REGISTERATION_SERVICE = "atg_partial_registeration_service";
				public static final String ATG_FULL_REGISTERATION_SERVICE = "atg_full_registeration_service";
				
						
				public static final String DIGITAL_APP_GET_OFFERS_URL = "digital_app_get_offers_url";
				public static final String DIGITAL_APP_SET_OFFERS_URL = "digital_app_set_offers_url";
				public static final String BILL_NOTIF_SOME_PAY_BEFORE_21 = "BILL_NOTIF_SOME_PAY_BEFORE_21";
				public static final String BILL_NOTIF_SOME_PAY_BEFORE_21_AR = "BILL_NOTIF_SOME_PAY_BEFORE_21_AR";
				public static final String BILL_NOTIF_BILL_NOT_GENER = "BILL_NOTIF_BILL_NOT_GENER";
				public static final String BILL_NOTIF_BILL_NOT_GENER_AR = "BILL_NOTIF_BILL_NOT_GENER_AR";
				
				public static final String BILL_NOTIF_ADV_PAY = "BILL_NOTIF_ADV_PAY";
				public static final String BILL_NOTIF_ADV_PAY_AR = "BILL_NOTIF_ADV_PAY_AR";
				public static final String BILL_NOTIF_CUR_MON_OVR_DUE_AFTER_20 = "BILL_NOTIF_CUR_MON_OVR_DUE_AFTER_20";
				public static final String BILL_NOTIF_CUR_MON_OVR_DUE_AFTER_20_AR = "BILL_NOTIF_CUR_MON_OVR_DUE_AFTER_20_AR";
				public static final String ATG_REGISTERATION_REQUEST_SERVICE = "atg_registeration_request_service";
				public static final String DIGITAL_APP_INDIVIDUAL_ACCESS_LOGIN_MESSAGE_AR = "digital_app_individual_access_login_message_ar";
				public static final String DIGITAL_APP_INDIVIDUAL_ACCESS_LOGIN_MESSAGE = "digital_app_individual_access_login_message";
				
				
				//%%%%%%%%%%%%% DROP 1 2 3 ROUND 2 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

				public static final String CUSTOMER_REGISTRATION_ACCEPTED_TC = "customer_registration_accepted_tc";
				public static final String CUSTOMER_REGISTRATION_ACCEPTED_TC_AR = "customer_registration_accepted_tc_ar";
				public static final String CUSTOMER_REGISTRATION_ACCEPTED_TC_PRIVACY_EN = "CUSTOMER_REGISTRATION_ACCEPTED_TC_PRIVACY_EN";
				public static final String CUSTOMER_REGISTRATION_ACCEPTED_TC_PRIVACY_AR = "CUSTOMER_REGISTRATION_ACCEPTED_TC_PRIVACY_AR";


				public static final String VOD_NUM_OF_DAYS = "VOD_NUM_OF_DAYS";
				public static final String DIGITAL_APP_UM_CHANNEL_ID = "digital_app_um_channel_id";

				
				//%%%%%%%%%%%%% DROP 1 2 3 ROUND 3 %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
				///smiles_summary_points_expiry_text_
				public static final String CODE_REQ_SYS = "CODE_REQ_SYS";
				public static final String SMILES_SUMMARY_REWARD_TEXT = "SMILES_SUMMARY_REWARD_TEXT_";
				public static final String SMILES_SUMMARY_REWARD_IMAGE = "SMILES_SUMMARY_REWARD_IMAGE";
				
				
				
				public static final String devices_brand_name_property_name = "devices_brand_name_property_name";
				
				public static final String devices_color_code_property_name = "devices_color_code_property_name";
				
				public static final String devices_capacity_property_name = "devices_capacity_property_name";
				
				public static final String devices_price_slider_property_name = "devices_price_slider_property_name";
				
				public static final String elife_tab_internet = "elife_tab_internet_";
				
				public static final String elife_tab_tv = "elife_tab_tv_";
				public static final String elife_elife_on = "elife_elife_on_";
				public static final String elife_elife_desc = "elife_elife_desc_";
				public static final String elife_on_image_url = "elife_on_image_url";

				public static final String elife_tab_landline = "elife_tab_landline_";
				public static final String elife_my_home_network = "elife_my_home_network_";
				public static final String elife_my_home_network_int_sp = "elife_my_home_network_int_sp_";
				
				public static final String elife_my_home_network_image = "elife_my_home_network_image";
				public static final String elife_tab_landline_int_sp = "elife_tab_landline_int_sp_";
				public static final String SMILES_SUMMARY_TIER_IMAGE = "SMILES_SUMMARY_TIER_IMAGE_";
				
				public static final String STATEMENT_SHOW_ACC_NUM_FILTERS = "STATEMENT_SHOW_ACC_NUM_FILTERS";
				public static final String PREFERRED_NUM_KEY = "PREFERRED_NUM_KEY";
				public static final String WEB_SHOP_INDIVIDUAL_LOGIN_URL_AR = "web_shop_individual_login_url_ar";
				public static final String DIGITAL_APP_WS_VAT_INCLUSIVE = "5";
				
				public static final String usage_expires_on = "d2020_usage_expires_on_";
				
				public static final String usage_since = "usage_since_";
				
				public static final String usage_renews_on = "d2020_usage_renews_on_";
				
				
				public static final String NOTIFIER_BAL_LESS5_RES_CR_GR_0_TITLE = "NOTIFIER_BAL_LESS5_RES_CR_GR_0_TITLE_";
				public static final String NOTIFIER_BAL_LESS5_RES_CR_GR_0_SUB_TITLE = "NOTIFIER_BAL_LESS5_RES_CR_GR_0_SUB_TITLE_";
				public static final String NOTIFIER_BAL_LESS5_RES_CR_GR_0_ACTION = "NOTIFIER_BAL_LESS5_RES_CR_GR_0_ACTION_";
				
				
				public static final String NOTIFIER_BAL_LESS5_RES_CR_EQ_0_SUB_TITLE = "NOTIFIER_BAL_LESS5_RES_CR_EQ_0_SUB_TITLE_";
				public static final String NOTIFIER_BAL_LESS5_RES_CR_EQ_0_TITLE = "NOTIFIER_BAL_LESS5_RES_CR_EQ_0_TITLE_";
				public static final String NOTIFIER_BAL_LESS5_RES_CR_EQ_0_ACTION = "NOTIFIER_BAL_LESS5_RES_CR_EQ_0_TITLE_";
				
				public static final String NOTIFIER_BAL_EQ0_RES_CR_GR_0_TITLE = "NOTIFIER_BAL_EQ0_RES_CR_GR_0_TITLE_";
				public static final String NOTIFIER_BAL_EQ0_RES_CR_GR_0_SUB_TITLE = "NOTIFIER_BAL_EQ0_RES_CR_GR_0_SUB_TITLE_";
				public static final String NOTIFIER_BAL_EQ0_RES_CR_GR_0_ACTION = "NOTIFIER_BAL_EQ0_RES_CR_GR_0_ACTION_";
				
				public static final String NOTIFIER_BAL_EQ0_RES_CR_EQ_0_RES_CR_LIMIT_GR_0_TITLE = "NOTIFIER_BAL_EQ0_RES_CR_EQ_0_RES_CR_LIMIT_GR_0_TITLE_";
				public static final String NOTIFIER_BAL_EQ0_RES_CR_EQ_0_RES_CR_LIMIT_GR_0_SUB_TITLE = "NOTIFIER_BAL_EQ0_RES_CR_EQ_0_RES_CR_LIMIT_GR_0_SUB_TITLE_";
				public static final String NOTIFIER_BAL_EQ0_RES_CR_EQ_0_RES_CR_LIMIT_GR_0_ACTION = "NOTIFIER_BAL_EQ0_RES_CR_EQ_0_RES_CR_LIMIT_GR_0_ACTION_";
				
				

				public static final String NOTIFIER_BAL_EQ0_RES_CR_EQ_0_RES_CR_LIMIT_EQ_0_TITLE = "NOTIFIER_BAL_EQ0_RES_CR_EQ_0_RES_CR_LIMIT_EQ_0_TITLE_";
				public static final String NOTIFIER_BAL_EQ0_RES_CR_EQ_0_RES_CR_LIMIT_EQ_0_SUB_TITLE = "NOTIFIER_BAL_EQ0_RES_CR_EQ_0_RES_CR_LIMIT_EQ_0_SUB_TITLE_";
				public static final String NOTIFIER_BAL_EQ0_RES_CR_EQ_0_RES_CR_LIMIT_EQ_0_ACTION = "NOTIFIER_BAL_EQ0_RES_CR_EQ_0_RES_CR_LIMIT_EQ_0_ACTION_";
				public static final String CAP_MAX_NUMBER_OF_DEVICE_MSG = "cap_max_number_of_device_msg";
				public static final String CAP_MAX_NUMBER_OF_DEVICE_MSG_AR = "cap_max_number_of_device_msg_ar";
				public static final String DIGITAL_APP_CAP_MAX_LIMIT_ERROR_CODE = "0001178";
				public static final String LOYALTY_REST_ACCESS_TOKEN_ID = "loyalty_rest_access_token_id";
				public static final String LOYALTY_REVAMP_BASE_URL = "loyalty_revamp_base_url";
				public static final String LOYALTY_CREATE_PAYMENT_FUNC = "loyalty_create_payment_func";
				public static final int LOYALTY_ENROLL_MEMBER_SUCCESS_RESPONSE_CODE = 0;
				public static final String LOYALTY_IS_REST_ENABLED_CONFIG = "loyalty_is_rest_enabled";
				public static final String LOYALTY_APP_POINTS_CALC_PAYMENT_TYPE_1_RECHARGE = "WR25";
				public static final String LOYALTY_APP_POINTS_CALC_PAYMENT_TYPE_2_BILL_PAYMENT = "PR25";
				public static final String LOYALTY_EQUIVALENT_POINTS = "loyalty_equivalent_points";
				public static final String LOYALTY_MEMBER_SHIP_INFO_FUNC = "loyalty_member_ship_info_func";
				public static final String LOYALTY_DEVICE_RESERVE_PARTNER_CODE = "ES";
				public static final String LOYALTY_MARKET_PLACE_EQUIVALENT_POINTS = "loyalty_market_place_equivalent_points";
				public static final String CHANNEL_FOR_LOYALTY = "MEAPP";
				public static final String LOYALTY_DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";// dd-MM-yyyy
				public static final String LOYALTY_RESERVE_POINTS_FUNC = "loyalty_reserve_points_func";
				public static final Integer LOYALTY_DEVICE_RESERVATION_TIME = 3600;
				public static final Integer LOYALTY_RESERVATION_TIME = 1800;
				public static final String LOYALTY_DEVICE_REDEMPTION_TYPE = "RESERVE";
				public static final String LOYALTY_DEVICE_RESERVE_ACTIVITY_CODE = "DEVICE_MEAPP";
				public static final String LOYALTY_REDEMPTION_TYPE = "RESERVE";
				public static final String LOYALTY_REST_PARTNER_CONNECTING_ERROR_CODE = "partner_connecting_error_code";
				public static final String LOYALTY_REST_PARTNER_FAILURE_RESPONSE_CODE = "partner_failure_response_code";
				public static final String LOYALTY_REST_PARTNER_CONNECTING_ERROR_MSG = "partner_connecting_error_msg";
				public static final String VALIDATE_ORDER_URL = "validate_order_url";
				public static final String DIGITAL_APP_UM_CAPPING_URL = "digital_app_um_capping_url";
				public static final String DIGITAL_APP_UM_MONTHLY_LIMIT = "digital_app_um_monthly_limit";
				public static final String DIGITAL_APP_UM_MONTHLY_LIMIT_AR = "digital_app_um_monthly_limit_ar";
				public static final String DIGITAL_APP_UM_RECOMENDATION_URL = "digital_app_um_recomendation_url";
				public static final String DIGITAL_APP_UM_OFFER_ACCEPTANCE_URL = "digital_app_um_offer_acceptance_url";
				public static final String DIGITAL_APP_UM_OFFER_ACCEPTANCE_MSG = "digital_app_um_offer_acceptance_msg";
				public static final String DIGITAL_APP_UM_OFFER_ACCEPTANCE_MSG_AR = "digital_app_um_offer_acceptance_msg_ar";
				public static final String DIGITAL_APP_UM_OFFER_HISTORY_URL = "digital_app_um_offer_history_url";
				public static final String DIGITAL_APP_DEAL_FOR_YOU_NOTIFICATION = "digital_app_deal_for_you_notification";
				public static final String DIGITAL_APP_DEAL_FOR_YOU_NOTIFICATION_AR = "digital_app_deal_for_you_notification_ar";
				public static final String LOYALTY_POINTS_SUMMERY = "loyalty_points_summery";
				public static final String LOYALTY_REST_SRVC_CHANNEL_CONFIG_KEY = "loyalty_rest_srvc_channel_config_key";
				public static final String LOYALTY_REST_SRVC_PROGRAM_CONFIG_KEY = "loyalty_rest_srvc_program_config_key";
				
				public static final String ATG_AVAILABLE_NUMBERS_URL = "ATG_AVAILABLE_NUMBERS_URL";
				public static final String ATG_RESERVE_NUMBER_URL = "ATG_RESERVE_NUMBER_URL";
				public static final String ATG_ADD_TO_CART_URL = "ATG_ADD_TO_CART_URL";
				public static final String ATG_GET_CART_URL = "ATG_GET_CART_URL";
				public static final String ATG_GET_CART_NOTIFICATIONS_URL = "ATG_GET_CART_NOTIFICATIONS_URL";
				public static final String ATG_PORTAL_ROOT_URL = "ATG_PORTAL_ROOT_URL";
				public static final String DEVICES_REGULAR_COLOR = "DEVICES_REGULAR_COLOR";
				public static final String DEVICES_DISCOUNT_COLOR = "DEVICES_DISCOUNT_COLOR";
				public static final String DEVICES_PRE_ORDER_COLOR = "DEVICES_PRE_ORDER_COLOR";
				public static final String DEVICES_TEXT_COLOR = "DEVICES_TEXT_COLOR";
				public static final String ATG_SHIPPING_GROUP_URL = "ATG_SHIPPING_GROUP_URL";
				public static final String ATG_GET_PROFILE_CONTACT_INFO_URL = "ATG_GET_PROFILE_CONTACT_INFO_URL";
				public static final String ATG_GET_PROFILE_ADDRESSES_URL = "ATG_GET_PROFILE_ADDRESSES_URL";
				public static final String ATG_GET_PROFILE_CREDIT_CARDS_URL = "ATG_GET_PROFILE_CREDIT_CARDS_URL";
				public static final String ATG_OPTIMIZE_INVENTORY_URL = "ATG_OPTIMIZE_INVENTORY_URL";
				public static final String ATG_RELATE_SHIPPING_TO_ITEM_URL = "ATG_RELATE_SHIPPING_TO_ITEM_URL";
				public static final String ATG_PAYMENT_GROUPS_URL = "ATG_PAYMENT_GROUPS_URL";
				public static final String ATG_RELATE_PAYMENT_TO_ORDER_URL = "ATG_RELATE_PAYMENT_TO_ORDER_URL";
				public static final String ATG_RELATE_PAYMENT_TO_ITEMS_URL = "ATG_RELATE_PAYMENT_TO_ITEMS_URL";
				public static final String ATG_PAY_URL = "ATG_PAY_URL";
				public static final String ATG_VALIDATE_COUPON_URL = "ATG_VALIDATE_COUPON_URL";
				public static final String ATG_APPLY_COUPON_URL = "ATG_APPLY_COUPON_URL";
				public static final String ATG_ACCOUNT_PICTURE_AND_NICK_NAME_URL = "ATG_GET_ACCOUNT_PICTURE_AND_NICK_NAME_URL";
				public static final String ATG_CHECKOUT_URL = "ATG_CHECKOUT_URL";
				public static final String ATG_ACCOUNT_NUMBER_ELIGIBILITY_URL = "ATG_ACCOUNT_NUMBER_ELIGIBILITY_URL";
				public static final String ATG_EID_ELIGIBILITY_URL = "ATG_EID_ELIGIBILITY_URL";
				public static final String ATG_SEND_OTP_URL = "ATG_SEND_OTP_URL";
				public static final String ATG_VERIFY_OTP_URL = "ATG_VERIFY_OTP_URL";
				public static final String SMARTPAY_PRICE = "50";
				public static final String SMARTPAY_FREQUENCY = "month";
				public static final String PAYMENT_GROUP_CLASS_TYPE_CREDIT_CARD = "creditCard";
				public static final String PAYMENT_GROUP_CLASS_TYPE_LOYALTY_POINTS = "loyaltyPoint";
				public static final String PAYMENT_GROUP_CLASS_TYPE_CASH = "cash";
				public static final String ATG_EID_PARTY_CREATION_ELIGIBILITY_URL = "ATG_EID_PARTY_CREATION_ELIGIBILITY_URL";
				public static final String ATG_NEW_PARTY_GENERATE_OTP_URL = "ATG_NEW_PARTY_GENERATE_OTP_URL";
				public static final String ATG_NEW_PARTY_VALIDATE_OTP_URL = "ATG_NEW_PARTY_VALIDATE_OTP_URL";
				public static final String ATG_NEW_PARTY_CREATION_URL = "ATG_NEW_PARTY_CREATION_URL";
				public static final String ATG_DELETE_CHILD_FROM_CART_URL = "ATG_DELETE_CHILD_FROM_CART_URL";
				public static final String ATG_GET_PROMOTIONS_URL = "ATG_GET_PROMOTIONS_URL";											
				public static final String ATG_SMARTPAY_ELIGIBILITY_URL = "ATG_SMARTPAY_ELIGIBILITY_URL";
				public static final String ATG_BUNDLES_CONFIG_URL = "ATG_BUNDLES_CONFIG_URL";
				public static final String ATG_PLANS_CONFIG_URL = "ATG_PLANS_CONFIG_URL";
				public static final String ATG_GET_PRODUCTS_URL = "ATG_GET_PRODUCTS_URL";
				public static final String ATG_COMPARE_URL = "ATG_COMPARE_URL";
				public static final String BUNDLE_ADDONS_ID_SEPARATOR = "&=&";
				public static final String COMMERCE_ITEM_ID_SEPARATOR = "&ci=ci&";
				public static final String DEVICE_CATALOGUE_RECOMMENDED_CATEGORY = "DEVICE_CATALOGUE_RECOMMENDED_CATEGORY";
				public static final String PLANS_PROMOTION_FLAG = "PLANS_PROMOTION_FLAG";
				public static final String STANDALONE_FREQUENCY_AR = "مره واحده";
				public static final String STANDALONE_FREQUENCY = "one time";
				public static final String SMARTPAY_FREQUENCY_AR = "شهر";
				public static final String FEE_WAIVER_FREQUENCY_AR = "أسبوع";
				public static final String FEE_WAIVER_FREQUENCY = "Week";
				public static final String FEE_WAIVER_CHARGES_TEXT = "New Sim Charges";
				public static final String FEE_WAIVER_CHARGES_TEXT_AR = "رسوم سيم جديدة";
				public static final String DEVICE_CATALOGUE_TRENDING_CATEGORY = "DEVICE_CATALOGUE_TRENDING_CATEGORY";
				public static final String DEVICE_CATALOGUE_BUNDLES_CATEGORY = "DEVICE_CATALOGUE_BUNDLES_CATEGORY";
				public static final String DEVICE_ADDON_PAYMENT_TYPE = "Standalone";
				public static final String LMS_CREATE_LEAD_V2_URL = "lms_create_lead_v2_url";
				public static final String IS_LOYALTY_REST_ENABLE_IOS = "is_loyalty_rest_enable_ios";
				public static final String IS_LOYALTY_REST_ENABLE_ANDRIOD = "is_loyalty_rest_enable_andriod";
				public static final String EPG_MECHANGT_CONFIG_KEY = "epg_mechangt_config_key"; //
				public static final String EPG_STORE_NAME_CONFIG_KEY= "epg_store_name_config_key"; //
				public static final String EPG_TERMINAL_CONFIG_KEY= "epg_terminal_config_key"; //
				public static final String EPG_PAY_FOR_MULTIPLE_ACCOUNTS_EWALLET_RETURN_PATH = "epg_pay_for_multiple_accounts_ewallet_return_path";
				public static final String EPG_TERMINAL_TRANSACTION_PROPERTY = "Terminal";//
				public static final String EPG_MERCHANT_TRANSACTION_PROPERTY = "Merchant";//
				public static final String EPG_PAY_FOR_OTHERS_EWALLET_RETURN_PATH = "epg_pay_for_others_ewallet_return_path";
				public static final String EPG_PAY_FOR_DEVICE_STANDALONE_EWALLET_NS_V2_RETURN_PATH = "epg_pay_for_device_standalone_ewallet_ns_v2_return_path";
				public static final String DIGITAL_APP_TITLE = "digital_app_title";
				public static final String DIGITAL_APP_TITLE_AR = "digital_app_title_ar";
				public static final String DIGITAL_APP_SUB_TITLE = "digital_app_sub_title";
				public static final String DIGITAL_APP_SUB_TITLE_AR = "digital_app_sub_title_ar";
				
				public static final String DIGITAL_APP_ADD_TO_CART_BACKEND_FAILURE_CODE = "0000101";
				public static final String DIGITAL_APP_ADD_TO_CART_RESPONSE_BACKEND_FAILURE_CODE = "errorcodes.VAL-00052";	
		
				public static final String EXCL_VAT_EN = "EXCL_VAT_EN";
				public static final String EXCL_VAT_AR = "EXCL_VAT_AR";
				public static final String INCL_VAT_EN = "INCL_VAT_EN";
				public static final String INCL_VAT_AR = "INCL_VAT_AR";
				public static final String ADDON_DESC_RENEWS_EN = "ADDON_DESC_RENEWS_EN";
				public static final String ADDON_DESC_RENEWS_AR = "ADDON_DESC_RENEWS_AR";
				public static final String ADDON_DESC_RENEWS_ON_EN = "ADDON_DESC_RENEWS_ON_EN";
				public static final String ADDON_DESC_RENEWS_ON_AR = "ADDON_DESC_RENEWS_ON_AR";
				public static final String IMMEDIATE_UNSUB_WARN_EN = "IMMEDIATE_UNSUB_WARN_EN";
				public static final String IMMEDIATE_UNSUB_WARN_AR = "IMMEDIATE_UNSUB_WARN_AR";
				public static final String SIM_CARD_N_EN = "SIM_CARD_N_EN";
				public static final String SIM_CARD_N_AR = "SIM_CARD_N_AR";
				public static final String ACTIVE_INCOMING_EN = "ACTIVE_INCOMING_EN";
				public static final String ACTIVE_INCOMING_AR = "ACTIVE_INCOMING_AR";
				public static final String SIM_ACTIVE_SINCE_EN = "SIM_ACTIVE_SINCE_EN";
				public static final String SIM_ACTIVE_SINCE_AR = "SIM_ACTIVE_SINCE_AR";
				public static final String ELIFE_ALLOWANCE_1_EN = "ELIFE_ALLOWANCE_1_EN";
				public static final String ELIFE_ALLOWANCE_1_AR = "ELIFE_ALLOWANCE_1_AR";

				public static final String ELIFE_ALLOWANCE_2_EN = "ELIFE_ALLOWANCE_2_EN";
				public static final String ELIFE_ALLOWANCE_2_AR = "ELIFE_ALLOWANCE_2_AR";
				
				public static final String EXIT_CHARGE_WARNING_EN = "EXIT_CHARGE_WARNING_EN";
				public static final String EXIT_CHARGE_WARNING_AR = "EXIT_CHARGE_WARNING_AR";
				
				public static final String MONTHLY_TARIFF_ALLOWANCE_EN = "MONTHLY_TARIFF_ALLOWANCE_EN";
				public static final String MONTHLY_TARIFF_ALLOWANCE_AR = "MONTHLY_TARIFF_ALLOWANCE_AR";
				
				public static final String CAP_MAX_NUMBER_OF_DEVICE_CODE = "0001153";
				
				public static final String DEFAULT_ACCOUNT_STATUS_INACTIVE_RESPONSE_EN = "DEFAULT_ACCOUNT_STATUS_INACTIVE_RESPONSE_EN";
				public static final String DEFAULT_ACCOUNT_STATUS_INACTIVE_RESPONSE_AR = "DEFAULT_ACCOUNT_STATUS_INACTIVE_RESPONSE_AR";
				public static final String PRO_RATA_DESC_EN = "PRO_RATA_DESC_EN";
				public static final String PRO_RATA_DESC_AR = "PRO_RATA_DESC_AR";

				public static final String CRM_EVALUATE_ORDER_URL = "CRM_EVALUATE_ORDER_URL";
				
				public static final String TARIFF_RATES_EN = "TARIFF_RATES_EN";
				public static final String TARIFF_RATES_AR = "TARIFF_RATES_AR";
				
				public static final String TARIFF_PAYG_EN = "TARIFF_PAYG_EN";
				public static final String TARIFF_PAYG_AR = "TARIFF_PAYG_AR";
				public static final String plansAddonsNoContract = "plansAddonsNoContract";
				public static final String plansAddonsCharges = "plansAddonsCharges";
				public static final String plansAddonsNoDeviceLinkedWithSim = "plansAddonsNoDeviceLinkedWithSim_";
				public static final String plansAddonsNoDeviceImageFound = "plansAddonsNoDeviceImageFound";
				public static final String plansAddonsTariffRatesTemplate = "plansAddonsTariffRatesTemplate_";
				public static final String plansAddonsFrequencyOneTime = "plansAddonsFrequencyOneTime";
				public static final String plansAddonsPerferredNumberWarning = "plansAddonsPerferredNumberWarning";
				public static final String plansAddonsPerferredNumberActionName = "plansAddonsPerferredNumberActionName";
				public static final String plansAddonsPerferredNumberActionNameEdit = "plansAddonsPerferredNumberActionNameEdit";
				
				public static final String plansAddonsRenewsOn = "plansAddonsRenewsOn_";
				public static final String plansAddonsVatExcluded = "plansAddonsVatExcluded";
				public static final String plansAddonUnsubscribeDesc = "plansAddonUnsubscribeDesc";
				
				public static final String THIRD_PARTY_ADDON_PRODUCT_CODE_PREFIX = "T_P_A&";
				
				public static final String ADDON_SUBBED_ON_EN = "ADDON_SUBBED_ON_EN";
				public static final String ADDON_SUBBED_ON_AR = "ADDON_SUBBED_ON_AR";
				
				public static final String GENERIC_MOBILE_APP_ERROR = "GENERIC_MOBILE_APP_ERROR";
				public static final String GENERIC_MOBILE_APP_ERROR_CALL_SYSTEM_NAME = "MOBILEAPP";
				
				public static final String REFRESHES_ON_EN = "REFRESHES_ON_EN";
				public static final String REFRESHES_ON_AR = "REFRESHES_ON_AR";
				
				public static final String TIBCO_GET_BAD_DEBIT_API = "TIBCO_GET_BAD_DEBIT_API";
												
				public static final String TIBCO_GET_SIM_DETAILS_URL = "TIBCO_GET_SIM_DETAILS_URL";
				public static final String TIBCO_VIEW_ANTI_SPAM_PROFILE_URL = "tibco_view_anti_spam_profile_url";
				public static final String TIBCO_MANAGE_ANTI_SPAM_PROFILE_URL = "tibco_manage_anti_spam_profile_url";
				public static final String ECM_GET_PRODUCT_OFFERS_URL = "lwc_get_product_offer_srvc_url";

				public static final String PERFERRED_NUMBER_SET_SECCESS_EN = "preferred_number_set_success_en";
	    		public static final String PERFERRED_NUMBER_SET_SECCESS_AR = "preferred_number_set_success_ar";
	    		

	    		
				public static final String CART_PREPAID_PLAN_ITEM = "MOBILE_PREPAID";
				public static final String CART_POSTPAID_PLAN_ITEM = "MOBILE_POSTPAID";
				public static final String TIBCO_CUSTOMER_INTRECTION_MGMT_KEY = "tibco_customer_intrection_mgmt_key";

				public static final String NEWS_DETAIL_FLAG = "NEWS_DETAIL_FLAG";
				public static final String NEW_FROM_ETISALAT_FLAG = "NEW_FROM_ETISALAT_FLAG";
				
				public static final String ETISALAT_NEW_MSHOP_MENU_ITEM_ID = "etisalat_new_mshop_menu_item_id";
				public static final String ETISALAT_NEW_MSHOP_MENU_ITEM = "etisalat_new_mshop_menu_item";
				public static final String ETISALAT_OLD_MSHOP_MENU_ITEM_ID = "etisalat_old_mshop_menu_item_id";
				public static final String TIMEOUT_ATG_MSHOP_SERVICES = "timeout_atg_mshop_services";
				public static final String DEVICES_SAMSUNG_CARE_ADDON_LABEL = "Samsung";
				public static final String DEVICES_APPLE_CARE_ADDON_LABEL = "Apple";
				public static final String POSTPAID_PLAN_CONTRACT_DURATION = "12";

				public static final String DIGITAL_APP_PARTY_SUB_TYPE = "digital_app_party_sub_type";



				
				public static final String planChangeCreditCheck2title1 = "planChangeCreditCheck2title1";
				public static final String planChangeCreditCheck3title1 = "planChangeCreditCheck3title1";
				public static final String planChangeCreditCheck2desc1 = "planChangeCreditCheck2desc1";
				public static final String planChangeCreditCheck3desc1 = "planChangeCreditCheck3desc1";
				public static final String planChangeCreditCheck3title2 = "planChangeCreditCheck3title2";
				public static final String planChangeCreditCheck3desc2 = "planChangeCreditCheck3desc2";
				public static final String planChangeMigrateMustKnowAcceptanceMessage = "planChangeMigrateMustKnowAcceptanceMessage";
				public static final String planChangeMigrateProRataInfoProratedDisclaimer = "planChangeMigrateProRataInfoProratedDisclaimer";
				public static final String planChangeMigrateProRataInfoProratedDisclaimer2 = "planChangeMigrateProRataInfoProratedDisclaimer2";
				public static final String planChangeMigrateProRataInfoProratedMessage = "planChangeMigrateProRataInfoProratedMessage";
				public static final String planChangeMigrateConsentInfoTitle = "planChangeMigrateConsentInfoTitle";
				public static final String planChangeMigrateNote = "planChangeMigrateNote";
				public static final String planChangeMigrateConsentInfoMessage = "planChangeMigrateConsentInfoMessage";
				public static final String crm_gw_customer_update = "crm_gw_customer_update";
				public static final String epg_return_path_pay_for_plan = "epg_return_path_pay_for_plan";
				public static final String DIGITAL_APP_DEVICE_CUSTOMER_CREDIT_CHECK = "digital_app_device_customer_credit_check";
				public static final String PAYMENT_GROUP_CLASS_TYPE_E_WALLET = "eWallet";
				
				public static final String DIGITAL_APP_FACE_ID_DESCRIPTION_AR = "digital_app_face_id_description_ar";
				public static final String DIGITAL_APP_FACE_ID_DESCRIPTION = "digital_app_face_id_description";
				public static final String FACIAL_RECOGNITION_RESTRICTED_CATEGORIES = "facial_recognition_restricted_categories";
				public static final String FACE_ID_IMAGE_NOT_FOUND_FROM_CRM_GW = "face_id_image_not_found_from_crm_gw";
						public static final String FACE_ID_IMAGE_NOT_FOUND_FROM_CRM_GW_AR = "face_id_image_not_found_from_crm_gw_ar";
						public static final String FACE_ID_IMAGE_NOT_SIMILAR_MESSAGE = "face_id_image_not_similar_message";
						public static final String FACE_ID_IMAGE_NOT_SIMILAR_MESSAGE_AR = "face_id_image_not_similar_message_ar";
						public static final String FACIAL_RECOGNITION_PROCESS = "facial_recognition_process";
						public static final String FACE_ID_NOTIFICATION_TITLE_AR_ADD = "face_id_notification_title_ar_add";
								public static final String FACE_ID_NOTIFICATION_TITLE_AR_DELETE = "face_id_notification_title_ar_delete";
								public static final String FACE_ID_NOTIFICATION_TITLE_AR_UPDATE = "face_id_notification_title_ar_update";
								
								public static final String FACE_ID_NOTIFICATION_TITLE_EN_ADD = "face_id_notification_title_en_add";
								public static final String FACE_ID_NOTIFICATION_TITLE_EN_DELETE = "face_id_notification_title_en_delete";
								public static final String FACE_ID_NOTIFICATION_TITLE_EN_UPDATE = "face_id_notification_title_en_update";
								
								public static final String FACE_ID_NOTIFICATION_DESC_EN_ADD = "face_id_notification_desc_en_add";
								public static final String FACE_ID_NOTIFICATION_DESC_EN_DELETE = "face_id_notification_desc_en_delete";
								public static final String FACE_ID_NOTIFICATION_DESC_EN_UPDATE = "face_id_notification_desc_en_update";
								
								public static final String FACE_ID_NOTIFICATION_DESC_AR_ADD = "face_id_notification_desc_ar_add";
								public static final String FACE_ID_NOTIFICATION_DESC_AR_DELETE = "face_id_notification_desc_ar_delete";
								public static final String FACE_ID_NOTIFICATION_DESC_AR_UPDATE = "face_id_notification_desc_ar_update";
								public static final String FACIAL_RECOGNITION_ENROLLMENT_DETAILS_URL_KYE = "facial_recognition_enrollment_details_url_kye";
								public static final String FACIAL_RECOGNITION_SIMILARITY = "facial_recognition_similarity";
								public static final String FACIAL_RECOGNITION_FULL_URL = "facial_recognition_full_url";
								public static final String FACIAL_RECOGNITION_URL_KYE = "facial_recognition_url";
								
				public static final String DIGITAL_APP_WS_ATG_CONTACT_NOT_FOUND_TEXT_EN_CONFIG_KEY = "digital_app_ws_atg_contact_not_found_text_en_config_key";
				public static final String DIGITAL_APP_WS_ATG_CONTACT_NOT_FOUND_TEXT_AR_CONFIG_KEY = "digital_app_ws_atg_contact_not_found_text_ar_config_key";
				public static final String BILL_LIMIT_LIST = "bill_limit_list_url";
				
				public static final String EXIT_CHARGES_WARNING_MESSAGE_EN = "exit_charges_warning_message_en";
				public static final String EXIT_CHARGES_WARNING_MESSAGE_AR = "exit_charges_warning_message_ar";
				public static final String EXIT_CHARGES_CANCELLATION_MESSAGE = "exit_charges_cancellation_message";
				public static final String EXIT_CHARGES_CANCELLATION_MESSAGE_AR = "exit_charges_cancellation_message_ar";
				
				public static final String RESPONSE_SUCCESS_THIRD_PARTY_STATUS = "TRANSACTION SUCCESS";
				public static final String COMPLAINT_STATUS_SERVICE_URL_CONFIG_KEY = "complaint_status_service_url_config_key";
				public static final String PROMISE_TO_PAY_ELIGIBILITY_SYSTEM_NAME = "promise_to_pay_eligibility_system_name";
				public static final String TIBCO_COLLECTION_MANAGMENT_REQUESTED_SYSTEM = "tibco_collection_managment_requested_system";
				public static final String  BILL_CUR_MON_AFTER_FIFTEEN_CONDITION_THREE_AR = "bill_cur_mon_after_fifteen_condition_three_ar";
				public static final String  BILL_CUR_MON_AFTER_FIFTEEN_CONDITION_THREE = "bill_cur_mon_after_fifteen_condition_three";
				public static final String BILL_CUR_MON_AFTER_FIFTEEN_CONDITION_SEVEN = "bill_cur_mon_after_fifteen_condition_seven";
				public static final String BILL_CUR_MON_AFTER_FIFTEEN_CONDITION_SEVEN_AR = "bill_cur_mon_after_fifteen_condition_seven_ar";
				public static final String BILL_CUR_MON_BEFORE_FIFTEEN_CONDITION_ONE_AR = "bill_cur_mon_before_fifteen_condition_one_ar";
				public static final String BILL_CUR_MON_BEFORE_FIFTEEN_CONDITION_ONE = "bill_cur_mon_before_fifteen_condition_one";
				public static final String BILL_CUR_MON_BEFORE_FIFTEEN_CONDITION_TWO_AR = "bill_cur_mon_before_fifteen_condition_two_ar";
				public static final String BILL_CUR_MON_BEFORE_FIFTEEN_CONDITION_TWO = "bill_cur_mon_before_fifteen_condition_two";
				public static final String  BILL_CUR_MON_BEFORE_FIFTEEN_CONDITION_FOUR_AR = "bill_cur_mon_before_fifteen_condition_four_ar";
				public static final String  BILL_CUR_MON_BEFORE_FIFTEEN_CONDITION_FOUR = "bill_cur_mon_before_fifteen_condition_four";
				public static final String  BILL_CUR_MON_AFTER_FIFTEEN_CONDITION_ONE_AR = "bill_cur_mon_after_fifteen_condition_one_ar";
				public static final String  BILL_CUR_MON_AFTER_FIFTEEN_CONDITION_ONE = "bill_cur_mon_after_fifteen_condition_one";
				public static final String  BILL_CUR_MON_AFTER_FIFTEEN_CONDITION_TWO_AR = "bill_cur_mon_after_fifteen_condition_two_ar";
				public static final String  BILL_CUR_MON_AFTER_FIFTEEN_CONDITION_TWO = "bill_cur_mon_after_fifteen_condition_two";
				public static final String BILL_CUR_MON_AFTER_FIFTEEN_CONDITION_SIX_AR = "bill_cur_mon_after_fifteen_condition_six_ar";
				public static final String BILL_CUR_MON_AFTER_FIFTEEN_CONDITION_SIX = "bill_cur_mon_after_fifteen_condition_six";
				public static final String  BILL_CUR_MON_AFTER_FIFTEEN_CONDITION_FOUR_AR = "bill_cur_mon_after_fifteen_condition_four_ar";
				public static final String  BILL_CUR_MON_AFTER_FIFTEEN_CONDITION_FOUR = "bill_cur_mon_after_fifteen_condition_four";
				public static final String  BILL_CUR_MON_AFTER_FIFTEEN_CONDITION_FIVE_AR = "bill_cur_mon_after_fifteen_condition_five_ar";
				public static final String  BILL_CUR_MON_AFTER_FIFTEEN_CONDITION_FIVE = "bill_cur_mon_after_fifteen_condition_five";
				public static final String  CATCH_ALL_BILL_AMOUNT_DUE = "catch_all_bill_amount_due";
				public static final String  CATCH_ALL_BILL_AMOUNT_DUE_AR = "catch_all_bill_amount_due_ar";
				public static final String TIBCO_COLLECTION_MANAGEMENT_URL = "tibco_collection_management_url";
				public static final String TIBCO_COLLECTION_MANAGEMENT_USERNAME = "tibco_collection_management_username";
				public static final String TIBCO_COLLECTION_MANAGEMENT_PASSWORD = "tibco_collection_management_password";
				public static final String EPG_GATEWAY_PAYMNT_INITIALIZATION_FLAG = "epg_gateway_paymnt_initialization_flag";
				public static final String EPG_GATEWAY_PAYMNT_INITIALIZATION_CUSTOMER = "epg_gateway_paymnt_initialization_customer";
				public static final String EPG_GATEWAY_PAYMNT_INITIALIZATION_TRANSACTION_HINT = "epg_gateway_paymnt_initialization_transaction_hint";
				public static final String EPG_GATEWAY_PAYMNT_INITIALIZATION_TERMINAL = "epg_gateway_paymnt_initialization_terminal";
				public static final String EPG_GATEWAY_PAYMNT_INITIALIZATION_STORE = "epg_gateway_paymnt_initialization_store";
				public static final String MOBILE_APP_PAYMENT_HISTORY_NO_RECORDS_FOUND_AR = "mobile_app_payment_history_no_records_found_ar";
				public static final String MOBILE_APP_PAYMENT_HISTORY_NO_RECORDS_FOUND_EN = "mobile_app_payment_history_no_records_found_en";
				public static final String DIGITAL_APP_FACE_ID_BANNER_IMAGE_URL = "digital_app_face_id_banner_image_url";
				public static final String GREEN_FRIDAY_BUTTON_TEXT = "green_friday_button_text";
				public static final String GREEN_FRIDAY_BUTTON_TEXT_AR = "green_friday_button_text_ar";
				public static final String GREEN_FRIDAY_BUTTON_COLOR = "green_friday_button_color";
				public static final String GREEN_FRIDAY_PREPAID_TEXT = "green_friday_prepaid_text";
				public static final String GREEN_FRIDAY_PREPAID_TEXT_AR = "green_friday_prepaid_text_ar";
				public static final String GREEN_FRIDAY_POSTPAID_TEXT = "green_friday_postpaid_text";
				public static final String GREEN_FRIDAY_POSTPAID_TEXT_AR = "green_friday_postpaid_text_ar";
				public static final String GREEN_FRIDAY_BANNER_COLOR= "green_friday_banner_color";
				public static final String GREEN_FRIDAY_DISCOUNT_PERCENTAGE_TEXT= "green_friday_discount_percentage_text";
				public static final String GREEN_FRIDAY_DISCOUNT_PERCENTAGE_TEXT_AR= "green_friday_discount_percentage_text_ar";
				public static final String GREEN_FRIDAY_PREPAID_LEARN_MORE_URL = "green_friday_prepaid_learn_more_url";
				public static final String GREEN_FRIDAY_PREPAID_LEARN_MORE_URL_AR = "green_friday_prepaid_learn_more_url_ar";
				public static final String GREEN_FRIDAY_POSTPAID_LEARN_MORE_URL = "green_friday_postpaid_learn_more_url";
				public static final String GREEN_FRIDAY_POSTPAID_LEARN_MORE_URL_AR = "green_friday_postpaid_learn_more_url_ar";
				public static final String GREEN_FRIDAY_ONLINE_EXCLUSIVE_AR= "green_friday_online_exclusive_ar";
				public static final String GREEN_FRIDAY_ONLINE_EXCLUSIVE= "green_friday_online_exclusive";
				public static final String GREEN_FRIDAY_ONLINE_EXCLUSIVE_COLOR= "green_friday_online_exclusive_color";
				public static final String GREEN_FRIDAY_PERCENTAGE_FOR_ALL= "green_friday_percentage_for_all";
				public static final String NETWORK_RESOURCE_MGMT_SERVICE_URL_CONFIG_KEY = "network_resource_mgmt_service_url_config_key";
				public static final String NETWORK_RESOURCE_MGMT_USERNAME_CONFIG_KEY = "network_resource_mgmt_username_config_key";
				public static final String NETWORK_RESOURCE_MGMT_PASSWORD_CONFIG_KEY = "network_resource_mgmt_password_config_key";
				public static final String NETWORK_RESOURCE_MGMT_CONFIG_KEY = "network_resource_mgmt_config_key";
				public static final String NETWORK_RESOURCE_MGMT_SYSTEM_NAME_CONFIG_KEY = "network_resource_mgmt_system_name_config_key";
				public static final String TIBCO_RESOURCEWORKFORCEMGTCUD_USERNAME = "tibco_resourceworkforcemgtcud_username";
				public static final String TIBCO_RESOURCEWORKFORCEMGTCUD_PASSWORD = "tibco_resourceworkforcemgtcud_password";
				public static final String TIBCO_RESOURCEWORKFORCEMGTCUD_REQUESTED_SYSTEM = "tibco_resourceworkforcemgtcud_requested_system";
				public static final String TIBCO_RESOURCEWORKFORCEMGTCUD_MANAGEAPPOINTMENT_URL = "tibco_resourceworkforcemgtcud_manageappointment";
				public static final String RTA_SUBMIT_OREDER_URL = "rta_submit_oreder_url";
				public static final String RTA_SUBMIT_OREDER_CHANNEL = "rta_submit_oreder_channel";
				public static final String TIBCO_RESOURCEWORKFORCEMGMTR_GET_AVAILABLE_APPOINTMENT_SLOTS_URL = "tibco_resourceworkforcemgmtr_get_available_appointment_slots_url";
				public static final String TIBCO_RESOURCEWORKFORCEMGMTR_USERNAME = "tibco_resourceworkforcemgmtr_username";
				public static final String TIBCO_RESOURCEWORKFORCEMGMTR_PASSWORD = "tibco_resourceworkforcemgmtr_password";
				public static final String TIBCO_RESOURCEWORKFORCEMGMTR_REQUESTED_SYSTEM = "tibco_resourceworkforcemgmtr_requested_system";
				public static final String TIB_WFMS_AB_ERROR  = "0010002";
				public static final String NO_AVAILABLE_APPOINTMENT_SLOTS = "no_available_appointment_slots";
				public static final String NO_AVAILABLE_APPOINTMENT_SLOTS_AR = "no_available_appointment_slots_ar";
				public static final String TIBCO_RESOURCEINVENTORYMGTCUD_MANAGERESOURCE_URL = "tibco_resourceinventorymgtcud_manageresource_url";
				public static final String TIBCO_RESOURCE_INVENTORY_MGTCUD_REQUESTED_SYSTEM = "tibco_resource_inventory_mgtcud_requested_system";
				public static final String TIBCO_RESOURCE_INVENTORY_MGTCUD_USERNAME = "tibco_resource_inventory_mgtcud_username";
				public static final String TIBCO_RESOURCE_INVENTORY_MGTCUD_PASSWORD = "tibco_resource_inventory_mgtcud_password";
				public static final String RTA_PROCESS_REQUEST_URL = "rta_process_request_url";
				public static final String TIBCO_MANAGE_RESOURCE_LOCK_NUMBER_URL = "tibco_manage_resource_lock_number_url";
				public static final String HOME_MOVE_AR = "home_move_ar";
				public static final String HOME_MOVE_EN = "home_move_en";
				public static final String HOME_MOVE_CHANNEL_CIM = "home_move_channel_cim";
				public static final String HOME_MOVE_CHANNEL_ETISALAT_APP = "home_move_channel_etisalat_app";
				public static final String HOME_MOVE_CHANNEL_DOOR_2_DOOR = "home_move_channel_door_2_door";
				
				public static final String ETISALAT_ADVISOR = "etisalat_advisor";
				public static final String ETISALAT_ADVISOR_AR = "etisalat_advisor_ar";
				public static final String MY_ETISALAT_APP = "my_etisalat_app";
				public static final String MY_ETISALAT_APP_AR = "my_etisalat_app_ar";
				public static final String ETISALAT_FLEET = "etisalat_fleet";
				public static final String ETISALAT_FLEET_AR = "etisalat_fleet_ar";
				public static final String ANA_EMARATI_PLANS_CAT = "ANA_EMARATI_PLANS_CAT";
		public static final String LOYALTY_MEMBER_ACTIVATE_SMILES_URL = "LOYALTY_MEMBER_ACTIVATE_SMILES_URL";
		public static final String LOYALTY_ACTIVATE_SMILES_TIME_OUT = "activate_smiles_api_timeout";
			
				public static final String CRM_MODIFY_SUBSCRIPTION_URL = "CRM_MODIFY_SUBSCRIPTION_URL";
				public static final String VMASS_URL = "VMASS_URL";
				public static final String POSTPAID_CLONE_SIM_PRODUCT_CODE = "POSTPAID_CLONE_SIM_PRODUCT_CODE";
				public static final String PREPAID_CLONE_SIM_PRODUCT_CODE = "PREPAID_CLONE_SIM_PRODUCT_CODE";
				public static final String PHYSICAL_SIM_DISCLAIMER_HEADER = "PHYSICAL_SIM_DISCLAIMER_HEADER";
				public static final String PHYSICAL_SIM_DISCLAIMER_HEADER_AR = "PHYSICAL_SIM_DISCLAIMER_HEADER_AR";
				public static final String PHYSICAL_SIM_DISCLAIMER_BODY = "PHYSICAL_SIM_DISCLAIMER_BODY";
				public static final String PHYSICAL_SIM_DISCLAIMER_BODY_AR = "PHYSICAL_SIM_DISCLAIMER_BODY_AR";
				public static final String ESIM_DISCLAIMER_HEADER = "ESIM_DISCLAIMER_HEADER";
				public static final String ESIM_DISCLAIMER_HEADER_AR = "ESIM_DISCLAIMER_HEADER_AR";
				public static final String ESIM_DISCLAIMER_BODY = "ESIM_DISCLAIMER_BODY";
				public static final String ESIM_DISCLAIMER_BODY_AR = "ESIM_DISCLAIMER_BODY_AR";
				public static final String SIM_PAYMENT_SERVLET = "SIM_PAYMENT_SERVLET";
				public static final String SIM_SIC_1 = "SIM_SIC_1";
				public static final String SIM_SIC_2 = "SIM_SIC_2";
				public static final String SIM_PAYMENT_ERROR_EN = "SIM_PAYMENT_ERROR_EN";
				public static final String SIM_PAYMENT_ERROR_AR = "SIM_PAYMENT_ERROR_AR";
				public static final String SIM_PENDING_ORDER_ERROR_EN = "SIM_PENDING_ORDER_ERROR_EN";
				public static final String SIM_PENDING_ORDER_ERROR_AR = "SIM_PENDING_ORDER_ERROR_AR";
				public static final String SIM_BALANCE_ERROR_EN = "SIM_BALANCE_ERROR_EN";
				public static final String SIM_BALANCE_ERROR_AR = "SIM_BALANCE_ERROR_AR";
				public static final String ESIM_TO_ANOTHER_DEVICE_SUCCESS_MSG = "ESIM_TO_ANOTHER_DEVICE_SUCCESS_MSG";
				public static final String ESIM_TO_ANOTHER_DEVICE_SUCCESS_MSG_AR = "ESIM_TO_ANOTHER_DEVICE_SUCCESS_MSG_AR";
				public static final String SIM_BAD_DEBT_ERROR_EN = "SIM_BAD_DEBT_ERROR_EN";
				public static final String SIM_BAD_DEBT_ERROR_AR = "SIM_BAD_DEBT_ERROR_AR";
				public static final String SIM_EID_ERROR_EN = "SIM_EID_ERROR_EN";
				public static final String SIM_EID_ERROR_AR = "SIM_EID_ERROR_AR";
				public static final String SIM_REQUEST_ERROR_EN = "SIM_REQUEST_ERROR_EN";
				public static final String SIM_REQUEST_ERROR_AR = "SIM_REQUEST_ERROR_AR";
				public static final String HEADER_PARAM_SMDP_ADDRESS = "smdpAddress";
				public static final String HEADER_PARAM_MATCHING_ID = "matchingId";
				public static final String ATG_GET_CREDIT_FACILITY_ADVANCE_PAYMENT_FLAG = "atg_get_credit_facility_advance_payment_flag";
				public static final String DIGITAL_APP_DELETE_FROM_CART = "digital_app_delete_from_cart";
				public static final String DIGITAL_APP_DELETE_FROM_CART_AR = "digital_app_delete_from_cart_ar";				
				public static final String GREEN_FRIDAY_ONLINE_ONLY_FLAG= "green_friday_online_only_flag";
				public static final String planChangeMigratePrepaidBalanceCat2 = "planChangeMigratePrepaidBalanceCat2";
				public static final String planChangeMigratePrepaidBalanceCat3 = "planChangeMigratePrepaidBalanceCat3";
				public static final String planChangeMigratePrepaidBalanceCat5 = "planChangeMigratePrepaidBalanceCat5";
				public static final String planChangeMigrateRCB2 = "planChangeMigrateRCB2";
				public static final String planChangeMigrateRCB3 = "planChangeMigrateRCB3";
				public static final String planChangeMigrateINCA5 = "planChangeMigrateINCA5";
				public static final String planChangeMigrateCA4 = "planChangeMigrateCA4";
				public static final String planChangeMigrateEC6 = "planChangeMigrateEC6";
				
				//Recharge History CR
				
				public static final String RECHARGE_HISTORY_URL = "tibco_recharge_history_url";
				public static final String RECHARGE_HISTORY_REQUESTED_SYSTEM = "tibco_recharge_history_req_system";
				public static final String RECHARGE_HISTORY_CREDENTIALS = "recharge_history_credentials";
				public static final String LOYALTY_ACTIVATE_SMILES_FEATURE_FLAG = "loyalty_activate_smiles_feature_flag";

				
				//Interim Design CR
				public static final Integer PAGE_VERION_WHATS_NEW = 1;
				public static final Integer PAGE_VERION_WHATS_Improved = 2;
				public static final String ATG_UPDATE_ACCOUNT_DETAILS_URL = "atg_update_account_details_url";

				public static final String ENABLE_SIM_CARD_ACTIONS = "ENABLE_SIM_CARD_ACTIONS";
				public static final String ENABLE_ESIM_FEATURES = "ENABLE_ESIM_FEATURES";
				public static final String CSS_CANCEL_BASKET_REST_URL = "CSS_CANCEL_BASKET_REST_URL";
				
				//quick access changes
				public static final String DIGITAL_APP_ACCOUNT_DETAILS_NOT_FOUND_RESPONSE_CODE = "0012000";
				public static final String DIGITAL_APP_ELIF_ACCOUNT_DETAILS_NOT_FOUND_RESPONSE_CODE = "0001003";
				public static final String DIGITAL_APP_GENERATE_OTP_MULTIPLE_FAILED_ATTEMPTS_RESPONSE_CODE = "0011000";
				public static final String kofax_get_eid_details_url = "kofax_get_eid_details_url";
				public static final String TIMEOUT_ATG_GET_KOFAX_IN_SECOND = "timeout_atg_get_kofax_in_second";

				public static final String atg_reset_password_url = "atg_reset_password_url";
				public static final String atg_get_user_name_url = "atg_get_user_name_url";
				public static final String TIMEOUT_ATG_ACCOUNTS_IN_SECOND = "timeout_atg_accounts_in_second";
				public static final String TIMEOUT_ATG_RETRIVE_CUSTOMER_IN_SECOND = "timeout_atg_retrive_customer_in_second";
				public static final String TIMEOUT_ATG_INDIVIDUAL_LOG_IN_SECOND = "timeout_atg_individual_log_in_second";
				public static final String TIMEOUT_ATG_EQUAVALANT_POINT_IN_SECOND = "timeout_atg_equavalant_point_in_second";
				
				public static final String DIGITAL_APP_VALIDATE_SECURITY_PIN = "0011100";
				String SERVICE_TYPE_DATA = "Data";
				String SERVICE_SUB_TYPE_DATA = "Local";
				String RTF_SHORT_DATE_TIME_FORMAT = "dd-MM-yyyy HH:mm:ss";// dd-MM-yyyy
				String RTF_RENEWAL_CHANNEL = "RTF_RENEWAL_CHANNEL";
				String RTF_RENEWAL_USER_ID = "RTF_RENEWAL_USER_ID";
				String CORRELATION_PREFIX = "0.";
				String RTF_RENEWAL_ORIGINATOR = "RTF_RENEWAL_ORIGINATOR"; 
				String ELIFE_INPROGRESS_CONTRACT_TYPE = "RENEWAL";
				String ELIFE_INPROGRESS_CONTRACT_STATUS = "OPEN";
				String CRM_GW_RETRIEVE_ORDER_URL = "CRM_GW_RETRIEVE_ORDER_URL";
				long ONE_WEEK_INTEGER = 7L;
				String MOBILE_CONTRACT_RENEWAL_NOTIFICATION_TITLE_EN = "MOBILE_CONTRACT_RENEWAL_NOTIFICATION_TITLE_EN";
				String MOBILE_CONTRACT_RENEWAL_NOTIFICATION_TITLE_AR = "MOBILE_CONTRACT_RENEWAL_NOTIFICATION_TITLE_AR";
				String MOBILE_CONTRACT_RENEWAL_NOTIFICATION_EN = "MOBILE_CONTRACT_RENEWAL_NOTIFICATION_EN";
				String MOBILE_CONTRACT_RENEWAL_NOTIFICATION_AR = "MOBILE_CONTRACT_RENEWAL_NOTIFICATION_AR";
				String PACKAGE_TEMPLATE = "{{package}}";
				String ACCOUNT_NUMBER_TEMPLATE = "{{account_number}}";
				String CONTRACT_END_DATE_TEMPLATE = "{{contract_end_date}}";
				String ELIFE_RENEWAL_NOITIFICATION_DATE_FORMAT = "dd.MM.yyyy";
				String CONTRACT_RENEWAL_NOTIFICATION_ACTION_EN = "CONTRACT_RENEWAL_NOTIFICATION_ACTION_EN";
				String CONTRACT_RENEWAL_NOTIFICATION_ACTION_AR = "CONTRACT_RENEWAL_NOTIFICATION_ACTION_AR";
				String CONTRACT_END_DATE_FORMAT = "yyyy/MM/dd HH:mm:ss";
				String RENEWAL_NOITIFICATION_DATE_FORMAT = "MM dd, yyyy";
				String RENEW_PLAN_ACTION_ID = "RENEW_PLAN";
				
				public static final String ATG_GET_INSURANCE_ON_DEMAND_GENERATE_TOKEN = "atg_get_insurance_on_demand_generate_token";
				public static final String ATG_GET_INSURANCE_ON_DEMAND_AUTHENTICATE_TOKEN = "atg_get_insurance_on_demand_authenticate_token";
				public static final String ATG_GET_INSURANCE_ON_DEMAND_REDIRECT_URL = "atg_get_insurance_on_demand_redirect_url";
				public static final String INSURANCE_ON_TITLE = "insurance_on_title";
				public static final String INSURANCE_ON_TITLE_AR = "insurance_on_title_ar";
				public static final String INSURANCE_ON_SUB_TITLE = "insurance_on_sub_title";
				public static final String INSURANCE_ON_SUB_TITLE_AR = "insurance_on_sub_title_ar";
				public static final String DIGITAL_APP_PENDING_REGISTRATION_RESPONSE_CODE = "0001190";
				public static final String DIGITAL_APP_PENDING_REGISTRATION = "digital_app_pending_registration";
				public static final String DIGITAL_APP_PENDING_REGISTRATION_AR = "digital_app_pending_registration_ar";
				public static final String RE_REGISTRATION_PENDING_REQUEST_STATUS = "re_registration_pending_request_status";
				public static final String RE_REGISTRATION_PENDING_REQUEST_STATUS_AR = "re_registration_pending_request_status_ar";
				public static final String RE_REGISTRATION_LEND_ME_BALANCE = "re_registration_lend_me_balance";
				public static final String TIBCO_LEND_ME_BALANCE_RESERVE_CREDIT = "0002002";
				public static final String TIBCO_LEND_ME_BALANCE_RESERVE_CREDIT_MESSAGE = "tibco_lend_me_balance_reserve_credit_message";
				public static final String TIBCO_LEND_ME_BALANCE_RESERVE_CREDIT_MESSAGE_AR = "tibco_lend_me_balance_reserve_credit_message_ar";
				public static final String DIGITAL_APP_EID_NOT_MATCHED="digital_app_eid_not_matched";
				public static final String DIGITAL_APP_EID_NOT_MATCHED_AR="digital_app_eid_not_matched_ar";
				public static final String TIBCO_RESOURCE_LEND_ME_BALANCE_CONFIG_KEY = "tibco_resource_lend_me_balance_config_key";

				String ELIFE_CONTRACT_RENEWAL_NOTIFICATION_TITLE_EN = "ELIFE_CONTRACT_RENEWAL_NOTIFICATION_TITLE_EN";
				String ELIFE_CONTRACT_RENEWAL_NOTIFICATION_TITLE_AR = "ELIFE_CONTRACT_RENEWAL_NOTIFICATION_TITLE_AR";
				String ELIFE_CONTRACT_RENEWAL_NOTIFICATION_EN = "ELIFE_CONTRACT_RENEWAL_NOTIFICATION_EN";
				String ELIFE_CONTRACT_RENEWAL_NOTIFICATION_AR = "ELIFE_CONTRACT_RENEWAL_NOTIFICATION_AR";
				String ELIFE_INPROGRESS_NOTIFICATION_TITLE_EN = "ELIFE_INPROGRESS_NOTIFICATION_TITLE_EN";
				String ELIFE_INPROGRESS_NOTIFICATION_TITLE_AR = "ELIFE_INPROGRESS_NOTIFICATION_TITLE_AR";

				String ELIFE_INPROGRESS_NOTIFICATION_EN = "ELIFE_INPROGRESS_NOTIFICATION_EN";
				String ELIFE_INPROGRESS_NOTIFICATION_AR = "ELIFE_INPROGRESS_NOTIFICATION_AR";
				String RENEW_DATE_TEMPLATE = "{{renew_date}}";
				String CONTRACT_CANCELLED_SUCCESS_EN = "CONTRACT_CANCELLED_SUCCESS_EN";
				String CONTRACT_CANCELLED_SUCCESS_AR = "CONTRACT_CANCELLED_SUCCESS_AR";
				String RTF_SUCCESS_STATUS = "SUCCESS";
				String RTF_SUCCESS_CODE = "SC-00000";
				public static final String NETWORK_LOGGING_PERIOD_SEC = "NETWORK_LOGGING_PERIOD_SEC";
				
				public static final String PAYMENT_AND_CHARGES_START_PROCESS_URL = "payment_and_charges_start_process_url";
				public static final String PAYMENT_AND_CHARGES_NAVIGATE_PROCESS_URL = "payment_and_charges_navigate_process_url";
				public static final String TIBCO_CREATE_COMPLAIN_URL="TIBCO_CREATE_COMPLAIN_URL";
				public static final String FAILOVER_COMPLAIN_NATURE_CODE="FAILOVER_COMPLAIN_NATURE_CODE";
				public static final String FAILOVER_COMPLAIN_TYPE_CODE="FAILOVER_COMPLAIN_TYPE_CODE";
				public static final String TIBCO_CREATE_COMPLAIN_DESC="TIBCO_CREATE_COMPLAIN_DESC";
				public static final String RETRIEVE_ORDERS_ENDPOINT_URL = "retrieve_orders_endpoint_url";
				public static final String CLOSING_RESERVED_CREDIT_BALANCE_EN="closing_reserved_credit_balance_en";
				public static final String CLOSING_RESERVED_CREDIT_BALANCE_AR="closing_reserved_credit_balance_ar";
				public static final String OUT_OF_CREDIT_CALL_SERVICE_EN="out_of_credit_call_service_en";
				public static final String OUT_OF_CREDIT_CALL_SERVICE_AR="out_of_credit_call_service_ar";
				public static final String WEB_CALL_BACK_URL = "web_call_back_url";
				public static final String EDMS_DOWNLOADED_EDMS_DOCUMENT_URL = "edms_downloaded_edms_document_url";
				public static final String TOP_ARTICLE_LIST_URL = "top_article_list_url";
				public static final String HELP_TOPIC_LIST_URL = "help_topic_list_url";
				public static final String FAQ_LIST_URL = "faq_list_url";
				public static final String SHOP_CONTENTS_LIST_URL = "shop_contents_list_url";
				public static final String CHILD_LIST_URL = "child_list_url";
				public static final String CHILD_LIST_ARTICLES_URL = "child_list_articles_url";
				public static final String HELP_ARTICLE_RELATED_INFO_URL = "help_article_related_info_url";
				public static final String CFM_SUBMIT_FAQ_FEEDBACK_URL = "cfm_submit_faq_feedback_url";
				public static final String ETISALAT_URL = "etisalat_url";
				public static final String ELIFE_CONTRACT_RENEWAL_ENABLE = "elife_contract_renewal_enable";
				
				//elife_service_check_username_url
				public static final String ELIFE_CHANGE_PLANS_SERVICE_CHECK_USERNAME_URL = "elife_change_plans_service_check_username_url";
				
				//elife_service_location_info_url
				public static final String ELIFE_CHANGE_PLANS_SERVICE_LOCATION_INFO_URL = "elife_change_plans_service_location_info_url";
				//elife_service_add_to_cart_url
				public static final String ELIFE_CHANGE_PLANS_SERVICE_ADD_TO_CART_URL = "elife_change_plans_service_add_to_cart_url";
				//elife_service_delete_shipping_group_url
				public static final String ELIFE_CHANGE_PLANS_SERVICE_DELETE_SHIPPING_GROUP_URL = "elife_change_plans_service_delete_shipping_group_url";
				//elife_service_create_shipping_group_url
				public static final String ELIFE_CHANGE_PLANS_SERVICE_CREATE_SHIPPING_GROUP_URL = "elife_change_plans_service_create_shipping_group_url";
				//elife_service_relate_shipping_group_url
				public static final String ELIFE_CHANGE_PLANS_SERVICE_RELATE_SHIPPING_GROUP_URL = "elife_change_plans_service_relate_shipping_group_url";
				//elife_service_update_shipping_group_url
				public static final String ELIFE_CHANGE_PLANS_SERVICE_UPDATE_SHIPPING_GROUP_URL = "elife_change_plans_service_update_shipping_group_url";
				//elife_service_get_shipping_methods_url
				public static final String ELIFE_CHANGE_PLANS_SERVICE_GET_SHIPPING_METHODS_URL = "elife_change_plans_service_get_shipping_methods_url";
				//elife_installation_promo
				public static final String ELIFE_CHANGE_PLANS_INSTALLATION_PROMO = "elife_change_plans_installation_promo";
				//elife_free_installation_txt
				public static final String ELIFE_CHANGE_PLANS_FREE_INSTALLATION_TXT = "elife_change_plans_free_installation_txt";
				//elife_standard_inst_lbl_2
				public static final String ELIFE_CHANGE_PLANS_STANDARD_INST_LBL_2 = "elife_change_plans_standard_inst_lbl_2";
				//elife_standard_inst_lbl_2_ar
				public static final String ELIFE_CHANGE_PLANS_STANDARD_INST_LBL_2_AR = "elife_change_plans_standard_inst_lbl_2_ar";
				//elife_express_inst_lbl_2
				public static final String ELIFE_CHANGE_PLANS_EXPRESS_INST_LBL_2 = "elife_change_plans_express_inst_lbl_2";
				//elife_express_inst_lbl_2_ar
				public static final String ELIFE_CHANGE_PLANS_EXPRESS_INST_LBL_2_AR = "elife_change_plans_express_inst_lbl_2_ar";
				//elife_express_inst_monthly_lbl_2
				public static final String ELIFE_CHANGE_PLANS_EXPRESS_INST_MONTHLY_LBL_2 = "elife_change_plans_express_inst_monthly_lbl_2";
				//elife_express_inst_monthly_lbl_2_ar
				public static final String ELIFE_CHANGE_PLANS_EXPRESS_INST_MONTHLY_LBL_2_AR = "elife_change_plans_express_inst_monthly_lbl_2_ar";
				//elife_free_installation_txt_ar
				public static final String ELIFE_CHANGE_PLANS_FREE_INSTALLATION_TXT_AR = "elife_change_plans_free_installation_txt_ar";
				
				//plans_prepaid_banner_url
				public static final String ELIFE_CHANGE_PLANS_PREPAID_BANNER_URL = "elife_change_plans_prepaid_banner_url";
				//plans_prepaid_banner_url_ar
				public static final String ELIFE_CHANGE_PLANS_PREPAID_BANNER_URL_AR = "elife_change_plans_prepaid_banner_url_ar";
				//plans_prepaid_banner_title
				public static final String ELIFE_CHANGE_PLANS_PREPAID_BANNER_TITLE = "elife_change_plans_prepaid_banner_title";
				//plans_prepaid_banner_title_ar
				public static final String ELIFE_CHANGE_PLANS_PREPAID_BANNER_TITLE_AR = "elife_change_plans_prepaid_banner_title_ar";
				//plans_prepaid_banner_desc
				public static final String ELIFE_CHANGE_PLANS_PREPAID_BANNER_DESC = "elife_change_plans_prepaid_banner_desc";
				//plans_prepaid_banner_desc_ar
				public static final String ELIFE_CHANGE_PLANS_PREPAID_BANNER_DESC_AR = "elife_change_plans_prepaid_banner_desc_ar";
				//plans_postpaid_free_act_banner_url
				public static final String ELIFE_CHANGE_PLANS_POSTPAID_FREE_ACT_BANNER_URL = "elife_change_plans_postpaid_free_act_banner_url";
				//plans_postpaid_free_act_banner_url_ar
				public static final String ELIFE_CHANGE_PLANS_POSTPAID_FREE_ACT_BANNER_URL_AR = "elife_change_plans_postpaid_free_act_banner_url_ar";
				//plans_postpaid_free_act_banner_title
				public static final String ELIFE_CHANGE_PLANS_POSTPAID_FREE_ACT_BANNER_TITLE = "elife_change_plans_postpaid_free_act_banner_title";
				//plans_postpaid_free_act_banner_title_ar
				public static final String ELIFE_CHANGE_PLANS_POSTPAID_FREE_ACT_BANNER_TITLE_AR = "elife_change_plans_postpaid_free_act_banner_title_ar";
				//plans_postpaid_free_act_banner_desc
				public static final String ELIFE_CHANGE_PLANS_POSTPAID_FREE_ACT_BANNER_DESC = "elife_change_plans_postpaid_free_act_banner_desc";
				//plans_postpaid_free_act_banner_desc_ar
				public static final String ELIFE_CHANGE_PLANS_POSTPAID_FREE_ACT_BANNER_DESC_AR = "elife_change_plans_postpaid_free_act_banner_desc_ar";
				//generic_cart_banner_url
				public static final String ELIFE_CHANGE_PLANS_GENERIC_CART_BANNER_URL = "elife_change_plans_generic_cart_banner_url";
				//generic_cart_banner_url_ar
				public static final String ELIFE_CHANGE_PLANS_GENERIC_CART_BANNER_URL_AR = "elife_change_plans_generic_cart_banner_url_ar";
				//generic_cart_banner_title
				public static final String ELIFE_CHANGE_PLANS_GENERIC_CART_BANNER_TITLE = "elife_change_plans_generic_cart_banner_title";
				//generic_cart_banner_title_ar
				public static final String ELIFE_CHANGE_PLANS_GENERIC_CART_BANNER_TITLE_AR = "elife_change_plans_generic_cart_banner_title_ar";
				//generic_cart_banner_desc
				public static final String ELIFE_CHANGE_PLANS_GENERIC_CART_BANNER_DESC = "elife_change_plans_generic_cart_banner_desc";
				//generic_cart_banner_desc_ar
				public static final String ELIFE_CHANGE_PLANS_GENERIC_CART_BANNER_DESC_AR = "elife_change_plans_generic_cart_banner_desc_ar";
				//cart_delivery_method_label_charges_ar
				public static final String ELIFE_CHANGE_PLANS_CART_DELIVERY_METHOD_LABEL_CHARGES_AR = "elife_change_plans_cart_delivery_method_label_charges_ar";
				//cart_delivery_method_label_description_ar
				public static final String ELIFE_CHANGE_PLANS_CART_DELIVERY_METHOD_LABEL_DESCRIPTION_AR = "elife_change_plans_cart_delivery_method_label_description_ar";
				//cart_delivery_method_label_title_ar
				public static final String ELIFE_CHANGE_PLANS_CART_DELIVERY_METHOD_LABEL_TITLE_AR = "elife_change_plans_cart_delivery_method_label_title_ar";
				//cart_delivery_method_label_charges
				public static final String ELIFE_CHANGE_PLANS_CART_DELIVERY_METHOD_LABEL_CHARGES = "elife_change_plans_cart_delivery_method_label_charges";
				//cart_delivery_method_label_description
				public static final String ELIFE_CHANGE_PLANS_CART_DELIVERY_METHOD_LABEL_DESCRIPTION = "elife_change_plans_cart_delivery_method_label_description";
				//cart_delivery_method_label_title
				public static final String ELIFE_CHANGE_PLANS_CART_DELIVERY_METHOD_LABEL_TITLE = "elife_change_plans_cart_delivery_method_label_title";
				
				//Cart Constants
				public static final String ELIFE_CHANGE_PLANS_ATG_GET_CART_URL = "elife_change_plans_atg_get_cart_url";
				public static final String ELIFE_CHANGE_PLANS_ATG_GET_CART_NOTIFICATIONS_URL = "elife_change_plans_ATG_GET_CART_NOTIFICATIONS_URL";
				//atg_devices_product_url
				public static final String ELIFE_CHANGE_PLANS_ATG_DEVICES_PRODUCT_URL = "elife_change_plans_atg_devices_product_url";
				public static final String ELIFE_CHANGE_PLANS_ATG_DEVICES_SKU_URL = "elife_change_plans_atg_devices_sku_url";
				
				//devices_pre_order_title_ar
				public static final String ELIFE_CHANGE_PLANS_DEVICES_PRE_ORDER_TITLE_AR = "elife_change_plans_devices_pre_order_title_ar";
				//devices_pre_order_title
				public static final String ELIFE_CHANGE_PLANS_DEVICES_PRE_ORDER_TITLE = "elife_change_plans_devices_pre_order_title";
				//devices_pre_order_subtitle_ar
				public static final String ELIFE_CHANGE_PLANS_DEVICES_PRE_ORDER_SUBTITLE_AR = "elife_change_plans_devices_pre_order_subtitle_ar";
				//devices_pre_order_subtitle
				public static final String ELIFE_CHANGE_PLANS_DEVICES_PRE_ORDER_SUBTITLE = "elife_change_plans_devices_pre_order_subtitle";
				//fee_waiver_charges_text_ar
				public static final String ELIFE_CHANGE_PLANS_FEE_WAIVER_CHARGES_TEXT_AR = "elife_change_plans_fee_waiver_charges_text_ar";
				//fee_waiver_charges_text
				public static final String ELIFE_CHANGE_PLANS_FEE_WAIVER_CHARGES_TEXT = "elife_change_plans_fee_waiver_charges_text";
				//ATG_DEVICE_PER_ORDER_QUANTITY_LIMIT
				public static final String ELIFE_CHANGE_PLANS_ATG_DEVICE_PER_ORDER_QUANTITY_LIMIT = "elife_change_plans_atg_device_per_order_quantity_limit";
				//devices_cart_payment_method_cod
				public static final String ELIFE_CHANGE_PLANS_DEVICES_CART_PAYMENT_METHOD_COD = "elife_change_plans_devices_cart_payment_method_cod";
				//devices_cart_reservation_time_ar
				public static final String ELIFE_CHANGE_PLANS_DEVICES_CART_RESERVATION_TIME_AR = "elife_change_plans_devices_cart_reservation_time_ar";
				//devices_cart_reservation_time
				public static final String ELIFE_CHANGE_PLANS_DEVICES_CART_RESERVATION_TIME = "elife_change_plans_devices_cart_reservation_time";
				//cart_vat_info_label_ar
				public static final String ELIFE_CHANGE_PLANS_CART_VAT_INFO_LABEL_AR = "elife_change_plans_cart_vat_info_label_ar";
				//cart_vat_info_label
				public static final String ELIFE_CHANGE_PLANS_CART_VAT_INFO_LABEL = "elife_change_plans_cart_vat_info_label";
				//cart_total_vat_info_label_ar
				public static final String ELIFE_CHANGE_PLANS_CART_TOTAL_VAT_INFO_LABEL_AR = "elife_change_plans_cart_total_vat_info_label_ar";
				//cart_total_vat_info_label
				public static final String ELIFE_CHANGE_PLANS_CART_TOTAL_VAT_INFO_LABEL = "elife_change_plans_cart_total_vat_info_label";
				//cart_vat_mix_info_label_ar
				public static final String ELIFE_CHANGE_PLANS_CART_VAT_MIX_INFO_LABEL_AR = "elife_change_plans_cart_vat_mix_info_label_ar";
				//cart_vat_mix_info_label
				public static final String ELIFE_CHANGE_PLANS_CART_VAT_MIX_INFO_LABEL = "elife_change_plans_cart_vat_mix_info_label";
				//cart_vat_excluded_info_label_ar
				public static final String ELIFE_CHANGE_PLANS_CART_VAT_EXCLUDED_INFO_LABEL_AR = "elife_change_plans_cart_vat_excluded_info_label_ar";
				//cart_vat_excluded_info_label
				public static final String ELIFE_CHANGE_PLANS_CART_VAT_EXCLUDED_INFO_LABEL = "elife_change_plans_cart_vat_excluded_info_label";
				//cart_vat_total_excluded_info_label_ar
				public static final String ELIFE_CHANGE_PLANS_CART_VAT_TOTAL_EXCLUDED_INFO_LABEL_AR = "elife_change_plans_cart_vat_total_excluded_info_label_ar";
				//cart_vat_total_excluded_info_label
				public static final String ELIFE_CHANGE_PLANS_CART_VAT_TOTAL_EXCLUDED_INFO_LABEL = "elife_change_plans_cart_vat_total_excluded_info_label";
					
				// eLife change Plans
				public static final String ELIFE_CHANGE_PLANS_SERVICE_LOCATION_URL = "elife_change_plans_service_location_url";
				public static final String ELIFE_CHANGE_PLANS_SERVICE_GET_PLANS_URL = "elife_change_plans_service_get_plans_url";
				
				
				//public static final String ELIFE_CHANGE_PLANS_FREE_INSTALLATION_TEXT = "elife_free_installation_text";
				//public static final String ELIFE_CHANGE_PLANS_NETWORK_TYPE_GPON = "elife_network_type_gpon";
				//public static final String ELIFE_CHANGE_PLANS_NETWORK_TYPE_BITSTREAM = "elife_network_type_bitstream";
				//public static final String ELIFE_CHANGE_PLANS_OTHER_PACKAGES_CATEGORY = "elife_other_packages_category";
				
				//public static final String ELIFE_CHANGE_PLANS_NON_REACHABLE_LOCATION_TEXT = "elife_non_reachable_location_text";
				public static final String ELIFE_CHANGE_PLANS_NON_REACHABLE_LOCATION_TEXT = "elife_change_plans_non_reachable_location_text";
				
				//public static final String ELIFE_CHANGE_PLANS_NON_REACHABLE_LOCATION_TEXT_AR = "elife_non_reachable_location_text_ar";
				public static final String ELIFE_CHANGE_PLANS_NON_REACHABLE_LOCATION_TEXT_AR = "elife_change_plans_non_reachable_location_text_ar";
				//elife_technology_codes_gpon
				public static final String ELIFE_CHANGE_PLANS_TECHNOLOGY_CODES_GPON = "elife_change_plans_technology_codes_gpon";
				//elife_technology_codes_bitstream
				public static final String ELIFE_CHANGE_PLANS_TECHNOLOGY_CODES_BITSTREAM = "elife_change_plans_technology_codes_bitstream";
				//elife_technology_codes_non
				public static final String ELIFE_CHANGE_PLANS_TECHNOLOGY_CODES_NON = "elife_change_plans_technology_codes_non";
				//elife_endeca_enable_filter
				public static final String ELIFE_CHANGE_PLANS_ENDECA_ENABLE_FILTER = "elife_change_plans_endeca_enable_filter";
				//elife_plan_view_channels_flag
				public static final String ELIFE_CHANGEPLANS_PLAN_VIEW_CHANNELS_FLAG = "elife_changeplans_plan_view_channels_flag";
				//elife_common_lc_base_url
				public static final String ELIFE_CHANGE_PLANS_COMMON_LC_BASE_URL = "elife_change_plans_common_lc_base_url";
				//elife_url_channel
				public static final String ELIFE_CHANGE_PLANS_URL_CHANNEL = "elife_change_plans_url_channel";
				//elife_promo_card_url
				public static final String ELIFE_CHANGE_PLANS_PROMO_CARD_URL = "elife_change_plans_promo_card_url";
				//elife_promo_card_url_ar
				public static final String ELIFE_CHANGE_PLANS_PROMO_CARD_URL_AR = "elife_change_plans_promo_card_url_ar";
				//elife_promo_card_exc_txt
				public static final String ELIFE_CHANGE_PLANS_PROMO_CARD_EXC_TXT = "elife_change_plans_promo_card_exc_txt";
				//elife_promo_card_exc_txt_ar
				public static final String ELIFE_CHANGE_PLANS_PROMO_CARD_EXC_TXT_AR = "elife_change_plans_promo_card_exc_txt_ar";
				//elife_promo_card_title
				public static final String ELIFE_CHANGE_PLANS_PROMO_CARD_TITLE = "elife_change_plans_promo_card_title";
				//elife_promo_card_title_ar
				public static final String ELIFE_CHANGE_PLANS_PROMO_CARD_TITLE_AR = "elife_change_plans_promo_card_title_ar";
				//elife_promo_card_desc
				public static final String ELIFE_CHANGE_PLANS_PROMO_CARD_DESC = "elife_change_plans_promo_card_desc";
				//elife_promo_card_desc_ar
				public static final String ELIFE_CHANGE_PLANS_PROMO_CARD_DESC_AR = "elife_change_plans_promo_card_desc_ar";
				//elife_promo_card_price
				public static final String ELIFE_CHANGE_PLANS_PROMO_CARD_PRICE = "elife_change_plans_promo_card_price";
				
				public static final String ELIFE_CHANGE_PLANS_CURRENT_TAB_TITLE1_EN = "elife_change_plans_current_tab_title1_en";
				public static final String ELIFE_CHANGE_PLANS_CURRENT_TAB_TITLE1_AR = "elife_change_plans_current_tab_title1_ar";
				public static final String ELIFE_CHANGE_PLANS_CURRENT_TAB_TITLE2_EN = "elife_change_plans_current_tab_title2_en";
				public static final String ELIFE_CHANGE_PLANS_CURRENT_TAB_TITLE2_AR = "elife_change_plans_current_tab_title2_ar";
				
				public static final String ELIFE_CHANGE_PLANS_CURRENT_TAB_BULLET1_EN = "elife_change_plans_current_tab_bullet1_en";
				public static final String ELIFE_CHANGE_PLANS_CURRENT_TAB_BULLET1_AR = "elife_change_plans_current_tab_bullet1_ar";
				public static final String ELIFE_CHANGE_PLANS_CURRENT_TAB_BULLET2_EN = "elife_change_plans_current_tab_bullet2_en";
				public static final String ELIFE_CHANGE_PLANS_CURRENT_TAB_BULLET2_AR = "elife_change_plans_current_tab_bullet2_ar";
				public static final String ELIFE_CHANGE_PLANS_GENERAL_TAB_BULLET1_EN = "elife_change_plans_general_tab_bullet1_en";
				public static final String ELIFE_CHANGE_PLANS_GENERAL_TAB_BULLET1_AR = "elife_change_plans_general_tab_bullet1_ar";
				public static final String ELIFE_CHANGE_PLANS_PROMO_CARD_PRICE_AR = "elife_change_plans_promo_card_price_ar";
				public static final String DIGITAL_APP_WS_CHANGE_PLAN_LEAD_RESPONSE_CODE = "0010001";
				public static final String DIGITAL_APP_WS_CHANGE_PLAN_NOT_ALLOWED = "0010010";
				public static final String ENABLE_PAY_LATER = "ENABLE_PAY_LATER";
			
				public static final String ELIFE_SMART_HOME_MONITORING_CATEGORY_ID = "elife_smart_home_monitoring_category_id";
				public static final String ELIFE_SMART_HOME_COMFORT_CATEGORY_ID = "elife_smart_home_comfort_category_id";
				public static final String ATG_SKU_DETAILS_BY_ID_URL = "atg_sku_details_by_id_url";
				String ATG_GET_TERMSANDCONDITION_URL = "atg_get_termsandconditions_url";
				String CPR_TYPE = "CPRType";
				
				public static final String INSURANCE_ON_DEMAND_ENABLE_FLAG= "insurance_on_demand_enable_flag";
				public static final String ATG_MSHOP_SMART_PAY_BANNER_FLAG = "atg_mshop_smart_pay_banner_flag";

				public static final String PAYMENT_OPTION_BANK_TRANSFER = "payment_option_bank_transfer";
				public static final String PAYMENT_OPTION_BANK_TRANSFER_AR = "payment_option_bank_transfer_ar";
				public static final Integer PAYMENT_OPTION_BANK_CODE = 10;
				public static final String BANK_TRANSFER_STORE_NAME_CONFIG_KEY= "bank_transfer_store_name_config_key"; //
				public static final String BANK_TRANSFER_TERMINAL_CONFIG_KEY= "bank_transfer_terminal_config_key"; //
				public static final String BANK_TRANSFER_CUSTOMER_CONFIG_KEY= "bank_transfer_customer_config_key";
				public static final String PAY_FOR_DEVICE_BANK_TRANSFER_OPTION = "10";
				public static final String PAYMENT_GROUP_CLASS_TYPE_BANK_TRANSFER = "payment_group_class_type_bank_transfer";
				public static final String TRACKING_BANK_TRANSFER_PARAMETER = "isBankTransfer";
				public static final String BANK_TRANSFER_CODE = "3491";
				public static final String PAYMENT_OPTION_BANK_TRANSFER_SUB_TITLE = "payment_option_bank_transfer_sub_title";
				public static final String PAYMENT_OPTION_BANK_TRANSFER_SUB_TITLE_AR = "payment_option_bank_transfer_sub_title_ar";
				
				public static final String DISABLE_LOG_FILE_BE_SERVICE_FUNCTIONALITY_FLAG = "disable_log_file_be_service_functionality_flag";
				public static final String DISABLE_LOG_FILE_BE_SERVICE_NAME_LIST = "disable_log_file_be_service_name_list";
				public static final String DISABLE_LOG_DB_FE_SERVICE_FUNCTIONALITY_FLAG = "disable_log_db_fe_service_functionality_flag";
				public static final String DISABLE_LOG_DB_FE_SERVICE_NAME_LIST = "disable_log_db_fe_service_name_list";		
				public static final String DISABLE_LOG_DB_BE_SERVICE_FUNCTIONALITY_FLAG = "disable_log_db_be_service_functionality_flag";
				public static final String DISABLE_LOG_DB_BE_SERVICE_NAME_LIST = "disable_log_db_be_service_name_list";
				public static final String DISABLE_LOG_FILE_FE_SERVICE_FUNCTIONALITY_FLAG = "disable_log_file_fe_service_functionality_flag";
				public static final String DISABLE_LOG_FILE_FE_SERVICE_NAME_LIST = "disable_log_file_fe_service_name_list";
				String LANGUAGE = "Language";
				
				public static final String UPSELLING_BENEFIT_1_ICON = "UPSELLING_BENEFIT_1_ICON";
				public static final String UPSELLING_BENEFIT_1_NAME_EN = "UPSELLING_BENEFIT_1_NAME_EN";
				public static final String UPSELLING_BENEFIT_1_NAME_AR = "UPSELLING_BENEFIT_1_NAME_AR";
				public static final String UPSELLING_BENEFIT_1_DESC_EN = "UPSELLING_BENEFIT_1_DESC_EN";
				public static final String UPSELLING_BENEFIT_1_DESC_AR = "UPSELLING_BENEFIT_1_DESC_AR";
				public static final String UPSELLING_BENEFIT_2_ICON = "UPSELLING_BENEFIT_2_ICON";
				public static final String UPSELLING_BENEFIT_2_NAME_EN = "UPSELLING_BENEFIT_2_NAME_EN";
				public static final String UPSELLING_BENEFIT_2_NAME_AR = "UPSELLING_BENEFIT_2_NAME_AR";
				public static final String UPSELLING_BENEFIT_2_DESC_EN = "UPSELLING_BENEFIT_2_DESC_EN";
				public static final String UPSELLING_BENEFIT_2_DESC_AR = "UPSELLING_BENEFIT_2_DESC_AR";
				public static final String UPSELLING_BENEFIT_3_ICON = "UPSELLING_BENEFIT_3_ICON";
				public static final String UPSELLING_BENEFIT_3_NAME_EN = "UPSELLING_BENEFIT_3_NAME_EN";
				public static final String UPSELLING_BENEFIT_3_NAME_AR = "UPSELLING_BENEFIT_3_NAME_AR";
				public static final String UPSELLING_BENEFIT_3_DESC_EN = "UPSELLING_BENEFIT_3_DESC_EN";
				public static final String UPSELLING_BENEFIT_3_DESC_AR = "UPSELLING_BENEFIT_3_DESC_AR";
				public static final String UPSELLING_BENEFIT_4_ICON = "UPSELLING_BENEFIT_4_ICON";
				public static final String UPSELLING_BENEFIT_4_NAME_EN = "UPSELLING_BENEFIT_4_NAME_EN";
				public static final String UPSELLING_BENEFIT_4_NAME_AR = "UPSELLING_BENEFIT_4_NAME_AR";
				public static final String UPSELLING_BENEFIT_4_DESC_EN = "UPSELLING_BENEFIT_4_DESC_EN";
				public static final String UPSELLING_BENEFIT_4_DESC_AR = "UPSELLING_BENEFIT_4_DESC_AR";
				public static final String UPSELLING_FLAG_ICON = "UPSELLING_FLAG_ICON";
				public static final String UPSELLING_TITLE_EN = "UPSELLING_TITLE_EN";
				public static final String UPSELLING_TITLE_AR = "UPSELLING_TITLE_AR";
				public static final String UPSELLING_SUBTITLE_EN = "UPSELLING_SUBTITLE_EN";
				public static final String UPSELLING_SUBTITLE_AR = "UPSELLING_SUBTITLE_AR";
				public static final String SMILES_BANNER_IMAGE = "SMILES_BANNER_IMAGE";
				public static final String SMILES_BANNER_TITLE_EN = "SMILES_BANNER_TITLE_EN";
				public static final String SMILES_BANNER_TITLE_AR = "SMILES_BANNER_TITLE_AR";
				public static final String SMILES_BANNER_SUBTITLE_EN = "SMILES_BANNER_SUBTITLE_EN";
				public static final String SMILES_BANNER_SUBTITLE_AR = "SMILES_BANNER_SUBTITLE_AR";
				public static final String SMILES_BANNER_DESC_EN = "SMILES_BANNER_DESC_EN";
				public static final String SMILES_BANNER_DESC_AR = "SMILES_BANNER_DESC_AR";
				public static final String SMILES_BANNER_TEXT_EN = "SMILES_BANNER_TEXT_EN";
				public static final String SMILES_BANNER_TEXT_AR = "SMILES_BANNER_TEXT_AR";
				public static final String SMILES_BANNER_ICON = "SMILES_BANNER_ICON";
				public static final String PRIVILEGE_CARD_DETAILED_BENEFIT_1_BANNER_EN = "PRIVILEGE_CARD_DETAILED_BENEFIT_1_BANNER_EN";
				public static final String PRIVILEGE_CARD_DETAILED_BENEFIT_1_BANNER_AR = "PRIVILEGE_CARD_DETAILED_BENEFIT_1_BANNER_AR";
				public static final String PRIVILEGE_CARD_DETAILED_BENEFIT_1_ICON = "PRIVILEGE_CARD_DETAILED_BENEFIT_1_ICON";
				public static final String PRIVILEGE_CARD_DETAILED_BENEFIT_1_TITLE_EN = "PRIVILEGE_CARD_DETAILED_BENEFIT_1_TITLE_EN";
				public static final String PRIVILEGE_CARD_DETAILED_BENEFIT_1_TITLE_AR = "PRIVILEGE_CARD_DETAILED_BENEFIT_1_TITLE_AR";
				public static final String PRIVILEGE_CARD_DETAILED_BENEFIT_1_DESC_EN = "PRIVILEGE_CARD_DETAILED_BENEFIT_1_DESC_EN";
				public static final String PRIVILEGE_CARD_DETAILED_BENEFIT_1_DESC_AR = "PRIVILEGE_CARD_DETAILED_BENEFIT_1_DESC_AR";
				public static final String PRIVILEGE_CARD_DETAILED_BENEFIT_2_BANNER_EN = "PRIVILEGE_CARD_DETAILED_BENEFIT_2_BANNER_EN";
				public static final String PRIVILEGE_CARD_DETAILED_BENEFIT_2_BANNER_AR = "PRIVILEGE_CARD_DETAILED_BENEFIT_2_BANNER_AR";
				public static final String PRIVILEGE_CARD_DETAILED_BENEFIT_2_ICON = "PRIVILEGE_CARD_DETAILED_BENEFIT_2_ICON";
				public static final String PRIVILEGE_CARD_DETAILED_BENEFIT_2_TITLE_EN = "PRIVILEGE_CARD_DETAILED_BENEFIT_2_TITLE_EN";
				public static final String PRIVILEGE_CARD_DETAILED_BENEFIT_2_TITLE_AR = "PRIVILEGE_CARD_DETAILED_BENEFIT_2_TITLE_AR";
				public static final String PRIVILEGE_CARD_DETAILED_BENEFIT_2_DESC_EN = "PRIVILEGE_CARD_DETAILED_BENEFIT_2_DESC_EN";
				public static final String PRIVILEGE_CARD_DETAILED_BENEFIT_2_DESC_AR = "PRIVILEGE_CARD_DETAILED_BENEFIT_2_DESC_AR";
				public static final String PRIVILEGE_1_ICON = "PRIVILEGE_1_ICON";
				public static final String PRIVILEGE_1_TITLE_EN = "PRIVILEGE_1_TITLE_EN";
				public static final String PRIVILEGE_1_TITLE_AR = "PRIVILEGE_1_TITLE_AR";
				public static final String PRIVILEGE_2_ICON = "PRIVILEGE_2_ICON";
				public static final String PRIVILEGE_2_TITLE_EN = "PRIVILEGE_2_TITLE_EN";
				public static final String PRIVILEGE_2_TITLE_AR = "PRIVILEGE_2_TITLE_AR";
				public static final String PRIVILEGE_3_ICON = "PRIVILEGE_3_ICON";
				public static final String PRIVILEGE_3_TITLE_EN = "PRIVILEGE_3_TITLE_EN";
				public static final String PRIVILEGE_3_TITLE_AR = "PRIVILEGE_3_TITLE_AR";
				public static final String PRIVILEGE_4_ICON = "PRIVILEGE_4_ICON";
				public static final String PRIVILEGE_4_TITLE_EN = "PRIVILEGE_4_TITLE_EN";
				public static final String PRIVILEGE_4_TITLE_AR = "PRIVILEGE_4_TITLE_AR";
				public static final String PRIVILEGE_5_ICON = "PRIVILEGE_5_ICON";
				public static final String PRIVILEGE_5_TITLE_EN = "PRIVILEGE_5_TITLE_EN";
				public static final String PRIVILEGE_5_TITLE_AR = "PRIVILEGE_5_TITLE_AR";
				public static final String PRIVILEGE_6_ICON = "PRIVILEGE_6_ICON";
				public static final String PRIVILEGE_6_TITLE_EN = "PRIVILEGE_6_TITLE_EN";
				public static final String PRIVILEGE_6_TITLE_AR = "PRIVILEGE_6_TITLE_AR";
				public static final String PRIVILEGE_CARD_DISCLAIMER_EN = "PRIVILEGE_CARD_DISCLAIMER_EN";
				public static final String PRIVILEGE_CARD_DISCLAIMER_AR = "PRIVILEGE_CARD_DISCLAIMER_AR";
				public static final String PRIVILEGE_CARD_TITLE_EN = "PRIVILEGE_CARD_TITLE_EN";
				public static final String PRIVILEGE_CARD_TITLE_AR = "PRIVILEGE_CARD_TITLE_AR";
				public static final String PRIVILEGE_CARD_SUBTITLE_EN = "PRIVILEGE_CARD_SUBTITLE_EN";
				public static final String PRIVILEGE_CARD_SUBTITLE_AR = "PRIVILEGE_CARD_SUBTITLE_AR";
				public static final String PRIVILEGE_CARD_BUTTON_EN = "PRIVILEGE_CARD_BUTTON_EN";
				public static final String PRIVILEGE_CARD_BUTTON_AR = "PRIVILEGE_CARD_BUTTON_AR";
				
				public static final String MUST_KNOW_ADDED_POINTS_EN = "MUST_KNOW_ADDED_POINTS_EN";
				public static final String MUST_KNOW_ADDED_POINTS_AR = "MUST_KNOW_ADDED_POINTS_AR";
				public static final String MUST_KNOW_DEDUCTED_POINTS_EN = "MUST_KNOW_DEDUCTED_POINTS_EN";
				public static final String MUST_KNOW_DEDUCTED_POINTS_AR = "MUST_KNOW_DEDUCTED_POINTS_AR";
				public static final String MUST_KNOW_DEDUCTED_AMOUNT_EN = "MUST_KNOW_DEDUCTED_AMOUNT_EN";
				public static final String MUST_KNOW_DEDUCTED_AMOUNT_AR = "MUST_KNOW_DEDUCTED_AMOUNT_AR";
				public static final String ATG_GET_RECOMMENDAION_URL = "atg_get_recommendaion_url";
				public static final String PAYMENT_OPTION_BANK_TRANSFER_ENABLE = "payment_option_bank_transfer_enable";
				public static final String CFM_SUBMIT_SURVEY_API_KEY = "cfm_submit_survey_api_key";
				public static final String ELIFE_SHOP_TITLE = "elife_shop_title";
				public static final String ELIFE_SHOP_TITLE_AR = "elife_shop_title_ar";
				public static final String ELIFE_SHOP_DESCRIPTION = "elife_shop_description";
				public static final String ELIFE_SHOP_DESCRIPTION_AR = "elife_shop_description_ar";
				
				public static final String ELIFE_CHANGE_PLANS_GRID_LABELS_URL = "elife_change_plans_grid_labels_url";
				
				public static final Integer MAX_MULTI_SIMS = 4;

				public static final String WEB_CALL_BACK_USERNAME = "web_call_back_username";
				public static final String WEB_CALL_BACK_PASSWORD = "web_call_back_password";
				public static final String CALL_BACK_REQUEST_EXISTS = "CALL_BACK_REQUEST_EXISTS";
				public static final String CALL_BACK_REQUEST_EXISTS_MSG_EN = "call_back_request_exist_msg_en";
				public static final String CALL_BACK_REQUEST_EXISTS_MSG_AR = "call_back_request_exist_msg_ar";
				public static final String CALL_BACK_REQUEST_SUCCESS_MSG_EN = "call_back_success_msg_en";
				public static final String CALL_BACK_REQUEST_SUCCESS_MSG_AR = "call_back_success_msg_ar";
				
				
				public static final String AED_EN = "aed_en";
				public static final String AED_AR = "aed_ar";
				public static final String ATG_GET_PASSES_URL = "ATG_GET_PASSES_URL";				
				public static final String QR_DESCRIPTION_EN = "qr_description_en";
				public static final String QR_DESCRIPTION_AR = "qr_description_ar";			
				String ELIFE = "eLife" ;
				String LANDLINE = "landline" ;
				String RTF_USER_ID = "RTF_USER_ID";
				public static final String GET_PROFILE_INFORMATION_URL = "get_profile_information_url";
				public static final String PROFILE_MANAGEMENT_CHANGE_PSWD = "profile_management_change_pswd";
				String ATG_PROFILE_PICTURE_URL = "atg_profile_picture_url";
				String ATG_ACCOUNT_PICTURE_URL = "atg_account_picture_url";
				public static final String PROFILE_MANAGEMENT_GET_ACCOUNT_PICTURE = "profile_management_get_account_picture";
				String ATG_PROFILE_MANAGEMENT_URL = "atg_profile_management_url";
				public static final String ATG_ACTIVATE_SUBSCRIPTION_URL = "ATG_ACTIVATE_SUBSCRIPTION_URL";
				public static final String SHOP_BY_PROPERTY = "shop_by_property";
				public static final String AUTO_SUGGEST_SERVICE = "auto_suggest_service";
				
		    	/*Sim Replacement -  OTP*/
		    	public static final String OTP_MAX_ATTEMPTS = "otp_max_attempts";
		    	public static final String OTP_TIME_INTERVAL = "otp_time_interval";
		    	public static final String GENERATE_OTP_URL = "generate_otp_url";
		    	public static final String VERIFY_OTP_URL = "verify_otp_url";
		    	public static final String OTP_EXPIRY_DURATION = "5";
		    	public static final String DIGITAL_APP_OTP_INVALID_ERROR_CODE = "0001020";
		    	public static final String DIGITAL_APP_OTP_HAS_EXPIRED_ERROR_CODE = "0001021";
		    	public static final String OTP_HAS_EXPIRED_MSG_AR = "انتهت صلاحية كلمة المرور لمرة واحدة";
		    	public static final String INVALID_OTP_MSG_AR = "OTP لا يتطابق";
		    	

		    	
		    	
				public static final String CNS_DEVICE_TOKEN_DEREGISTRATION_END_POINT = "cns_device_token_deRegistration_end_point";
				public static final String DIGITALAPP = "DIGITALAPP";
				
		    	public static final String ATG_GUIDED_SEARCH_SERVICE_URL = "atg_guided_search_service_url";
		    	public static final String AUTO_SUGGEST_COUNT = "auto_suggest_count";
		    	
//				Search Enhancement 
				public static final String DIGITAL_APP_SEARCH_ENHANCEMENT_IF_SEARCH_DID_NOT_RETURN_RESULT_EN = "search_did_not_return_result_only_suggested_en";
				public static final String DIGITAL_APP_SEARCH_ENHANCEMENT_IF_SEARCH_DID_NOT_RETURN_RESULT_AR = "search_did_not_return_result_only_suggested_ar";
				public static final String DIGITAL_APP_SEARCH_ENHANCEMENT_IF_SEARCH_KEY_WRONG_RESULT_EN = "searched_no_result_no_suggestion_en";
				public static final String DIGITAL_APP_SEARCH_ENHANCEMENT_IF_SEARCH_KEY_WRONG_RESULT_AR = "searched_no_result_no_suggestion_ar";
				public static final String DIGITAL_APP_SEARCH_ENHANCEMENT_IF_SEARCH_KEY_EMPTY_RESULT_EN = "search_with_empty_key_en";
				public static final String DIGITAL_APP_SEARCH_ENHANCEMENT_IF_SEARCH_KEY_EMPTY_RESULT_AR = "search_with_empty_key_ar";
				
				public static final String DIGITAL_APP_AMAZON_PRIME_ICON_URL = "amazon_prime_icon_url";
				public static final String DIGITAL_APP_AMAZON_PRIME_ACCOUNT_ACTIVATION_DETAILS_EN = "amazon_prime_my_plan_benefits_account_activation_en";
				public static final String DIGITAL_APP_AMAZON_PRIME_ACCOUNT_ACTIVATION_DETAILS_AR = "amazon_prime_my_plan_benefits_account_activation_ar";
				public static final String DIGITAL_APP_AMAZON_PRIME_MY_PLAN_BENEFIT_DESCRIPTION_EN = "amazon_prime_my_plan_benefits_description_en";
				public static final String DIGITAL_APP_AMAZON_PRIME_MY_PLAN_BENEFIT_DESCRIPTION_AR = "amazon_prime_my_plan_benefits_description_ar";
				public static final String DIGITAL_APP_AMAZON_PRIME_MY_PLAN_BENEFIT_DESCRIPTION_DETAILS_EN = "amazon_prime_my_plan_benefits_description_en";
				public static final String DIGITAL_APP_AMAZON_PRIME_MY_PLAN_BENEFIT_DESCRIPTION_DETAILS_AR = "amazon_prime_my_plan_benefits_description_ar";
				
				public static final String DIGITAL_APP_AMAZON_PRIME_STATIC_TILE_LINK_EN = "digital_app_amazon_prime_tile_link_en";
				public static final String DIGITAL_APP_AMAZON_PRIME_STATIC_TILE_LINK_AR = "digital_app_amazon_prime_tile_link_ar";
				public static final String DIGITAL_APP_AMAZON_PRIME_TILE_SUB_HEADING_EN = "digital_app_amazon_prime_tile_sub_heading_en";
				public static final String DIGITAL_APP_AMAZON_PRIME_TILE_SUB_HEADING_AR = "digital_app_amazon_prime_tile_sub_heading_ar";
				
				public static final String DIGITAL_APP_AMAZON_PRIME_SETUP_DETAILS_SUB_HEADING_EN = "digital_app_amazon_prime_setup_details_sub_heading_en";
				public static final String DIGITAL_APP_AMAZON_PRIME_SETUP_DETAILS_SUB_HEADING_AR = "digital_app_amazon_prime_setup_details_sub_heading_ar";
				public static final String DIGITAL_APP_AMAZON_PRIME_BENEFIT_DETAILS_SETUP_DESCIPTION_EN = "digital_app_amazon_prime_benefit_detail_setup_desciption_en";
				public static final String DIGITAL_APP_AMAZON_PRIME_BENEFIT_DETAILS_SETUP_DESCIPTION_AR = "digital_app_amazon_prime_benefit_detail_setup_desciption_ar";
				public static final String DIGITAL_APP_AMAZON_PRIME_BENEFIT_DETAILS_TITLE_EN = "DIGITAL_APP_AMAZON_PRIME_BENEFIT_DETAILS_TITLE_EN";
				public static final String DIGITAL_APP_AMAZON_PRIME_BENEFIT_DETAILS_TITLE_AR = "DIGITAL_APP_AMAZON_PRIME_BENEFIT_DETAILS_TITLE_AR";

				public static final String DIGITAL_APP_AMAZON_PRIME_BENEFIT_DETAILS_NON_SETUP_SUB_HEADING_EN = "digital_app_amazon_prime_benefit_details_non_setup_sub_heading_en";
				public static final String DIGITAL_APP_AMAZON_PRIME_BENEFIT_DETAILS_NON_SETUP_SUB_HEADING_AR = "digital_app_amazon_prime_benefit_details_non_setup_sub_heading_ar";
				public static final String DIGITAL_APP_AMAZON_PRIME_BENEFIT_DETAILS_NON_SETUP_DESCIPTION_EN = "digital_app_amazon_prime_benefit_details_non_setup_desciption_en";
				public static final String DIGITAL_APP_AMAZON_PRIME_BENEFIT_DETAILS_NON_SETUP_DESCIPTION_AR = "digital_app_amazon_prime_benefit_details_non_setup_desciption_ar";
				
				public static final String RTF_COMS_ERROR_RESPONSE_CODE = "COMS-00001";
				public static final String RTF_COMS_ERROR_MSG_SUB_RESPONSE = "Already Subscribed";
				public static final String RTF_COMS_ERROR_MSG_DEACTIVATE_RESPONSE = "Already Deactivated";
				
				//international card recharge
				public static final String EPG_RECHARGE_ALLOWED_FOR_INTERNATIONAL_CARD_CONFIG_KEY = "epg_recharge_allowed_for_international_card_config_key";
				public static final String EPG_CURTOMER_NAME_CONFIG_KEY_FOR_INTERNATIONAL_CARD_RECHARGE = "epg_curtomer_name_config_key_for_international_card_recharge";
				public static final String EPG_STORE_NAME_CONFIG_KEY_FOR_INTERNATIONAL_CARD_RECHARGE = "epg_store_name_config_key_for_international_card_recharge";
				public static final String EPG_TERMINAL_NAME_CONFIG_KEY_FOR_INTERNATIONAL_CARD_RECHARGE = "epg_terminal_name_config_key_for_international_card_recharge";
								
				public static final String DIGITAL_APP_UNABLE_TO_LOGIN_MSG_EN = "unable_to_login_error_msg_en";
				public static final String DIGITAL_APP_UNABLE_TO_LOGIN_MSG_AR = "unable_to_login_error_msg_ar";		
				
				public static final String ATG_VALIDATE_RE_REGISTRATION_FAILED_ERROR_CODE = "BIOMETRIC_VERIFICATION_ERROR";
				
				public static final String DIGITAL_APP_VALIDATE_RE_REGISTRATION_EXCEPTION_RESPONSE_CODE = "0011003";
				public static final String VALIDATE_RE_REGISTRATION_FAILED_ERROR_MSG_AR = "VALIDATE_RE_REGISTRATION_FAILED_ERROR_MSG_AR";
				public static final String VALIDATE_RE_REGISTRATION_FAILED_ERROR_MSG = "VALIDATE_RE_REGISTRATION_FAILED_ERROR_MSG";
				public static final String VALIDATE_RE_REGISTRATION_FAILED_ERROR_TITLE_AR = "VALIDATE_RE_REGISTRATION_FAILED_ERROR_TITLE_AR";
				public static final String VALIDATE_RE_REGISTRATION_FAILED_ERROR_TITLE = "VALIDATE_RE_REGISTRATION_FAILED_ERROR_TITLE";
				public static final String ATG_GET_AVAILABLE_SHIPPING_METHODS_URL = "ATG_GET_AVAILABLE_SHIPPING_METHODS_URL";
				public static final String ATG_AVAILABLE_SHIPPING_METHODS_TIMEOUT = "ATG_AVAILABLE_SHIPPING_METHODS_TIMEOUT";
				
				public static final String ATG_SHIPPING_METHOD_EXPRESS = "ATG_SHIPPING_METHOD_EXPRESS";
				public static final String ATG_SHIPPING_METHOD_SAME_DAY = "ATG_SHIPPING_METHOD_SAME_DAY";
				public static final String ATG_SHIPPING_METHOD_STANDARD = "ATG_SHIPPING_METHOD_STANDARD";
				public static final String ATG_SHIPPING_METHOD_BULLET = "ATG_SHIPPING_METHOD_BULLET";
				
				public static final String ATG_REMOVE_COUPON_URL = "ATG_REMOVE_COUPON_URL";
			
				public static final String RTF_CC_INVALID_ERROR_CODE = "CBCM-00002";
		    	public static final String CREDIT_LIMIT_UPDATE_UNABLE_TO_PROCEED_EN = "credit_limit_update_unable_to_proceed_en";
		    	public static final String CREDIT_LIMIT_UPDATE_UNABLE_TO_PROCEED_AR = "credit_limit_update_unable_to_proceed_ar";
		    	public static final String CREDIT_LIMIT_UPDATE_SUCCESS_EN = "credit_limit_update_success_en";
		    	public static final String CREDIT_LIMIT_UPDATE_SUCCESS_AR = "credit_limit_update_success_ar";
				public static final String VERIFY_HOME_CACHING = "verify_home_caching";
				public static final String PROMO_LABEL_COLOR_CONSTANT = "PROMO_LABEL_COLOR_CONSTANT";
				public static final String GREEN_FRIDAY_COLOR_CONSTANT = "GREEN_FRIDAY_COLOR_CONSTANT";
				public static final String PROMO_LABEL_DEFAULT_EN = "PROMO_LABEL_DEFAULT_EN";
				public static final String PROMO_LABEL_DEFAULT_AR = "PROMO_LABEL_DEFAULT_AR";
				public static final String TIBCO_USAGE_INQUIRY_SERVICE_PERMITS_PER_SEC_PER_NODE = "TIBCO_USAGE_INQUIRY_SERVICE_PERMITS_PER_SEC_PER_NODE";
				public static final String TIBCO_USAGE_INQUIRY_SERVICE_PERMITS_TIMEOUT_MILLISEC = "TIBCO_USAGE_INQUIRY_SERVICE_PERMITS_TIMEOUT_MILLISEC";
				public static final String TIBCO_USAGE_INQUIRY_SERVICE_THROTTLING_FLAG = "TIBCO_USAGE_INQUIRY_SERVICE_THROTTLING_FLAG";
				public static final String TIBCO_USAGE_INQUIRY_SERVICE_URL = "TIBCO_USAGE_INQUIRY_SERVICE_URL";

				public static final String PROMO_TAG_DEFAULT_EN = "PROMO_TAG_DEFAULT_EN";
				public static final String PROMO_TAG_DEFAULT_AR = "PROMO_TAG_DEFAULT_AR";
				

				public static final String DIGITAL_APP_DEEZER_SUB_TITLE_EN = "digital_app_deezer_sub_title_en";
				public static final String DIGITAL_APP_DEEZER_SUB_TITLE_AR = "digital_app_deezer_sub_title_ar";
				public static final String DIGITAL_APP_DEEZER_ADDON_DESCRIPTION_EN = "digital_app_deezer_addon_description_en";
				public static final String DIGITAL_APP_DEEZER_ADDON_DESCRIPTION_AR = "digital_app_deezer_addon_description_ar";
				public static final String DIGITAL_APP_DEEZER_STATIC_CONTENT_EN = "digital_app_deezer_static_content_en";
				public static final String DIGITAL_APP_DEEZER_STATIC_CONTENT_AR = "digital_app_deezer_static_content_ar";

				
				//auto pay
				String EPG_REGISTRATION_CUSTOMER = "EPG_REGISTRATION_CUSTOMER";
				String EPG_REGISTRATION_ORDERNAME = "EPG_REGISTRATION_ORDERNAME";
				String EPG_REGISTRATION_USERNAME = "EPG_REGISTRATION_USERNAME";
				String EPG_REGISTRATION_PASSWORD = "EPG_REGISTRATION_PASSWORD";
				String EPG_REGISTRATION_STORE = "EPG_REGISTRATION_STORE";
				String EPG_REGISTRATION_TERMINAL = "EPG_REGISTRATION_TERMINAL";
				String EPG_REGISTRATION_TRANSACTION_HINT = "EPG_REGISTRATION_TRANSACTION_HINT";
				String EPG_REGISTRATION_FINALIZATION_URL= "EPG_REGISTRATION_FINALIZATION_URL"; 
				String RECHARGE = "Recharge";
				String EPG_REGISTRATION_OPERATION = "operation";
				String EPG_REGISTRATION_OPERATION_ADD = "ADD";
				String EPG_REGISTRATION_OPERATION_ADD_UPDATE = "ADD_UPDATE";
				String EPG_REGISTRATION_OPERATION_UPDATE = "UPDATE";
				String EPG_REGISTRATION_NOTIFICATION_MOBILE_NUMBER = "notificationMobileNumber";
				String EPG_REGISTRATION_EMAIL = "email";
				String PARTY_ID = "partyId";
				String PAYMENT_METHOD_ID = "paymentMethodId";
				String PAY_BILL = "PayBill";
				String AUTOPAY_START_DATE_FORMAT = "yyyy/MM/dd HH:mm:ss";
				String AUTOPAY_EXPIRY_DATE_FORMAT = "MM/yy";
				int LEVEL = 3;
				String PAYMENT_METHOD_PROCESS_CODE = "PAYMENT_METHOD";
				String RTF_AUTOPAY_CHANNEL = "RTF_AUTOPAY_CHANNEL";
				String RTF_AUTOPAY_USER_ID = "RTF_AUTOPAY_USER_ID";
				String EPG_FINALIZATION_DATE_FORMAT = "MM/dd/yyyy";
				String RTF_DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";// dd-MM-yyyy
				String PAYMENT_GW_REFERENCE_ID = "paymentGWReferenceId";
				String EPG_NEW_AUTOPAY_REGISTRATION_FINALIZATION_URL = "EPG_NEW_AUTOPAY_REGISTRATION_FINALIZATION_URL";
				String AUTOPAY_CONSUMER = "AUTOPAY_CONSUMER";
				String AUTOPAY_TYPE = "autopayType";
				String THRESHHOLD_AMOUNT ="thresholdAmount";
				String PREFERRED_PAYMENT_DATE ="preferredPaymentDate";
				String AMOUNT ="amount";
				String START_DATE ="startDate";
				String UPDATE = "UPDATE";
				String CC_NAME = "ccName";
				String AUTOPAY_UPDATE_NOT_ALLOWED_EN = "AUTOPAY_UPDATE_NOT_ALLOWED_EN";
				String AUTOPAY_UPDATE_NOT_ALLOWED_AR = "AUTOPAY_UPDATE_NOT_ALLOWED_AR";
				String AUTOPAY_DISABLE_NOT_ALLOWED_EN = "AUTOPAY_DISABLE_NOT_ALLOWED_EN";
				String AUTOPAY_DISABLE_NOT_ALLOWED_AR = "AUTOPAY_DISABLE_NOT_ALLOWED_AR";
				boolean DOWNWARD = true;
				public static final String AUTOPAY_UPDATE_ERROR_ON_PAYMENT_DAY_EN = "AUTOPAY_UPDATE_ERROR_ON_PAYMENT_DAY_EN";
				public static final String AUTOPAY_UPDATE_ERROR_ON_PAYMENT_DAY_AR = "AUTOPAY_UPDATE_ERROR_ON_PAYMENT_DAY_AR";
				String AUTOPAY_ENABLED_EN = "autopay_enable_en";
				String AUTOPAY_ENABLED_AR = "autopay_enable_ar";
				String AUTOPAY_DISABLED_EN = "autopay_disabled_en";
				String AUTOPAY_DISABLED_AR = "autopay_disabled_ar";
				String AUTORECHARGE_DISABLED_EN = "autorecharge_disabled_en";
				String AUTORECHARGE_DISABLED_AR = "autocharge_disabled_ar";
				public static final String AUTOPAY_DROPDOWN_VAL = "autopay_dropdown_val";
				String SMARTPAY_DATE_FORMAT = "MMM yyyy";
				String DAY_LABEL = "{{day}}";
				String AUTOPAY_SETUP_FOR_LABEL_EN = "autopay_setup_for_label_en";
				String AUTOPAY_SETUP_FOR_LABEL_AR = "autopay_setup_for_label_ar";
				String FULL_AMOUNT_LABEL_EN = "full_amount_label_en";
				String FULL_AMOUNT_LABEL_AR = "full_amount_label_ar";
				String AMOUNT_UPTO_LABEL_EN = "amount_upto_label_en";
				String AMOUNT_UPTO_LABEL_AR = "amount_upto_label_ar";
				String SCHEDULED_ON_TEXT_EN = "scheduled_on_text_en";
				String SCHEDULED_ON_TEXT_AR = "scheduled_on_text_ar";
				String AUTORECHARGE_SET_FOR_LABEL_EN = "autorecharge_set_for_label_en";
				String AUTORECHARGE_SET_FOR_LABEL_AR = "autorecharge_set_for_label_ar";
				String DAY_OF_WEEK_TEXT_EN = "day_of_week_text_en";
				String DAY_OF_WEEK_TEXT_AR = "day_of_week_text_ar";
				String DAY_OF_THE_MONTH_TEXT_EN = "day_of_the_month_text_en";
				String DAY_OF_THE_MONTH_TEXT_AR = "day_of_the_month_text_ar";
				String[] WEEK_DAYS = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
				String AUTOPAY_FULL_AMOUNT= "Full Amount";
				String AUTOPAY_LIST_SCHEDULED_ON_WEEK_EN = "autopay_list_scheduled_on_week_en";
				String AUTOPAY_LIST_SCHEDULED_ON_WEEK_AR = "autopay_list_scheduled_on_week_ar";
				String VISA_CARD_ICON_URL = "visa_card_icon_url";
				String MASTER_CARD_ICON_URL = "master_card_icon_url";
				String AUTOPAY_LIST_SCHEDULED_ON_MONTHLY_EN = "autopay_list_scheduled_on_monthly_en";
				String AUTOPAY_LIST_SCHEDULED_ON_MONTHLY_AR = "autopay_list_scheduled_on_monthly_ar";
				String AUTOPAY_LIST_THRESHOLD_TEXT_EN = "autopay_list_threshold_text_en";
				String AUTOPAY_LIST_THRESHOLD_TEXT_AR = "autopay_list_threshold_text_ar";
				String AUTOPAY_CARD_ALREADY_EXIST_EN = "AUTOPAY_CARD_ALREADY_EXIST_EN";
				String AUTOPAY_CARD_ALREADY_EXIST_AR = "AUTOPAY_CARD_ALREADY_EXIST_AR";
				String AUTOPAY_CC_INVALID_EN = "autopay_cc_invalid_en";
				String AUTOPAY_CC_INVALID_AR = "autopay_cc_invalid_ar";
				String RTF_CC_ALREADY_EXIST_ERROR_CODE = "VAL-00251";
				String ACCOUNT_COUNT = "accountsCount";
				String CARD_ICON = "cardIcon";
				String CARDHOLDER_NAME = "cardHolderName";
				String CREDIT_CARD_NUMBER = "cardNumber";
				//String AMOUNT = "amount";
				String AUTOPAY_TYPE_LABEL = "autoPayTypeLabel";
				String SCHEDULEON = "scheduleOn";
				String THRESHOLD_AMOUNT = "threshold";
				String AUTOPAY_TYPE_CODE = "type";
				String SCHEDULED_ON_THRESHOLD_EN = "scheduled_on_threshold_en";
				String SCHEDULED_ON_THRESHOLD_AR = "scheduled_on_threshold_ar";
				public static final String CREDIT_LIMIT_UPDATE_ENABLE_KEY = "credit_limit_update_enable_key";
				
				//MAB-137 | Add-on Suggestions Constants
	    		public static final String ADD_ON_SUGGESTION_BUTTON_TITLE_EN = "ADD_ON_SUGGESTION_BUTTON_TITLE_EN";
	    		public static final String ADD_ON_SUGGESTION_BUTTON_TITLE_AR = "ADD_ON_SUGGESTION_BUTTON_TITLE_AR";
	    		public static final String ADD_ON_SUGGESTION_TITLE_EN = "ADD_ON_SUGGESTION_TITLE_EN";
	    		public static final String ADD_ON_SUGGESTION_TITLE_AR = "ADD_ON_SUGGESTION_TITLE_AR";
	    		public static final String ADD_ON_SUGGESTION_BACKGROUND_IMAGE = "ADD_ON_SUGGESTION_BACKGROUND_IMAGE";


				//pre to post offers
				public static final String PRE_TO_POST_GET_OFFERS_URL = "pre2post_get_offers_url";
				public static final String PRE_TO_POST_FEEDBACK_URL = "pre2post_feedback_url";
				public static final String GET_OFFERS_SECTION_TITLE_EN = "GET_OFFERS_SECTION_TITLE_EN";
				public static final String GET_OFFERS_SECTION_TITLE_AR = "GET_OFFERS_SECTION_TITLE_AR";
				public static final String GET_OFFERS_BUTTON_TITLE_EN = "GET_OFFERS_BUTTON_TITLE_EN";
				public static final String GET_OFFERS_BUTTON_TITLE_AR = "GET_OFFERS_BUTTON_TITLE_AR";
				
				//OTP Document check
				public static final String VERIFY_OTP_PIN_DOCUMENT_FLAG = "verify_otp_pin_document_flag";
		    	public static final String FULL_PROFILE_ATG_SERVICE_URL = "full_profile_atg_service_url";
		    	public static final String OTP_LOGIN_DUMMY_EMAIL = "otp_login_dummy_email";
		    	public static final String OTP_LOGIN_DUMMY_CONTACT_NUMBER = "otp_login_dummy_contact_number";
		    	public static final String MASKED_EMAIL_CONTACT_NULL_ERROR_MSG_TITLE_AR = "masked_email_contact_null_error_msg_title_ar";
		    	public static final String MASKED_EMAIL_CONTACT_NULL_ERROR_MSG_AR = "masked_email_contact_null_error_msg_ar";
		    	public static final String MASKED_EMAIL_CONTACT_NULL_ERROR_MSG_TITLE_EN = "masked_email_contact_null_error_msg_title_en";
		    	public static final String MASKED_EMAIL_CONTACT_NULL_ERROR_MSG_EN = "masked_email_contact_null_error_msg_en";
		    	public static final String SECURITY_PIN_TRY_AFTER_FIFTEEN_MIN_AR = "SECURITY_PIN_TRY_AFTER_FIFTEEN_MIN_AR";
		    	public static final String SECURITY_PIN_TRY_AFTER_FIFTEEN_MIN_EN = "SECURITY_PIN_TRY_AFTER_FIFTEEN_MIN_EN";
		    	public static final String SECURITY_OTP_TRY_AFTER_FIFTEEN_MIN_AR = "SECURITY_OTP_TRY_AFTER_FIFTEEN_MIN_AR";
		    	public static final String SECURITY_OTP_TRY_AFTER_FIFTEEN_MIN_EN = "SECURITY_OTP_TRY_AFTER_FIFTEEN_MIN_EN";
		    	
		    	public static final String FULL_PROFILE_ERROR_MESSAGE_DOC_EXPIRY_DATE_AR = "FULL_PROFILE_ERROR_MESSAGE_DOC_EXPIRY_DATE_AR";
		    	public static final String FULL_PROFILE_ERROR_MESSAGE_DOC_EXPIRY_DATE_EN = "FULL_PROFILE_ERROR_MESSAGE_DOC_EXPIRY_DATE_EN";
		    	public static final String FULL_PROFILE_ERROR_MESSAGE_DOC_NUMBER_AR = "FULL_PROFILE_ERROR_MESSAGE_DOC_NUMBER_AR";
		    	public static final String FULL_PROFILE_ERROR_MESSAGE_DOC_NUMBER_EN = "FULL_PROFILE_ERROR_MESSAGE_DOC_NUMBER_EN";
		    	public static final String FULL_PROFILE_ERROR_MESSAGE_DATE_OF_BIRTH_AR = "FULL_PROFILE_ERROR_MESSAGE_DATE_OF_BIRTH_AR";
		    	public static final String FULL_PROFILE_ERROR_MESSAGE_DATE_OF_BIRTH_EN = "FULL_PROFILE_ERROR_MESSAGE_DATE_OF_BIRTH_EN";


			    public static final String HOME_4G_CATEGORY_ID = "HOME_4G_CATEGORY_ID";
			    public static final String HOME_4G_BANNER = "HOME_4G_BANNER";
			    public static final String HOME_4G_TITLE = "HOME_4G_TITLE";
			    public static final String HOME_4G_TITLE_AR = "HOME_4G_TITLE_AR";
			    public static final String HOME_4G_DISCRIPTION = "HOME_4G_DISCRIPTION";
			    public static final String HOME_4G_DISCRIPTION_AR = "HOME_4G_DISCRIPTION_AR";
			    public static final String HOME_4G_HOW_IT_WORKS_TITLE = "HOME_4G_HOW_IT_WORKS_TITLE";
			    public static final String HOME_4G_HOW_IT_WORKS_TITLE_AR = "HOME_4G_HOW_IT_WORKS_TITLE_AR";
			    public static final String HOME_4G_LEARN_MORE_TITLE = "HOME_4G_LEARN_MORE_TITLE";
			    public static final String HOME_4G_LEARN_MORE_TITLE_AR = "HOME_4G_LEARN_MORE_TITLE_AR";
				public static final String ATG_COUNTRY_LIST_URL = "atg_country_list";
				public static final String ATG_SERVICE_ID_RTF_ERRORCODE_VAL_00305 = "SERVICE_ID.RTF.ERRORCODE.VAL-00305";
				public static final String ATG_SERVICE_ID_RTF_ERRORCODE_VAL_00227 = "SERVICE_ID.RTF.ERRORCODE.VAL-00227";
				public static final String ATG_SERVICE_ID_RTF_ERRORCODE_VAL_00015 = "SERVICE_ID.RTF.ERRORCODE.VAL-00015";
				public static final String ATG_SERVICE_ID_RTF_ERRORCODE_VAL_00304 = "SERVICE_ID.RTF.ERRORCODE.VAL-00304";
				public static final String QUERY_HLR_SERVICE_URL_CONFIG_KEY = "query_hlr_service_url_config_key";

				//Sprint 7 
		    	public static final String LOGIN_REVAMP_ATG_SERVICE_URL = "login_revamp_atg_service_url";
		    	public static final String CHECK_FULL_PROFILE_ELIGIBILITY_TIMEOUT = "CHECK_FULL_PROFILE_ELIGIBILITY_TIMEOUT";
		    	public static final String CHECK_FULL_PROFILE_TIMEOUT = "CHECK_FULL_PROFILE_TIMEOUT";
		    	
		    	public static final String PURCHASE_LIMIT_CAP_AMOUNT = "PURCHASE_LIMIT_CAP_AMOUNT";
				public static final String PURCHASE_LIMIT_CAP_AMOUNT_ERROR_EN = "PURCHASE_LIMIT_CAP_AMOUNT_ERROR_EN";
				public static final String PURCHASE_LIMIT_CAP_AMOUNT_ERROR_AR = "PURCHASE_LIMIT_CAP_AMOUNT_ERROR_AR";
				public static final String PRE_TO_POST_NBA_REQUEST_TIMEOUT = "PRE_TO_POST_NBA_REQUEST_TIMEOUT";
				public static final String CACHE_UPDATE_PERIOD_MIN = "CACHE_UPDATE_PERIOD_MIN";
				
				//gamification 
				
				//Gamification Error Code
				public static final String DIGITAL_APP_WS_GAMIFICATION_PLAY_ERROR_CODE = "0002000";
				
//	    		Talos Headers
	    		public static final String USER_GROUP_ID_HEADER = "X-Talos-UserGroup-Id";
	    		public static final String APPLICATION_ID_HEADER = "X-Talos-Application-Id";
	    		public static final String ACCEPT_LANGUAGE_HEADER = "Accept-Language";
	    		public static final String SESSION_ID_HEADER = "X-Talos-Session-Id";
	    		
//	    		Talos Urls
	    		public static final String TALOS_OPTIN_SERVICE_URL = "talos_optin_service_url";
	    		public static final String TALOS_INSTANCE_LOTTERY_SERVICE_URL = "talos_instance_lottery_service_url";
	    		public static final String TALOS_INSTANCE_LOTTERY_SERIES_SERVICE_URL = "talos_instance_lottery_series_service_url";
	    		public static final String TALOS_TOURNAMENT_SERVICE_URL = "talos_tournament_service_url";
	    		public static final String TALOS_TOURNAMENT_STATISTICS_SERVICE_URL = "talos_tournament_statistics_service_url";
	    		public static final String TALOS_TOURNAMENT_WINNER_URL = "talos_tournament_winner_url";
	    		public static final String TALOS_INSTANT_LOTTERY_PLAY_URL = "talos_instant_lottery_play_url";


//	    		Talos Key
	    		public static final String TALOS_ANDROID_APPLICATIONID_KEY = "talos_android_applicationid_key";
	    		public static final String TALOS_IOS_APPLICATIONID_KEY = "talos_ios_applicationid_key";
	    		public static final String TALOS_GAME_STATUS_KEY = "talos_game_status_key";
	    		public static final String TALOS_GAME_SCRATCH_CARD_STATUS_KEY = "talos_game_scratch_card_status_key";
	    		public static final String TALOS_GAME_SPIN_THE_WHEEL_STATUS_KEY = "talos_game_spin_the_wheel_status_key";
	    		public static final String TALOS_GAME_TREASURE_CHEST_STATUS_KEY = "talos_game_treasure_chest_status_key";
	    		public static final String TALOS_GAME_MAGIC_BAG_STATUS_KEY = "talos_game_magic_bag_status_key";
	    		public static final String TALOS_GAME_GROUP_ID_KEY = "talos_game_group_id_key";
	    		public static final String TALOS_GAME_TYPE_ID_KEY = "talos_game_type_id_key";
	    		public static final String TALOS_BASE_URL = "talos_base_url";
	    		
//	    		Gamification Keys (gmfc)
	    		public static final Integer GMFC_TREASURE_CHEST_ID = 1;
	    		public static final Integer GMFC_MAGIC_BAG_ID = 2;
	    		public static final Integer GMFC_SPIN_THE_WHEEL_ID = 3;
	    		public static final Integer GMFC_SCRATCH_CARD_ID = 4;
	    		public static final String GMFC_TREASURE_CHEST_KEY = "TREASURE_CHEST";
	    		public static final String GMFC_MAGIC_BAG_KEY = "MAGIC_BAG";
	    		public static final String GMFC_SPIN_THE_WHEEL_KEY = "SPIN_THE_WHEEL";
	    		public static final String GMFC_SCRATCH_CARD_KEY = "SCRATCH_CARD";
	    		public static final String GMFC_OPTIN_TITLE_EN = "gmfc_optin_title_en";
	    		public static final String GMFC_OPTIN_SUBTITLE_EN = "gmfc_optin_subtitle_en";
	    		public static final String GMFC_OPTIN_SUBTITLE_AR = "gmfc_optin_subtitle_ar";
	    		public static final String GMFC_OPTIN_TEXT_COLOR = "gmfc_optin_text_color";
	    		public static final String GMFC_OPTIN_BACKGROUND_GRADIENT_START_COLOR = "gmfc_optin_background_gradient_start_color";
	    		public static final String GMFC_OPTIN_BACKGROUND_GRADIENT_END_COLOR = "gmfc_optin_background_gradient_end_color";
	    		public static final String GMFC_OPTIN_BACKGROUND_GRADIENT_ANGLE = "gmfc_optin_background_gradient_angle";
	    		public static final String GMFC_TREASURE_CHEST_GAME_ID = "1";
	    		public static final String GMFC_TREASURE_CHEST_GAME_TYPE = "TREASURE_CHEST";
	    		public static final String GMFC_TREASURE_CHEST_REMAINING_CHANCES = "You have {chances} remaining";
	    		public static final String GMFC_TREASURE_CHEST_GAME_TITLE = "gmfc_treasure_chest_game_title";
	    		public static final String GMFC_TREASURE_CHEST_GAME_DESC = "gmfc_treasure_chest_game_desc";
	    		public static final String GMFC_TREASURE_CHEST_POP_UP_TITLE = "gmfc_treasure_chest_pop_up_title";
	    		public static final String GMFC_TREASURE_CHEST_POP_UP_DESC = "gmfc_treasure_chest_pop_up_desc";
	    		public static final String GMFC_TREASURE_CHEST_T_S_TITLE = "gmfc_treasure_chest_t_s_title";
	    		public static final String GMFC_TREASURE_CHEST_T_S_DESC = "gmfc_treasure_chest_t_s_desc";
	    		public static final String GMFC_TREASURE_CHEST_POP_UP_BTN = "gmfc_treasure_chest_pop_up_btn";
	    		public static final String GMFC_TREASURE_CHEST_BACKGROUND_IMG = "gmfc_treasure_chest_background_img";
	    		public static final String GMFC_TREASURE_CHEST_TEXT_COLOR = "gmfc_treasure_chest_text_color";
	    		public static final String GMFC_TREASURE_CHEST_DEFAULT_ANIMATION = "gmfc_treasure_chest_default_animation";
	    		public static final String GMFC_TREASURE_CHEST_SUCCESS_ANIMATION = "gmfc_treasure_chest_success_animation";
	    		public static final String GMFC_TREASURE_CHEST_FAILURE_ANIMATION = "gmfc_treasure_chest_failure_animation";
	    		public static final String GMFC_TREASURE_CHEST_BG_GRADIENT_START_CLR = "gmfc_treasure_chest_bg_gradient_start_clr";
	    		public static final String GMFC_TREASURE_CHEST_BG_GRADIENT_END_CLR = "gmfc_treasure_chest_bg_gradient_end_clr";
	    		public static final String GMFC_TREASURE_CHEST_BG_GRADIENT_ANGLE = "gmfc_treasure_chest_bg_gradient_angle";
	    		public static final String GMFC_TREASURE_CHEST_BANNER_TITLE = "gmfc_treasure_chest_banner_title";
	    		public static final String GMFC_TREASURE_CHEST_BANNER_DESC = "gmfc_treasure_chest_banner_desc";
	    		public static final String GMFC_TREASURE_CHEST_BANNER_IMG = "gmfc_treasure_chest_banner_img";
	    		public static final String GMFC_TREASURE_CHEST_BANNER_BG = "gmfc_treasure_chest_banner_bg";
	    		//Scratch card keys
	    		public static final String GMFC_SCRATCH_CARD_TEXT_COLOR = "gmfc_scratch_card_text_color";
	    		public static final String GMFC_SCRATCH_CARD_DEFAULT_ANIMATION = "gmfc_scratch_card_default_animation";
	    		public static final String GMFC_SCRATCH_CARD_SUCCESS_ANIMATION = "gmfc_scratch_card_success_animation";
	    		public static final String GMFC_SCRATCH_CARD_FAILURE_ANIMATION = "gmfc_scratch_card_failure_animation";
	    		public static final String GMFC_SCRATCH_CARD_BG_GRADIENT_START_CLR = "gmfc_scratch_card_bg_gradient_start_clr";
	    		public static final String GMFC_SCRATCH_CARD_BG_GRADIENT_END_CLR = "gmfc_scratch_card_bg_gradient_end_clr";
	    		public static final String GMFC_SCRATCH_CARD_BG_GRADIENT_ANGLE = "gmfc_scratch_card_bg_gradient_angle";
	    		public static final String GMFC_SCRATCH_CARD_TITLE_EN = "GMFC_SCRATCH_CARD_TITLE_EN";
	    		public static final String GMFC_SCRATCH_CARD_TITLE_AR = "GMFC_SCRATCH_CARD_TITLE_AR";
	    		//Spin the wheel keys
	    		public static final String GMFC_SPIN_THE_WHEEL_TEXT_COLOR = "gmfc_spin_the_wheel_text_color";
	    		public static final String GMFC_SPIN_THE_WHEEL_DEFAULT_ANIMATION = "gmfc_spin_the_wheel_default_animation";
	    		public static final String GMFC_SPIN_THE_WHEEL_SUCCESS_ANIMATION = "gmfc_spin_the_wheel_success_animation";
	    		public static final String GMFC_SPIN_THE_WHEEL_FAILURE_ANIMATION = "gmfc_spin_the_wheel_failure_animation";
	    		public static final String GMFC_SPIN_THE_WHEEL_BG_GRADIENT_START_CLR = "gmfc_spin_the_wheel_bg_gradient_start_clr";
	    		public static final String GMFC_SPIN_THE_WHEEL_BG_GRADIENT_END_CLR = "gmfc_spin_the_wheel_bg_gradient_end_clr";
	    		public static final String GMFC_SPIN_THE_WHEEL_BG_GRADIENT_ANGLE = "gmfc_spin_the_wheel_bg_gradient_angle";
	    		public static final String GMFC_SPIN_THE_WHEEL_TITLE_AR = "GMFC_SPIN_THE_WHEEL_TITLE_AR";
	    		public static final String GMFC_SPIN_THE_WHEEL_TITLE_EN = "GMFC_SPIN_THE_WHEEL_TITLE_EN";
	    		public static final String GMFC_SPIN_THE_WHEEL_LOOSE_EN = "GMFC_SPIN_THE_WHEEL_LOOSE_EN";
	    		public static final String GMFC_SPIN_THE_WHEEL_LOOSE_AR = "GMFC_SPIN_THE_WHEEL_LOOSE_AR";
	    		//magic bag keys
	    		public static final String GMFC_MAGIC_BAG_TEXT_COLOR = "gmfc_magic_bag_text_color";
	    		public static final String GMFC_MAGIC_BAG_DEFAULT_ANIMATION = "gmfc_magic_bag_default_animation";
	    		public static final String GMFC_MAGIC_BAG_SUCCESS_ANIMATION = "gmfc_magic_bag_success_animation";
	    		public static final String GMFC_MAGIC_BAG_FAILURE_ANIMATION = "gmfc_magic_bag_failure_animation";
	    		public static final String GMFC_MAGIC_BAG_BG_GRADIENT_START_CLR = "gmfc_magic_bag_bg_gradient_start_clr";
	    		public static final String GMFC_MAGIC_BAG_BG_GRADIENT_END_CLR = "gmfc_magic_bag_bg_gradient_end_clr";
	    		public static final String GMFC_MAGIC_BAG_BG_GRADIENT_ANGLE = "gmfc_magic_bag_bg_gradient_angle";
	    		public static final String GMFC_MAGIC_BAG_TITLE_EN = "GMFC_MAGIC_BAG_TITLE_EN";
	    		public static final String GMFC_MAGIC_BAG_TITLE_AR = "GMFC_MAGIC_BAG_TITLE_AR";
	    		//Raffle results keys
	    		public static final String GMFC_RAFFLE_RESULT_BG_GRADIENT_START_CLR = "gmfc_raffle_result_bg_gradient_start_clr";
	    		public static final String GMFC_RAFFLE_RESULT_BG_GRADIENT_END_CLR = "gmfc_raffle_result_bg_gradient_end_clr";
	    		public static final String GMFC_RAFFLE_RESULT_BG_GRADIENT_ANGLE = "gmfc_raffle_result_bg_gradient_angle";
	    		public static final String GMFC_RAFFLE_DETAILS_TOTAL_POINT_AR = "GMFC_RAFFLE_DETAILS_TOTAL_POINT_AR";
	    		public static final String GMFC_RAFFLE_DETAILS_TOTAL_POINT_EN = "GMFC_RAFFLE_DETAILS_TOTAL_POINT_EN";
	    		public static final String GMFC_RAFFLE_DETAILS_NEED_TO_WIN_EN = "GMFC_RAFFLE_DETAILS_NEED_TO_WIN_EN";
	    		public static final String GMFC_RAFFLE_DETAILS_NEED_TO_WIN_AR = "GMFC_RAFFLE_DETAILS_NEED_TO_WIN_AR";
	    		public static final String GMFC_RAFFLE_BANNER_DETAILS_BUTTON_TEXT_AR = "GMFC_RAFFLE_BANNER_DETAILS_BUTTON_TEXT_AR";
	    		public static final String GMFC_RAFFLE_BANNER_DETAILS_BUTTON_TEXT_EN = "GMFC_RAFFLE_BANNER_DETAILS_BUTTON_TEXT_EN";
	    		public static final String GMFC_RAFFLE_DETAILS_BELOW_THRESHOLD_DESCTIPTION_EN = "GMFC_RAFFLE_DETAILS_BELOW_THRESHOLD_DESCTIPTION_EN";
	    		public static final String GMFC_RAFFLE_DETAILS_BELOW_THRESHOLD_DESCTIPTION_AR = "GMFC_RAFFLE_DETAILS_BELOW_THRESHOLD_DESCTIPTION_AR";
	    		public static final String GMFC_RAFFLE_DETAILS_ABOVE_THRESHOLD_DESCTIPTION_AR = "GMFC_RAFFLE_DETAILS_ABOVE_THRESHOLD_DESCTIPTION_AR";
	    		public static final String GMFC_RAFFLE_DETAILS_ABOVE_THRESHOLD_DESCTIPTION_EN = "GMFC_RAFFLE_DETAILS_ABOVE_THRESHOLD_DESCTIPTION_EN";
	    		//Translated Labels
	    		public static final String GMFC_LABEL_PLAY_AND_WIN_ENG = "GMFC_LABEL_PLAY_AND_WIN_ENG";
	    		public static final String GMFC_LABEL_PLAY_AND_WIN_AR = "GMFC_LABEL_PLAY_AND_WIN_AR";
	    		public static final String GMFC_LABEL_TAP_TO_SPIN_THE_WHEEL_ENG = "GMFC_LABEL_TAP_TO_SPIN_THE_WHEEL_ENG";
	    		public static final String GMFC_LABEL_TAP_TO_SPIN_THE_WHEEL_AR = "GMFC_LABEL_TAP_TO_SPIN_THE_WHEEL_AR";
	    		public static final String GMFC_LABEL_COLLECT_POINTS_ENG = "GMFC_LABEL_COLLECT_POINTS_ENG";
	    		public static final String GMFC_LABEL_COLLECT_POINTS_AR = "GMFC_LABEL_COLLECT_POINTS_AR";
	    		public static final String GMFC_LABEL_CLOSE_ENG = "GMFC_LABEL_CLOSE_ENG";
	    		public static final String GMFC_LABEL_CLOSE_AR = "GMFC_LABEL_CLOSE_AR";
	    		public static final String GMFC_LABEL_DO_YOU_WANT_TO_SEE_PLAY_AND_WIN_ENG = "GMFC_LABEL_DO_YOU_WANT_TO_SEE_PLAY_AND_WIN_ENG";
	    		public static final String GMFC_LABEL_DO_YOU_WANT_TO_SEE_PLAY_AND_WIN_AR = "GMFC_LABEL_DO_YOU_WANT_TO_SEE_PLAY_AND_WIN_AR";
	    		public static final String GMFC_LABEL_TRY_MY_LUCK_ENG = "GMFC_LABEL_TRY_MY_LUCK_ENG";
	    		public static final String GMFC_LABEL_TRY_MY_LUCK_AR = "GMFC_LABEL_TRY_MY_LUCK_AR";
	    		public static final String GMFC_LABEL_DONT_SHOW_ME_THIS_AGAIN_ENG = "GMFC_LABEL_DONT_SHOW_ME_THIS_AGAIN_ENG";
	    		public static final String GMFC_LABEL_DONT_SHOW_ME_THIS_AGAIN_AR = "GMFC_LABEL_DONT_SHOW_ME_THIS_AGAIN_AR";
	    		public static final String GMFC_LABEL_WAITING_GIFTS_ENG = "GMFC_LABEL_WAITING_GIFTS_ENG";
	    		public static final String GMFC_LABEL_WAITING_GIFTS_AR = "GMFC_LABEL_WAITING_GIFTS_AR";
	    		public static final String GMFC_LABEL_TAP_TO_CLAIM_ENG = "GMFC_LABEL_TAP_TO_CLAIM_ENG";
	    		public static final String GMFC_LABEL_TAP_TO_CLAIM_AR = "GMFC_LABEL_TAP_TO_CLAIM_AR";
	    		public static final String GMFC_LABEL_END_IN_ENG = "GMFC_LABEL_END_IN_ENG";
	    		public static final String GMFC_LABEL_ENDS_IN_AR = "GMFC_LABEL_ENDS_IN_AR";
	    		public static final String GMFC_LABEL_EXPIRY_TEXT_AR = "GMFC_LABEL_EXPIRY_TEXT_AR";
	    		public static final String GMFC_LABEL_EXPIRY_TEXT_EN = "GMFC_LABEL_EXPIRY_TEXT_EN";
	    		public static final String GMFC_LABEL_YOU_WON_RAFFLE_ENG = "GMFC_LABEL_YOU_WON_RAFFLE_ENG";
	    		public static final String GMFC_LABEL_YOU_WON_RAFFLE_AR = "GMFC_LABEL_YOU_WON_RAFFLE_AR";
	    		public static final String GMFC_LABEL_CONGRATS_RAFFLE_WIN_ENG = "GMFC_LABEL_CONGRATS_RAFFLE_WIN_ENG";
	    		public static final String GMFC_LABEL_CONGRATS_RAFFLE_WIN_AR = "GMFC_LABEL_CONGRATS_RAFFLE_WIN_AR";
	    		public static final String GMFC_LABEL_MEGA_PRIZE_IS_READY_ENG = "GMFC_LABEL_MEGA_PRIZE_IS_READY_ENG";
	    		public static final String GMFC_LABEL_MEGA_PRIZE_IS_READY_AR = "GMFC_LABEL_MEGA_PRIZE_IS_READY_AR";
	    		public static final String GMFC_LABEL_BACK_TO_HOME_ENG = "GMFC_LABEL_BACK_TO_HOME_ENG";
	    		public static final String GMFC_LABEL_BACK_TO_HOME_AR = "GMFC_LABEL_BACK_TO_HOME_AR";
	    		public static final String GMFC_LABEL_UH_OH_ENG = "GMFC_LABEL_UH_OH_ENG";
	    		public static final String GMFC_LABEL_UH_OH_AR = "GMFC_LABEL_UH_OH_AR";
	    		public static final String GMFC_LABEL_UNABLE_TO_LOAD_THE_GAME_ENG = "GMFC_LABEL_UNABLE_TO_LOAD_THE_GAME_ENG";
	    		public static final String GMFC_LABEL_UNABLE_TO_LOAD_THE_GAME_AR = "GMFC_LABEL_UNABLE_TO_LOAD_THE_GAME_AR";
	    		public static final String GMFC_LABEL_PLEASE_TRY_AGAIN_LATER_ENG = "GMFC_LABEL_PLEASE_TRY_AGAIN_LATER_ENG";
	    		public static final String GMFC_LABEL_PLEASE_TRY_AGAIN_LATER_AR = "GMFC_LABEL_PLEASE_TRY_AGAIN_LATER_AR";
	    		public static final String GMFC_LABEL_OK_ENG = "GMFC_LABEL_OK_ENG";
	    		public static final String GMFC_LABEL_OK_AR = "GMFC_LABEL_OK_AR";
	    		public static final String GMFC_LABEL_TAP_HERE_TO_REDEEM_YOUR_PRIZE_ENG = "GMFC_LABEL_TAP_HERE_TO_REDEEM_YOUR_PRIZE_ENG";
	    		public static final String GMFC_LABEL_TAP_HERE_TO_REDEEM_YOUR_PRIZE_AR = "GMFC_LABEL_TAP_HERE_TO_REDEEM_YOUR_PRIZE_AR";
	    		public static final String GMFC_LABEL_DONT_WORRY_ENG = "GMFC_LABEL_DONT_WORRY_ENG";
	    		public static final String GMFC_LABEL_DONT_WORRY_AR = "GMFC_LABEL_DONT_WORRY_AR";
	    		public static final String GMFC_LABEL_CHANCE_TO_WIN_RAFFLE_KEEP_COLLECTING_ENG = "GMFC_LABEL_CHANCE_TO_WIN_RAFFLE_KEEP_COLLECTING_ENG";
	    		public static final String GMFC_LABEL_CHANCE_TO_WIN_RAFFLE_KEEP_COLLECTING_AR = "GMFC_LABEL_CHANCE_TO_WIN_RAFFLE_KEEP_COLLECTING_AR";
	    		public static final String GMFC_LABEL_BETTER_LUCK_NEXT_TIME_ENG = "GMFC_LABEL_BETTER_LUCK_NEXT_TIME_ENG";
	    		public static final String GMFC_LABEL_BETTER_LUCK_NEXT_TIME_AR = "GMFC_LABEL_BETTER_LUCK_NEXT_TIME_AR";
	    		public static final String TRESSURE_CHEST_TITLE_AR = "TRESSURE_CHEST_TITLE_AR";
	    		public static final String TRESSURE_CHEST_TITLE_EN = "TRESSURE_CHEST_TITLE_EN";
	    		public static final String GAME_END_DESCRIPTION_EN = "GAME_END_DESCRIPTION_EN";
	    		public static final String GAME_END_DESCRIPTION_AR = "GAME_END_DESCRIPTION_AR";
	    		public static final String GAME_END_ACTION_TEXT_AR = "GAME_END_ACTION_TEXT_AR";
	    		public static final String GAME_END_ACTION_TEXT_EN = "GAME_END_ACTION_TEXT_EN";
	    		public static final String GAME_END_SUBTITLE_EN = "GAME_END_SUBTITLE_EN";
	    		public static final String GAME_END_SUBTITLE_AR = "GAME_END_SUBTITLE_AR";
	    		public static final String GMFC_SORRY_TRY_AGAIN_LATER_ERROR_ENG = "GMFC_SORRY_TRY_AGAIN_LATER_ERROR_ENG";
	    		public static final String GMFC_SORRY_TRY_AGAIN_LATER_ERROR_AR = "GMFC_SORRY_TRY_AGAIN_LATER_ERROR_AR";
	    		public static final String GMFC_LABEL_TRY_AGAIN_LATER_ENG = "GMFC_LABEL_TRY_AGAIN_LATER_ENG";
	    		public static final String GMFC_LABEL_TRY_AGAIN_LATER_AR = "GMFC_LABEL_TRY_AGAIN_LATER_AR";
	    		public static final String GMFC_LABEL_CONTINUE_NEXT_TO_REDEEM_ENG = "GMFC_LABEL_CONTINUE_NEXT_TO_REDEEM_ENG";
	    		public static final String GMFC_LABEL_CONTINUE_NEXT_TO_REDEEM_AR = "GMFC_LABEL_CONTINUE_NEXT_TO_REDEEM_AR";
	    		public static final String GMFC_LABEL_CHANCE_TO_WIN_RAFFLE_KEEP_COLLECTING_AND_TRY_AGAIN_ENG = "GMFC_LABEL_CHANCE_TO_WIN_RAFFLE_KEEP_COLLECTING_AND_TRY_AGAIN_ENG";
	    		public static final String GMFC_LABEL_CHANCE_TO_WIN_RAFFLE_KEEP_COLLECTING_AND_TRY_AGAIN_AR = "GMFC_LABEL_CHANCE_TO_WIN_RAFFLE_KEEP_COLLECTING_AND_TRY_AGAIN_AR";
	    		public static final String GMFC_LABEL_SORRY_EN = "GMFC_LABEL_SORRY_EN";
	    		public static final String GMFC_LABEL_SORRY_AR = "GMFC_LABEL_SORRY_AR";
	    		public static final String GMFC_LABEL_NOT_WIN_POINTS_EN = "GMFC_LABEL_NOT_WIN_POINTS_EN";
	    		public static final String GMFC_LABEL_NOT_WIN_POINTS_AR = "GMFC_LABEL_NOT_WIN_POINTS_AR";
	    		
	    		// is profile id enabled
	    		public static final String IS_PROFILE_ID_ENABLED = "IS_PROFILE_ID_ENABLED";

	    		public static final String ACCOUNT_CANCELLATION_START_PROCESS_URL = "account_cancellation_start_process_url";
	    		public static final String DIGITAL_APP_OPEN_COMPLAINT_AR = "digital_app_open_complaint_ar";
		    	public static final String DIGITAL_APP_OPEN_COMPLAINT = "digital_app_open_complaint";
		    	public static final String DIGITAL_APP_OPEN_COMPLAINT_DESC_AR = "digital_app_open_complaint_desc_ar";
		    	public static final String DIGITAL_APP_OPEN_COMPLAINT_DESC = "digital_app_open_complaint_desc";
		    	
		    	public static final String DIGITAL_APP_NO_COMPLAINT_AR = "digital_app_no_complaint_ar";
		    	public static final String DIGITAL_APP_NO_COMPLAINT = "digital_app_no_complaint";
		    	public static final String DIGITAL_APP_NO_COMPLAINT_DESC_AR = "digital_app_no_complaint_desc_ar";
		    	public static final String DIGITAL_APP_NO_COMPLAINT_DESC = "digital_app_no_complaint_desc";
		    	public static final String REQUEST_ID_HEADER = "requestId";
		    	public static final String NBA_AC_CAN_OFFERS_SERVICE_URL_CONFIG_KEY = "nba_ac_can_offers_srvc_url";
		    	public static final String TIMEOUT_LOYALTY_MEMBER_IN_SECOND = "timeout_loyalty_member_in_second";
				
		    	//MAB-117 App Store Purchase Limit
				public static final String APP_STORE_PURCHASE_LIMIT_ERROR_EN = "app_store_purchase_limit_error_en";
				public static final String APP_STORE_PURCHASE_LIMIT_ERROR_AR = "app_store_purchase_limit_error_ar";
				

	    		public static final String BILL_GENERATION_ERROR_BUTTON_TITLE_EN = "BILL_GENERATION_ERROR_BUTTON_TITLE_EN";
	    		public static final String BILL_GENERATION_ERROR_BUTTON_TITLE_AR = "BILL_GENERATION_ERROR_BUTTON_TITLE_AR";
	    		public static final String BILL_GENERATION_ERROR_TITLE_EN = "BILL_GENERATION_ERROR_TITLE_EN";
	    		public static final String BILL_GENERATION_ERROR_TITLE_AR = "BILL_GENERATION_ERROR_TITLE_AR";
	    		public static final String BILL_GENERATION_ERROR_MESSAGE_EN = "BILL_GENERATION_ERROR_MESSAGE_EN";
	    		public static final String BILL_GENERATION_ERROR_MESSAGE_AR = "BILL_GENERATION_ERROR_MESSAGE_AR";
	    		public static final String WASEL_FALXI_PRODUCT_CATEGORY_CODE_1 = "WASEL_FALXI_PRODUCT_CATEGORY_CODE_1";
	    		
	    		
	    		public static final String CREDIT_TRANSFER_LATER_DAY1 = "credit_transfer_later_day1";
	    		public static final String CREDIT_TRANSFER_LATER_DAY1_AR = "credit_transfer_later_day1_ar";
	    		public static final String CREDIT_TRANSFER_LATER_DAY1N15 = "credit_transfer_later_day1n15";
	    		public static final String CREDIT_TRANSFER_LATER_DAY1N15_AR = "credit_transfer_later_day1n15_ar";
	    		public static final String CREDIT_TRANSFER_LATER_DAY1N10N20 = "credit_transfer_later_day1n10n20";
	    		public static final String CREDIT_TRANSFER_LATER_DAY1N10N20_AR = "credit_transfer_later_day1n10n20_ar";
	    		
	    		public static final String CREDIT_TRANSFER_LATER_SCHEDULED_DAY1 = "credit_transfer_later_scheduled_day1";
	    		public static final String CREDIT_TRANSFER_LATER_SCHEDULED_DAY1_AR = "credit_transfer_later_scheduled_day1_ar";
	    		public static final String CREDIT_TRANSFER_LATER_SCHEDULED_DAY1N15 = "credit_transfer_later_scheduled_day1n15";
	    		public static final String CREDIT_TRANSFER_LATER_SCHEDULED_DAY1N15_AR = "credit_transfer_later_scheduled_day1n15_ar";
	    		public static final String CREDIT_TRANSFER_LATER_SCHEDULED_DAY1N10N20 = "credit_transfer_later_scheduled_day1n10n20";
	    		public static final String CREDIT_TRANSFER_LATER_SCHEDULED_DAY1N10N20_AR = "credit_transfer_later_scheduled_day1n10n20_ar";
	    		
	    		public static final String TIBCO_GET_CREDIT_TRANSFER = "tibco_get_credit_transfer";
	    		public static final String TIBCO_SET_CREDIT_TRANSFER = "tibco_set_credit_transfer";
	    		public static final String TIBCO_DELETE_CREDIT_TRANSFER = "tibco_delete_credit_transfer";
	    		public static final String TIBCO_GET_CREDIT_TRANSFER_time_out = "tibco_get_credit_transfer_time_out";
	    		public static final String TIBCO_SET_CREDIT_TRANSFER_time_out = "tibco_set_credit_transfer_time_out";
	    		public static final String TIBCO_DELETE_CREDIT_TRANSFER_time_out = "tibco_delete_credit_transfer_time_out";
	    		
	    		
	    		
	    		
	    		
	    		
	    		////////////////////////////////// APPLE SAMSUNG PAY /////////////////////////////////
	    		
	    		public static final String PAY_FOR_DEVICE_SAMSUNGPAY_OPTION = "12";
	    		public static final String PAY_FOR_DEVICE_APPLEPAY_OPTION = "13";
	    		
	    		
	    		public static final String PAYMENT_OPTION_SAMSUNG_PAY_ENABLE_DEVICE = "PAYMENT_OPTION_SAMSUNG_PAY_ENABLE_DEVICE";
	    		public static final String PAYMENT_OPTION_APPLE_PAY_ENABLE_DEVICE = "PAYMENT_OPTION_APPLE_PAY_ENABLE_DEVICE";
	    		
	    		

	    		public static final String apple_pay_title = "apple_pay_title_";

	    		public static final String apple_pay_sub_title = "apple_pay_sub_title_";

	    		public static final String samsung_pay_title = "samsung_pay_title_";
	    		
	    		public static final String samsung_pay_sub_title = "samsung_pay_sub_title_";
	    		
	    		public static final String EPG_CREATE_SESSION = "EPG_CREATE_SESSION";
	    		public static final String PAYMENT_OPTION_SAMSUNG_PAY_ENABLE = "PAYMENT_OPTION_SAMSUNG_PAY_ENABLE";
	    		public static final String PAYMENT_OPTION_APPLE_PAY_ENABLE = "PAYMENT_OPTION_APPLE_PAY_ENABLE";
	    		
	    		
	    		public static final String WALLET_EPG_CUSTOMER_NAME = "wallet_epg_customer_name"; //
	    		public static final String wallet_devices_epg_customer_name = "wallet_devices_epg_customer_name"; //
	    		public static final String EGP_CREATE_WALLET_TIME_OUT = "EGP_CREATE_WALLET_TIME_OUT"; //
	    		
	    		public static final String EGP_SUBMIT_WALLET_TIME_OUT = "EGP_SUBMIT_WALLET_TIME_OUT"; //

	    		public static final String WALLET_EPG_STORE = "wallet_epg_store"; //

	    		public static final String WALLET_EPG_USERNAME = "wallet_epg_username"; //
	    		public static final String WALLET_EPG_WALLET_NAME_SAMSUNG = "wallet_epg_wallet_name_samsung"; //
	    		public static final String WALLET_EPG_WALLET_NAME_APPLE = "wallet_epg_wallet_name_apple"; //
	    		public static final String WALLET_EPG_PASSWORD = "wallet_epg_password"; //
	    		public static final String WALLET_EPG_TERMINAL = "wallet_epg_terminal"; //
	    		public static final String WALLET_EPG_TERMINAL_SAMSUNG = "wallet_epg_terminal_samsung"; //
	    		public static final String WALLET_EPG_TERMINAL_APPLE = "wallet_epg_terminal_apple"; //
	    		
	    		
	    		

	    		public static final String EPG_RECURRENCE_ALLOWED_CARD_TYPE_PROPERTY = "Recurrence/AllowedCardType";
	    		public static final String EPG_RECURRENCE_AUTOPAY_ENROLMENT_PROPERTY = "Recurrence/AutopayEnrolment";
	    	
	    		public static final String EPG_USER_NAME_PROPERRTY = "UserName"; //
	    		
	    		public static final String EPG_PASSWORD_PROPERRTY = "Password"; //

	    		public static final String EPG_SESSION_ID_PROPERTY = "SessionID";//

	    		public static final String EPG_WALLET_NAME_PROPERRTY = "WalletName"; //
	    		
}	



