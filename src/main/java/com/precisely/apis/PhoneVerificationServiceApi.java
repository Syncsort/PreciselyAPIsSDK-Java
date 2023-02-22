/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 14.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis;

import com.precisely.ApiCallback;
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.ApiResponse;
import com.precisely.Configuration;
import com.precisely.Pair;
import com.precisely.ProgressRequestBody;
import com.precisely.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.precisely.apis.model.ErrorInfo;
import com.precisely.apis.model.PhoneVerification;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneVerificationServiceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PhoneVerificationServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PhoneVerificationServiceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for phoneVerification
     * @param phoneNumber E.164 formatted phone number. Accepts digits only. Country Code (1) optional for USA &amp; CAN. (required)
     * @param includeNetworkInfo Y or N (default is Y) – if it is N, then network/carrier details will not be added in the response. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call phoneVerificationCall(String phoneNumber, String includeNetworkInfo, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/phoneverification/v1/phoneverification";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (phoneNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("phoneNumber", phoneNumber));
        }

        if (includeNetworkInfo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("includeNetworkInfo", includeNetworkInfo));
        }

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null && localVarContentTypes != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call phoneVerificationValidateBeforeCall(String phoneNumber, String includeNetworkInfo, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'phoneNumber' is set
        if (phoneNumber == null) {
            throw new ApiException("Missing the required parameter 'phoneNumber' when calling phoneVerification(Async)");
        }
        

        okhttp3.Call localVarCall = phoneVerificationCall(phoneNumber, includeNetworkInfo, _callback);
        return localVarCall;

    }

    /**
     * Phone verification.
     * This service accepts a phone number as input and returns details distinguishing landline and wireless numbers and also checks if a wireless number can be located.
     * @param phoneNumber E.164 formatted phone number. Accepts digits only. Country Code (1) optional for USA &amp; CAN. (required)
     * @param includeNetworkInfo Y or N (default is Y) – if it is N, then network/carrier details will not be added in the response. (optional)
     * @return PhoneVerification
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public PhoneVerification phoneVerification(String phoneNumber, String includeNetworkInfo) throws ApiException {
        ApiResponse<PhoneVerification> localVarResp = phoneVerificationWithHttpInfo(phoneNumber, includeNetworkInfo);
        return localVarResp.getData();
    }

    /**
     * Phone verification.
     * This service accepts a phone number as input and returns details distinguishing landline and wireless numbers and also checks if a wireless number can be located.
     * @param phoneNumber E.164 formatted phone number. Accepts digits only. Country Code (1) optional for USA &amp; CAN. (required)
     * @param includeNetworkInfo Y or N (default is Y) – if it is N, then network/carrier details will not be added in the response. (optional)
     * @return ApiResponse&lt;PhoneVerification&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PhoneVerification> phoneVerificationWithHttpInfo(String phoneNumber, String includeNetworkInfo) throws ApiException {
        okhttp3.Call localVarCall = phoneVerificationValidateBeforeCall(phoneNumber, includeNetworkInfo, null);
        Type localVarReturnType = new TypeToken<PhoneVerification>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Phone verification. (asynchronously)
     * This service accepts a phone number as input and returns details distinguishing landline and wireless numbers and also checks if a wireless number can be located.
     * @param phoneNumber E.164 formatted phone number. Accepts digits only. Country Code (1) optional for USA &amp; CAN. (required)
     * @param includeNetworkInfo Y or N (default is Y) – if it is N, then network/carrier details will not be added in the response. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call phoneVerificationAsync(String phoneNumber, String includeNetworkInfo, final ApiCallback<PhoneVerification> _callback) throws ApiException {

        okhttp3.Call localVarCall = phoneVerificationValidateBeforeCall(phoneNumber, includeNetworkInfo, _callback);
        Type localVarReturnType = new TypeToken<PhoneVerification>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
