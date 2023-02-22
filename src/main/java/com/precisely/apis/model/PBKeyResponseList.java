/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 14.0.0
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
import com.precisely.apis.model.Pbkey;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PBKeyResponseList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-17T17:59:08.288488200+05:30[Asia/Calcutta]")
public class PBKeyResponseList {
  public static final String SERIALIZED_NAME_PBKEY = "pbkey";
  @SerializedName(SERIALIZED_NAME_PBKEY)
  private List<Pbkey> pbkey = null;

  public PBKeyResponseList() { 
  }

  public PBKeyResponseList pbkey(List<Pbkey> pbkey) {
    
    this.pbkey = pbkey;
    return this;
  }

  public PBKeyResponseList addPbkeyItem(Pbkey pbkeyItem) {
    if (this.pbkey == null) {
      this.pbkey = new ArrayList<Pbkey>();
    }
    this.pbkey.add(pbkeyItem);
    return this;
  }

   /**
   * Get pbkey
   * @return pbkey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Pbkey> getPbkey() {
    return pbkey;
  }


  public void setPbkey(List<Pbkey> pbkey) {
    this.pbkey = pbkey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PBKeyResponseList pbKeyResponseList = (PBKeyResponseList) o;
    return Objects.equals(this.pbkey, pbKeyResponseList.pbkey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pbkey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PBKeyResponseList {\n");
    sb.append("    pbkey: ").append(toIndentedString(pbkey)).append("\n");
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

