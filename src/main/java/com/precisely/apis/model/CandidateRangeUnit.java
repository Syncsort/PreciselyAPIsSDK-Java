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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CandidateRangeUnit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T17:17:01.735+05:30[Asia/Calcutta]")
public class CandidateRangeUnit {
  public static final String SERIALIZED_NAME_PLACE_NAME = "placeName";
  @SerializedName(SERIALIZED_NAME_PLACE_NAME)
  private String placeName;

  public static final String SERIALIZED_NAME_UNIT_TYPE = "unitType";
  @SerializedName(SERIALIZED_NAME_UNIT_TYPE)
  private String unitType;

  public static final String SERIALIZED_NAME_HIGH_UNIT_VALUE = "highUnitValue";
  @SerializedName(SERIALIZED_NAME_HIGH_UNIT_VALUE)
  private String highUnitValue;

  public static final String SERIALIZED_NAME_LOW_UNIT_VALUE = "lowUnitValue";
  @SerializedName(SERIALIZED_NAME_LOW_UNIT_VALUE)
  private String lowUnitValue;

  public static final String SERIALIZED_NAME_CUSTOM_VALUES = "customValues";
  @SerializedName(SERIALIZED_NAME_CUSTOM_VALUES)
  private Map<String, Object> customValues = null;

  public CandidateRangeUnit() { 
  }

  public CandidateRangeUnit placeName(String placeName) {
    
    this.placeName = placeName;
    return this;
  }

   /**
   * Get placeName
   * @return placeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaceName() {
    return placeName;
  }


  public void setPlaceName(String placeName) {
    this.placeName = placeName;
  }


  public CandidateRangeUnit unitType(String unitType) {
    
    this.unitType = unitType;
    return this;
  }

   /**
   * Get unitType
   * @return unitType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnitType() {
    return unitType;
  }


  public void setUnitType(String unitType) {
    this.unitType = unitType;
  }


  public CandidateRangeUnit highUnitValue(String highUnitValue) {
    
    this.highUnitValue = highUnitValue;
    return this;
  }

   /**
   * Get highUnitValue
   * @return highUnitValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHighUnitValue() {
    return highUnitValue;
  }


  public void setHighUnitValue(String highUnitValue) {
    this.highUnitValue = highUnitValue;
  }


  public CandidateRangeUnit lowUnitValue(String lowUnitValue) {
    
    this.lowUnitValue = lowUnitValue;
    return this;
  }

   /**
   * Get lowUnitValue
   * @return lowUnitValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLowUnitValue() {
    return lowUnitValue;
  }


  public void setLowUnitValue(String lowUnitValue) {
    this.lowUnitValue = lowUnitValue;
  }


  public CandidateRangeUnit customValues(Map<String, Object> customValues) {
    
    this.customValues = customValues;
    return this;
  }

  public CandidateRangeUnit putCustomValuesItem(String key, Object customValuesItem) {
    if (this.customValues == null) {
      this.customValues = new HashMap<String, Object>();
    }
    this.customValues.put(key, customValuesItem);
    return this;
  }

   /**
   * Get customValues
   * @return customValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getCustomValues() {
    return customValues;
  }


  public void setCustomValues(Map<String, Object> customValues) {
    this.customValues = customValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandidateRangeUnit candidateRangeUnit = (CandidateRangeUnit) o;
    return Objects.equals(this.placeName, candidateRangeUnit.placeName) &&
        Objects.equals(this.unitType, candidateRangeUnit.unitType) &&
        Objects.equals(this.highUnitValue, candidateRangeUnit.highUnitValue) &&
        Objects.equals(this.lowUnitValue, candidateRangeUnit.lowUnitValue) &&
        Objects.equals(this.customValues, candidateRangeUnit.customValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeName, unitType, highUnitValue, lowUnitValue, customValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateRangeUnit {\n");
    sb.append("    placeName: ").append(toIndentedString(placeName)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    highUnitValue: ").append(toIndentedString(highUnitValue)).append("\n");
    sb.append("    lowUnitValue: ").append(toIndentedString(lowUnitValue)).append("\n");
    sb.append("    customValues: ").append(toIndentedString(customValues)).append("\n");
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

