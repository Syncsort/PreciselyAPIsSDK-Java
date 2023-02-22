/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 14.0.0
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
import com.precisely.apis.model.Community;
import com.precisely.apis.model.CrimeBoundary;
import com.precisely.apis.model.FloodZone;
import com.precisely.apis.model.RiskAddress;
import com.precisely.apis.model.State;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FloodRiskResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-17T17:59:08.288488200+05:30[Asia/Calcutta]")
public class FloodRiskResponse {
  public static final String SERIALIZED_NAME_OBJECT_ID = "objectId";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private String objectId;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private State state;

  public static final String SERIALIZED_NAME_FLOOD_ZONE = "floodZone";
  @SerializedName(SERIALIZED_NAME_FLOOD_ZONE)
  private FloodZone floodZone;

  public static final String SERIALIZED_NAME_COMMUNITY = "community";
  @SerializedName(SERIALIZED_NAME_COMMUNITY)
  private Community community;

  public static final String SERIALIZED_NAME_BOUNDARY = "boundary";
  @SerializedName(SERIALIZED_NAME_BOUNDARY)
  private CrimeBoundary boundary;

  public static final String SERIALIZED_NAME_MATCHED_ADDRESS = "matchedAddress";
  @SerializedName(SERIALIZED_NAME_MATCHED_ADDRESS)
  private RiskAddress matchedAddress;

  public FloodRiskResponse() { 
  }

  public FloodRiskResponse objectId(String objectId) {
    
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


  public FloodRiskResponse state(State state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public State getState() {
    return state;
  }


  public void setState(State state) {
    this.state = state;
  }


  public FloodRiskResponse floodZone(FloodZone floodZone) {
    
    this.floodZone = floodZone;
    return this;
  }

   /**
   * Get floodZone
   * @return floodZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FloodZone getFloodZone() {
    return floodZone;
  }


  public void setFloodZone(FloodZone floodZone) {
    this.floodZone = floodZone;
  }


  public FloodRiskResponse community(Community community) {
    
    this.community = community;
    return this;
  }

   /**
   * Get community
   * @return community
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Community getCommunity() {
    return community;
  }


  public void setCommunity(Community community) {
    this.community = community;
  }


  public FloodRiskResponse boundary(CrimeBoundary boundary) {
    
    this.boundary = boundary;
    return this;
  }

   /**
   * Get boundary
   * @return boundary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CrimeBoundary getBoundary() {
    return boundary;
  }


  public void setBoundary(CrimeBoundary boundary) {
    this.boundary = boundary;
  }


  public FloodRiskResponse matchedAddress(RiskAddress matchedAddress) {
    
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RiskAddress getMatchedAddress() {
    return matchedAddress;
  }


  public void setMatchedAddress(RiskAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FloodRiskResponse floodRiskResponse = (FloodRiskResponse) o;
    return Objects.equals(this.objectId, floodRiskResponse.objectId) &&
        Objects.equals(this.state, floodRiskResponse.state) &&
        Objects.equals(this.floodZone, floodRiskResponse.floodZone) &&
        Objects.equals(this.community, floodRiskResponse.community) &&
        Objects.equals(this.boundary, floodRiskResponse.boundary) &&
        Objects.equals(this.matchedAddress, floodRiskResponse.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, state, floodZone, community, boundary, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FloodRiskResponse {\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    floodZone: ").append(toIndentedString(floodZone)).append("\n");
    sb.append("    community: ").append(toIndentedString(community)).append("\n");
    sb.append("    boundary: ").append(toIndentedString(boundary)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
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

