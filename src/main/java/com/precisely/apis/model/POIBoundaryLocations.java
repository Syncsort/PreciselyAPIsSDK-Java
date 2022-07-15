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
import com.precisely.apis.model.ZonesGeometry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * POIBoundaryLocations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-15T13:23:13.677+05:30[Asia/Calcutta]")
public class POIBoundaryLocations {
  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private ZonesGeometry geometry;

  public static final String SERIALIZED_NAME_PURCHASE_AMOUNT = "purchaseAmount";
  @SerializedName(SERIALIZED_NAME_PURCHASE_AMOUNT)
  private String purchaseAmount;

  public static final String SERIALIZED_NAME_OBJECT_ID = "objectId";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private String objectId;

  public POIBoundaryLocations() { 
  }

  public POIBoundaryLocations geometry(ZonesGeometry geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ZonesGeometry getGeometry() {
    return geometry;
  }


  public void setGeometry(ZonesGeometry geometry) {
    this.geometry = geometry;
  }


  public POIBoundaryLocations purchaseAmount(String purchaseAmount) {
    
    this.purchaseAmount = purchaseAmount;
    return this;
  }

   /**
   * Get purchaseAmount
   * @return purchaseAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPurchaseAmount() {
    return purchaseAmount;
  }


  public void setPurchaseAmount(String purchaseAmount) {
    this.purchaseAmount = purchaseAmount;
  }


  public POIBoundaryLocations objectId(String objectId) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    POIBoundaryLocations poIBoundaryLocations = (POIBoundaryLocations) o;
    return Objects.equals(this.geometry, poIBoundaryLocations.geometry) &&
        Objects.equals(this.purchaseAmount, poIBoundaryLocations.purchaseAmount) &&
        Objects.equals(this.objectId, poIBoundaryLocations.objectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geometry, purchaseAmount, objectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class POIBoundaryLocations {\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    purchaseAmount: ").append(toIndentedString(purchaseAmount)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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

