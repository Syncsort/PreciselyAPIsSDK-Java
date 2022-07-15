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
 * ValidateMailingAddressOptions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-15T13:23:13.677+05:30[Asia/Calcutta]")
public class ValidateMailingAddressOptions {
  public static final String SERIALIZED_NAME_OUTPUT_CASING = "OutputCasing";
  @SerializedName(SERIALIZED_NAME_OUTPUT_CASING)
  private String outputCasing = "M";

  public ValidateMailingAddressOptions() { 
  }

  public ValidateMailingAddressOptions outputCasing(String outputCasing) {
    
    this.outputCasing = outputCasing;
    return this;
  }

   /**
   * Specify the casing of the output data.
   * @return outputCasing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify the casing of the output data.")

  public String getOutputCasing() {
    return outputCasing;
  }


  public void setOutputCasing(String outputCasing) {
    this.outputCasing = outputCasing;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateMailingAddressOptions validateMailingAddressOptions = (ValidateMailingAddressOptions) o;
    return Objects.equals(this.outputCasing, validateMailingAddressOptions.outputCasing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outputCasing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateMailingAddressOptions {\n");
    sb.append("    outputCasing: ").append(toIndentedString(outputCasing)).append("\n");
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

