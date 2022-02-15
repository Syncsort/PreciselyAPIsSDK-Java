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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReturnFieldsDescriptor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T13:24:49.425+05:30[Asia/Calcutta]")
public class ReturnFieldsDescriptor {
  public static final String SERIALIZED_NAME_RETURN_ALL_CUSTOM_FIELDS = "returnAllCustomFields";
  @SerializedName(SERIALIZED_NAME_RETURN_ALL_CUSTOM_FIELDS)
  private Boolean returnAllCustomFields;

  public static final String SERIALIZED_NAME_RETURN_MATCH_DESCRIPTOR = "returnMatchDescriptor";
  @SerializedName(SERIALIZED_NAME_RETURN_MATCH_DESCRIPTOR)
  private Boolean returnMatchDescriptor;

  public static final String SERIALIZED_NAME_RETURN_STREET_ADDRESS_FIELDS = "returnStreetAddressFields";
  @SerializedName(SERIALIZED_NAME_RETURN_STREET_ADDRESS_FIELDS)
  private Boolean returnStreetAddressFields;

  public static final String SERIALIZED_NAME_RETURN_UNIT_INFORMATION = "returnUnitInformation";
  @SerializedName(SERIALIZED_NAME_RETURN_UNIT_INFORMATION)
  private Boolean returnUnitInformation;

  public static final String SERIALIZED_NAME_RETURNED_CUSTOM_FIELD_KEYS = "returnedCustomFieldKeys";
  @SerializedName(SERIALIZED_NAME_RETURNED_CUSTOM_FIELD_KEYS)
  private List<String> returnedCustomFieldKeys = null;

  public ReturnFieldsDescriptor() { 
  }

  public ReturnFieldsDescriptor returnAllCustomFields(Boolean returnAllCustomFields) {
    
    this.returnAllCustomFields = returnAllCustomFields;
    return this;
  }

   /**
   * Get returnAllCustomFields
   * @return returnAllCustomFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReturnAllCustomFields() {
    return returnAllCustomFields;
  }


  public void setReturnAllCustomFields(Boolean returnAllCustomFields) {
    this.returnAllCustomFields = returnAllCustomFields;
  }


  public ReturnFieldsDescriptor returnMatchDescriptor(Boolean returnMatchDescriptor) {
    
    this.returnMatchDescriptor = returnMatchDescriptor;
    return this;
  }

   /**
   * Get returnMatchDescriptor
   * @return returnMatchDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReturnMatchDescriptor() {
    return returnMatchDescriptor;
  }


  public void setReturnMatchDescriptor(Boolean returnMatchDescriptor) {
    this.returnMatchDescriptor = returnMatchDescriptor;
  }


  public ReturnFieldsDescriptor returnStreetAddressFields(Boolean returnStreetAddressFields) {
    
    this.returnStreetAddressFields = returnStreetAddressFields;
    return this;
  }

   /**
   * Get returnStreetAddressFields
   * @return returnStreetAddressFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReturnStreetAddressFields() {
    return returnStreetAddressFields;
  }


  public void setReturnStreetAddressFields(Boolean returnStreetAddressFields) {
    this.returnStreetAddressFields = returnStreetAddressFields;
  }


  public ReturnFieldsDescriptor returnUnitInformation(Boolean returnUnitInformation) {
    
    this.returnUnitInformation = returnUnitInformation;
    return this;
  }

   /**
   * Get returnUnitInformation
   * @return returnUnitInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReturnUnitInformation() {
    return returnUnitInformation;
  }


  public void setReturnUnitInformation(Boolean returnUnitInformation) {
    this.returnUnitInformation = returnUnitInformation;
  }


  public ReturnFieldsDescriptor returnedCustomFieldKeys(List<String> returnedCustomFieldKeys) {
    
    this.returnedCustomFieldKeys = returnedCustomFieldKeys;
    return this;
  }

  public ReturnFieldsDescriptor addReturnedCustomFieldKeysItem(String returnedCustomFieldKeysItem) {
    if (this.returnedCustomFieldKeys == null) {
      this.returnedCustomFieldKeys = new ArrayList<String>();
    }
    this.returnedCustomFieldKeys.add(returnedCustomFieldKeysItem);
    return this;
  }

   /**
   * Get returnedCustomFieldKeys
   * @return returnedCustomFieldKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getReturnedCustomFieldKeys() {
    return returnedCustomFieldKeys;
  }


  public void setReturnedCustomFieldKeys(List<String> returnedCustomFieldKeys) {
    this.returnedCustomFieldKeys = returnedCustomFieldKeys;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnFieldsDescriptor returnFieldsDescriptor = (ReturnFieldsDescriptor) o;
    return Objects.equals(this.returnAllCustomFields, returnFieldsDescriptor.returnAllCustomFields) &&
        Objects.equals(this.returnMatchDescriptor, returnFieldsDescriptor.returnMatchDescriptor) &&
        Objects.equals(this.returnStreetAddressFields, returnFieldsDescriptor.returnStreetAddressFields) &&
        Objects.equals(this.returnUnitInformation, returnFieldsDescriptor.returnUnitInformation) &&
        Objects.equals(this.returnedCustomFieldKeys, returnFieldsDescriptor.returnedCustomFieldKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnAllCustomFields, returnMatchDescriptor, returnStreetAddressFields, returnUnitInformation, returnedCustomFieldKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturnFieldsDescriptor {\n");
    sb.append("    returnAllCustomFields: ").append(toIndentedString(returnAllCustomFields)).append("\n");
    sb.append("    returnMatchDescriptor: ").append(toIndentedString(returnMatchDescriptor)).append("\n");
    sb.append("    returnStreetAddressFields: ").append(toIndentedString(returnStreetAddressFields)).append("\n");
    sb.append("    returnUnitInformation: ").append(toIndentedString(returnUnitInformation)).append("\n");
    sb.append("    returnedCustomFieldKeys: ").append(toIndentedString(returnedCustomFieldKeys)).append("\n");
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

