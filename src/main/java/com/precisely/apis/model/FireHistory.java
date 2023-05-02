/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 16.0.0
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
import com.precisely.apis.model.FireEventsResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FireHistory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-02T13:39:37.494742200+05:30[Asia/Calcutta]")
public class FireHistory {
  public static final String SERIALIZED_NAME_STATE_CODE = "stateCode";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  private String stateCode;

  public static final String SERIALIZED_NAME_POST_CODE = "postCode";
  @SerializedName(SERIALIZED_NAME_POST_CODE)
  private String postCode;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private FireEventsResponse events;

  public FireHistory() { 
  }

  public FireHistory stateCode(String stateCode) {
    
    this.stateCode = stateCode;
    return this;
  }

   /**
   * Get stateCode
   * @return stateCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStateCode() {
    return stateCode;
  }


  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }


  public FireHistory postCode(String postCode) {
    
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


  public FireHistory events(FireEventsResponse events) {
    
    this.events = events;
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FireEventsResponse getEvents() {
    return events;
  }


  public void setEvents(FireEventsResponse events) {
    this.events = events;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FireHistory fireHistory = (FireHistory) o;
    return Objects.equals(this.stateCode, fireHistory.stateCode) &&
        Objects.equals(this.postCode, fireHistory.postCode) &&
        Objects.equals(this.events, fireHistory.events);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stateCode, postCode, events);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FireHistory {\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

