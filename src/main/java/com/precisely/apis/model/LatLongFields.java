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
import com.precisely.apis.model.LocalTaxGeometry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LatLongFields
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-02T13:39:37.494742200+05:30[Asia/Calcutta]")
public class LatLongFields {
  public static final String SERIALIZED_NAME_MATCH_CODE = "matchCode";
  @SerializedName(SERIALIZED_NAME_MATCH_CODE)
  private String matchCode;

  public static final String SERIALIZED_NAME_MATCH_LEVEL = "matchLevel";
  @SerializedName(SERIALIZED_NAME_MATCH_LEVEL)
  private String matchLevel;

  public static final String SERIALIZED_NAME_STREET_MATCH_CODE = "streetMatchCode";
  @SerializedName(SERIALIZED_NAME_STREET_MATCH_CODE)
  private String streetMatchCode;

  public static final String SERIALIZED_NAME_STREET_MATCH_LEVEL = "streetMatchLevel";
  @SerializedName(SERIALIZED_NAME_STREET_MATCH_LEVEL)
  private String streetMatchLevel;

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private LocalTaxGeometry geometry;

  public LatLongFields() { 
  }

  public LatLongFields matchCode(String matchCode) {
    
    this.matchCode = matchCode;
    return this;
  }

   /**
   * Get matchCode
   * @return matchCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMatchCode() {
    return matchCode;
  }


  public void setMatchCode(String matchCode) {
    this.matchCode = matchCode;
  }


  public LatLongFields matchLevel(String matchLevel) {
    
    this.matchLevel = matchLevel;
    return this;
  }

   /**
   * Get matchLevel
   * @return matchLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMatchLevel() {
    return matchLevel;
  }


  public void setMatchLevel(String matchLevel) {
    this.matchLevel = matchLevel;
  }


  public LatLongFields streetMatchCode(String streetMatchCode) {
    
    this.streetMatchCode = streetMatchCode;
    return this;
  }

   /**
   * Get streetMatchCode
   * @return streetMatchCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreetMatchCode() {
    return streetMatchCode;
  }


  public void setStreetMatchCode(String streetMatchCode) {
    this.streetMatchCode = streetMatchCode;
  }


  public LatLongFields streetMatchLevel(String streetMatchLevel) {
    
    this.streetMatchLevel = streetMatchLevel;
    return this;
  }

   /**
   * Get streetMatchLevel
   * @return streetMatchLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreetMatchLevel() {
    return streetMatchLevel;
  }


  public void setStreetMatchLevel(String streetMatchLevel) {
    this.streetMatchLevel = streetMatchLevel;
  }


  public LatLongFields geometry(LocalTaxGeometry geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalTaxGeometry getGeometry() {
    return geometry;
  }


  public void setGeometry(LocalTaxGeometry geometry) {
    this.geometry = geometry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LatLongFields latLongFields = (LatLongFields) o;
    return Objects.equals(this.matchCode, latLongFields.matchCode) &&
        Objects.equals(this.matchLevel, latLongFields.matchLevel) &&
        Objects.equals(this.streetMatchCode, latLongFields.streetMatchCode) &&
        Objects.equals(this.streetMatchLevel, latLongFields.streetMatchLevel) &&
        Objects.equals(this.geometry, latLongFields.geometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchCode, matchLevel, streetMatchCode, streetMatchLevel, geometry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LatLongFields {\n");
    sb.append("    matchCode: ").append(toIndentedString(matchCode)).append("\n");
    sb.append("    matchLevel: ").append(toIndentedString(matchLevel)).append("\n");
    sb.append("    streetMatchCode: ").append(toIndentedString(streetMatchCode)).append("\n");
    sb.append("    streetMatchLevel: ").append(toIndentedString(streetMatchLevel)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
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

