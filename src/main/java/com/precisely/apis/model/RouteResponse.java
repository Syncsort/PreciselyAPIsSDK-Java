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
import com.precisely.apis.model.IntermediatePoints;
import com.precisely.apis.model.RouteDirection;
import com.precisely.apis.model.RouteGeometry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * RouteResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T17:17:01.735+05:30[Asia/Calcutta]")
public class RouteResponse {
  public static final String SERIALIZED_NAME_DIRECTIONS_STYLE = "directionsStyle";
  @SerializedName(SERIALIZED_NAME_DIRECTIONS_STYLE)
  private String directionsStyle;

  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private BigDecimal distance;

  public static final String SERIALIZED_NAME_DISTANCE_UNIT = "distanceUnit";
  @SerializedName(SERIALIZED_NAME_DISTANCE_UNIT)
  private String distanceUnit;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_TIME_UNIT = "timeUnit";
  @SerializedName(SERIALIZED_NAME_TIME_UNIT)
  private String timeUnit;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private BigDecimal time;

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private RouteGeometry geometry;

  public static final String SERIALIZED_NAME_ROUTE_DIRECTIONS = "routeDirections";
  @SerializedName(SERIALIZED_NAME_ROUTE_DIRECTIONS)
  private List<RouteDirection> routeDirections = null;

  public static final String SERIALIZED_NAME_INTERMEDIATE_POINTS = "intermediatePoints";
  @SerializedName(SERIALIZED_NAME_INTERMEDIATE_POINTS)
  private IntermediatePoints intermediatePoints;

  public RouteResponse() { 
  }

  public RouteResponse directionsStyle(String directionsStyle) {
    
    this.directionsStyle = directionsStyle;
    return this;
  }

   /**
   * Get directionsStyle
   * @return directionsStyle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDirectionsStyle() {
    return directionsStyle;
  }


  public void setDirectionsStyle(String directionsStyle) {
    this.directionsStyle = directionsStyle;
  }


  public RouteResponse distance(BigDecimal distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getDistance() {
    return distance;
  }


  public void setDistance(BigDecimal distance) {
    this.distance = distance;
  }


  public RouteResponse distanceUnit(String distanceUnit) {
    
    this.distanceUnit = distanceUnit;
    return this;
  }

   /**
   * Get distanceUnit
   * @return distanceUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDistanceUnit() {
    return distanceUnit;
  }


  public void setDistanceUnit(String distanceUnit) {
    this.distanceUnit = distanceUnit;
  }


  public RouteResponse language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public RouteResponse timeUnit(String timeUnit) {
    
    this.timeUnit = timeUnit;
    return this;
  }

   /**
   * Get timeUnit
   * @return timeUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimeUnit() {
    return timeUnit;
  }


  public void setTimeUnit(String timeUnit) {
    this.timeUnit = timeUnit;
  }


  public RouteResponse time(BigDecimal time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTime() {
    return time;
  }


  public void setTime(BigDecimal time) {
    this.time = time;
  }


  public RouteResponse geometry(RouteGeometry geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RouteGeometry getGeometry() {
    return geometry;
  }


  public void setGeometry(RouteGeometry geometry) {
    this.geometry = geometry;
  }


  public RouteResponse routeDirections(List<RouteDirection> routeDirections) {
    
    this.routeDirections = routeDirections;
    return this;
  }

  public RouteResponse addRouteDirectionsItem(RouteDirection routeDirectionsItem) {
    if (this.routeDirections == null) {
      this.routeDirections = new ArrayList<RouteDirection>();
    }
    this.routeDirections.add(routeDirectionsItem);
    return this;
  }

   /**
   * Get routeDirections
   * @return routeDirections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RouteDirection> getRouteDirections() {
    return routeDirections;
  }


  public void setRouteDirections(List<RouteDirection> routeDirections) {
    this.routeDirections = routeDirections;
  }


  public RouteResponse intermediatePoints(IntermediatePoints intermediatePoints) {
    
    this.intermediatePoints = intermediatePoints;
    return this;
  }

   /**
   * Get intermediatePoints
   * @return intermediatePoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IntermediatePoints getIntermediatePoints() {
    return intermediatePoints;
  }


  public void setIntermediatePoints(IntermediatePoints intermediatePoints) {
    this.intermediatePoints = intermediatePoints;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteResponse routeResponse = (RouteResponse) o;
    return Objects.equals(this.directionsStyle, routeResponse.directionsStyle) &&
        Objects.equals(this.distance, routeResponse.distance) &&
        Objects.equals(this.distanceUnit, routeResponse.distanceUnit) &&
        Objects.equals(this.language, routeResponse.language) &&
        Objects.equals(this.timeUnit, routeResponse.timeUnit) &&
        Objects.equals(this.time, routeResponse.time) &&
        Objects.equals(this.geometry, routeResponse.geometry) &&
        Objects.equals(this.routeDirections, routeResponse.routeDirections) &&
        Objects.equals(this.intermediatePoints, routeResponse.intermediatePoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directionsStyle, distance, distanceUnit, language, timeUnit, time, geometry, routeDirections, intermediatePoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteResponse {\n");
    sb.append("    directionsStyle: ").append(toIndentedString(directionsStyle)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    distanceUnit: ").append(toIndentedString(distanceUnit)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    routeDirections: ").append(toIndentedString(routeDirections)).append("\n");
    sb.append("    intermediatePoints: ").append(toIndentedString(intermediatePoints)).append("\n");
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

