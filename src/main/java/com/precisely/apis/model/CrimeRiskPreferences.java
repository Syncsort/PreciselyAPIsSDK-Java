/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 15.0.0
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
 * CrimeRiskPreferences
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-12T11:12:38.208312800+05:30[Asia/Calcutta]")
public class CrimeRiskPreferences {
  public static final String SERIALIZED_NAME_INCLUDE_GEOMETRY = "includeGeometry";
  @SerializedName(SERIALIZED_NAME_INCLUDE_GEOMETRY)
  private String includeGeometry;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public CrimeRiskPreferences() { 
  }

  public CrimeRiskPreferences includeGeometry(String includeGeometry) {
    
    this.includeGeometry = includeGeometry;
    return this;
  }

   /**
   * Get includeGeometry
   * @return includeGeometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIncludeGeometry() {
    return includeGeometry;
  }


  public void setIncludeGeometry(String includeGeometry) {
    this.includeGeometry = includeGeometry;
  }


  public CrimeRiskPreferences type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrimeRiskPreferences crimeRiskPreferences = (CrimeRiskPreferences) o;
    return Objects.equals(this.includeGeometry, crimeRiskPreferences.includeGeometry) &&
        Objects.equals(this.type, crimeRiskPreferences.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeGeometry, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrimeRiskPreferences {\n");
    sb.append("    includeGeometry: ").append(toIndentedString(includeGeometry)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

