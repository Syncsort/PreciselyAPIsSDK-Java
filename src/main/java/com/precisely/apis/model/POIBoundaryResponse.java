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
import com.precisely.apis.model.PoiBoundary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * POIBoundaryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T17:17:01.735+05:30[Asia/Calcutta]")
public class POIBoundaryResponse {
  public static final String SERIALIZED_NAME_POI_BOUNDARY = "poiBoundary";
  @SerializedName(SERIALIZED_NAME_POI_BOUNDARY)
  private List<PoiBoundary> poiBoundary = null;

  public POIBoundaryResponse() { 
  }

  public POIBoundaryResponse poiBoundary(List<PoiBoundary> poiBoundary) {
    
    this.poiBoundary = poiBoundary;
    return this;
  }

  public POIBoundaryResponse addPoiBoundaryItem(PoiBoundary poiBoundaryItem) {
    if (this.poiBoundary == null) {
      this.poiBoundary = new ArrayList<PoiBoundary>();
    }
    this.poiBoundary.add(poiBoundaryItem);
    return this;
  }

   /**
   * Get poiBoundary
   * @return poiBoundary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PoiBoundary> getPoiBoundary() {
    return poiBoundary;
  }


  public void setPoiBoundary(List<PoiBoundary> poiBoundary) {
    this.poiBoundary = poiBoundary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    POIBoundaryResponse poIBoundaryResponse = (POIBoundaryResponse) o;
    return Objects.equals(this.poiBoundary, poIBoundaryResponse.poiBoundary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poiBoundary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class POIBoundaryResponse {\n");
    sb.append("    poiBoundary: ").append(toIndentedString(poiBoundary)).append("\n");
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

