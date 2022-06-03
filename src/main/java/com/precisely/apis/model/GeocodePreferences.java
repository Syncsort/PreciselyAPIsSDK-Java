/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.3
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
import com.precisely.apis.model.FieldsMatching;
import com.precisely.apis.model.ReturnFieldsDescriptor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GeocodePreferences
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T17:17:01.735+05:30[Asia/Calcutta]")
public class GeocodePreferences {
  public static final String SERIALIZED_NAME_RETURN_ALL_CANDIDATE_INFO = "returnAllCandidateInfo";
  @SerializedName(SERIALIZED_NAME_RETURN_ALL_CANDIDATE_INFO)
  private Boolean returnAllCandidateInfo;

  public static final String SERIALIZED_NAME_FALLBACK_TO_GEOGRAPHIC = "fallbackToGeographic";
  @SerializedName(SERIALIZED_NAME_FALLBACK_TO_GEOGRAPHIC)
  private String fallbackToGeographic;

  public static final String SERIALIZED_NAME_FALLBACK_TO_POSTAL = "fallbackToPostal";
  @SerializedName(SERIALIZED_NAME_FALLBACK_TO_POSTAL)
  private String fallbackToPostal;

  public static final String SERIALIZED_NAME_MAX_RETURNED_CANDIDATES = "maxReturnedCandidates";
  @SerializedName(SERIALIZED_NAME_MAX_RETURNED_CANDIDATES)
  private String maxReturnedCandidates;

  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private String distance;

  public static final String SERIALIZED_NAME_STREET_OFFSET = "streetOffset";
  @SerializedName(SERIALIZED_NAME_STREET_OFFSET)
  private String streetOffset;

  public static final String SERIALIZED_NAME_CORNER_OFFSET = "cornerOffset";
  @SerializedName(SERIALIZED_NAME_CORNER_OFFSET)
  private String cornerOffset;

  public static final String SERIALIZED_NAME_MATCH_MODE = "matchMode";
  @SerializedName(SERIALIZED_NAME_MATCH_MODE)
  private String matchMode;

  public static final String SERIALIZED_NAME_CLIENT_LOCALE = "clientLocale";
  @SerializedName(SERIALIZED_NAME_CLIENT_LOCALE)
  private String clientLocale;

  public static final String SERIALIZED_NAME_CLIENT_COORD_SYS_NAME = "clientCoordSysName";
  @SerializedName(SERIALIZED_NAME_CLIENT_COORD_SYS_NAME)
  private String clientCoordSysName;

  public static final String SERIALIZED_NAME_DISTANCE_UNITS = "distanceUnits";
  @SerializedName(SERIALIZED_NAME_DISTANCE_UNITS)
  private String distanceUnits;

  public static final String SERIALIZED_NAME_STREET_OFFSET_UNITS = "streetOffsetUnits";
  @SerializedName(SERIALIZED_NAME_STREET_OFFSET_UNITS)
  private String streetOffsetUnits;

  public static final String SERIALIZED_NAME_CORNER_OFFSET_UNITS = "cornerOffsetUnits";
  @SerializedName(SERIALIZED_NAME_CORNER_OFFSET_UNITS)
  private String cornerOffsetUnits;

  public static final String SERIALIZED_NAME_MUST_MATCH_FIELDS = "mustMatchFields";
  @SerializedName(SERIALIZED_NAME_MUST_MATCH_FIELDS)
  private FieldsMatching mustMatchFields;

  public static final String SERIALIZED_NAME_RETURN_FIELDS_DESCRIPTOR = "returnFieldsDescriptor";
  @SerializedName(SERIALIZED_NAME_RETURN_FIELDS_DESCRIPTOR)
  private ReturnFieldsDescriptor returnFieldsDescriptor;

  public static final String SERIALIZED_NAME_OUTPUT_RECORD_TYPE = "outputRecordType";
  @SerializedName(SERIALIZED_NAME_OUTPUT_RECORD_TYPE)
  private String outputRecordType;

