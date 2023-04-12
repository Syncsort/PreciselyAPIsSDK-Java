/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 15.0.0
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
import com.precisely.apis.model.Address;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TimezoneResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-12T11:12:38.208312800+05:30[Asia/Calcutta]")
public class TimezoneResponse {
  public static final String SERIALIZED_NAME_OBJECT_ID = "objectId";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private String objectId;

  public static final String SERIALIZED_NAME_TIMEZONE_NAME = "timezoneName";
  @SerializedName(SERIALIZED_NAME_TIMEZONE_NAME)
  private String timezoneName;

  public static final String SERIALIZED_NAME_ZONE_TYPE = "zoneType";
  @SerializedName(SERIALIZED_NAME_ZONE_TYPE)
  private String zoneType;

  public static final String SERIALIZED_NAME_UTC_OFFSET = "utcOffset";
  @SerializedName(SERIALIZED_NAME_UTC_OFFSET)
  private Long utcOffset;

  public static final String SERIALIZED_NAME_DST_OFFSET = "dstOffset";
  @SerializedName(SERIALIZED_NAME_DST_OFFSET)
  private Long dstOffset;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private Long timestamp;

  public static final String SERIALIZED_NAME_MATCHED_ADDRESS = "matchedAddress";
  @SerializedName(SERIALIZED_NAME_MATCHED_ADDRESS)
  private Address matchedAddress;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_TZ_VALID_FROM = "tzValidFrom";
  @SerializedName(SERIALIZED_NAME_TZ_VALID_FROM)
  private String tzValidFrom;

  public static final String SERIALIZED_NAME_TZ_VALID_UNTILL = "tzValidUntill";
  @SerializedName(SERIALIZED_NAME_TZ_VALID_UNTILL)
  private String tzValidUntill;

  public static final String SERIALIZED_NAME_DST_RULE = "dstRule";
  @SerializedName(SERIALIZED_NAME_DST_RULE)
  private String dstRule;

  public static final String SERIALIZED_NAME_DST_VALID_FROM = "dstValidFrom";
  @SerializedName(SERIALIZED_NAME_DST_VALID_FROM)
  private String dstValidFrom;

  public static final String SERIALIZED_NAME_DST_VALID_UNTILL = "dstValidUntill";
  @SerializedName(SERIALIZED_NAME_DST_VALID_UNTILL)
  private String dstValidUntill;

  public static final String SERIALIZED_NAME_DST_START_DATE_FORMAT = "dstStartDateFormat";
  @SerializedName(SERIALIZED_NAME_DST_START_DATE_FORMAT)
  private String dstStartDateFormat;

  public static final String SERIALIZED_NAME_DST_END_DATE_FORMAT = "dstEndDateFormat";
  @SerializedName(SERIALIZED_NAME_DST_END_DATE_FORMAT)
  private String dstEndDateFormat;

  public static final String SERIALIZED_NAME_DST_START_DATE = "dstStartDate";
  @SerializedName(SERIALIZED_NAME_DST_START_DATE)
  private String dstStartDate;

  public static final String SERIALIZED_NAME_DST_START_TIME = "dstStartTime";
  @SerializedName(SERIALIZED_NAME_DST_START_TIME)
  private String dstStartTime;

  public static final String SERIALIZED_NAME_DST_END_TIME = "dstEndTime";
  @SerializedName(SERIALIZED_NAME_DST_END_TIME)
  private String dstEndTime;

  public static final String SERIALIZED_NAME_DST_END_DATE = "dstEndDate";
  @SerializedName(SERIALIZED_NAME_DST_END_DATE)
  private String dstEndDate;

  public TimezoneResponse() { 
  }

