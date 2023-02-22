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
 * ValidateMailingAddressProOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-17T17:59:08.288488200+05:30[Asia/Calcutta]")
public class ValidateMailingAddressProOutput {
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

  public static final String SERIALIZED_NAME_CHANGE_SCORE = "ChangeScore";
  @SerializedName(SERIALIZED_NAME_CHANGE_SCORE)
  private String changeScore;

  public static final String SERIALIZED_NAME_LOCALITY = "Locality";
  @SerializedName(SERIALIZED_NAME_LOCALITY)
  private String locality;

  public static final String SERIALIZED_NAME_SUBURB = "Suburb";
  @SerializedName(SERIALIZED_NAME_SUBURB)
  private String suburb;

  public static final String SERIALIZED_NAME_ADDRESS_TYPE = "AddressType";
  @SerializedName(SERIALIZED_NAME_ADDRESS_TYPE)
  private String addressType;

  public static final String SERIALIZED_NAME_DELIVERABILITY = "Deliverability";
  @SerializedName(SERIALIZED_NAME_DELIVERABILITY)
  private String deliverability;

  public static final String SERIALIZED_NAME_ADDRESS_QUALITY = "AddressQuality";
  @SerializedName(SERIALIZED_NAME_ADDRESS_QUALITY)
  private String addressQuality;

  public static final String SERIALIZED_NAME_COULD_NOT_VALIDATE = "CouldNotValidate";
  @SerializedName(SERIALIZED_NAME_COULD_NOT_VALIDATE)
  private String couldNotValidate;

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

  public ValidateMailingAddressProOutput() { 
  }

  public ValidateMailingAddressProOutput userFields(List<GetPostalCodesAPIOutputUserFields> userFields) {
    
    this.userFields = userFields;
    return this;
  }

