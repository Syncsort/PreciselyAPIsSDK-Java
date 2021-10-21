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
import com.precisely.apis.model.SpecialPurposeDistrict;
import com.precisely.apis.model.TaxCounty;
import com.precisely.apis.model.TaxPlace;
import com.precisely.apis.model.TaxState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * TaxJurisdiction
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-21T13:09:30.973+05:30")
public class TaxJurisdiction   {
  @SerializedName("state")
  private TaxState state = null;

  @SerializedName("county")
  private TaxCounty county = null;

  @SerializedName("place")
  private TaxPlace place = null;

  @SerializedName("spds")
  private List<SpecialPurposeDistrict> spds = new ArrayList<SpecialPurposeDistrict>();

  public TaxJurisdiction state(TaxState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxState getState() {
    return state;
  }

  public void setState(TaxState state) {
    this.state = state;
  }

  public TaxJurisdiction county(TaxCounty county) {
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxCounty getCounty() {
    return county;
  }

  public void setCounty(TaxCounty county) {
    this.county = county;
  }

  public TaxJurisdiction place(TaxPlace place) {
    this.place = place;
    return this;
  }

   /**
   * Get place
   * @return place
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaxPlace getPlace() {
    return place;
  }

  public void setPlace(TaxPlace place) {
    this.place = place;
  }

  public TaxJurisdiction spds(List<SpecialPurposeDistrict> spds) {
    this.spds = spds;
    return this;
  }

   /**
   * Get spds
   * @return spds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SpecialPurposeDistrict> getSpds() {
    return spds;
  }

  public void setSpds(List<SpecialPurposeDistrict> spds) {
    this.spds = spds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxJurisdiction taxJurisdiction = (TaxJurisdiction) o;
    return Objects.equals(this.state, taxJurisdiction.state) &&
        Objects.equals(this.county, taxJurisdiction.county) &&
        Objects.equals(this.place, taxJurisdiction.place) &&
        Objects.equals(this.spds, taxJurisdiction.spds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, county, place, spds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxJurisdiction {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    spds: ").append(toIndentedString(spds)).append("\n");
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

