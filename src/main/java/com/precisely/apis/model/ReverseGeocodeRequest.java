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
import com.precisely.apis.model.GeocodePreferences;
import com.precisely.apis.model.Points;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ReverseGeocodeRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T17:17:01.735+05:30[Asia/Calcutta]")
public class ReverseGeocodeRequest {
  public static final String SERIALIZED_NAME_PREFERENCES = "preferences";
  @SerializedName(SERIALIZED_NAME_PREFERENCES)
  private GeocodePreferences preferences;

  public static final String SERIALIZED_NAME_POINTS = "points";
  @SerializedName(SERIALIZED_NAME_POINTS)
  private List<Points> points = new ArrayList<Points>();

  public ReverseGeocodeRequest() { 
  }

  public ReverseGeocodeRequest preferences(GeocodePreferences preferences) {
    
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeocodePreferences getPreferences() {
    return preferences;
  }


  public void setPreferences(GeocodePreferences preferences) {
    this.preferences = preferences;
  }


  public ReverseGeocodeRequest points(List<Points> points) {
    
    this.points = points;
    return this;
  }

  public ReverseGeocodeRequest addPointsItem(Points pointsItem) {
    this.points.add(pointsItem);
    return this;
  }

   /**
   * Get points
   * @return points
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Points> getPoints() {
    return points;
  }


  public void setPoints(List<Points> points) {
    this.points = points;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReverseGeocodeRequest reverseGeocodeRequest = (ReverseGeocodeRequest) o;
    return Objects.equals(this.preferences, reverseGeocodeRequest.preferences) &&
        Objects.equals(this.points, reverseGeocodeRequest.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferences, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReverseGeocodeRequest {\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

