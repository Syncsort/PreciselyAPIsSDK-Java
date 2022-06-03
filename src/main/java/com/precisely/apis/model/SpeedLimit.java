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
import com.precisely.apis.model.Road;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SpeedLimit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T17:17:01.735+05:30[Asia/Calcutta]")
public class SpeedLimit {
  public static final String SERIALIZED_NAME_MAX_SPEED = "maxSpeed";
  @SerializedName(SERIALIZED_NAME_MAX_SPEED)
  private String maxSpeed;

  public static final String SERIALIZED_NAME_SPEED_UNIT = "speedUnit";
  @SerializedName(SERIALIZED_NAME_SPEED_UNIT)
  private String speedUnit;

  public static final String SERIALIZED_NAME_SPEED_VERIFICATION = "speedVerification";
  @SerializedName(SERIALIZED_NAME_SPEED_VERIFICATION)
  private String speedVerification;

  public static final String SERIALIZED_NAME_AM_PEAK_AVG_SPEED = "amPeakAvgSpeed";
  @SerializedName(SERIALIZED_NAME_AM_PEAK_AVG_SPEED)
  private String amPeakAvgSpeed;

  public static final String SERIALIZED_NAME_PM_PEAK_AVG_SPEED = "pmPeakAvgSpeed";
  @SerializedName(SERIALIZED_NAME_PM_PEAK_AVG_SPEED)
  private String pmPeakAvgSpeed;

  public static final String SERIALIZED_NAME_OFF_PEAK_AVG_SPEED = "offPeakAvgSpeed";
  @SerializedName(SERIALIZED_NAME_OFF_PEAK_AVG_SPEED)
  private String offPeakAvgSpeed;

  public static final String SERIALIZED_NAME_NIGHT_AVG_SPEED = "nightAvgSpeed";
  @SerializedName(SERIALIZED_NAME_NIGHT_AVG_SPEED)
  private String nightAvgSpeed;

  public static final String SERIALIZED_NAME_WEEK_AVG_SPEED = "weekAvgSpeed";
  @SerializedName(SERIALIZED_NAME_WEEK_AVG_SPEED)
  private String weekAvgSpeed;

  public static final String SERIALIZED_NAME_ROAD = "road";
  @SerializedName(SERIALIZED_NAME_ROAD)
  private Road road;

  public SpeedLimit() { 
  }

  public SpeedLimit maxSpeed(String maxSpeed) {
    
    this.maxSpeed = maxSpeed;
    return this;
  }