  public TimezoneResponse objectId(String objectId) {
    
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


  public TimezoneResponse timezoneName(String timezoneName) {
    
    this.timezoneName = timezoneName;
    return this;
  }

   /**
   * Get timezoneName
   * @return timezoneName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimezoneName() {
    return timezoneName;
  }


  public void setTimezoneName(String timezoneName) {
    this.timezoneName = timezoneName;
  }


  public TimezoneResponse zoneType(String zoneType) {
    
    this.zoneType = zoneType;
    return this;
  }

   /**
   * Get zoneType
   * @return zoneType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZoneType() {
    return zoneType;
  }


  public void setZoneType(String zoneType) {
    this.zoneType = zoneType;
  }


  public TimezoneResponse utcOffset(Long utcOffset) {
    
    this.utcOffset = utcOffset;
    return this;
  }

   /**
   * Get utcOffset
   * @return utcOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUtcOffset() {
    return utcOffset;
  }


  public void setUtcOffset(Long utcOffset) {
    this.utcOffset = utcOffset;
  }


  public TimezoneResponse dstOffset(Long dstOffset) {
    
    this.dstOffset = dstOffset;
    return this;
  }

   /**
   * Get dstOffset
   * @return dstOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getDstOffset() {
    return dstOffset;
  }


  public void setDstOffset(Long dstOffset) {
    this.dstOffset = dstOffset;
  }


  public TimezoneResponse timestamp(Long timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  public TimezoneResponse matchedAddress(Address matchedAddress) {
    
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getMatchedAddress() {
    return matchedAddress;
  }


  public void setMatchedAddress(Address matchedAddress) {
    this.matchedAddress = matchedAddress;
  }


  public TimezoneResponse country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public TimezoneResponse tzValidFrom(String tzValidFrom) {
    
    this.tzValidFrom = tzValidFrom;
    return this;
  }

   /**
   * Get tzValidFrom
   * @return tzValidFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTzValidFrom() {
    return tzValidFrom;
  }


  public void setTzValidFrom(String tzValidFrom) {
    this.tzValidFrom = tzValidFrom;
  }


  public TimezoneResponse tzValidUntill(String tzValidUntill) {
    
    this.tzValidUntill = tzValidUntill;
    return this;
  }

   /**
   * Get tzValidUntill
   * @return tzValidUntill
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTzValidUntill() {
    return tzValidUntill;
  }


  public void setTzValidUntill(String tzValidUntill) {
    this.tzValidUntill = tzValidUntill;
  }


  public TimezoneResponse dstRule(String dstRule) {
    
    this.dstRule = dstRule;
    return this;
  }

   /**
   * Get dstRule
   * @return dstRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDstRule() {
    return dstRule;
  }


  public void setDstRule(String dstRule) {
    this.dstRule = dstRule;
  }


  public TimezoneResponse dstValidFrom(String dstValidFrom) {
    
    this.dstValidFrom = dstValidFrom;
    return this;
  }

   /**
   * Get dstValidFrom
   * @return dstValidFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDstValidFrom() {
    return dstValidFrom;
  }


  public void setDstValidFrom(String dstValidFrom) {
    this.dstValidFrom = dstValidFrom;
  }


  public TimezoneResponse dstValidUntill(String dstValidUntill) {
    
    this.dstValidUntill = dstValidUntill;
    return this;
  }

   /**
   * Get dstValidUntill
   * @return dstValidUntill
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDstValidUntill() {
    return dstValidUntill;
  }


  public void setDstValidUntill(String dstValidUntill) {
    this.dstValidUntill = dstValidUntill;
  }


  public TimezoneResponse dstStartDateFormat(String dstStartDateFormat) {
    
    this.dstStartDateFormat = dstStartDateFormat;
    return this;
  }

   /**
   * Get dstStartDateFormat
   * @return dstStartDateFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDstStartDateFormat() {
    return dstStartDateFormat;
  }


  public void setDstStartDateFormat(String dstStartDateFormat) {
    this.dstStartDateFormat = dstStartDateFormat;
  }


  public TimezoneResponse dstEndDateFormat(String dstEndDateFormat) {
    
    this.dstEndDateFormat = dstEndDateFormat;
    return this;
  }

   /**
   * Get dstEndDateFormat
   * @return dstEndDateFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDstEndDateFormat() {
    return dstEndDateFormat;
  }


  public void setDstEndDateFormat(String dstEndDateFormat) {
    this.dstEndDateFormat = dstEndDateFormat;
  }


  public TimezoneResponse dstStartDate(String dstStartDate) {
    
    this.dstStartDate = dstStartDate;
    return this;
  }

   /**
   * Get dstStartDate
   * @return dstStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDstStartDate() {
    return dstStartDate;
  }


  public void setDstStartDate(String dstStartDate) {
    this.dstStartDate = dstStartDate;
  }


  public TimezoneResponse dstStartTime(String dstStartTime) {
    
    this.dstStartTime = dstStartTime;
    return this;
  }

   /**
   * Get dstStartTime
   * @return dstStartTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDstStartTime() {
    return dstStartTime;
  }


  public void setDstStartTime(String dstStartTime) {
    this.dstStartTime = dstStartTime;
  }


  public TimezoneResponse dstEndTime(String dstEndTime) {
    
    this.dstEndTime = dstEndTime;
    return this;
  }

   /**
   * Get dstEndTime
   * @return dstEndTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDstEndTime() {
    return dstEndTime;
  }


  public void setDstEndTime(String dstEndTime) {
    this.dstEndTime = dstEndTime;
  }


  public TimezoneResponse dstEndDate(String dstEndDate) {
    
    this.dstEndDate = dstEndDate;
    return this;
  }

   /**
   * Get dstEndDate
   * @return dstEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDstEndDate() {
    return dstEndDate;
  }


  public void setDstEndDate(String dstEndDate) {
    this.dstEndDate = dstEndDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimezoneResponse timezoneResponse = (TimezoneResponse) o;
    return Objects.equals(this.objectId, timezoneResponse.objectId) &&
        Objects.equals(this.timezoneName, timezoneResponse.timezoneName) &&
        Objects.equals(this.zoneType, timezoneResponse.zoneType) &&
        Objects.equals(this.utcOffset, timezoneResponse.utcOffset) &&
        Objects.equals(this.dstOffset, timezoneResponse.dstOffset) &&
        Objects.equals(this.timestamp, timezoneResponse.timestamp) &&
        Objects.equals(this.matchedAddress, timezoneResponse.matchedAddress) &&
        Objects.equals(this.country, timezoneResponse.country) &&
        Objects.equals(this.tzValidFrom, timezoneResponse.tzValidFrom) &&
        Objects.equals(this.tzValidUntill, timezoneResponse.tzValidUntill) &&
        Objects.equals(this.dstRule, timezoneResponse.dstRule) &&
        Objects.equals(this.dstValidFrom, timezoneResponse.dstValidFrom) &&
        Objects.equals(this.dstValidUntill, timezoneResponse.dstValidUntill) &&
        Objects.equals(this.dstStartDateFormat, timezoneResponse.dstStartDateFormat) &&
        Objects.equals(this.dstEndDateFormat, timezoneResponse.dstEndDateFormat) &&
        Objects.equals(this.dstStartDate, timezoneResponse.dstStartDate) &&
        Objects.equals(this.dstStartTime, timezoneResponse.dstStartTime) &&
        Objects.equals(this.dstEndTime, timezoneResponse.dstEndTime) &&
        Objects.equals(this.dstEndDate, timezoneResponse.dstEndDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, timezoneName, zoneType, utcOffset, dstOffset, timestamp, matchedAddress, country, tzValidFrom, tzValidUntill, dstRule, dstValidFrom, dstValidUntill, dstStartDateFormat, dstEndDateFormat, dstStartDate, dstStartTime, dstEndTime, dstEndDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimezoneResponse {\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    timezoneName: ").append(toIndentedString(timezoneName)).append("\n");
    sb.append("    zoneType: ").append(toIndentedString(zoneType)).append("\n");
    sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
    sb.append("    dstOffset: ").append(toIndentedString(dstOffset)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    tzValidFrom: ").append(toIndentedString(tzValidFrom)).append("\n");
    sb.append("    tzValidUntill: ").append(toIndentedString(tzValidUntill)).append("\n");
    sb.append("    dstRule: ").append(toIndentedString(dstRule)).append("\n");
    sb.append("    dstValidFrom: ").append(toIndentedString(dstValidFrom)).append("\n");
    sb.append("    dstValidUntill: ").append(toIndentedString(dstValidUntill)).append("\n");
    sb.append("    dstStartDateFormat: ").append(toIndentedString(dstStartDateFormat)).append("\n");
    sb.append("    dstEndDateFormat: ").append(toIndentedString(dstEndDateFormat)).append("\n");
    sb.append("    dstStartDate: ").append(toIndentedString(dstStartDate)).append("\n");
    sb.append("    dstStartTime: ").append(toIndentedString(dstStartTime)).append("\n");
    sb.append("    dstEndTime: ").append(toIndentedString(dstEndTime)).append("\n");
    sb.append("    dstEndDate: ").append(toIndentedString(dstEndDate)).append("\n");
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

