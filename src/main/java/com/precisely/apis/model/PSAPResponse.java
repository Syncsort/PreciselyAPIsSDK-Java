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
import com.precisely.apis.model.ContactPerson;
import com.precisely.apis.model.County;
import com.precisely.apis.model.Coverage;
import com.precisely.apis.model.MatchedAddress;
import com.precisely.apis.model.SiteDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * PSAPResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-21T13:09:30.973+05:30")
public class PSAPResponse   {
  @SerializedName("psapId")
  private String psapId = null;

  @SerializedName("fccId")
  private String fccId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("agency")
  private String agency = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("county")
  private County county = null;

  @SerializedName("coverage")
  private Coverage coverage = null;

  @SerializedName("contactPerson")
  private ContactPerson contactPerson = null;

  @SerializedName("siteDetails")
  private SiteDetails siteDetails = null;

  @SerializedName("mailingAddress")
  private MatchedAddress mailingAddress = null;

  public PSAPResponse psapId(String psapId) {
    this.psapId = psapId;
    return this;
  }

   /**
   * Get psapId
   * @return psapId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPsapId() {
    return psapId;
  }

  public void setPsapId(String psapId) {
    this.psapId = psapId;
  }

  public PSAPResponse fccId(String fccId) {
    this.fccId = fccId;
    return this;
  }

   /**
   * Get fccId
   * @return fccId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFccId() {
    return fccId;
  }

  public void setFccId(String fccId) {
    this.fccId = fccId;
  }

  public PSAPResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PSAPResponse count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PSAPResponse agency(String agency) {
    this.agency = agency;
    return this;
  }

   /**
   * Get agency
   * @return agency
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAgency() {
    return agency;
  }

  public void setAgency(String agency) {
    this.agency = agency;
  }

  public PSAPResponse phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public PSAPResponse county(County county) {
    this.county = county;
    return this;
  }

   /**
   * Get county
   * @return county
  **/
  @ApiModelProperty(example = "null", value = "")
  public County getCounty() {
    return county;
  }

  public void setCounty(County county) {
    this.county = county;
  }

  public PSAPResponse coverage(Coverage coverage) {
    this.coverage = coverage;
    return this;
  }

   /**
   * Get coverage
   * @return coverage
  **/
  @ApiModelProperty(example = "null", value = "")
  public Coverage getCoverage() {
    return coverage;
  }

  public void setCoverage(Coverage coverage) {
    this.coverage = coverage;
  }

  public PSAPResponse contactPerson(ContactPerson contactPerson) {
    this.contactPerson = contactPerson;
    return this;
  }

   /**
   * Get contactPerson
   * @return contactPerson
  **/
  @ApiModelProperty(example = "null", value = "")
  public ContactPerson getContactPerson() {
    return contactPerson;
  }

  public void setContactPerson(ContactPerson contactPerson) {
    this.contactPerson = contactPerson;
  }

  public PSAPResponse siteDetails(SiteDetails siteDetails) {
    this.siteDetails = siteDetails;
    return this;
  }

   /**
   * Get siteDetails
   * @return siteDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public SiteDetails getSiteDetails() {
    return siteDetails;
  }

  public void setSiteDetails(SiteDetails siteDetails) {
    this.siteDetails = siteDetails;
  }

  public PSAPResponse mailingAddress(MatchedAddress mailingAddress) {
    this.mailingAddress = mailingAddress;
    return this;
  }

   /**
   * Get mailingAddress
   * @return mailingAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public MatchedAddress getMailingAddress() {
    return mailingAddress;
  }

  public void setMailingAddress(MatchedAddress mailingAddress) {
    this.mailingAddress = mailingAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PSAPResponse pSAPResponse = (PSAPResponse) o;
    return Objects.equals(this.psapId, pSAPResponse.psapId) &&
        Objects.equals(this.fccId, pSAPResponse.fccId) &&
        Objects.equals(this.type, pSAPResponse.type) &&
        Objects.equals(this.count, pSAPResponse.count) &&
        Objects.equals(this.agency, pSAPResponse.agency) &&
        Objects.equals(this.phone, pSAPResponse.phone) &&
        Objects.equals(this.county, pSAPResponse.county) &&
        Objects.equals(this.coverage, pSAPResponse.coverage) &&
        Objects.equals(this.contactPerson, pSAPResponse.contactPerson) &&
        Objects.equals(this.siteDetails, pSAPResponse.siteDetails) &&
        Objects.equals(this.mailingAddress, pSAPResponse.mailingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(psapId, fccId, type, count, agency, phone, county, coverage, contactPerson, siteDetails, mailingAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PSAPResponse {\n");
    
    sb.append("    psapId: ").append(toIndentedString(psapId)).append("\n");
    sb.append("    fccId: ").append(toIndentedString(fccId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
    sb.append("    contactPerson: ").append(toIndentedString(contactPerson)).append("\n");
    sb.append("    siteDetails: ").append(toIndentedString(siteDetails)).append("\n");
    sb.append("    mailingAddress: ").append(toIndentedString(mailingAddress)).append("\n");
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

