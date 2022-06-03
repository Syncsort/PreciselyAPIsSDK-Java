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
import com.precisely.apis.model.LocalTaxPreferences;
import com.precisely.apis.model.TaxLocations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TaxRateLocationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T17:17:01.735+05:30[Asia/Calcutta]")
public class TaxRateLocationRequest {
  public static final String SERIALIZED_NAME_PREFERENCES = "preferences";
  @SerializedName(SERIALIZED_NAME_PREFERENCES)
  private LocalTaxPreferences preferences;

  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private List<TaxLocations> locations = new ArrayList<TaxLocations>();

  public TaxRateLocationRequest() { 
  }

  public TaxRateLocationRequest preferences(LocalTaxPreferences preferences) {
    
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalTaxPreferences getPreferences() {
    return preferences;
  }


  public void setPreferences(LocalTaxPreferences preferences) {
    this.preferences = preferences;
  }


  public TaxRateLocationRequest locations(List<TaxLocations> locations) {
    
    this.locations = locations;
    return this;
  }

  public TaxRateLocationRequest addLocationsItem(TaxLocations locationsItem) {
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<TaxLocations> getLocations() {
    return locations;
  }


  public void setLocations(List<TaxLocations> locations) {
    this.locations = locations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxRateLocationRequest taxRateLocationRequest = (TaxRateLocationRequest) o;
    return Objects.equals(this.preferences, taxRateLocationRequest.preferences) &&
        Objects.equals(this.locations, taxRateLocationRequest.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferences, locations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxRateLocationRequest {\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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

