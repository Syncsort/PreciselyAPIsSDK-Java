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
import com.precisely.apis.model.RiskAddress;
import com.precisely.apis.model.RisksBoundaries;
import com.precisely.apis.model.RisksCrimeTheme;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CrimeRiskResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-12T11:12:38.208312800+05:30[Asia/Calcutta]")
public class CrimeRiskResponse {
  public static final String SERIALIZED_NAME_OBJECT_ID = "objectId";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private String objectId;

  public static final String SERIALIZED_NAME_THEMES = "themes";
  @SerializedName(SERIALIZED_NAME_THEMES)
  private List<RisksCrimeTheme> themes = null;

  public static final String SERIALIZED_NAME_BOUNDARIES = "boundaries";
  @SerializedName(SERIALIZED_NAME_BOUNDARIES)
  private RisksBoundaries boundaries;

  public static final String SERIALIZED_NAME_MATCHED_ADDRESS = "matchedAddress";
  @SerializedName(SERIALIZED_NAME_MATCHED_ADDRESS)
  private RiskAddress matchedAddress;

  public CrimeRiskResponse() { 
  }

  public CrimeRiskResponse objectId(String objectId) {
    
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


  public CrimeRiskResponse themes(List<RisksCrimeTheme> themes) {
    
    this.themes = themes;
    return this;
  }

  public CrimeRiskResponse addThemesItem(RisksCrimeTheme themesItem) {
    if (this.themes == null) {
      this.themes = new ArrayList<RisksCrimeTheme>();
    }
    this.themes.add(themesItem);
    return this;
  }

   /**
   * Get themes
   * @return themes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<RisksCrimeTheme> getThemes() {
    return themes;
  }


  public void setThemes(List<RisksCrimeTheme> themes) {
    this.themes = themes;
  }


  public CrimeRiskResponse boundaries(RisksBoundaries boundaries) {
    
    this.boundaries = boundaries;
    return this;
  }

   /**
   * Get boundaries
   * @return boundaries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RisksBoundaries getBoundaries() {
    return boundaries;
  }


  public void setBoundaries(RisksBoundaries boundaries) {
    this.boundaries = boundaries;
  }


  public CrimeRiskResponse matchedAddress(RiskAddress matchedAddress) {
    
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
    CrimeRiskResponse crimeRiskResponse = (CrimeRiskResponse) o;
    return Objects.equals(this.objectId, crimeRiskResponse.objectId) &&
        Objects.equals(this.themes, crimeRiskResponse.themes) &&
        Objects.equals(this.boundaries, crimeRiskResponse.boundaries) &&
        Objects.equals(this.matchedAddress, crimeRiskResponse.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, themes, boundaries, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrimeRiskResponse {\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    themes: ").append(toIndentedString(themes)).append("\n");
    sb.append("    boundaries: ").append(toIndentedString(boundaries)).append("\n");
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

