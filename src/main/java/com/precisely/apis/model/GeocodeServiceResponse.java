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
import com.precisely.apis.model.Candidate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * GeocodeServiceResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T13:24:49.425+05:30[Asia/Calcutta]")
public class GeocodeServiceResponse {
  public static final String SERIALIZED_NAME_OBJECT_ID = "objectId";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private String objectId;

  public static final String SERIALIZED_NAME_TOTAL_POSSIBLE_CANDIDATES = "totalPossibleCandidates";
  @SerializedName(SERIALIZED_NAME_TOTAL_POSSIBLE_CANDIDATES)
  private Integer totalPossibleCandidates;

  public static final String SERIALIZED_NAME_TOTAL_MATCHES = "totalMatches";
  @SerializedName(SERIALIZED_NAME_TOTAL_MATCHES)
  private Integer totalMatches;

  public static final String SERIALIZED_NAME_CANDIDATES = "candidates";
  @SerializedName(SERIALIZED_NAME_CANDIDATES)
  private List<Candidate> candidates = null;

  public GeocodeServiceResponse() { 
  }

  public GeocodeServiceResponse objectId(String objectId) {
    
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


  public GeocodeServiceResponse totalPossibleCandidates(Integer totalPossibleCandidates) {
    
    this.totalPossibleCandidates = totalPossibleCandidates;
    return this;
  }

   /**
   * Get totalPossibleCandidates
   * @return totalPossibleCandidates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalPossibleCandidates() {
    return totalPossibleCandidates;
  }


  public void setTotalPossibleCandidates(Integer totalPossibleCandidates) {
    this.totalPossibleCandidates = totalPossibleCandidates;
  }


  public GeocodeServiceResponse totalMatches(Integer totalMatches) {
    
    this.totalMatches = totalMatches;
    return this;
  }

   /**
   * Get totalMatches
   * @return totalMatches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotalMatches() {
    return totalMatches;
  }


  public void setTotalMatches(Integer totalMatches) {
    this.totalMatches = totalMatches;
  }


  public GeocodeServiceResponse candidates(List<Candidate> candidates) {
    
    this.candidates = candidates;
    return this;
  }

  public GeocodeServiceResponse addCandidatesItem(Candidate candidatesItem) {
    if (this.candidates == null) {
      this.candidates = new ArrayList<Candidate>();
    }
    this.candidates.add(candidatesItem);
    return this;
  }

   /**
   * Get candidates
   * @return candidates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Candidate> getCandidates() {
    return candidates;
  }


  public void setCandidates(List<Candidate> candidates) {
    this.candidates = candidates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeocodeServiceResponse geocodeServiceResponse = (GeocodeServiceResponse) o;
    return Objects.equals(this.objectId, geocodeServiceResponse.objectId) &&
        Objects.equals(this.totalPossibleCandidates, geocodeServiceResponse.totalPossibleCandidates) &&
        Objects.equals(this.totalMatches, geocodeServiceResponse.totalMatches) &&
        Objects.equals(this.candidates, geocodeServiceResponse.candidates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, totalPossibleCandidates, totalMatches, candidates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeocodeServiceResponse {\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    totalPossibleCandidates: ").append(toIndentedString(totalPossibleCandidates)).append("\n");
    sb.append("    totalMatches: ").append(toIndentedString(totalMatches)).append("\n");
    sb.append("    candidates: ").append(toIndentedString(candidates)).append("\n");
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

