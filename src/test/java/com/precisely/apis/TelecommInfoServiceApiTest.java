/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 16.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis;

import com.precisely.ApiException;
import com.precisely.apis.model.ErrorInfo;
import com.precisely.apis.model.RateCenterResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TelecommInfoServiceApi
 */
@Ignore
public class TelecommInfoServiceApiTest {

    private final TelecommInfoServiceApi api = new TelecommInfoServiceApi();

    
    /**
     * Rate Center By Address.
     *
     * Accepts addresses as input and returns Incumbent Local Exchange Carrier (ILEC) doing-business-as names.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRateCenterByAddressTest() throws ApiException {
        String address = null;
        String country = null;
        String areaCodeInfo = null;
        String level = null;
                RateCenterResponse response = api.getRateCenterByAddress(address, country, areaCodeInfo, level);
        // TODO: test validations
    }
    
    /**
     * Rate Center By Location.
     *
     * Accepts latitude &amp; longitude as input and returns Incumbent Local Exchange Carrier (ILEC) doing-business-as names.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRateCenterByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        String areaCodeInfo = null;
        String level = null;
                RateCenterResponse response = api.getRateCenterByLocation(longitude, latitude, areaCodeInfo, level);
        // TODO: test validations
    }
    
}
