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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrganizationType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-17T17:59:08.288488200+05:30[Asia/Calcutta]")
public class OrganizationType {
  public static final String SERIALIZED_NAME_NAICS_CODE = "naicsCode";
  @SerializedName(SERIALIZED_NAME_NAICS_CODE)
  private String naicsCode;

  public static final String SERIALIZED_NAME_ISIC_CODE = "isicCode";
  @SerializedName(SERIALIZED_NAME_ISIC_CODE)
  private String isicCode;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public OrganizationType() { 
  }

  public OrganizationType naicsCode(String naicsCode) {
    
    this.naicsCode = naicsCode;
    return this;
  }

   /**
   * Get naicsCode
   * @return naicsCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNaicsCode() {
    return naicsCode;
  }


  public void setNaicsCode(String naicsCode) {
    this.naicsCode = naicsCode;
  }


  public OrganizationType isicCode(String isicCode) {
    
    this.isicCode = isicCode;
    return this;
  }

   /**
   * Get isicCode
   * @return isicCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIsicCode() {
    return isicCode;
  }


  public void setIsicCode(String isicCode) {
    this.isicCode = isicCode;
  }


  public OrganizationType value(String value) {
    
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
    OrganizationType organizationType = (OrganizationType) o;
    return Objects.equals(this.naicsCode, organizationType.naicsCode) &&
        Objects.equals(this.isicCode, organizationType.isicCode) &&
        Objects.equals(this.value, organizationType.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(naicsCode, isicCode, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationType {\n");
    sb.append("    naicsCode: ").append(toIndentedString(naicsCode)).append("\n");
    sb.append("    isicCode: ").append(toIndentedString(isicCode)).append("\n");
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

