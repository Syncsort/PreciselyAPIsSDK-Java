/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.2
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
import com.precisely.apis.model.SchoolsNearByResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolsServiceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SchoolsServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SchoolsServiceApi(ApiClient apiClient) {
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
     * Build call for getSchoolsByAddress
     * @param address free form address text (required)
     * @param edLevel Single digit code for education level applicable values are P -&gt; primary, M -&gt; Middle, H -&gt; High, O -&gt; Mixed Grades for public school type andE -&gt; Elementary , S -&gt; Secondary , O -&gt; Others mixed grades for private schools  (optional)
     * @param schoolType Single digit code for schoolTypes applicable values are PRI and PUB (optional)
     * @param schoolSubType Single digit code for schoolSubType Applicable values are C, M, A, R, I, L, P, V, U, S (i.e. Charter, Magnet, Alternative, Regular, Indian, Military, Reportable Program, Vocational, Unknown, Special Education) (optional)
     * @param gender Single digit code for gender Applicable values are C, F, M (Coed, All Females, All Males) Applicable for Private Schools Only (optional)
     * @param assignedSchoolsOnly Single digit code for assignedSchoolOnly applicable values are  Y/N  (optional)
     * @param districtSchoolsOnly Single digit code for districtSchoolOnly applicable values are Y/N  (optional)
     * @param searchRadius Search Radius within which schools are searched (optional)
     * @param searchRadiusUnit Search Radius unit applicable values are feet,kilometers,miles,meters (optional)
     * @param travelTime Travel Time based on ‘travelMode’ within which schools are searched. (optional)
     * @param travelTimeUnit Travel Time unit applicable values are minutes,hours,seconds,milliseconds  (optional)
     * @param travelDistance Travel Distance based on ‘travelMode’ within which schools are searched. (optional)
     * @param travelDistanceUnit Travel distanceUnit applicable values are feet,kilometers,miles,meters (optional)
     * @param travelMode Travel mode Required when travelDistance or travelTime is specified. Accepted values are walking,driving (optional)
     * @param maxCandidates Max result to search  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSchoolsByAddressCall(String address, String edLevel, String schoolType, String schoolSubType, String gender, String assignedSchoolsOnly, String districtSchoolsOnly, String searchRadius, String searchRadiusUnit, String travelTime, String travelTimeUnit, String travelDistance, String travelDistanceUnit, String travelMode, String maxCandidates, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/schools/v1/school/byaddress";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (address != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("address", address));
        }

        if (edLevel != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("edLevel", edLevel));
        }

        if (schoolType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("schoolType", schoolType));
        }

        if (schoolSubType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("schoolSubType", schoolSubType));
        }

        if (gender != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("gender", gender));
        }

        if (assignedSchoolsOnly != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("assignedSchoolsOnly", assignedSchoolsOnly));
        }

        if (districtSchoolsOnly != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("districtSchoolsOnly", districtSchoolsOnly));
        }

        if (searchRadius != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("searchRadius", searchRadius));
        }

        if (searchRadiusUnit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("searchRadiusUnit", searchRadiusUnit));
        }

        if (travelTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("travelTime", travelTime));
        }

        if (travelTimeUnit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("travelTimeUnit", travelTimeUnit));
        }

        if (travelDistance != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("travelDistance", travelDistance));
        }

        if (travelDistanceUnit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("travelDistanceUnit", travelDistanceUnit));
        }

        if (travelMode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("travelMode", travelMode));
        }

        if (maxCandidates != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("maxCandidates", maxCandidates));
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
    private okhttp3.Call getSchoolsByAddressValidateBeforeCall(String address, String edLevel, String schoolType, String schoolSubType, String gender, String assignedSchoolsOnly, String districtSchoolsOnly, String searchRadius, String searchRadiusUnit, String travelTime, String travelTimeUnit, String travelDistance, String travelDistanceUnit, String travelMode, String maxCandidates, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new ApiException("Missing the required parameter 'address' when calling getSchoolsByAddress(Async)");
        }
        

        okhttp3.Call localVarCall = getSchoolsByAddressCall(address, edLevel, schoolType, schoolSubType, gender, assignedSchoolsOnly, districtSchoolsOnly, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, maxCandidates, _callback);
        return localVarCall;

    }

    /**
     * Search Nearby Schools by Address
     * Search Nearby Schools by Address
     * @param address free form address text (required)
     * @param edLevel Single digit code for education level applicable values are P -&gt; primary, M -&gt; Middle, H -&gt; High, O -&gt; Mixed Grades for public school type andE -&gt; Elementary , S -&gt; Secondary , O -&gt; Others mixed grades for private schools  (optional)
     * @param schoolType Single digit code for schoolTypes applicable values are PRI and PUB (optional)
     * @param schoolSubType Single digit code for schoolSubType Applicable values are C, M, A, R, I, L, P, V, U, S (i.e. Charter, Magnet, Alternative, Regular, Indian, Military, Reportable Program, Vocational, Unknown, Special Education) (optional)
     * @param gender Single digit code for gender Applicable values are C, F, M (Coed, All Females, All Males) Applicable for Private Schools Only (optional)
     * @param assignedSchoolsOnly Single digit code for assignedSchoolOnly applicable values are  Y/N  (optional)
     * @param districtSchoolsOnly Single digit code for districtSchoolOnly applicable values are Y/N  (optional)
     * @param searchRadius Search Radius within which schools are searched (optional)
     * @param searchRadiusUnit Search Radius unit applicable values are feet,kilometers,miles,meters (optional)
     * @param travelTime Travel Time based on ‘travelMode’ within which schools are searched. (optional)
     * @param travelTimeUnit Travel Time unit applicable values are minutes,hours,seconds,milliseconds  (optional)
     * @param travelDistance Travel Distance based on ‘travelMode’ within which schools are searched. (optional)
     * @param travelDistanceUnit Travel distanceUnit applicable values are feet,kilometers,miles,meters (optional)
     * @param travelMode Travel mode Required when travelDistance or travelTime is specified. Accepted values are walking,driving (optional)
     * @param maxCandidates Max result to search  (optional)
     * @return SchoolsNearByResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public SchoolsNearByResponse getSchoolsByAddress(String address, String edLevel, String schoolType, String schoolSubType, String gender, String assignedSchoolsOnly, String districtSchoolsOnly, String searchRadius, String searchRadiusUnit, String travelTime, String travelTimeUnit, String travelDistance, String travelDistanceUnit, String travelMode, String maxCandidates) throws ApiException {
        ApiResponse<SchoolsNearByResponse> localVarResp = getSchoolsByAddressWithHttpInfo(address, edLevel, schoolType, schoolSubType, gender, assignedSchoolsOnly, districtSchoolsOnly, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, maxCandidates);
        return localVarResp.getData();
    }

    /**
     * Search Nearby Schools by Address
     * Search Nearby Schools by Address
     * @param address free form address text (required)
     * @param edLevel Single digit code for education level applicable values are P -&gt; primary, M -&gt; Middle, H -&gt; High, O -&gt; Mixed Grades for public school type andE -&gt; Elementary , S -&gt; Secondary , O -&gt; Others mixed grades for private schools  (optional)
     * @param schoolType Single digit code for schoolTypes applicable values are PRI and PUB (optional)
     * @param schoolSubType Single digit code for schoolSubType Applicable values are C, M, A, R, I, L, P, V, U, S (i.e. Charter, Magnet, Alternative, Regular, Indian, Military, Reportable Program, Vocational, Unknown, Special Education) (optional)
     * @param gender Single digit code for gender Applicable values are C, F, M (Coed, All Females, All Males) Applicable for Private Schools Only (optional)
     * @param assignedSchoolsOnly Single digit code for assignedSchoolOnly applicable values are  Y/N  (optional)
     * @param districtSchoolsOnly Single digit code for districtSchoolOnly applicable values are Y/N  (optional)
     * @param searchRadius Search Radius within which schools are searched (optional)
     * @param searchRadiusUnit Search Radius unit applicable values are feet,kilometers,miles,meters (optional)
     * @param travelTime Travel Time based on ‘travelMode’ within which schools are searched. (optional)
     * @param travelTimeUnit Travel Time unit applicable values are minutes,hours,seconds,milliseconds  (optional)
     * @param travelDistance Travel Distance based on ‘travelMode’ within which schools are searched. (optional)
     * @param travelDistanceUnit Travel distanceUnit applicable values are feet,kilometers,miles,meters (optional)
     * @param travelMode Travel mode Required when travelDistance or travelTime is specified. Accepted values are walking,driving (optional)
     * @param maxCandidates Max result to search  (optional)
     * @return ApiResponse&lt;SchoolsNearByResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SchoolsNearByResponse> getSchoolsByAddressWithHttpInfo(String address, String edLevel, String schoolType, String schoolSubType, String gender, String assignedSchoolsOnly, String districtSchoolsOnly, String searchRadius, String searchRadiusUnit, String travelTime, String travelTimeUnit, String travelDistance, String travelDistanceUnit, String travelMode, String maxCandidates) throws ApiException {
        okhttp3.Call localVarCall = getSchoolsByAddressValidateBeforeCall(address, edLevel, schoolType, schoolSubType, gender, assignedSchoolsOnly, districtSchoolsOnly, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, maxCandidates, null);
        Type localVarReturnType = new TypeToken<SchoolsNearByResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Search Nearby Schools by Address (asynchronously)
     * Search Nearby Schools by Address
     * @param address free form address text (required)
     * @param edLevel Single digit code for education level applicable values are P -&gt; primary, M -&gt; Middle, H -&gt; High, O -&gt; Mixed Grades for public school type andE -&gt; Elementary , S -&gt; Secondary , O -&gt; Others mixed grades for private schools  (optional)
     * @param schoolType Single digit code for schoolTypes applicable values are PRI and PUB (optional)
     * @param schoolSubType Single digit code for schoolSubType Applicable values are C, M, A, R, I, L, P, V, U, S (i.e. Charter, Magnet, Alternative, Regular, Indian, Military, Reportable Program, Vocational, Unknown, Special Education) (optional)
     * @param gender Single digit code for gender Applicable values are C, F, M (Coed, All Females, All Males) Applicable for Private Schools Only (optional)
     * @param assignedSchoolsOnly Single digit code for assignedSchoolOnly applicable values are  Y/N  (optional)
     * @param districtSchoolsOnly Single digit code for districtSchoolOnly applicable values are Y/N  (optional)
     * @param searchRadius Search Radius within which schools are searched (optional)
     * @param searchRadiusUnit Search Radius unit applicable values are feet,kilometers,miles,meters (optional)
     * @param travelTime Travel Time based on ‘travelMode’ within which schools are searched. (optional)
     * @param travelTimeUnit Travel Time unit applicable values are minutes,hours,seconds,milliseconds  (optional)
     * @param travelDistance Travel Distance based on ‘travelMode’ within which schools are searched. (optional)
     * @param travelDistanceUnit Travel distanceUnit applicable values are feet,kilometers,miles,meters (optional)
     * @param travelMode Travel mode Required when travelDistance or travelTime is specified. Accepted values are walking,driving (optional)
     * @param maxCandidates Max result to search  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSchoolsByAddressAsync(String address, String edLevel, String schoolType, String schoolSubType, String gender, String assignedSchoolsOnly, String districtSchoolsOnly, String searchRadius, String searchRadiusUnit, String travelTime, String travelTimeUnit, String travelDistance, String travelDistanceUnit, String travelMode, String maxCandidates, final ApiCallback<SchoolsNearByResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSchoolsByAddressValidateBeforeCall(address, edLevel, schoolType, schoolSubType, gender, assignedSchoolsOnly, districtSchoolsOnly, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, maxCandidates, _callback);
        Type localVarReturnType = new TypeToken<SchoolsNearByResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
