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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FreeOrReducedPriceLunches
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-15T13:23:13.677+05:30[Asia/Calcutta]")
public class FreeOrReducedPriceLunches {
  public static final String SERIALIZED_NAME_FREE_LUNCHES_COUNT = "freeLunchesCount";
  @SerializedName(SERIALIZED_NAME_FREE_LUNCHES_COUNT)
  private String freeLunchesCount;

  public static final String SERIALIZED_NAME_REDUCED_PRICE_LUNCHED_COUNT = "reducedPriceLunchedCount";
  @SerializedName(SERIALIZED_NAME_REDUCED_PRICE_LUNCHED_COUNT)
  private String reducedPriceLunchedCount;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private String totalCount;

  public FreeOrReducedPriceLunches() { 
  }

  public FreeOrReducedPriceLunches freeLunchesCount(String freeLunchesCount) {
    
    this.freeLunchesCount = freeLunchesCount;
    return this;
  }

   /**
   * Get freeLunchesCount
   * @return freeLunchesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFreeLunchesCount() {
    return freeLunchesCount;
  }


  public void setFreeLunchesCount(String freeLunchesCount) {
    this.freeLunchesCount = freeLunchesCount;
  }


  public FreeOrReducedPriceLunches reducedPriceLunchedCount(String reducedPriceLunchedCount) {
    
    this.reducedPriceLunchedCount = reducedPriceLunchedCount;
    return this;
  }

   /**
   * Get reducedPriceLunchedCount
   * @return reducedPriceLunchedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReducedPriceLunchedCount() {
    return reducedPriceLunchedCount;
  }


  public void setReducedPriceLunchedCount(String reducedPriceLunchedCount) {
    this.reducedPriceLunchedCount = reducedPriceLunchedCount;
  }


  public FreeOrReducedPriceLunches totalCount(String totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(String totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FreeOrReducedPriceLunches freeOrReducedPriceLunches = (FreeOrReducedPriceLunches) o;
    return Objects.equals(this.freeLunchesCount, freeOrReducedPriceLunches.freeLunchesCount) &&
        Objects.equals(this.reducedPriceLunchedCount, freeOrReducedPriceLunches.reducedPriceLunchedCount) &&
        Objects.equals(this.totalCount, freeOrReducedPriceLunches.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freeLunchesCount, reducedPriceLunchedCount, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FreeOrReducedPriceLunches {\n");
    sb.append("    freeLunchesCount: ").append(toIndentedString(freeLunchesCount)).append("\n");
    sb.append("    reducedPriceLunchedCount: ").append(toIndentedString(reducedPriceLunchedCount)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