  public ValidateMailingAddressProOutput addUserFieldsItem(GetPostalCodesAPIOutputUserFields userFieldsItem) {
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


  public ValidateMailingAddressProOutput addressLine1(String addressLine1) {
    
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


  public ValidateMailingAddressProOutput addressLine2(String addressLine2) {
    
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


  public ValidateMailingAddressProOutput firmName(String firmName) {
    
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


  public ValidateMailingAddressProOutput changeScore(String changeScore) {
    
    this.changeScore = changeScore;
    return this;
  }

   /**
   * A value of 0 and 100 that reflects how much the address has changed to make it valid.
   * @return changeScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A value of 0 and 100 that reflects how much the address has changed to make it valid.")

  public String getChangeScore() {
    return changeScore;
  }


  public void setChangeScore(String changeScore) {
    this.changeScore = changeScore;
  }


  public ValidateMailingAddressProOutput locality(String locality) {
    
    this.locality = locality;
    return this;
  }

   /**
   * Generally a locality is a village in rural areas or it may be a suburb in urban areas.
   * @return locality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Generally a locality is a village in rural areas or it may be a suburb in urban areas.")

  public String getLocality() {
    return locality;
  }


  public void setLocality(String locality) {
    this.locality = locality;
  }


  public ValidateMailingAddressProOutput suburb(String suburb) {
    
    this.suburb = suburb;
    return this;
  }

   /**
   * The suburb name.
   * @return suburb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The suburb name.")

  public String getSuburb() {
    return suburb;
  }


  public void setSuburb(String suburb) {
    this.suburb = suburb;
  }


  public ValidateMailingAddressProOutput addressType(String addressType) {
    
    this.addressType = addressType;
    return this;
  }

   /**
   * A single letter code that indicates the type of address.
   * @return addressType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A single letter code that indicates the type of address.")

  public String getAddressType() {
    return addressType;
  }


  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }


  public ValidateMailingAddressProOutput deliverability(String deliverability) {
    
    this.deliverability = deliverability;
    return this;
  }

   /**
   * An estimate of confidence that an item mailed or shipped to this address would be successfully delivered.
   * @return deliverability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An estimate of confidence that an item mailed or shipped to this address would be successfully delivered.")

  public String getDeliverability() {
    return deliverability;
  }


  public void setDeliverability(String deliverability) {
    this.deliverability = deliverability;
  }


  public ValidateMailingAddressProOutput addressQuality(String addressQuality) {
    
    this.addressQuality = addressQuality;
    return this;
  }

   /**
   * A two character code indicating overall quality of the resulting address.
   * @return addressQuality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A two character code indicating overall quality of the resulting address.")

  public String getAddressQuality() {
    return addressQuality;
  }


  public void setAddressQuality(String addressQuality) {
    this.addressQuality = addressQuality;
  }


  public ValidateMailingAddressProOutput couldNotValidate(String couldNotValidate) {
    
    this.couldNotValidate = couldNotValidate;
    return this;
  }

   /**
   * Mentions the address component that could not be validated, in case no match is found.
   * @return couldNotValidate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mentions the address component that could not be validated, in case no match is found.")

  public String getCouldNotValidate() {
    return couldNotValidate;
  }


  public void setCouldNotValidate(String couldNotValidate) {
    this.couldNotValidate = couldNotValidate;
  }


  public ValidateMailingAddressProOutput city(String city) {
    
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


  public ValidateMailingAddressProOutput postalCode(String postalCode) {
    
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


  public ValidateMailingAddressProOutput country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The country in the format determined by what you selected.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The country in the format determined by what you selected.")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public ValidateMailingAddressProOutput stateProvince(String stateProvince) {
    
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


  public ValidateMailingAddressProOutput blockAddress(String blockAddress) {
    
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


  public ValidateMailingAddressProOutput additionalInputData(String additionalInputData) {
    
    this.additionalInputData = additionalInputData;
    return this;
  }

   /**
   * Input data that could not be matched to a particular address component.
   * @return additionalInputData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Input data that could not be matched to a particular address component.")

  public String getAdditionalInputData() {
    return additionalInputData;
  }


  public void setAdditionalInputData(String additionalInputData) {
    this.additionalInputData = additionalInputData;
  }


  public ValidateMailingAddressProOutput postalCodeBase(String postalCodeBase) {
    
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


  public ValidateMailingAddressProOutput postalCodeAddOn(String postalCodeAddOn) {
    
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


  public ValidateMailingAddressProOutput status(String status) {
    
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


  public ValidateMailingAddressProOutput statusCode(String statusCode) {
    
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


  public ValidateMailingAddressProOutput statusDescription(String statusDescription) {
    
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
    ValidateMailingAddressProOutput validateMailingAddressProOutput = (ValidateMailingAddressProOutput) o;
    return Objects.equals(this.userFields, validateMailingAddressProOutput.userFields) &&
        Objects.equals(this.addressLine1, validateMailingAddressProOutput.addressLine1) &&
        Objects.equals(this.addressLine2, validateMailingAddressProOutput.addressLine2) &&
        Objects.equals(this.firmName, validateMailingAddressProOutput.firmName) &&
        Objects.equals(this.changeScore, validateMailingAddressProOutput.changeScore) &&
        Objects.equals(this.locality, validateMailingAddressProOutput.locality) &&
        Objects.equals(this.suburb, validateMailingAddressProOutput.suburb) &&
        Objects.equals(this.addressType, validateMailingAddressProOutput.addressType) &&
        Objects.equals(this.deliverability, validateMailingAddressProOutput.deliverability) &&
        Objects.equals(this.addressQuality, validateMailingAddressProOutput.addressQuality) &&
        Objects.equals(this.couldNotValidate, validateMailingAddressProOutput.couldNotValidate) &&
        Objects.equals(this.city, validateMailingAddressProOutput.city) &&
        Objects.equals(this.postalCode, validateMailingAddressProOutput.postalCode) &&
        Objects.equals(this.country, validateMailingAddressProOutput.country) &&
        Objects.equals(this.stateProvince, validateMailingAddressProOutput.stateProvince) &&
        Objects.equals(this.blockAddress, validateMailingAddressProOutput.blockAddress) &&
        Objects.equals(this.additionalInputData, validateMailingAddressProOutput.additionalInputData) &&
        Objects.equals(this.postalCodeBase, validateMailingAddressProOutput.postalCodeBase) &&
        Objects.equals(this.postalCodeAddOn, validateMailingAddressProOutput.postalCodeAddOn) &&
        Objects.equals(this.status, validateMailingAddressProOutput.status) &&
        Objects.equals(this.statusCode, validateMailingAddressProOutput.statusCode) &&
        Objects.equals(this.statusDescription, validateMailingAddressProOutput.statusDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userFields, addressLine1, addressLine2, firmName, changeScore, locality, suburb, addressType, deliverability, addressQuality, couldNotValidate, city, postalCode, country, stateProvince, blockAddress, additionalInputData, postalCodeBase, postalCodeAddOn, status, statusCode, statusDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateMailingAddressProOutput {\n");
    sb.append("    userFields: ").append(toIndentedString(userFields)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    firmName: ").append(toIndentedString(firmName)).append("\n");
    sb.append("    changeScore: ").append(toIndentedString(changeScore)).append("\n");
    sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
    sb.append("    suburb: ").append(toIndentedString(suburb)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    deliverability: ").append(toIndentedString(deliverability)).append("\n");
    sb.append("    addressQuality: ").append(toIndentedString(addressQuality)).append("\n");
    sb.append("    couldNotValidate: ").append(toIndentedString(couldNotValidate)).append("\n");
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

