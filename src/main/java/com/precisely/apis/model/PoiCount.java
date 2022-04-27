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

/**
 * PoiCount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class PoiCount {
  public static final String SERIALIZED_NAME_TOTAL_POIS_FOUND = "totalPoisFound";
  @SerializedName(SERIALIZED_NAME_TOTAL_POIS_FOUND)
  private Integer totalPoisFound;

  public PoiCount() { 
  }

  public PoiCount totalPoisFound(Integer totalPoisFound) {
    
    this.totalPoisFound = totalPoisFound;
    return this;
  }

   /**
   * Get totalPoisFound
   * @return totalPoisFound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalPoisFound() {
    return totalPoisFound;
  }


  public void setTotalPoisFound(Integer totalPoisFound) {
    this.totalPoisFound = totalPoisFound;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiCount poiCount = (PoiCount) o;
    return Objects.equals(this.totalPoisFound, poiCount.totalPoisFound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPoisFound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiCount {\n");
    sb.append("    totalPoisFound: ").append(toIndentedString(totalPoisFound)).append("\n");
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

