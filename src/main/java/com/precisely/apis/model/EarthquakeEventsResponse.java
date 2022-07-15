/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.4
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
import com.precisely.apis.model.EarthquakeEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EarthquakeEventsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-15T13:23:13.677+05:30[Asia/Calcutta]")
public class EarthquakeEventsResponse {
  public static final String SERIALIZED_NAME_EARTHUAKE_EVENTS = "earthuakeEvents";
  @SerializedName(SERIALIZED_NAME_EARTHUAKE_EVENTS)
  private List<EarthquakeEvent> earthuakeEvents = null;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private List<EarthquakeEvent> event = null;

  public EarthquakeEventsResponse() { 
  }

  public EarthquakeEventsResponse earthuakeEvents(List<EarthquakeEvent> earthuakeEvents) {
    
    this.earthuakeEvents = earthuakeEvents;
    return this;
  }

  public EarthquakeEventsResponse addEarthuakeEventsItem(EarthquakeEvent earthuakeEventsItem) {
    if (this.earthuakeEvents == null) {
      this.earthuakeEvents = new ArrayList<EarthquakeEvent>();
    }
    this.earthuakeEvents.add(earthuakeEventsItem);
    return this;
  }

   /**
   * Get earthuakeEvents
   * @return earthuakeEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EarthquakeEvent> getEarthuakeEvents() {
    return earthuakeEvents;
  }


  public void setEarthuakeEvents(List<EarthquakeEvent> earthuakeEvents) {
    this.earthuakeEvents = earthuakeEvents;
  }


  public EarthquakeEventsResponse event(List<EarthquakeEvent> event) {
    
    this.event = event;
    return this;
  }

  public EarthquakeEventsResponse addEventItem(EarthquakeEvent eventItem) {
    if (this.event == null) {
      this.event = new ArrayList<EarthquakeEvent>();
    }
    this.event.add(eventItem);
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EarthquakeEvent> getEvent() {
    return event;
  }


  public void setEvent(List<EarthquakeEvent> event) {
    this.event = event;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarthquakeEventsResponse earthquakeEventsResponse = (EarthquakeEventsResponse) o;
    return Objects.equals(this.earthuakeEvents, earthquakeEventsResponse.earthuakeEvents) &&
        Objects.equals(this.event, earthquakeEventsResponse.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(earthuakeEvents, event);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarthquakeEventsResponse {\n");
    sb.append("    earthuakeEvents: ").append(toIndentedString(earthuakeEvents)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

