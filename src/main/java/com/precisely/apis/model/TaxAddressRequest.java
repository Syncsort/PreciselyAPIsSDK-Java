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


package com.precisely.apis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.precisely.apis.model.LocalTaxPreferences;
import com.precisely.apis.model.TaxAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TaxAddressRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-15T13:23:13.677+05:30[Asia/Calcutta]")
public class TaxAddressRequest {
  public static final String SERIALIZED_NAME_PREFERENCES = "preferences";
  @SerializedName(SERIALIZED_NAME_PREFERENCES)
  private LocalTaxPreferences preferences;

  public static final String SERIALIZED_NAME_TAX_ADDRESSES = "taxAddresses";
  @SerializedName(SERIALIZED_NAME_TAX_ADDRESSES)
  private List<TaxAddress> taxAddresses = new ArrayList<TaxAddress>();

  public TaxAddressRequest() { 
  }

  public TaxAddressRequest preferences(LocalTaxPreferences preferences) {
    
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalTaxPreferences getPreferences() {
    return preferences;
  }


  public void setPreferences(LocalTaxPreferences preferences) {
    this.preferences = preferences;
  }


  public TaxAddressRequest taxAddresses(List<TaxAddress> taxAddresses) {
    
    this.taxAddresses = taxAddresses;
    return this;
  }

  public TaxAddressRequest addTaxAddressesItem(TaxAddress taxAddressesItem) {
    this.taxAddresses.add(taxAddressesItem);
    return this;
  }

   /**
   * Get taxAddresses
   * @return taxAddresses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<TaxAddress> getTaxAddresses() {
    return taxAddresses;
  }


  public void setTaxAddresses(List<TaxAddress> taxAddresses) {
    this.taxAddresses = taxAddresses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxAddressRequest taxAddressRequest = (TaxAddressRequest) o;
    return Objects.equals(this.preferences, taxAddressRequest.preferences) &&
        Objects.equals(this.taxAddresses, taxAddressRequest.taxAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferences, taxAddresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxAddressRequest {\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    taxAddresses: ").append(toIndentedString(taxAddresses)).append("\n");
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