  public static final String SERIALIZED_NAME_CUSTOM_PREFERENCES = "customPreferences";
  @SerializedName(SERIALIZED_NAME_CUSTOM_PREFERENCES)
  private Map<String, Object> customPreferences = null;

  public static final String SERIALIZED_NAME_PREFERRED_DICTIONARY_ORDERS = "preferredDictionaryOrders";
  @SerializedName(SERIALIZED_NAME_PREFERRED_DICTIONARY_ORDERS)
  private List<String> preferredDictionaryOrders = null;

  public static final String SERIALIZED_NAME_OUTPUT_CASING = "outputCasing";
  @SerializedName(SERIALIZED_NAME_OUTPUT_CASING)
  private String outputCasing;

  public static final String SERIALIZED_NAME_LAT_LONG_OFFSET = "latLongOffset";
  @SerializedName(SERIALIZED_NAME_LAT_LONG_OFFSET)
  private String latLongOffset;

  public static final String SERIALIZED_NAME_SQUEEZE = "squeeze";
  @SerializedName(SERIALIZED_NAME_SQUEEZE)
  private String squeeze;

  public static final String SERIALIZED_NAME_RETURN_LAT_LONG_FIELDS = "returnLatLongFields";
  @SerializedName(SERIALIZED_NAME_RETURN_LAT_LONG_FIELDS)
  private String returnLatLongFields;

  public static final String SERIALIZED_NAME_USE_GEO_TAX_AUXILIARY_FILE = "useGeoTaxAuxiliaryFile";
  @SerializedName(SERIALIZED_NAME_USE_GEO_TAX_AUXILIARY_FILE)
  private String useGeoTaxAuxiliaryFile;

  public static final String SERIALIZED_NAME_LAT_LONG_FORMAT = "latLongFormat";
  @SerializedName(SERIALIZED_NAME_LAT_LONG_FORMAT)
  private String latLongFormat;

  public static final String SERIALIZED_NAME_DEFAULT_BUFFER_WIDTH = "defaultBufferWidth";
  @SerializedName(SERIALIZED_NAME_DEFAULT_BUFFER_WIDTH)
  private String defaultBufferWidth;

  public static final String SERIALIZED_NAME_RETURN_CENSUS_FIELDS = "returnCensusFields";
  @SerializedName(SERIALIZED_NAME_RETURN_CENSUS_FIELDS)
  private String returnCensusFields;

  public GeocodePreferences() { 
  }

  public GeocodePreferences returnAllCandidateInfo(Boolean returnAllCandidateInfo) {
    
    this.returnAllCandidateInfo = returnAllCandidateInfo;
    return this;
  }

