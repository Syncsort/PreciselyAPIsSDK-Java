/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 16.0.0
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
 * GetPostalCodesAPIOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-02T13:39:37.494742200+05:30[Asia/Calcutta]")
public class GetPostalCodesAPIOptions {
  public static final String SERIALIZED_NAME_OUTPUT_CITY_TYPE = "OutputCityType";
  @SerializedName(SERIALIZED_NAME_OUTPUT_CITY_TYPE)
  private String outputCityType = "N";

  public static final String SERIALIZED_NAME_OUTPUT_VANITY_CITY = "OutputVanityCity";
  @SerializedName(SERIALIZED_NAME_OUTPUT_VANITY_CITY)
  private String outputVanityCity = "N";

  public GetPostalCodesAPIOptions() { 
  }

  public GetPostalCodesAPIOptions outputCityType(String outputCityType) {
    
    this.outputCityType = outputCityType;
    return this;
  }

   /**
   * Output CityType.
   * @return outputCityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Output CityType.")

  public String getOutputCityType() {
    return outputCityType;
  }


  public void setOutputCityType(String outputCityType) {
    this.outputCityType = outputCityType;
  }


  public GetPostalCodesAPIOptions outputVanityCity(String outputVanityCity) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPostalCodesAPIOptions getPostalCodesAPIOptions = (GetPostalCodesAPIOptions) o;
    return Objects.equals(this.outputCityType, getPostalCodesAPIOptions.outputCityType) &&
        Objects.equals(this.outputVanityCity, getPostalCodesAPIOptions.outputVanityCity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputCityType, outputVanityCity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPostalCodesAPIOptions {\n");
    sb.append("    outputCityType: ").append(toIndentedString(outputCityType)).append("\n");
    sb.append("    outputVanityCity: ").append(toIndentedString(outputVanityCity)).append("\n");
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

