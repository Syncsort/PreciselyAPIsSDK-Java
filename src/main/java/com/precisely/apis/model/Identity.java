/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 10.5.0
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
import com.precisely.apis.model.IdentityDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Identity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-08T13:38:51.844+05:30")
public class Identity   {
  @SerializedName("fullName")
  private String fullName = null;

  @SerializedName("ageRange")
  private String ageRange = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("coreId")
  private String coreId = null;

  @SerializedName("pbKey")
  private String pbKey = null;

  @SerializedName("details")
  private IdentityDetail details = null;

  public Identity fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Identity ageRange(String ageRange) {
    this.ageRange = ageRange;
    return this;
  }

   /**
   * Get ageRange
   * @return ageRange
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAgeRange() {
    return ageRange;
  }

  public void setAgeRange(String ageRange) {
    this.ageRange = ageRange;
  }

  public Identity gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Identity location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Identity coreId(String coreId) {
    this.coreId = coreId;
    return this;
  }

   /**
   * Get coreId
   * @return coreId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCoreId() {
    return coreId;
  }

  public void setCoreId(String coreId) {
    this.coreId = coreId;
  }

  public Identity pbKey(String pbKey) {
    this.pbKey = pbKey;
    return this;
  }

   /**
   * Get pbKey
   * @return pbKey
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPbKey() {
    return pbKey;
  }

  public void setPbKey(String pbKey) {
    this.pbKey = pbKey;
  }

  public Identity details(IdentityDetail details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(example = "null", value = "")
  public IdentityDetail getDetails() {
    return details;
  }

  public void setDetails(IdentityDetail details) {
    this.details = details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Identity identity = (Identity) o;
    return Objects.equals(this.fullName, identity.fullName) &&
        Objects.equals(this.ageRange, identity.ageRange) &&
        Objects.equals(this.gender, identity.gender) &&
        Objects.equals(this.location, identity.location) &&
        Objects.equals(this.coreId, identity.coreId) &&
        Objects.equals(this.pbKey, identity.pbKey) &&
        Objects.equals(this.details, identity.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, ageRange, gender, location, coreId, pbKey, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Identity {\n");
    
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    ageRange: ").append(toIndentedString(ageRange)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    coreId: ").append(toIndentedString(coreId)).append("\n");
    sb.append("    pbKey: ").append(toIndentedString(pbKey)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

