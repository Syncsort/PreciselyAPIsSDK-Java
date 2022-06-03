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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SalesVolume
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T17:17:01.735+05:30[Asia/Calcutta]")
public class SalesVolume {
  public static final String SERIALIZED_NAME_CURRENCY_CODE = "currencyCode";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CODE)
  private String currencyCode;

  public static final String SERIALIZED_NAME_WORLD_BASE_CURRENCY_CODE = "worldBaseCurrencyCode";
  @SerializedName(SERIALIZED_NAME_WORLD_BASE_CURRENCY_CODE)
  private String worldBaseCurrencyCode;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public SalesVolume() { 
  }

  public SalesVolume currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public SalesVolume worldBaseCurrencyCode(String worldBaseCurrencyCode) {
    
    this.worldBaseCurrencyCode = worldBaseCurrencyCode;
    return this;
  }

   /**
   * Get worldBaseCurrencyCode
   * @return worldBaseCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWorldBaseCurrencyCode() {
    return worldBaseCurrencyCode;
  }


  public void setWorldBaseCurrencyCode(String worldBaseCurrencyCode) {
    this.worldBaseCurrencyCode = worldBaseCurrencyCode;
  }


  public SalesVolume value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesVolume salesVolume = (SalesVolume) o;
    return Objects.equals(this.currencyCode, salesVolume.currencyCode) &&
        Objects.equals(this.worldBaseCurrencyCode, salesVolume.worldBaseCurrencyCode) &&
        Objects.equals(this.value, salesVolume.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, worldBaseCurrencyCode, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesVolume {\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    worldBaseCurrencyCode: ").append(toIndentedString(worldBaseCurrencyCode)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

