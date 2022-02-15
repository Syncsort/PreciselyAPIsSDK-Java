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
import com.precisely.apis.model.Address;
import com.precisely.apis.model.AreaCodeInfo;
import com.precisely.apis.model.County;
import com.precisely.apis.model.Geometry;
import com.precisely.apis.model.Match;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RateCenterResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T13:24:49.425+05:30[Asia/Calcutta]")
public class RateCenterResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ALTERNATE_NAME = "alternateName";
  @SerializedName(SERIALIZED_NAME_ALTERNATE_NAME)
  private String alternateName;

  public static final String SERIALIZED_NAME_AREA_NAME1 = "areaName1";
  @SerializedName(SERIALIZED_NAME_AREA_NAME1)
  private String areaName1;

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private Geometry geometry;

  public static final String SERIALIZED_NAME_AREA_CODE_INFO_LIST = "areaCodeInfoList";
  @SerializedName(SERIALIZED_NAME_AREA_CODE_INFO_LIST)
  private List<AreaCodeInfo> areaCodeInfoList = null;

  public static final String SERIALIZED_NAME_MATCHED_ADDRESS = "matchedAddress";
  @SerializedName(SERIALIZED_NAME_MATCHED_ADDRESS)
  private Address matchedAddress;

  public static final String SERIALIZED_NAME_MATCH = "match";
  @SerializedName(SERIALIZED_NAME_MATCH)
  private Match match;

  public static final String SERIALIZED_NAME_COUNTY = "county";
  @SerializedName(SERIALIZED_NAME_COUNTY)
  private County county;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public RateCenterResponse() { 
  }

  public RateCenterResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RateCenterResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RateCenterResponse alternateName(String alternateName) {
    
    this.alternateName = alternateName;
    return this;
  }

   /**
   * Get alternateName
   * @return alternateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAlternateName() {
    return alternateName;
  }


  public void setAlternateName(String alternateName) {
    this.alternateName = alternateName;
  }


  public RateCenterResponse areaName1(String areaName1) {
    
    this.areaName1 = areaName1;
    return this;
  }

   /**
   * Get areaName1
   * @return areaName1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAreaName1() {
    return areaName1;
  }


  public void setAreaName1(String areaName1) {
    this.areaName1 = areaName1;
  }


  public RateCenterResponse geometry(Geometry geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Geometry getGeometry() {
    return geometry;
  }


  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }


  public RateCenterResponse areaCodeInfoList(List<AreaCodeInfo> areaCodeInfoList) {
    
    this.areaCodeInfoList = areaCodeInfoList;
    return this;
  }

  public RateCenterResponse addAreaCodeInfoListItem(AreaCodeInfo areaCodeInfoListItem) {
    if (this.areaCodeInfoList == null) {
      this.areaCodeInfoList = new ArrayList<AreaCodeInfo>();
    }
    this.areaCodeInfoList.add(areaCodeInfoListItem);
    return this;
  }

   /**
   * Get areaCodeInfoList
   * @return areaCodeInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AreaCodeInfo> getAreaCodeInfoList() {
    return areaCodeInfoList;
  }


  public void setAreaCodeInfoList(List<AreaCodeInfo> areaCodeInfoList) {
    this.areaCodeInfoList = areaCodeInfoList;
  }


  public RateCenterResponse matchedAddress(Address matchedAddress) {
    
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


  public RateCenterResponse match(Match match) {
    
    this.match = match;
    return this;
  }

   /**
   * Get match
   * @return match
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Match getMatch() {
    return match;
  }


  public void setMatch(Match match) {
    this.match = match;
  }


  public RateCenterResponse county(County county) {
    
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public County getCounty() {
    return county;
  }


  public void setCounty(County county) {
    this.county = county;
  }


  public RateCenterResponse count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public RateCenterResponse productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * Get productCode
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateCenterResponse rateCenterResponse = (RateCenterResponse) o;
    return Objects.equals(this.id, rateCenterResponse.id) &&
        Objects.equals(this.name, rateCenterResponse.name) &&
        Objects.equals(this.alternateName, rateCenterResponse.alternateName) &&
        Objects.equals(this.areaName1, rateCenterResponse.areaName1) &&
        Objects.equals(this.geometry, rateCenterResponse.geometry) &&
        Objects.equals(this.areaCodeInfoList, rateCenterResponse.areaCodeInfoList) &&
        Objects.equals(this.matchedAddress, rateCenterResponse.matchedAddress) &&
        Objects.equals(this.match, rateCenterResponse.match) &&
        Objects.equals(this.county, rateCenterResponse.county) &&
        Objects.equals(this.count, rateCenterResponse.count) &&
        Objects.equals(this.productCode, rateCenterResponse.productCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, alternateName, areaName1, geometry, areaCodeInfoList, matchedAddress, match, county, count, productCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateCenterResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alternateName: ").append(toIndentedString(alternateName)).append("\n");
    sb.append("    areaName1: ").append(toIndentedString(areaName1)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    areaCodeInfoList: ").append(toIndentedString(areaCodeInfoList)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
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

