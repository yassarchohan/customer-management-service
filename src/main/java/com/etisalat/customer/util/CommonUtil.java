package com.etisalat.customer.util;

import com.etisalat.customer.exception.BusinessException;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Random;

import static com.etisalat.customer.constant.Constants.*;
import static com.etisalat.customer.constant.Constants.DIGITAL_APP_WS_TRANSACTION_ID_RESPONSE_CODE;

@Component
public class CommonUtil {

    public static String generateTransactionId() {
        return Long.toString(Calendar.getInstance().getTimeInMillis());
    }

    public void validateRequestLang(String lang, String transactionId) throws BusinessException {
        if (lang == null) {
            throw new BusinessException(DIGITAL_APP_WS_MISSING_LANG_RESPONSE_CODE, "Please provide language code in request");
        }
        else if(YES.equalsIgnoreCase(new HashMap<String, String>().get(ENABLE_TRANSACTION_ID_CHECK))){

            if (transactionId == null)
            {
                throw new BusinessException(DIGITAL_APP_WS_TRANSACTION_ID_RESPONSE_CODE, "Transaction Id not found in request");
            }
        }
    }

    public static String generateRandomNumber(int lengthOfRandomNumber) {

        StringBuilder randomNumber = new StringBuilder();

        for (int i = 0; i < lengthOfRandomNumber; i++)
        {
            randomNumber.append((new Random().nextInt(9) + 1));
        }

        return randomNumber.toString();
    }

    public static boolean isNotNullAndEqualWithIngoreCase(String str1, String str2)
    {
        boolean isNotNullAndEqualWithIngoreCase = false;
        if (str1 != null && str2 != null)
        {
            if (str1.trim().equalsIgnoreCase(str2.trim()))
            {
                isNotNullAndEqualWithIngoreCase = true;
            }
        }
        return isNotNullAndEqualWithIngoreCase;
    }

    @SneakyThrows
    public String generateMarshaller(Object jaxbElement) {
        StringWriter sw = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(jaxbElement.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(jaxbElement, sw);
        return sw.toString();
    }
}
