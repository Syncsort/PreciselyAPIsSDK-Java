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
 * GetCityStateProvinceAPIOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-12T11:12:38.208312800+05:30[Asia/Calcutta]")
public class GetCityStateProvinceAPIOptions {
  public static final String SERIALIZED_NAME_OUTPUT_VANITY_CITY = "OutputVanityCity";
  @SerializedName(SERIALIZED_NAME_OUTPUT_VANITY_CITY)
  private String outputVanityCity = "N";

  public static final String SERIALIZED_NAME_PERFORM_CANADIAN_PROCESSING = "PerformCanadianProcessing";
  @SerializedName(SERIALIZED_NAME_PERFORM_CANADIAN_PROCESSING)
  private String performCanadianProcessing = "Y";

  public static final String SERIALIZED_NAME_MAXIMUM_RESULTS = "MaximumResults";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_RESULTS)
  private String maximumResults = "10";

  public static final String SERIALIZED_NAME_PERFORM_U_S_PROCESSING = "PerformUSProcessing";
  @SerializedName(SERIALIZED_NAME_PERFORM_U_S_PROCESSING)
  private String performUSProcessing = "Y";

  public GetCityStateProvinceAPIOptions() { 
  }

  public GetCityStateProvinceAPIOptions outputVanityCity(String outputVanityCity) {
    
    this.outputVanityCity = outputVanityCity;
    return this;
  }

   /**
   * Output VanityCity.
   * @return outputVanityCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Output VanityCity.")

  public String getOutputVanityCity() {
    return outputVanityCity;
  }


  public void setOutputVanityCity(String outputVanityCity) {
    this.outputVanityCity = outputVanityCity;
  }


  public GetCityStateProvinceAPIOptions performCanadianProcessing(String performCanadianProcessing) {
    
    this.performCanadianProcessing = performCanadianProcessing;
    return this;
  }

   /**
   * PerformCanadianProcessing.
   * @return performCanadianProcessing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PerformCanadianProcessing.")

  public String getPerformCanadianProcessing() {
    return performCanadianProcessing;
  }


  public void setPerformCanadianProcessing(String performCanadianProcessing) {
    this.performCanadianProcessing = performCanadianProcessing;
  }


  public GetCityStateProvinceAPIOptions maximumResults(String maximumResults) {
    
    this.maximumResults = maximumResults;
    return this;
  }

   /**
   * MaximumResults.
   * @return maximumResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MaximumResults.")

  public String getMaximumResults() {
    return maximumResults;
  }


  public void setMaximumResults(String maximumResults) {
    this.maximumResults = maximumResults;
  }


  public GetCityStateProvinceAPIOptions performUSProcessing(String performUSProcessing) {
    
    this.performUSProcessing = performUSProcessing;
    return this;
  }

   /**
   * PerformUSProcessing.
   * @return performUSProcessing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PerformUSProcessing.")

  public String getPerformUSProcessing() {
    return performUSProcessing;
  }


  public void setPerformUSProcessing(String performUSProcessing) {
    this.performUSProcessing = performUSProcessing;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCityStateProvinceAPIOptions getCityStateProvinceAPIOptions = (GetCityStateProvinceAPIOptions) o;
    return Objects.equals(this.outputVanityCity, getCityStateProvinceAPIOptions.outputVanityCity) &&
        Objects.equals(this.performCanadianProcessing, getCityStateProvinceAPIOptions.performCanadianProcessing) &&
        Objects.equals(this.maximumResults, getCityStateProvinceAPIOptions.maximumResults) &&
        Objects.equals(this.performUSProcessing, getCityStateProvinceAPIOptions.performUSProcessing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputVanityCity, performCanadianProcessing, maximumResults, performUSProcessing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCityStateProvinceAPIOptions {\n");
    sb.append("    outputVanityCity: ").append(toIndentedString(outputVanityCity)).append("\n");
    sb.append("    performCanadianProcessing: ").append(toIndentedString(performCanadianProcessing)).append("\n");
    sb.append("    maximumResults: ").append(toIndentedString(maximumResults)).append("\n");
    sb.append("    performUSProcessing: ").append(toIndentedString(performUSProcessing)).append("\n");
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