   /**
   * Get maxSpeed
   * @return maxSpeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMaxSpeed() {
    return maxSpeed;
  }


  public void setMaxSpeed(String maxSpeed) {
    this.maxSpeed = maxSpeed;
  }


  public SpeedLimit speedUnit(String speedUnit) {
    
    this.speedUnit = speedUnit;
    return this;
  }

   /**
   * Get speedUnit
   * @return speedUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSpeedUnit() {
    return speedUnit;
  }


  public void setSpeedUnit(String speedUnit) {
    this.speedUnit = speedUnit;
  }


  public SpeedLimit speedVerification(String speedVerification) {
    
    this.speedVerification = speedVerification;
    return this;
  }

   /**
   * Get speedVerification
   * @return speedVerification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSpeedVerification() {
    return speedVerification;
  }


  public void setSpeedVerification(String speedVerification) {
    this.speedVerification = speedVerification;
  }


  public SpeedLimit amPeakAvgSpeed(String amPeakAvgSpeed) {
    
    this.amPeakAvgSpeed = amPeakAvgSpeed;
    return this;
  }

   /**
   * Get amPeakAvgSpeed
   * @return amPeakAvgSpeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAmPeakAvgSpeed() {
    return amPeakAvgSpeed;
  }


  public void setAmPeakAvgSpeed(String amPeakAvgSpeed) {
    this.amPeakAvgSpeed = amPeakAvgSpeed;
  }


  public SpeedLimit pmPeakAvgSpeed(String pmPeakAvgSpeed) {
    
    this.pmPeakAvgSpeed = pmPeakAvgSpeed;
    return this;
  }

   /**
   * Get pmPeakAvgSpeed
   * @return pmPeakAvgSpeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPmPeakAvgSpeed() {
    return pmPeakAvgSpeed;
  }


  public void setPmPeakAvgSpeed(String pmPeakAvgSpeed) {
    this.pmPeakAvgSpeed = pmPeakAvgSpeed;
  }


  public SpeedLimit offPeakAvgSpeed(String offPeakAvgSpeed) {
    
    this.offPeakAvgSpeed = offPeakAvgSpeed;
    return this;
  }

   /**
   * Get offPeakAvgSpeed
   * @return offPeakAvgSpeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOffPeakAvgSpeed() {
    return offPeakAvgSpeed;
  }


  public void setOffPeakAvgSpeed(String offPeakAvgSpeed) {
    this.offPeakAvgSpeed = offPeakAvgSpeed;
  }


  public SpeedLimit nightAvgSpeed(String nightAvgSpeed) {
    
    this.nightAvgSpeed = nightAvgSpeed;
    return this;
  }

   /**
   * Get nightAvgSpeed
   * @return nightAvgSpeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNightAvgSpeed() {
    return nightAvgSpeed;
  }


  public void setNightAvgSpeed(String nightAvgSpeed) {
    this.nightAvgSpeed = nightAvgSpeed;
  }


  public SpeedLimit weekAvgSpeed(String weekAvgSpeed) {
    
    this.weekAvgSpeed = weekAvgSpeed;
    return this;
  }

   /**
   * Get weekAvgSpeed
   * @return weekAvgSpeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWeekAvgSpeed() {
    return weekAvgSpeed;
  }


  public void setWeekAvgSpeed(String weekAvgSpeed) {
    this.weekAvgSpeed = weekAvgSpeed;
  }


  public SpeedLimit road(Road road) {
    
    this.road = road;
    return this;
  }

   /**
   * Get road
   * @return road
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Road getRoad() {
    return road;
  }


  public void setRoad(Road road) {
    this.road = road;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpeedLimit speedLimit = (SpeedLimit) o;
    return Objects.equals(this.maxSpeed, speedLimit.maxSpeed) &&
        Objects.equals(this.speedUnit, speedLimit.speedUnit) &&
        Objects.equals(this.speedVerification, speedLimit.speedVerification) &&
        Objects.equals(this.amPeakAvgSpeed, speedLimit.amPeakAvgSpeed) &&
        Objects.equals(this.pmPeakAvgSpeed, speedLimit.pmPeakAvgSpeed) &&
        Objects.equals(this.offPeakAvgSpeed, speedLimit.offPeakAvgSpeed) &&
        Objects.equals(this.nightAvgSpeed, speedLimit.nightAvgSpeed) &&
        Objects.equals(this.weekAvgSpeed, speedLimit.weekAvgSpeed) &&
        Objects.equals(this.road, speedLimit.road);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxSpeed, speedUnit, speedVerification, amPeakAvgSpeed, pmPeakAvgSpeed, offPeakAvgSpeed, nightAvgSpeed, weekAvgSpeed, road);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpeedLimit {\n");
    sb.append("    maxSpeed: ").append(toIndentedString(maxSpeed)).append("\n");
    sb.append("    speedUnit: ").append(toIndentedString(speedUnit)).append("\n");
    sb.append("    speedVerification: ").append(toIndentedString(speedVerification)).append("\n");
    sb.append("    amPeakAvgSpeed: ").append(toIndentedString(amPeakAvgSpeed)).append("\n");
    sb.append("    pmPeakAvgSpeed: ").append(toIndentedString(pmPeakAvgSpeed)).append("\n");
    sb.append("    offPeakAvgSpeed: ").append(toIndentedString(offPeakAvgSpeed)).append("\n");
    sb.append("    nightAvgSpeed: ").append(toIndentedString(nightAvgSpeed)).append("\n");
    sb.append("    weekAvgSpeed: ").append(toIndentedString(weekAvgSpeed)).append("\n");
    sb.append("    road: ").append(toIndentedString(road)).append("\n");
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