   /**
   * Get returnAllCandidateInfo
   * @return returnAllCandidateInfo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getReturnAllCandidateInfo() {
    return returnAllCandidateInfo;
  }


  public void setReturnAllCandidateInfo(Boolean returnAllCandidateInfo) {
    this.returnAllCandidateInfo = returnAllCandidateInfo;
  }


  public GeocodePreferences fallbackToGeographic(String fallbackToGeographic) {
    
    this.fallbackToGeographic = fallbackToGeographic;
    return this;
  }

   /**
   * Get fallbackToGeographic
   * @return fallbackToGeographic
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFallbackToGeographic() {
    return fallbackToGeographic;
  }


  public void setFallbackToGeographic(String fallbackToGeographic) {
    this.fallbackToGeographic = fallbackToGeographic;
  }


  public GeocodePreferences fallbackToPostal(String fallbackToPostal) {
    
    this.fallbackToPostal = fallbackToPostal;
    return this;
  }

   /**
   * Get fallbackToPostal
   * @return fallbackToPostal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFallbackToPostal() {
    return fallbackToPostal;
  }


  public void setFallbackToPostal(String fallbackToPostal) {
    this.fallbackToPostal = fallbackToPostal;
  }


  public GeocodePreferences maxReturnedCandidates(String maxReturnedCandidates) {
    
    this.maxReturnedCandidates = maxReturnedCandidates;
    return this;
  }

   /**
   * Get maxReturnedCandidates
   * @return maxReturnedCandidates
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMaxReturnedCandidates() {
    return maxReturnedCandidates;
  }


  public void setMaxReturnedCandidates(String maxReturnedCandidates) {
    this.maxReturnedCandidates = maxReturnedCandidates;
  }


  public GeocodePreferences distance(String distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDistance() {
    return distance;
  }


  public void setDistance(String distance) {
    this.distance = distance;
  }


  public GeocodePreferences streetOffset(String streetOffset) {
    
    this.streetOffset = streetOffset;
    return this;
  }

   /**
   * Get streetOffset
   * @return streetOffset
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStreetOffset() {
    return streetOffset;
  }


  public void setStreetOffset(String streetOffset) {
    this.streetOffset = streetOffset;
  }


  public GeocodePreferences cornerOffset(String cornerOffset) {
    
    this.cornerOffset = cornerOffset;
    return this;
  }

   /**
   * Get cornerOffset
   * @return cornerOffset
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getCornerOffset() {
    return cornerOffset;
  }


  public void setCornerOffset(String cornerOffset) {
    this.cornerOffset = cornerOffset;
  }


  public GeocodePreferences matchMode(String matchMode) {
    
    this.matchMode = matchMode;
    return this;
  }

   /**
   * Get matchMode
   * @return matchMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMatchMode() {
    return matchMode;
  }


  public void setMatchMode(String matchMode) {
    this.matchMode = matchMode;
  }


  public GeocodePreferences clientLocale(String clientLocale) {
    
    this.clientLocale = clientLocale;
    return this;
  }

   /**
   * Get clientLocale
   * @return clientLocale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientLocale() {
    return clientLocale;
  }


  public void setClientLocale(String clientLocale) {
    this.clientLocale = clientLocale;
  }


  public GeocodePreferences clientCoordSysName(String clientCoordSysName) {
    
    this.clientCoordSysName = clientCoordSysName;
    return this;
  }

   /**
   * Get clientCoordSysName
   * @return clientCoordSysName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientCoordSysName() {
    return clientCoordSysName;
  }


  public void setClientCoordSysName(String clientCoordSysName) {
    this.clientCoordSysName = clientCoordSysName;
  }


  public GeocodePreferences distanceUnits(String distanceUnits) {
    
    this.distanceUnits = distanceUnits;
    return this;
  }

   /**
   * Get distanceUnits
   * @return distanceUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDistanceUnits() {
    return distanceUnits;
  }


  public void setDistanceUnits(String distanceUnits) {
    this.distanceUnits = distanceUnits;
  }


  public GeocodePreferences streetOffsetUnits(String streetOffsetUnits) {
    
    this.streetOffsetUnits = streetOffsetUnits;
    return this;
  }

   /**
   * Get streetOffsetUnits
   * @return streetOffsetUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreetOffsetUnits() {
    return streetOffsetUnits;
  }


  public void setStreetOffsetUnits(String streetOffsetUnits) {
    this.streetOffsetUnits = streetOffsetUnits;
  }


  public GeocodePreferences cornerOffsetUnits(String cornerOffsetUnits) {
    
    this.cornerOffsetUnits = cornerOffsetUnits;
    return this;
  }

   /**
   * Get cornerOffsetUnits
   * @return cornerOffsetUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCornerOffsetUnits() {
    return cornerOffsetUnits;
  }


  public void setCornerOffsetUnits(String cornerOffsetUnits) {
    this.cornerOffsetUnits = cornerOffsetUnits;
  }


  public GeocodePreferences mustMatchFields(FieldsMatching mustMatchFields) {
    
    this.mustMatchFields = mustMatchFields;
    return this;
  }

   /**
   * Get mustMatchFields
   * @return mustMatchFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FieldsMatching getMustMatchFields() {
    return mustMatchFields;
  }


  public void setMustMatchFields(FieldsMatching mustMatchFields) {
    this.mustMatchFields = mustMatchFields;
  }


  public GeocodePreferences returnFieldsDescriptor(ReturnFieldsDescriptor returnFieldsDescriptor) {
    
    this.returnFieldsDescriptor = returnFieldsDescriptor;
    return this;
  }

   /**
   * Get returnFieldsDescriptor
   * @return returnFieldsDescriptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReturnFieldsDescriptor getReturnFieldsDescriptor() {
    return returnFieldsDescriptor;
  }


  public void setReturnFieldsDescriptor(ReturnFieldsDescriptor returnFieldsDescriptor) {
    this.returnFieldsDescriptor = returnFieldsDescriptor;
  }


  public GeocodePreferences outputRecordType(String outputRecordType) {
    
    this.outputRecordType = outputRecordType;
    return this;
  }

   /**
   * Get outputRecordType
   * @return outputRecordType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOutputRecordType() {
    return outputRecordType;
  }


  public void setOutputRecordType(String outputRecordType) {
    this.outputRecordType = outputRecordType;
  }


  public GeocodePreferences customPreferences(Map<String, Object> customPreferences) {
    
    this.customPreferences = customPreferences;
    return this;
  }

  public GeocodePreferences putCustomPreferencesItem(String key, Object customPreferencesItem) {
    if (this.customPreferences == null) {
      this.customPreferences = new HashMap<String, Object>();
    }
    this.customPreferences.put(key, customPreferencesItem);
    return this;
  }

   /**
   * Get customPreferences
   * @return customPreferences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getCustomPreferences() {
    return customPreferences;
  }


  public void setCustomPreferences(Map<String, Object> customPreferences) {
    this.customPreferences = customPreferences;
  }


  public GeocodePreferences preferredDictionaryOrders(List<String> preferredDictionaryOrders) {
    
    this.preferredDictionaryOrders = preferredDictionaryOrders;
    return this;
  }

  public GeocodePreferences addPreferredDictionaryOrdersItem(String preferredDictionaryOrdersItem) {
    if (this.preferredDictionaryOrders == null) {
      this.preferredDictionaryOrders = new ArrayList<String>();
    }
    this.preferredDictionaryOrders.add(preferredDictionaryOrdersItem);
    return this;
  }

   /**
   * Get preferredDictionaryOrders
   * @return preferredDictionaryOrders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPreferredDictionaryOrders() {
    return preferredDictionaryOrders;
  }


  public void setPreferredDictionaryOrders(List<String> preferredDictionaryOrders) {
    this.preferredDictionaryOrders = preferredDictionaryOrders;
  }


  public GeocodePreferences outputCasing(String outputCasing) {
    
    this.outputCasing = outputCasing;
    return this;
  }

   /**
   * Get outputCasing
   * @return outputCasing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOutputCasing() {
    return outputCasing;
  }


  public void setOutputCasing(String outputCasing) {
    this.outputCasing = outputCasing;
  }


  public GeocodePreferences latLongOffset(String latLongOffset) {
    
    this.latLongOffset = latLongOffset;
    return this;
  }

   /**
   * Get latLongOffset
   * @return latLongOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLatLongOffset() {
    return latLongOffset;
  }


  public void setLatLongOffset(String latLongOffset) {
    this.latLongOffset = latLongOffset;
  }


  public GeocodePreferences squeeze(String squeeze) {
    
    this.squeeze = squeeze;
    return this;
  }

   /**
   * Get squeeze
   * @return squeeze
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSqueeze() {
    return squeeze;
  }


  public void setSqueeze(String squeeze) {
    this.squeeze = squeeze;
  }


  public GeocodePreferences returnLatLongFields(String returnLatLongFields) {
    
    this.returnLatLongFields = returnLatLongFields;
    return this;
  }

   /**
   * Get returnLatLongFields
   * @return returnLatLongFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReturnLatLongFields() {
    return returnLatLongFields;
  }


  public void setReturnLatLongFields(String returnLatLongFields) {
    this.returnLatLongFields = returnLatLongFields;
  }


  public GeocodePreferences useGeoTaxAuxiliaryFile(String useGeoTaxAuxiliaryFile) {
    
    this.useGeoTaxAuxiliaryFile = useGeoTaxAuxiliaryFile;
    return this;
  }

   /**
   * Get useGeoTaxAuxiliaryFile
   * @return useGeoTaxAuxiliaryFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUseGeoTaxAuxiliaryFile() {
    return useGeoTaxAuxiliaryFile;
  }


  public void setUseGeoTaxAuxiliaryFile(String useGeoTaxAuxiliaryFile) {
    this.useGeoTaxAuxiliaryFile = useGeoTaxAuxiliaryFile;
  }


  public GeocodePreferences latLongFormat(String latLongFormat) {
    
    this.latLongFormat = latLongFormat;
    return this;
  }

   /**
   * Get latLongFormat
   * @return latLongFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLatLongFormat() {
    return latLongFormat;
  }


  public void setLatLongFormat(String latLongFormat) {
    this.latLongFormat = latLongFormat;
  }


  public GeocodePreferences defaultBufferWidth(String defaultBufferWidth) {
    
    this.defaultBufferWidth = defaultBufferWidth;
    return this;
  }

   /**
   * Get defaultBufferWidth
   * @return defaultBufferWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefaultBufferWidth() {
    return defaultBufferWidth;
  }


  public void setDefaultBufferWidth(String defaultBufferWidth) {
    this.defaultBufferWidth = defaultBufferWidth;
  }


  public GeocodePreferences returnCensusFields(String returnCensusFields) {
    
    this.returnCensusFields = returnCensusFields;
    return this;
  }

   /**
   * Get returnCensusFields
   * @return returnCensusFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReturnCensusFields() {
    return returnCensusFields;
  }


  public void setReturnCensusFields(String returnCensusFields) {
    this.returnCensusFields = returnCensusFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeocodePreferences geocodePreferences = (GeocodePreferences) o;
    return Objects.equals(this.returnAllCandidateInfo, geocodePreferences.returnAllCandidateInfo) &&
        Objects.equals(this.fallbackToGeographic, geocodePreferences.fallbackToGeographic) &&
        Objects.equals(this.fallbackToPostal, geocodePreferences.fallbackToPostal) &&
        Objects.equals(this.maxReturnedCandidates, geocodePreferences.maxReturnedCandidates) &&
        Objects.equals(this.distance, geocodePreferences.distance) &&
        Objects.equals(this.streetOffset, geocodePreferences.streetOffset) &&
        Objects.equals(this.cornerOffset, geocodePreferences.cornerOffset) &&
        Objects.equals(this.matchMode, geocodePreferences.matchMode) &&
        Objects.equals(this.clientLocale, geocodePreferences.clientLocale) &&
        Objects.equals(this.clientCoordSysName, geocodePreferences.clientCoordSysName) &&
        Objects.equals(this.distanceUnits, geocodePreferences.distanceUnits) &&
        Objects.equals(this.streetOffsetUnits, geocodePreferences.streetOffsetUnits) &&
        Objects.equals(this.cornerOffsetUnits, geocodePreferences.cornerOffsetUnits) &&
        Objects.equals(this.mustMatchFields, geocodePreferences.mustMatchFields) &&
        Objects.equals(this.returnFieldsDescriptor, geocodePreferences.returnFieldsDescriptor) &&
        Objects.equals(this.outputRecordType, geocodePreferences.outputRecordType) &&
        Objects.equals(this.customPreferences, geocodePreferences.customPreferences) &&
        Objects.equals(this.preferredDictionaryOrders, geocodePreferences.preferredDictionaryOrders) &&
        Objects.equals(this.outputCasing, geocodePreferences.outputCasing) &&
        Objects.equals(this.latLongOffset, geocodePreferences.latLongOffset) &&
        Objects.equals(this.squeeze, geocodePreferences.squeeze) &&
        Objects.equals(this.returnLatLongFields, geocodePreferences.returnLatLongFields) &&
        Objects.equals(this.useGeoTaxAuxiliaryFile, geocodePreferences.useGeoTaxAuxiliaryFile) &&
        Objects.equals(this.latLongFormat, geocodePreferences.latLongFormat) &&
        Objects.equals(this.defaultBufferWidth, geocodePreferences.defaultBufferWidth) &&
        Objects.equals(this.returnCensusFields, geocodePreferences.returnCensusFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnAllCandidateInfo, fallbackToGeographic, fallbackToPostal, maxReturnedCandidates, distance, streetOffset, cornerOffset, matchMode, clientLocale, clientCoordSysName, distanceUnits, streetOffsetUnits, cornerOffsetUnits, mustMatchFields, returnFieldsDescriptor, outputRecordType, customPreferences, preferredDictionaryOrders, outputCasing, latLongOffset, squeeze, returnLatLongFields, useGeoTaxAuxiliaryFile, latLongFormat, defaultBufferWidth, returnCensusFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeocodePreferences {\n");
    sb.append("    returnAllCandidateInfo: ").append(toIndentedString(returnAllCandidateInfo)).append("\n");
    sb.append("    fallbackToGeographic: ").append(toIndentedString(fallbackToGeographic)).append("\n");
    sb.append("    fallbackToPostal: ").append(toIndentedString(fallbackToPostal)).append("\n");
    sb.append("    maxReturnedCandidates: ").append(toIndentedString(maxReturnedCandidates)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    streetOffset: ").append(toIndentedString(streetOffset)).append("\n");
    sb.append("    cornerOffset: ").append(toIndentedString(cornerOffset)).append("\n");
    sb.append("    matchMode: ").append(toIndentedString(matchMode)).append("\n");
    sb.append("    clientLocale: ").append(toIndentedString(clientLocale)).append("\n");
    sb.append("    clientCoordSysName: ").append(toIndentedString(clientCoordSysName)).append("\n");
    sb.append("    distanceUnits: ").append(toIndentedString(distanceUnits)).append("\n");
    sb.append("    streetOffsetUnits: ").append(toIndentedString(streetOffsetUnits)).append("\n");
    sb.append("    cornerOffsetUnits: ").append(toIndentedString(cornerOffsetUnits)).append("\n");
    sb.append("    mustMatchFields: ").append(toIndentedString(mustMatchFields)).append("\n");
    sb.append("    returnFieldsDescriptor: ").append(toIndentedString(returnFieldsDescriptor)).append("\n");
    sb.append("    outputRecordType: ").append(toIndentedString(outputRecordType)).append("\n");
    sb.append("    customPreferences: ").append(toIndentedString(customPreferences)).append("\n");
    sb.append("    preferredDictionaryOrders: ").append(toIndentedString(preferredDictionaryOrders)).append("\n");
    sb.append("    outputCasing: ").append(toIndentedString(outputCasing)).append("\n");
    sb.append("    latLongOffset: ").append(toIndentedString(latLongOffset)).append("\n");
    sb.append("    squeeze: ").append(toIndentedString(squeeze)).append("\n");
    sb.append("    returnLatLongFields: ").append(toIndentedString(returnLatLongFields)).append("\n");
    sb.append("    useGeoTaxAuxiliaryFile: ").append(toIndentedString(useGeoTaxAuxiliaryFile)).append("\n");
    sb.append("    latLongFormat: ").append(toIndentedString(latLongFormat)).append("\n");
    sb.append("    defaultBufferWidth: ").append(toIndentedString(defaultBufferWidth)).append("\n");
    sb.append("    returnCensusFields: ").append(toIndentedString(returnCensusFields)).append("\n");
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

