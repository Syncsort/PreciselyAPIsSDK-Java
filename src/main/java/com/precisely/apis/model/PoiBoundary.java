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
import com.precisely.apis.model.CommonGeometry;
import com.precisely.apis.model.GeoZoneGeometry;
import com.precisely.apis.model.MatchedAddress;
import com.precisely.apis.model.Poi;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * PoiBoundary
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-21T13:09:30.973+05:30")
public class PoiBoundary   {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("center")
  private GeoZoneGeometry center = null;

  @SerializedName("countyfips")
  private String countyfips = null;

  @SerializedName("geometry")
  private CommonGeometry geometry = null;

  @SerializedName("poiList")
  private List<Poi> poiList = new ArrayList<Poi>();

  @SerializedName("matchedAddress")
  private MatchedAddress matchedAddress = null;

  @SerializedName("id")
  private String id = null;

  public PoiBoundary objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public PoiBoundary center(GeoZoneGeometry center) {
    this.center = center;
    return this;
  }

   /**
   * Get center
   * @return center
  **/
  @ApiModelProperty(example = "null", value = "")
  public GeoZoneGeometry getCenter() {
    return center;
  }

  public void setCenter(GeoZoneGeometry center) {
    this.center = center;
  }

  public PoiBoundary countyfips(String countyfips) {
    this.countyfips = countyfips;
    return this;
  }

   /**
   * Get countyfips
   * @return countyfips
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountyfips() {
    return countyfips;
  }

  public void setCountyfips(String countyfips) {
    this.countyfips = countyfips;
  }

  public PoiBoundary geometry(CommonGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public CommonGeometry getGeometry() {
    return geometry;
  }

  public void setGeometry(CommonGeometry geometry) {
    this.geometry = geometry;
  }

  public PoiBoundary poiList(List<Poi> poiList) {
    this.poiList = poiList;
    return this;
  }

   /**
   * Get poiList
   * @return poiList
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Poi> getPoiList() {
    return poiList;
  }

  public void setPoiList(List<Poi> poiList) {
    this.poiList = poiList;
  }

  public PoiBoundary matchedAddress(MatchedAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public MatchedAddress getMatchedAddress() {
    return matchedAddress;
  }

  public void setMatchedAddress(MatchedAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
  }

  public PoiBoundary id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiBoundary poiBoundary = (PoiBoundary) o;
    return Objects.equals(this.objectId, poiBoundary.objectId) &&
        Objects.equals(this.center, poiBoundary.center) &&
        Objects.equals(this.countyfips, poiBoundary.countyfips) &&
        Objects.equals(this.geometry, poiBoundary.geometry) &&
        Objects.equals(this.poiList, poiBoundary.poiList) &&
        Objects.equals(this.matchedAddress, poiBoundary.matchedAddress) &&
        Objects.equals(this.id, poiBoundary.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, center, countyfips, geometry, poiList, matchedAddress, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiBoundary {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    center: ").append(toIndentedString(center)).append("\n");
    sb.append("    countyfips: ").append(toIndentedString(countyfips)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    poiList: ").append(toIndentedString(poiList)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

