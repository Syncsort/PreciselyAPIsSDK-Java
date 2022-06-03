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
import com.precisely.apis.model.CrimeRiskPreferences;
import com.precisely.apis.model.RiskLocations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CrimeRiskByLocationBatchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T17:17:01.735+05:30[Asia/Calcutta]")
public class CrimeRiskByLocationBatchRequest {
  public static final String SERIALIZED_NAME_LOCATIONS = "locations";
  @SerializedName(SERIALIZED_NAME_LOCATIONS)
  private List<RiskLocations> locations = new ArrayList<RiskLocations>();

  public static final String SERIALIZED_NAME_PREFERENCES = "preferences";
  @SerializedName(SERIALIZED_NAME_PREFERENCES)
  private CrimeRiskPreferences preferences;

  public CrimeRiskByLocationBatchRequest() { 
  }

  public CrimeRiskByLocationBatchRequest locations(List<RiskLocations> locations) {
    
    this.locations = locations;
    return this;
  }

  public CrimeRiskByLocationBatchRequest addLocationsItem(RiskLocations locationsItem) {
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<RiskLocations> getLocations() {
    return locations;
  }


  public void setLocations(List<RiskLocations> locations) {
    this.locations = locations;
  }


  public CrimeRiskByLocationBatchRequest preferences(CrimeRiskPreferences preferences) {
    
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CrimeRiskPreferences getPreferences() {
    return preferences;
  }


  public void setPreferences(CrimeRiskPreferences preferences) {
    this.preferences = preferences;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrimeRiskByLocationBatchRequest crimeRiskByLocationBatchRequest = (CrimeRiskByLocationBatchRequest) o;
    return Objects.equals(this.locations, crimeRiskByLocationBatchRequest.locations) &&
        Objects.equals(this.preferences, crimeRiskByLocationBatchRequest.preferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locations, preferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrimeRiskByLocationBatchRequest {\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
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

