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
import com.precisely.apis.model.FloodRiskLocationResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * FloodRiskLocationResponseList
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-21T13:09:30.973+05:30")
public class FloodRiskLocationResponseList   {
  @SerializedName("floodRisk")
  private List<FloodRiskLocationResponse> floodRisk = new ArrayList<FloodRiskLocationResponse>();

  public FloodRiskLocationResponseList floodRisk(List<FloodRiskLocationResponse> floodRisk) {
    this.floodRisk = floodRisk;
    return this;
  }

   /**
   * Get floodRisk
   * @return floodRisk
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FloodRiskLocationResponse> getFloodRisk() {
    return floodRisk;
  }

  public void setFloodRisk(List<FloodRiskLocationResponse> floodRisk) {
    this.floodRisk = floodRisk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FloodRiskLocationResponseList floodRiskLocationResponseList = (FloodRiskLocationResponseList) o;
    return Objects.equals(this.floodRisk, floodRiskLocationResponseList.floodRisk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(floodRisk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FloodRiskLocationResponseList {\n");
    
    sb.append("    floodRisk: ").append(toIndentedString(floodRisk)).append("\n");
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

