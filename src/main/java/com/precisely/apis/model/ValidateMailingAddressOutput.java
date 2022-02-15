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


package com.precisely.apis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.precisely.apis.model.GetPostalCodesAPIOutputUserFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ValidateMailingAddressOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T13:24:49.425+05:30[Asia/Calcutta]")
public class ValidateMailingAddressOutput {
  public static final String SERIALIZED_NAME_USER_FIELDS = "user_fields";
  @SerializedName(SERIALIZED_NAME_USER_FIELDS)
  private List<GetPostalCodesAPIOutputUserFields> userFields = null;

  public static final String SERIALIZED_NAME_ADDRESS_LINE1 = "AddressLine1";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE1)
  private String addressLine1;

  public static final String SERIALIZED_NAME_ADDRESS_LINE2 = "AddressLine2";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LINE2)
  private String addressLine2;

  public static final String SERIALIZED_NAME_FIRM_NAME = "FirmName";
  @SerializedName(SERIALIZED_NAME_FIRM_NAME)
  private String firmName;

  public static final String SERIALIZED_NAME_CITY = "City";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "PostalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY = "Country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_STATE_PROVINCE = "StateProvince";
  @SerializedName(SERIALIZED_NAME_STATE_PROVINCE)
  private String stateProvince;

  public static final String SERIALIZED_NAME_BLOCK_ADDRESS = "BlockAddress";
  @SerializedName(SERIALIZED_NAME_BLOCK_ADDRESS)
  private String blockAddress;

  public static final String SERIALIZED_NAME_ADDITIONAL_INPUT_DATA = "AdditionalInputData";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_INPUT_DATA)
  private String additionalInputData;

  public static final String SERIALIZED_NAME_POSTAL_CODE_BASE = "PostalCode.Base";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE_BASE)
  private String postalCodeBase;

  public static final String SERIALIZED_NAME_POSTAL_CODE_ADD_ON = "PostalCode.AddOn";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE_ADD_ON)
  private String postalCodeAddOn;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STATUS_CODE = "Status.Code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private String statusCode;

  public static final String SERIALIZED_NAME_STATUS_DESCRIPTION = "Status.Description";
  @SerializedName(SERIALIZED_NAME_STATUS_DESCRIPTION)
  private String statusDescription;

  public ValidateMailingAddressOutput() { 
  }

  public ValidateMailingAddressOutput userFields(List<GetPostalCodesAPIOutputUserFields> userFields) {
    
    this.userFields = userFields;
    return this;
  }

  public ValidateMailingAddressOutput addUserFieldsItem(GetPostalCodesAPIOutputUserFields userFieldsItem) {
    if (this.userFields == null) {
      this.userFields = new ArrayList<GetPostalCodesAPIOutputUserFields>();
    }
    this.userFields.add(userFieldsItem);
    return this;
  }

   /**
   * These fields are returned, unmodified, in the user_fields section of the response.
   * @return userFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "These fields are returned, unmodified, in the user_fields section of the response.")

  public List<GetPostalCodesAPIOutputUserFields> getUserFields() {
    return userFields;
  }


  public void setUserFields(List<GetPostalCodesAPIOutputUserFields> userFields) {
    this.userFields = userFields;
  }


  public ValidateMailingAddressOutput addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * The first line of the validated address.
   * @return addressLine1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The first line of the validated address.")

  public String getAddressLine1() {
    return addressLine1;
  }


  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public ValidateMailingAddressOutput addressLine2(String addressLine2) {
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * The second line of the validated address.
   * @return addressLine2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The second line of the validated address.")

  public String getAddressLine2() {
    return addressLine2;
  }


  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public ValidateMailingAddressOutput firmName(String firmName) {
    
    this.firmName = firmName;
    return this;
  }

   /**
   * The validated firm or company name.
   * @return firmName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The validated firm or company name.")

  public String getFirmName() {
    return firmName;
  }


  public void setFirmName(String firmName) {
    this.firmName = firmName;
  }


  public ValidateMailingAddressOutput city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The validated city name.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The validated city name.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public ValidateMailingAddressOutput postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The validated ZIP Code or postal code.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The validated ZIP Code or postal code.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public ValidateMailingAddressOutput country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country name in English.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country name in English.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public ValidateMailingAddressOutput stateProvince(String stateProvince) {
    
    this.stateProvince = stateProvince;
    return this;
  }

   /**
   * The validated state or province abbreviation.
   * @return stateProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The validated state or province abbreviation.")

  public String getStateProvince() {
    return stateProvince;
  }


  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }


  public ValidateMailingAddressOutput blockAddress(String blockAddress) {
    
    this.blockAddress = blockAddress;
    return this;
  }

   /**
   * The formatted address, as it would appear on a physical mail piece.
   * @return blockAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The formatted address, as it would appear on a physical mail piece.")

  public String getBlockAddress() {
    return blockAddress;
  }


  public void setBlockAddress(String blockAddress) {
    this.blockAddress = blockAddress;
  }


  public ValidateMailingAddressOutput additionalInputData(String additionalInputData) {
    
    this.additionalInputData = additionalInputData;
    return this;
  }

   /**
   * Input data not used by the address validation process.
   * @return additionalInputData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Input data not used by the address validation process.")

  public String getAdditionalInputData() {
    return additionalInputData;
  }


  public void setAdditionalInputData(String additionalInputData) {
    this.additionalInputData = additionalInputData;
  }


  public ValidateMailingAddressOutput postalCodeBase(String postalCodeBase) {
    
    this.postalCodeBase = postalCodeBase;
    return this;
  }

   /**
   * The 5-digit ZIP Code.
   * @return postalCodeBase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The 5-digit ZIP Code.")

  public String getPostalCodeBase() {
    return postalCodeBase;
  }


  public void setPostalCodeBase(String postalCodeBase) {
    this.postalCodeBase = postalCodeBase;
  }


  public ValidateMailingAddressOutput postalCodeAddOn(String postalCodeAddOn) {
    
    this.postalCodeAddOn = postalCodeAddOn;
    return this;
  }

   /**
   * The 4-digit add-on part of the ZIP Code.
   * @return postalCodeAddOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The 4-digit add-on part of the ZIP Code.")

  public String getPostalCodeAddOn() {
    return postalCodeAddOn;
  }


  public void setPostalCodeAddOn(String postalCodeAddOn) {
    this.postalCodeAddOn = postalCodeAddOn;
  }


  public ValidateMailingAddressOutput status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Reports the success or failure of the match attempt.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reports the success or failure of the match attempt.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ValidateMailingAddressOutput statusCode(String statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Reason for failure, if there is one.
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reason for failure, if there is one.")

  public String getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  public ValidateMailingAddressOutput statusDescription(String statusDescription) {
    
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Description of the problem, if there is one.
   * @return statusDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the problem, if there is one.")

  public String getStatusDescription() {
    return statusDescription;
  }


  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateMailingAddressOutput validateMailingAddressOutput = (ValidateMailingAddressOutput) o;
    return Objects.equals(this.userFields, validateMailingAddressOutput.userFields) &&
        Objects.equals(this.addressLine1, validateMailingAddressOutput.addressLine1) &&
        Objects.equals(this.addressLine2, validateMailingAddressOutput.addressLine2) &&
        Objects.equals(this.firmName, validateMailingAddressOutput.firmName) &&
        Objects.equals(this.city, validateMailingAddressOutput.city) &&
        Objects.equals(this.postalCode, validateMailingAddressOutput.postalCode) &&
        Objects.equals(this.country, validateMailingAddressOutput.country) &&
        Objects.equals(this.stateProvince, validateMailingAddressOutput.stateProvince) &&
        Objects.equals(this.blockAddress, validateMailingAddressOutput.blockAddress) &&
        Objects.equals(this.additionalInputData, validateMailingAddressOutput.additionalInputData) &&
        Objects.equals(this.postalCodeBase, validateMailingAddressOutput.postalCodeBase) &&
        Objects.equals(this.postalCodeAddOn, validateMailingAddressOutput.postalCodeAddOn) &&
        Objects.equals(this.status, validateMailingAddressOutput.status) &&
        Objects.equals(this.statusCode, validateMailingAddressOutput.statusCode) &&
        Objects.equals(this.statusDescription, validateMailingAddressOutput.statusDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userFields, addressLine1, addressLine2, firmName, city, postalCode, country, stateProvince, blockAddress, additionalInputData, postalCodeBase, postalCodeAddOn, status, statusCode, statusDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateMailingAddressOutput {\n");
    sb.append("    userFields: ").append(toIndentedString(userFields)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    firmName: ").append(toIndentedString(firmName)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    blockAddress: ").append(toIndentedString(blockAddress)).append("\n");
    sb.append("    additionalInputData: ").append(toIndentedString(additionalInputData)).append("\n");
    sb.append("    postalCodeBase: ").append(toIndentedString(postalCodeBase)).append("\n");
    sb.append("    postalCodeAddOn: ").append(toIndentedString(postalCodeAddOn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

