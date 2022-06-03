/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.3
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
import com.precisely.apis.model.MatchedAddress;
import com.precisely.apis.model.PropertyInfoPreferences;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PropertyInfoAddressRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T17:17:01.735+05:30[Asia/Calcutta]")
public class PropertyInfoAddressRequest {
  public static final String SERIALIZED_NAME_PREFERENCES = "preferences";
  @SerializedName(SERIALIZED_NAME_PREFERENCES)
  private PropertyInfoPreferences preferences;

  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<MatchedAddress> addresses = new ArrayList<MatchedAddress>();

  public PropertyInfoAddressRequest() { 
  }

  public PropertyInfoAddressRequest preferences(PropertyInfoPreferences preferences) {
    
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PropertyInfoPreferences getPreferences() {
    return preferences;
  }


  public void setPreferences(PropertyInfoPreferences preferences) {
    this.preferences = preferences;
  }


  public PropertyInfoAddressRequest addresses(List<MatchedAddress> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public PropertyInfoAddressRequest addAddressesItem(MatchedAddress addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<MatchedAddress> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<MatchedAddress> addresses) {
    this.addresses = addresses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyInfoAddressRequest propertyInfoAddressRequest = (PropertyInfoAddressRequest) o;
    return Objects.equals(this.preferences, propertyInfoAddressRequest.preferences) &&
        Objects.equals(this.addresses, propertyInfoAddressRequest.addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferences, addresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyInfoAddressRequest {\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
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

