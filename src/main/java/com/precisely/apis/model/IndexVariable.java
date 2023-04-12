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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IndexVariable
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-12T11:12:38.208312800+05:30[Asia/Calcutta]")
public class IndexVariable {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private String score;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_PERCENTILE = "percentile";
  @SerializedName(SERIALIZED_NAME_PERCENTILE)
  private String percentile;

  public static final String SERIALIZED_NAME_STATE_SCORE = "stateScore";
  @SerializedName(SERIALIZED_NAME_STATE_SCORE)
  private String stateScore;

  public IndexVariable() { 
  }

  public IndexVariable name(String name) {
    
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


  public IndexVariable score(String score) {
    
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getScore() {
    return score;
  }


  public void setScore(String score) {
    this.score = score;
  }


  public IndexVariable category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public IndexVariable percentile(String percentile) {
    
    this.percentile = percentile;
    return this;
  }

   /**
   * Get percentile
   * @return percentile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPercentile() {
    return percentile;
  }


  public void setPercentile(String percentile) {
    this.percentile = percentile;
  }


  public IndexVariable stateScore(String stateScore) {
    
    this.stateScore = stateScore;
    return this;
  }

   /**
   * Get stateScore
   * @return stateScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStateScore() {
    return stateScore;
  }


  public void setStateScore(String stateScore) {
    this.stateScore = stateScore;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndexVariable indexVariable = (IndexVariable) o;
    return Objects.equals(this.name, indexVariable.name) &&
        Objects.equals(this.score, indexVariable.score) &&
        Objects.equals(this.category, indexVariable.category) &&
        Objects.equals(this.percentile, indexVariable.percentile) &&
        Objects.equals(this.stateScore, indexVariable.stateScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, score, category, percentile, stateScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndexVariable {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    percentile: ").append(toIndentedString(percentile)).append("\n");
    sb.append("    stateScore: ").append(toIndentedString(stateScore)).append("\n");
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

