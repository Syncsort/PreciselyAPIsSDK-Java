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
import com.precisely.apis.model.Area;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FireEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-15T13:23:13.677+05:30[Asia/Calcutta]")
public class FireEvent {
  public static final String SERIALIZED_NAME_FIRE_START_DATE = "fireStartDate";
  @SerializedName(SERIALIZED_NAME_FIRE_START_DATE)
  private String fireStartDate;

  public static final String SERIALIZED_NAME_FIRE_END_DATE = "fireEndDate";
  @SerializedName(SERIALIZED_NAME_FIRE_END_DATE)
  private String fireEndDate;

  public static final String SERIALIZED_NAME_FIRE_NAME = "fireName";
  @SerializedName(SERIALIZED_NAME_FIRE_NAME)
  private String fireName;

  public static final String SERIALIZED_NAME_AREA = "area";
  @SerializedName(SERIALIZED_NAME_AREA)
  private Area area;

  public static final String SERIALIZED_NAME_AGENCY = "agency";
  @SerializedName(SERIALIZED_NAME_AGENCY)
  private String agency;

  public FireEvent() { 
  }

  public FireEvent fireStartDate(String fireStartDate) {
    
    this.fireStartDate = fireStartDate;
    return this;
  }

   /**
   * Get fireStartDate
   * @return fireStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFireStartDate() {
    return fireStartDate;
  }


  public void setFireStartDate(String fireStartDate) {
    this.fireStartDate = fireStartDate;
  }


  public FireEvent fireEndDate(String fireEndDate) {
    
    this.fireEndDate = fireEndDate;
    return this;
  }

   /**
   * Get fireEndDate
   * @return fireEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFireEndDate() {
    return fireEndDate;
  }


  public void setFireEndDate(String fireEndDate) {
    this.fireEndDate = fireEndDate;
  }


  public FireEvent fireName(String fireName) {
    
    this.fireName = fireName;
    return this;
  }

   /**
   * Get fireName
   * @return fireName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFireName() {
    return fireName;
  }


  public void setFireName(String fireName) {
    this.fireName = fireName;
  }


  public FireEvent area(Area area) {
    
    this.area = area;
    return this;
  }

   /**
   * Get area
   * @return area
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Area getArea() {
    return area;
  }


  public void setArea(Area area) {
    this.area = area;
  }


  public FireEvent agency(String agency) {
    
    this.agency = agency;
    return this;
  }

   /**
   * Get agency
   * @return agency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAgency() {
    return agency;
  }


  public void setAgency(String agency) {
    this.agency = agency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FireEvent fireEvent = (FireEvent) o;
    return Objects.equals(this.fireStartDate, fireEvent.fireStartDate) &&
        Objects.equals(this.fireEndDate, fireEvent.fireEndDate) &&
        Objects.equals(this.fireName, fireEvent.fireName) &&
        Objects.equals(this.area, fireEvent.area) &&
        Objects.equals(this.agency, fireEvent.agency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fireStartDate, fireEndDate, fireName, area, agency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireEvent {\n");
    sb.append("    fireStartDate: ").append(toIndentedString(fireStartDate)).append("\n");
    sb.append("    fireEndDate: ").append(toIndentedString(fireEndDate)).append("\n");
    sb.append("    fireName: ").append(toIndentedString(fireName)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
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

