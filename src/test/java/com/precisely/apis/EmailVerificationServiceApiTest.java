/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis;

import com.precisely.ApiException;
import com.precisely.apis.model.ErrorInfo;
import com.precisely.apis.model.ValidateEmailAddressAPIRequest;
import com.precisely.apis.model.ValidateEmailAddressAPIResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmailVerificationServiceApi
 */
@Ignore
public class EmailVerificationServiceApiTest {

    private final EmailVerificationServiceApi api = new EmailVerificationServiceApi();

    
    /**
     * ValidateEmailAddress
     *
     * Confirm that your customer’s mailing address exists and that mail and packages can be delivered to it.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void validateEmailAddressTest() throws ApiException {
        ValidateEmailAddressAPIRequest inputEmailAddress = null;
                ValidateEmailAddressAPIResponse response = api.validateEmailAddress(inputEmailAddress);
        // TODO: test validations
    }
    
}
