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
import com.precisely.apis.model.City;
import com.precisely.apis.model.ConsistencyCode;
import com.precisely.apis.model.GeoLocationCountry;
import com.precisely.apis.model.GeoLocationState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GeoLocationPlace
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T13:24:49.425+05:30[Asia/Calcutta]")
public class GeoLocationPlace {
  public static final String SERIALIZED_NAME_CONTINENT = "continent";
  @SerializedName(SERIALIZED_NAME_CONTINENT)
  private String continent;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private GeoLocationCountry country;

  public static final String SERIALIZED_NAME_CONSISTENCY_CODE = "consistencyCode";
  @SerializedName(SERIALIZED_NAME_CONSISTENCY_CODE)
  private ConsistencyCode consistencyCode;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private GeoLocationState state;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private City city;

  public static final String SERIALIZED_NAME_POST_CODE = "postCode";
  @SerializedName(SERIALIZED_NAME_POST_CODE)
  private String postCode;

  public static final String SERIALIZED_NAME_POST_CODE_CONFIDENCE = "postCodeConfidence";
  @SerializedName(SERIALIZED_NAME_POST_CODE_CONFIDENCE)
  private String postCodeConfidence;

  public GeoLocationPlace() { 
  }

  public GeoLocationPlace continent(String continent) {
    
    this.continent = continent;
    return this;
  }

   /**
   * Get continent
   * @return continent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContinent() {
    return continent;
  }


  public void setContinent(String continent) {
    this.continent = continent;
  }


  public GeoLocationPlace country(GeoLocationCountry country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeoLocationCountry getCountry() {
    return country;
  }


  public void setCountry(GeoLocationCountry country) {
    this.country = country;
  }


  public GeoLocationPlace consistencyCode(ConsistencyCode consistencyCode) {
    
    this.consistencyCode = consistencyCode;
    return this;
  }

   /**
   * Get consistencyCode
   * @return consistencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConsistencyCode getConsistencyCode() {
    return consistencyCode;
  }


  public void setConsistencyCode(ConsistencyCode consistencyCode) {
    this.consistencyCode = consistencyCode;
  }


  public GeoLocationPlace region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public GeoLocationPlace state(GeoLocationState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeoLocationState getState() {
    return state;
  }


  public void setState(GeoLocationState state) {
    this.state = state;
  }


  public GeoLocationPlace city(City city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public City getCity() {
    return city;
  }


  public void setCity(City city) {
    this.city = city;
  }


  public GeoLocationPlace postCode(String postCode) {
    
    this.postCode = postCode;
    return this;
  }

   /**
   * Get postCode
   * @return postCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostCode() {
    return postCode;
  }


  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }


  public GeoLocationPlace postCodeConfidence(String postCodeConfidence) {
    
    this.postCodeConfidence = postCodeConfidence;
    return this;
  }

   /**
   * Get postCodeConfidence
   * @return postCodeConfidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostCodeConfidence() {
    return postCodeConfidence;
  }


  public void setPostCodeConfidence(String postCodeConfidence) {
    this.postCodeConfidence = postCodeConfidence;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoLocationPlace geoLocationPlace = (GeoLocationPlace) o;
    return Objects.equals(this.continent, geoLocationPlace.continent) &&
        Objects.equals(this.country, geoLocationPlace.country) &&
        Objects.equals(this.consistencyCode, geoLocationPlace.consistencyCode) &&
        Objects.equals(this.region, geoLocationPlace.region) &&
        Objects.equals(this.state, geoLocationPlace.state) &&
        Objects.equals(this.city, geoLocationPlace.city) &&
        Objects.equals(this.postCode, geoLocationPlace.postCode) &&
        Objects.equals(this.postCodeConfidence, geoLocationPlace.postCodeConfidence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(continent, country, consistencyCode, region, state, city, postCode, postCodeConfidence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoLocationPlace {\n");
    sb.append("    continent: ").append(toIndentedString(continent)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    consistencyCode: ").append(toIndentedString(consistencyCode)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    postCodeConfidence: ").append(toIndentedString(postCodeConfidence)).append("\n");
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

