/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.2
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
import com.precisely.apis.model.EmployeeCount;
import com.precisely.apis.model.ZonesContactDetails;
import com.precisely.apis.model.ZonesParentBusiness;
import com.precisely.apis.model.ZonesPoiClassification;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ZonesPoi
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class ZonesPoi {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brandName";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_TRADE_NAME = "tradeName";
  @SerializedName(SERIALIZED_NAME_TRADE_NAME)
  private String tradeName;

  public static final String SERIALIZED_NAME_FRANCHISE_NAME = "franchiseName";
  @SerializedName(SERIALIZED_NAME_FRANCHISE_NAME)
  private String franchiseName;

  public static final String SERIALIZED_NAME_OPEN24_HOURS = "open24Hours";
  @SerializedName(SERIALIZED_NAME_OPEN24_HOURS)
  private String open24Hours;

  public static final String SERIALIZED_NAME_CONTACT_DETAILS = "contactDetails";
  @SerializedName(SERIALIZED_NAME_CONTACT_DETAILS)
  private ZonesContactDetails contactDetails;

  public static final String SERIALIZED_NAME_POI_CLASSIFICATION = "poiClassification";
  @SerializedName(SERIALIZED_NAME_POI_CLASSIFICATION)
  private ZonesPoiClassification poiClassification;

  public static final String SERIALIZED_NAME_EMPLOYEE_COUNT = "employeeCount";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_COUNT)
  private EmployeeCount employeeCount;

  public static final String SERIALIZED_NAME_ORGANIZATION_STATUS_CODE = "organizationStatusCode";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_STATUS_CODE)
  private String organizationStatusCode;

  public static final String SERIALIZED_NAME_ORGANIZATION_STATUS_CODE_DESCRIPTION = "organizationStatusCodeDescription";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_STATUS_CODE_DESCRIPTION)
  private String organizationStatusCodeDescription;

  public static final String SERIALIZED_NAME_PARENT_BUSINESS = "parentBusiness";
  @SerializedName(SERIALIZED_NAME_PARENT_BUSINESS)
  private ZonesParentBusiness parentBusiness;

  public static final String SERIALIZED_NAME_TICKER_SYMBOL = "tickerSymbol";
  @SerializedName(SERIALIZED_NAME_TICKER_SYMBOL)
  private String tickerSymbol;

  public static final String SERIALIZED_NAME_EXCHANGE_NAME = "exchangeName";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_NAME)
  private String exchangeName;

  public ZonesPoi() { 
  }

  public ZonesPoi id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ZonesPoi name(String name) {
    
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


  public ZonesPoi brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * Get brandName
   * @return brandName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public ZonesPoi tradeName(String tradeName) {
    
    this.tradeName = tradeName;
    return this;
  }

   /**
   * Get tradeName
   * @return tradeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTradeName() {
    return tradeName;
  }


  public void setTradeName(String tradeName) {
    this.tradeName = tradeName;
  }


  public ZonesPoi franchiseName(String franchiseName) {
    
    this.franchiseName = franchiseName;
    return this;
  }

   /**
   * Get franchiseName
   * @return franchiseName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFranchiseName() {
    return franchiseName;
  }


  public void setFranchiseName(String franchiseName) {
    this.franchiseName = franchiseName;
  }


  public ZonesPoi open24Hours(String open24Hours) {
    
    this.open24Hours = open24Hours;
    return this;
  }

   /**
   * Get open24Hours
   * @return open24Hours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOpen24Hours() {
    return open24Hours;
  }


  public void setOpen24Hours(String open24Hours) {
    this.open24Hours = open24Hours;
  }


  public ZonesPoi contactDetails(ZonesContactDetails contactDetails) {
    
    this.contactDetails = contactDetails;
    return this;
  }

   /**
   * Get contactDetails
   * @return contactDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZonesContactDetails getContactDetails() {
    return contactDetails;
  }


  public void setContactDetails(ZonesContactDetails contactDetails) {
    this.contactDetails = contactDetails;
  }


  public ZonesPoi poiClassification(ZonesPoiClassification poiClassification) {
    
    this.poiClassification = poiClassification;
    return this;
  }

   /**
   * Get poiClassification
   * @return poiClassification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZonesPoiClassification getPoiClassification() {
    return poiClassification;
  }


  public void setPoiClassification(ZonesPoiClassification poiClassification) {
    this.poiClassification = poiClassification;
  }


  public ZonesPoi employeeCount(EmployeeCount employeeCount) {
    
    this.employeeCount = employeeCount;
    return this;
  }

   /**
   * Get employeeCount
   * @return employeeCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EmployeeCount getEmployeeCount() {
    return employeeCount;
  }


  public void setEmployeeCount(EmployeeCount employeeCount) {
    this.employeeCount = employeeCount;
  }


  public ZonesPoi organizationStatusCode(String organizationStatusCode) {
    
    this.organizationStatusCode = organizationStatusCode;
    return this;
  }

   /**
   * Get organizationStatusCode
   * @return organizationStatusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrganizationStatusCode() {
    return organizationStatusCode;
  }


  public void setOrganizationStatusCode(String organizationStatusCode) {
    this.organizationStatusCode = organizationStatusCode;
  }


  public ZonesPoi organizationStatusCodeDescription(String organizationStatusCodeDescription) {
    
    this.organizationStatusCodeDescription = organizationStatusCodeDescription;
    return this;
  }

   /**
   * Get organizationStatusCodeDescription
   * @return organizationStatusCodeDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrganizationStatusCodeDescription() {
    return organizationStatusCodeDescription;
  }


  public void setOrganizationStatusCodeDescription(String organizationStatusCodeDescription) {
    this.organizationStatusCodeDescription = organizationStatusCodeDescription;
  }


  public ZonesPoi parentBusiness(ZonesParentBusiness parentBusiness) {
    
    this.parentBusiness = parentBusiness;
    return this;
  }

   /**
   * Get parentBusiness
   * @return parentBusiness
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZonesParentBusiness getParentBusiness() {
    return parentBusiness;
  }


  public void setParentBusiness(ZonesParentBusiness parentBusiness) {
    this.parentBusiness = parentBusiness;
  }


  public ZonesPoi tickerSymbol(String tickerSymbol) {
    
    this.tickerSymbol = tickerSymbol;
    return this;
  }

   /**
   * Get tickerSymbol
   * @return tickerSymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTickerSymbol() {
    return tickerSymbol;
  }


  public void setTickerSymbol(String tickerSymbol) {
    this.tickerSymbol = tickerSymbol;
  }


  public ZonesPoi exchangeName(String exchangeName) {
    
    this.exchangeName = exchangeName;
    return this;
  }

   /**
   * Get exchangeName
   * @return exchangeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExchangeName() {
    return exchangeName;
  }


  public void setExchangeName(String exchangeName) {
    this.exchangeName = exchangeName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZonesPoi zonesPoi = (ZonesPoi) o;
    return Objects.equals(this.id, zonesPoi.id) &&
        Objects.equals(this.name, zonesPoi.name) &&
        Objects.equals(this.brandName, zonesPoi.brandName) &&
        Objects.equals(this.tradeName, zonesPoi.tradeName) &&
        Objects.equals(this.franchiseName, zonesPoi.franchiseName) &&
        Objects.equals(this.open24Hours, zonesPoi.open24Hours) &&
        Objects.equals(this.contactDetails, zonesPoi.contactDetails) &&
        Objects.equals(this.poiClassification, zonesPoi.poiClassification) &&
        Objects.equals(this.employeeCount, zonesPoi.employeeCount) &&
        Objects.equals(this.organizationStatusCode, zonesPoi.organizationStatusCode) &&
        Objects.equals(this.organizationStatusCodeDescription, zonesPoi.organizationStatusCodeDescription) &&
        Objects.equals(this.parentBusiness, zonesPoi.parentBusiness) &&
        Objects.equals(this.tickerSymbol, zonesPoi.tickerSymbol) &&
        Objects.equals(this.exchangeName, zonesPoi.exchangeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, brandName, tradeName, franchiseName, open24Hours, contactDetails, poiClassification, employeeCount, organizationStatusCode, organizationStatusCodeDescription, parentBusiness, tickerSymbol, exchangeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZonesPoi {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    tradeName: ").append(toIndentedString(tradeName)).append("\n");
    sb.append("    franchiseName: ").append(toIndentedString(franchiseName)).append("\n");
    sb.append("    open24Hours: ").append(toIndentedString(open24Hours)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    poiClassification: ").append(toIndentedString(poiClassification)).append("\n");
    sb.append("    employeeCount: ").append(toIndentedString(employeeCount)).append("\n");
    sb.append("    organizationStatusCode: ").append(toIndentedString(organizationStatusCode)).append("\n");
    sb.append("    organizationStatusCodeDescription: ").append(toIndentedString(organizationStatusCodeDescription)).append("\n");
    sb.append("    parentBusiness: ").append(toIndentedString(parentBusiness)).append("\n");
    sb.append("    tickerSymbol: ").append(toIndentedString(tickerSymbol)).append("\n");
    sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
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

