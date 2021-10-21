/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.6.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.precisely.apis.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.precisely.apis.model.Accuracy;
import com.precisely.apis.model.GeoLocationFixedLineCountry;
import com.precisely.apis.model.Geometry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * GeoLocationFixedLine
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-21T13:09:30.973+05:30")
public class GeoLocationFixedLine   {
  @SerializedName("geometry")
  private Geometry geometry = null;

  @SerializedName("accuracy")
  private Accuracy accuracy = null;

  @SerializedName("deviceId")
  private String deviceId = null;

  @SerializedName("country")
  private GeoLocationFixedLineCountry country = null;

  public GeoLocationFixedLine geometry(Geometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public Geometry getGeometry() {
    return geometry;
  }

  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }

  public GeoLocationFixedLine accuracy(Accuracy accuracy) {
    this.accuracy = accuracy;
    return this;
  }

   /**
   * Get accuracy
   * @return accuracy
  **/
  @ApiModelProperty(example = "null", value = "")
  public Accuracy getAccuracy() {
    return accuracy;
  }

  public void setAccuracy(Accuracy accuracy) {
    this.accuracy = accuracy;
  }

  public GeoLocationFixedLine deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public GeoLocationFixedLine country(GeoLocationFixedLineCountry country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(example = "null", value = "")
  public GeoLocationFixedLineCountry getCountry() {
    return country;
  }

  public void setCountry(GeoLocationFixedLineCountry country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoLocationFixedLine geoLocationFixedLine = (GeoLocationFixedLine) o;
    return Objects.equals(this.geometry, geoLocationFixedLine.geometry) &&
        Objects.equals(this.accuracy, geoLocationFixedLine.accuracy) &&
        Objects.equals(this.deviceId, geoLocationFixedLine.deviceId) &&
        Objects.equals(this.country, geoLocationFixedLine.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(geometry, accuracy, deviceId, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoLocationFixedLine {\n");
    
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    accuracy: ").append(toIndentedString(accuracy)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

