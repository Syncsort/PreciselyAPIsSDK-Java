/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 10.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.precisely.apis;

import com.precisely.ApiException;
import com.precisely.apis.model.AHJPlusPSAPResponse;
import com.precisely.apis.model.PSAPResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for _911PSAPServiceApi
 */
public class _911PSAPServiceApiTest {

    private final _911PSAPServiceApi api = new _911PSAPServiceApi();

    
    /**
     * AHJ &amp; PSAP By Address.
     *
     * Accepts addresses as input and Returns contact details for Authorities Having Jurisdiction (AHJ) on-behalf-of local Public Safety Answering Points (PSAP). Geo911 accepts an address and returns PSAP contact data plus contact data for an AHJ to communicate directly with a PSAP. Details include agency name, phone number, city name, coverage, contact person&#39;s details, site details and mailing addresses for EMS, Fire, and Police PSAP contacts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAHJPlusPSAPByAddressTest() throws ApiException {
        String address = null;
        // AHJPlusPSAPResponse response = api.getAHJPlusPSAPByAddress(address);

        // TODO: test validations
    }
    
    /**
     * AHJ &amp; PSAP By Location
     *
     * Accepts latitude &amp; longitude as input and Returns contact details for Authorities Having Jurisdiction (AHJ) on-behalf-of local Public Safety Answering Points (PSAP). Geo911 accepts a location coordinate and returns PSAP contact data plus contact data for an AHJ to communicate directly with a PSAP. Details include agency name, phone number, city name, coverage, contact person&#39;s details, site details and mailing addresses for EMS, Fire, and Police PSAP contacts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAHJPlusPSAPByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        // AHJPlusPSAPResponse response = api.getAHJPlusPSAPByLocation(longitude, latitude);

        // TODO: test validations
    }
    
    /**
     * PSAP By Address.
     *
     * Accepts addresses as input and returns contact details for local Public Safety Answering Points (PSAP). Geo911 accepts an address as input and returns the relevant PSAP address and contact details including agency name, phone number, county name, coverage, contact person&#39;s details, site details and mailing address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPSAPByAddressTest() throws ApiException {
        String address = null;
        // PSAPResponse response = api.getPSAPByAddress(address);

        // TODO: test validations
    }
    
    /**
     * PSAP By Location.
     *
     * Accepts latitude &amp; longitude as input and Returns contact details for local Public Safety Answering Points (PSAP). Geo911 accepts a location coordinate and returns the relevant PSAP address and contact details including dispatch name, phone number, county name, coverage, contact person&#39;s details, site details and mailing address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPSAPByLocationTest() throws ApiException {
        String longitude = null;
        String latitude = null;
        // PSAPResponse response = api.getPSAPByLocation(longitude, latitude);

        // TODO: test validations
    }
    
}
