/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.2
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
import com.precisely.apis.model.GeoPos;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Points
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T13:24:49.425+05:30[Asia/Calcutta]")
public class Points {
  public static final String SERIALIZED_NAME_OBJECT_ID = "objectId";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private String objectId;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private GeoPos geometry;

  public Points() { 
  }

  public Points objectId(String objectId) {
    
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getObjectId() {
    return objectId;
  }


  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  public Points country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public Points geometry(GeoPos geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GeoPos getGeometry() {
    return geometry;
  }


  public void setGeometry(GeoPos geometry) {
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
    Points points = (Points) o;
    return Objects.equals(this.objectId, points.objectId) &&
        Objects.equals(this.country, points.country) &&
        Objects.equals(this.geometry, points.geometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, country, geometry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Points {\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

