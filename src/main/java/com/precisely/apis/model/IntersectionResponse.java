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
import com.precisely.apis.model.Address;
import com.precisely.apis.model.Intersection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IntersectionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T17:17:01.735+05:30[Asia/Calcutta]")
public class IntersectionResponse {
  public static final String SERIALIZED_NAME_INTERSECTION = "intersection";
  @SerializedName(SERIALIZED_NAME_INTERSECTION)
  private List<Intersection> intersection = null;

  public static final String SERIALIZED_NAME_MATCHED_ADDRESS = "matchedAddress";
  @SerializedName(SERIALIZED_NAME_MATCHED_ADDRESS)
  private Address matchedAddress;

  public IntersectionResponse() { 
  }

  public IntersectionResponse intersection(List<Intersection> intersection) {
    
    this.intersection = intersection;
    return this;
  }

  public IntersectionResponse addIntersectionItem(Intersection intersectionItem) {
    if (this.intersection == null) {
      this.intersection = new ArrayList<Intersection>();
    }
    this.intersection.add(intersectionItem);
    return this;
  }

   /**
   * Get intersection
   * @return intersection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Intersection> getIntersection() {
    return intersection;
  }


  public void setIntersection(List<Intersection> intersection) {
    this.intersection = intersection;
  }


  public IntersectionResponse matchedAddress(Address matchedAddress) {
    
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getMatchedAddress() {
    return matchedAddress;
  }


  public void setMatchedAddress(Address matchedAddress) {
    this.matchedAddress = matchedAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntersectionResponse intersectionResponse = (IntersectionResponse) o;
    return Objects.equals(this.intersection, intersectionResponse.intersection) &&
        Objects.equals(this.matchedAddress, intersectionResponse.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intersection, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntersectionResponse {\n");
    sb.append("    intersection: ").append(toIndentedString(intersection)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
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

