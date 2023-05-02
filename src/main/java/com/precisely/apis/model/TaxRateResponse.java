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
import com.precisely.apis.model.Census;
import com.precisely.apis.model.LatLongFields;
import com.precisely.apis.model.SalesTax;
import com.precisely.apis.model.TaxJurisdiction;
import com.precisely.apis.model.TaxRateMatchedAddress;
import com.precisely.apis.model.UseTax;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TaxRateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-02T13:39:37.494742200+05:30[Asia/Calcutta]")
public class TaxRateResponse {
  public static final String SERIALIZED_NAME_OBJECT_ID = "objectId";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private String objectId;

  public static final String SERIALIZED_NAME_VENDOR_NAME = "vendorName";
  @SerializedName(SERIALIZED_NAME_VENDOR_NAME)
  private String vendorName;

  public static final String SERIALIZED_NAME_GNIS_CODE = "gnisCode";
  @SerializedName(SERIALIZED_NAME_GNIS_CODE)
  private String gnisCode;

  public static final String SERIALIZED_NAME_CONFIDENCE = "confidence";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE)
  private Double confidence;

  public static final String SERIALIZED_NAME_JURISDICTION = "jurisdiction";
  @SerializedName(SERIALIZED_NAME_JURISDICTION)
  private TaxJurisdiction jurisdiction;

  public static final String SERIALIZED_NAME_MATCHED_ADDRESS = "matchedAddress";
  @SerializedName(SERIALIZED_NAME_MATCHED_ADDRESS)
  private TaxRateMatchedAddress matchedAddress;

  public static final String SERIALIZED_NAME_SALES_TAX = "salesTax";
  @SerializedName(SERIALIZED_NAME_SALES_TAX)
  private SalesTax salesTax;

  public static final String SERIALIZED_NAME_USE_TAX = "useTax";
  @SerializedName(SERIALIZED_NAME_USE_TAX)
  private UseTax useTax;

  public static final String SERIALIZED_NAME_CENSUS = "census";
  @SerializedName(SERIALIZED_NAME_CENSUS)
  private Census census;

  public static final String SERIALIZED_NAME_LAT_LONG_FIELDS = "latLongFields";
  @SerializedName(SERIALIZED_NAME_LAT_LONG_FIELDS)
  private LatLongFields latLongFields;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private TaxRateMatchedAddress address;

  public TaxRateResponse() { 
  }

  public TaxRateResponse objectId(String objectId) {
    
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getObjectId() {
    return objectId;
  }


  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  public TaxRateResponse vendorName(String vendorName) {
    
    this.vendorName = vendorName;
    return this;
  }

   /**
   * Get vendorName
   * @return vendorName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVendorName() {
    return vendorName;
  }


  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }


  public TaxRateResponse gnisCode(String gnisCode) {
    
    this.gnisCode = gnisCode;
    return this;
  }

   /**
   * Get gnisCode
   * @return gnisCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGnisCode() {
    return gnisCode;
  }


  public void setGnisCode(String gnisCode) {
    this.gnisCode = gnisCode;
  }


  public TaxRateResponse confidence(Double confidence) {
    
    this.confidence = confidence;
    return this;
  }

   /**
   * Get confidence
   * @return confidence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getConfidence() {
    return confidence;
  }


  public void setConfidence(Double confidence) {
    this.confidence = confidence;
  }


  public TaxRateResponse jurisdiction(TaxJurisdiction jurisdiction) {
    
    this.jurisdiction = jurisdiction;
    return this;
  }

   /**
   * Get jurisdiction
   * @return jurisdiction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaxJurisdiction getJurisdiction() {
    return jurisdiction;
  }


  public void setJurisdiction(TaxJurisdiction jurisdiction) {
    this.jurisdiction = jurisdiction;
  }


  public TaxRateResponse matchedAddress(TaxRateMatchedAddress matchedAddress) {
    
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaxRateMatchedAddress getMatchedAddress() {
    return matchedAddress;
  }


  public void setMatchedAddress(TaxRateMatchedAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
  }


  public TaxRateResponse salesTax(SalesTax salesTax) {
    
    this.salesTax = salesTax;
    return this;
  }

   /**
   * Get salesTax
   * @return salesTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SalesTax getSalesTax() {
    return salesTax;
  }


  public void setSalesTax(SalesTax salesTax) {
    this.salesTax = salesTax;
  }


  public TaxRateResponse useTax(UseTax useTax) {
    
    this.useTax = useTax;
    return this;
  }

   /**
   * Get useTax
   * @return useTax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UseTax getUseTax() {
    return useTax;
  }


  public void setUseTax(UseTax useTax) {
    this.useTax = useTax;
  }


  public TaxRateResponse census(Census census) {
    
    this.census = census;
    return this;
  }

   /**
   * Get census
   * @return census
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Census getCensus() {
    return census;
  }


  public void setCensus(Census census) {
    this.census = census;
  }


  public TaxRateResponse latLongFields(LatLongFields latLongFields) {
    
    this.latLongFields = latLongFields;
    return this;
  }

   /**
   * Get latLongFields
   * @return latLongFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LatLongFields getLatLongFields() {
    return latLongFields;
  }


  public void setLatLongFields(LatLongFields latLongFields) {
    this.latLongFields = latLongFields;
  }


  public TaxRateResponse address(TaxRateMatchedAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaxRateMatchedAddress getAddress() {
    return address;
  }


  public void setAddress(TaxRateMatchedAddress address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxRateResponse taxRateResponse = (TaxRateResponse) o;
    return Objects.equals(this.objectId, taxRateResponse.objectId) &&
        Objects.equals(this.vendorName, taxRateResponse.vendorName) &&
        Objects.equals(this.gnisCode, taxRateResponse.gnisCode) &&
        Objects.equals(this.confidence, taxRateResponse.confidence) &&
        Objects.equals(this.jurisdiction, taxRateResponse.jurisdiction) &&
        Objects.equals(this.matchedAddress, taxRateResponse.matchedAddress) &&
        Objects.equals(this.salesTax, taxRateResponse.salesTax) &&
        Objects.equals(this.useTax, taxRateResponse.useTax) &&
        Objects.equals(this.census, taxRateResponse.census) &&
        Objects.equals(this.latLongFields, taxRateResponse.latLongFields) &&
        Objects.equals(this.address, taxRateResponse.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, vendorName, gnisCode, confidence, jurisdiction, matchedAddress, salesTax, useTax, census, latLongFields, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxRateResponse {\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    gnisCode: ").append(toIndentedString(gnisCode)).append("\n");
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    jurisdiction: ").append(toIndentedString(jurisdiction)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
    sb.append("    salesTax: ").append(toIndentedString(salesTax)).append("\n");
    sb.append("    useTax: ").append(toIndentedString(useTax)).append("\n");
    sb.append("    census: ").append(toIndentedString(census)).append("\n");
    sb.append("    latLongFields: ").append(toIndentedString(latLongFields)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

