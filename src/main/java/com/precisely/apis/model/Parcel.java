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
import com.precisely.apis.model.MatchedAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Parcel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T17:17:01.735+05:30[Asia/Calcutta]")
public class Parcel {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CENSUS_CODE = "censusCode";
  @SerializedName(SERIALIZED_NAME_CENSUS_CODE)
  private String censusCode;

  public static final String SERIALIZED_NAME_PBKEY = "pbkey";
  @SerializedName(SERIALIZED_NAME_PBKEY)
  private String pbkey;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private MatchedAddress address;

  public Parcel() { 
  }

  public Parcel id(String id) {
    
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


  public Parcel censusCode(String censusCode) {
    
    this.censusCode = censusCode;
    return this;
  }

   /**
   * Get censusCode
   * @return censusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCensusCode() {
    return censusCode;
  }


  public void setCensusCode(String censusCode) {
    this.censusCode = censusCode;
  }


  public Parcel pbkey(String pbkey) {
    
    this.pbkey = pbkey;
    return this;
  }

   /**
   * Get pbkey
   * @return pbkey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPbkey() {
    return pbkey;
  }


  public void setPbkey(String pbkey) {
    this.pbkey = pbkey;
  }


  public Parcel address(MatchedAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MatchedAddress getAddress() {
    return address;
  }


  public void setAddress(MatchedAddress address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parcel parcel = (Parcel) o;
    return Objects.equals(this.id, parcel.id) &&
        Objects.equals(this.censusCode, parcel.censusCode) &&
        Objects.equals(this.pbkey, parcel.pbkey) &&
        Objects.equals(this.address, parcel.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, censusCode, pbkey, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parcel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    censusCode: ").append(toIndentedString(censusCode)).append("\n");
    sb.append("    pbkey: ").append(toIndentedString(pbkey)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

