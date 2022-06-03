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
import com.precisely.apis.model.Address;
import com.precisely.apis.model.Distance;
import com.precisely.apis.model.Geometry;
import com.precisely.apis.model.GradeLevelsTaught;
import com.precisely.apis.model.Greatschools;
import com.precisely.apis.model.SchoolDistrict;
import com.precisely.apis.model.SchoolProfile;
import com.precisely.apis.model.SchoolRanking;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * School
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-01T17:17:01.735+05:30[Asia/Calcutta]")
public class School {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ASSIGNED = "assigned";
  @SerializedName(SERIALIZED_NAME_ASSIGNED)
  private String assigned;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_WEBSITE = "website";
  @SerializedName(SERIALIZED_NAME_WEBSITE)
  private String website;

  public static final String SERIALIZED_NAME_ADDRESS_TYPE = "addressType";
  @SerializedName(SERIALIZED_NAME_ADDRESS_TYPE)
  private String addressType;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_LOWEST_GRADE = "lowestGrade";
  @SerializedName(SERIALIZED_NAME_LOWEST_GRADE)
  private String lowestGrade;

  public static final String SERIALIZED_NAME_HIGHEST_GRADE = "highestGrade";
  @SerializedName(SERIALIZED_NAME_HIGHEST_GRADE)
  private String highestGrade;

  public static final String SERIALIZED_NAME_SCHOOL_TYPE = "schoolType";
  @SerializedName(SERIALIZED_NAME_SCHOOL_TYPE)
  private String schoolType;

  public static final String SERIALIZED_NAME_SCHOOL_TYPE_DESC = "schoolTypeDesc";
  @SerializedName(SERIALIZED_NAME_SCHOOL_TYPE_DESC)
  private String schoolTypeDesc;

  public static final String SERIALIZED_NAME_SCHOOL_SUB_TYPE = "schoolSubType";
  @SerializedName(SERIALIZED_NAME_SCHOOL_SUB_TYPE)
  private String schoolSubType;

  public static final String SERIALIZED_NAME_SCHOOL_SUB_TYPE_DESC = "schoolSubTypeDesc";
  @SerializedName(SERIALIZED_NAME_SCHOOL_SUB_TYPE_DESC)
  private String schoolSubTypeDesc;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private String gender;

  public static final String SERIALIZED_NAME_GENDER_DESC = "genderDesc";
  @SerializedName(SERIALIZED_NAME_GENDER_DESC)
  private String genderDesc;

  public static final String SERIALIZED_NAME_EDUCATION_LEVEL = "educationLevel";
  @SerializedName(SERIALIZED_NAME_EDUCATION_LEVEL)
  private String educationLevel;

  public static final String SERIALIZED_NAME_EDUCATION_LEVEL_DESC = "educationLevelDesc";
  @SerializedName(SERIALIZED_NAME_EDUCATION_LEVEL_DESC)
  private String educationLevelDesc;

  public static final String SERIALIZED_NAME_GREATSCHOOLS = "greatschools";
  @SerializedName(SERIALIZED_NAME_GREATSCHOOLS)
  private Greatschools greatschools;

  public static final String SERIALIZED_NAME_NCES_SCHOOL_ID = "ncesSchoolId";
  @SerializedName(SERIALIZED_NAME_NCES_SCHOOL_ID)
  private String ncesSchoolId;

  public static final String SERIALIZED_NAME_NCES_DISTRICT_ID = "ncesDistrictId";
  @SerializedName(SERIALIZED_NAME_NCES_DISTRICT_ID)
  private String ncesDistrictId;

  public static final String SERIALIZED_NAME_NCES_DATA_YEAR = "ncesDataYear";
  @SerializedName(SERIALIZED_NAME_NCES_DATA_YEAR)
  private String ncesDataYear;

  public static final String SERIALIZED_NAME_SCHOOL_RANKING = "schoolRanking";
  @SerializedName(SERIALIZED_NAME_SCHOOL_RANKING)
  private List<SchoolRanking> schoolRanking = null;

  public static final String SERIALIZED_NAME_STUDENTS = "students";
  @SerializedName(SERIALIZED_NAME_STUDENTS)
  private String students;

  public static final String SERIALIZED_NAME_TEACHERS = "teachers";
  @SerializedName(SERIALIZED_NAME_TEACHERS)
  private String teachers;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STUDENT_TEACHER_RATIO = "studentTeacherRatio";
  @SerializedName(SERIALIZED_NAME_STUDENT_TEACHER_RATIO)
  private String studentTeacherRatio;

  public static final String SERIALIZED_NAME_CHOICE = "choice";
  @SerializedName(SERIALIZED_NAME_CHOICE)
  private String choice;

  public static final String SERIALIZED_NAME_COEXTENSIV = "coextensiv";
  @SerializedName(SERIALIZED_NAME_COEXTENSIV)
  private String coextensiv;

  public static final String SERIALIZED_NAME_SCHOOL_DISTRICTS = "schoolDistricts";
  @SerializedName(SERIALIZED_NAME_SCHOOL_DISTRICTS)
  private SchoolDistrict schoolDistricts;

  public static final String SERIALIZED_NAME_SCHOOL_PROFILE = "schoolProfile";
  @SerializedName(SERIALIZED_NAME_SCHOOL_PROFILE)
  private SchoolProfile schoolProfile;

  public static final String SERIALIZED_NAME_GRADE_LEVELS_TAUGHT = "gradeLevelsTaught";
  @SerializedName(SERIALIZED_NAME_GRADE_LEVELS_TAUGHT)
  private GradeLevelsTaught gradeLevelsTaught;

  public static final String SERIALIZED_NAME_DISTANCE = "distance";
  @SerializedName(SERIALIZED_NAME_DISTANCE)
  private Distance distance;

  public static final String SERIALIZED_NAME_GEOMETRY = "geometry";
  @SerializedName(SERIALIZED_NAME_GEOMETRY)
  private Geometry geometry;

  public School() { 
  }

  public School id(String id) {
    
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


  public School name(String name) {
    
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


  public School assigned(String assigned) {
    
    this.assigned = assigned;
    return this;
  }

   /**
   * Get assigned
   * @return assigned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAssigned() {
    return assigned;
  }


  public void setAssigned(String assigned) {
    this.assigned = assigned;
  }


  public School phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public School website(String website) {
    
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebsite() {
    return website;
  }


  public void setWebsite(String website) {
    this.website = website;
  }


  public School addressType(String addressType) {
    
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressType() {
    return addressType;
  }


  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }


  public School address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }


  public School lowestGrade(String lowestGrade) {
    
    this.lowestGrade = lowestGrade;
    return this;
  }

   /**
   * Get lowestGrade
   * @return lowestGrade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLowestGrade() {
    return lowestGrade;
  }


  public void setLowestGrade(String lowestGrade) {
    this.lowestGrade = lowestGrade;
  }


  public School highestGrade(String highestGrade) {
    
    this.highestGrade = highestGrade;
    return this;
  }

   /**
   * Get highestGrade
   * @return highestGrade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHighestGrade() {
    return highestGrade;
  }


  public void setHighestGrade(String highestGrade) {
    this.highestGrade = highestGrade;
  }


  public School schoolType(String schoolType) {
    
    this.schoolType = schoolType;
    return this;
  }

   /**
   * Get schoolType
   * @return schoolType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSchoolType() {
    return schoolType;
  }


  public void setSchoolType(String schoolType) {
    this.schoolType = schoolType;
  }


  public School schoolTypeDesc(String schoolTypeDesc) {
    
    this.schoolTypeDesc = schoolTypeDesc;
    return this;
  }

   /**
   * Get schoolTypeDesc
   * @return schoolTypeDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSchoolTypeDesc() {
    return schoolTypeDesc;
  }


  public void setSchoolTypeDesc(String schoolTypeDesc) {
    this.schoolTypeDesc = schoolTypeDesc;
  }


  public School schoolSubType(String schoolSubType) {
    
    this.schoolSubType = schoolSubType;
    return this;
  }

   /**
   * Get schoolSubType
   * @return schoolSubType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSchoolSubType() {
    return schoolSubType;
  }


  public void setSchoolSubType(String schoolSubType) {
    this.schoolSubType = schoolSubType;
  }


  public School schoolSubTypeDesc(String schoolSubTypeDesc) {
    
    this.schoolSubTypeDesc = schoolSubTypeDesc;
    return this;
  }

   /**
   * Get schoolSubTypeDesc
   * @return schoolSubTypeDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSchoolSubTypeDesc() {
    return schoolSubTypeDesc;
  }


  public void setSchoolSubTypeDesc(String schoolSubTypeDesc) {
    this.schoolSubTypeDesc = schoolSubTypeDesc;
  }


  public School gender(String gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    this.gender = gender;
  }


  public School genderDesc(String genderDesc) {
    
    this.genderDesc = genderDesc;
    return this;
  }

   /**
   * Get genderDesc
   * @return genderDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGenderDesc() {
    return genderDesc;
  }


  public void setGenderDesc(String genderDesc) {
    this.genderDesc = genderDesc;
  }


  public School educationLevel(String educationLevel) {
    
    this.educationLevel = educationLevel;
    return this;
  }

   /**
   * Get educationLevel
   * @return educationLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEducationLevel() {
    return educationLevel;
  }


  public void setEducationLevel(String educationLevel) {
    this.educationLevel = educationLevel;
  }


  public School educationLevelDesc(String educationLevelDesc) {
    
    this.educationLevelDesc = educationLevelDesc;
    return this;
  }

   /**
   * Get educationLevelDesc
   * @return educationLevelDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEducationLevelDesc() {
    return educationLevelDesc;
  }


  public void setEducationLevelDesc(String educationLevelDesc) {
    this.educationLevelDesc = educationLevelDesc;
  }


  public School greatschools(Greatschools greatschools) {
    
    this.greatschools = greatschools;
    return this;
  }

   /**
   * Get greatschools
   * @return greatschools
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Greatschools getGreatschools() {
    return greatschools;
  }


  public void setGreatschools(Greatschools greatschools) {
    this.greatschools = greatschools;
  }


  public School ncesSchoolId(String ncesSchoolId) {
    
    this.ncesSchoolId = ncesSchoolId;
    return this;
  }

   /**
   * Get ncesSchoolId
   * @return ncesSchoolId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNcesSchoolId() {
    return ncesSchoolId;
  }


  public void setNcesSchoolId(String ncesSchoolId) {
    this.ncesSchoolId = ncesSchoolId;
  }


  public School ncesDistrictId(String ncesDistrictId) {
    
    this.ncesDistrictId = ncesDistrictId;
    return this;
  }

   /**
   * Get ncesDistrictId
   * @return ncesDistrictId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNcesDistrictId() {
    return ncesDistrictId;
  }


  public void setNcesDistrictId(String ncesDistrictId) {
    this.ncesDistrictId = ncesDistrictId;
  }


  public School ncesDataYear(String ncesDataYear) {
    
    this.ncesDataYear = ncesDataYear;
    return this;
  }

   /**
   * Get ncesDataYear
   * @return ncesDataYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNcesDataYear() {
    return ncesDataYear;
  }


  public void setNcesDataYear(String ncesDataYear) {
    this.ncesDataYear = ncesDataYear;
  }


  public School schoolRanking(List<SchoolRanking> schoolRanking) {
    
    this.schoolRanking = schoolRanking;
    return this;
  }

  public School addSchoolRankingItem(SchoolRanking schoolRankingItem) {
    if (this.schoolRanking == null) {
      this.schoolRanking = new ArrayList<SchoolRanking>();
    }
    this.schoolRanking.add(schoolRankingItem);
    return this;
  }

   /**
   * Get schoolRanking
   * @return schoolRanking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SchoolRanking> getSchoolRanking() {
    return schoolRanking;
  }


  public void setSchoolRanking(List<SchoolRanking> schoolRanking) {
    this.schoolRanking = schoolRanking;
  }


  public School students(String students) {
    
    this.students = students;
    return this;
  }

   /**
   * Get students
   * @return students
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStudents() {
    return students;
  }


  public void setStudents(String students) {
    this.students = students;
  }


  public School teachers(String teachers) {
    
    this.teachers = teachers;
    return this;
  }

   /**
   * Get teachers
   * @return teachers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTeachers() {
    return teachers;
  }


  public void setTeachers(String teachers) {
    this.teachers = teachers;
  }


  public School status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public School studentTeacherRatio(String studentTeacherRatio) {
    
    this.studentTeacherRatio = studentTeacherRatio;
    return this;
  }

   /**
   * Get studentTeacherRatio
   * @return studentTeacherRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStudentTeacherRatio() {
    return studentTeacherRatio;
  }


  public void setStudentTeacherRatio(String studentTeacherRatio) {
    this.studentTeacherRatio = studentTeacherRatio;
  }


  public School choice(String choice) {
    
    this.choice = choice;
    return this;
  }

   /**
   * Get choice
   * @return choice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChoice() {
    return choice;
  }


  public void setChoice(String choice) {
    this.choice = choice;
  }


  public School coextensiv(String coextensiv) {
    
    this.coextensiv = coextensiv;
    return this;
  }

   /**
   * Get coextensiv
   * @return coextensiv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCoextensiv() {
    return coextensiv;
  }


  public void setCoextensiv(String coextensiv) {
    this.coextensiv = coextensiv;
  }


  public School schoolDistricts(SchoolDistrict schoolDistricts) {
    
    this.schoolDistricts = schoolDistricts;
    return this;
  }

   /**
   * Get schoolDistricts
   * @return schoolDistricts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SchoolDistrict getSchoolDistricts() {
    return schoolDistricts;
  }


  public void setSchoolDistricts(SchoolDistrict schoolDistricts) {
    this.schoolDistricts = schoolDistricts;
  }


  public School schoolProfile(SchoolProfile schoolProfile) {
    
    this.schoolProfile = schoolProfile;
    return this;
  }

   /**
   * Get schoolProfile
   * @return schoolProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SchoolProfile getSchoolProfile() {
    return schoolProfile;
  }


  public void setSchoolProfile(SchoolProfile schoolProfile) {
    this.schoolProfile = schoolProfile;
  }


  public School gradeLevelsTaught(GradeLevelsTaught gradeLevelsTaught) {
    
    this.gradeLevelsTaught = gradeLevelsTaught;
    return this;
  }

   /**
   * Get gradeLevelsTaught
   * @return gradeLevelsTaught
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GradeLevelsTaught getGradeLevelsTaught() {
    return gradeLevelsTaught;
  }


  public void setGradeLevelsTaught(GradeLevelsTaught gradeLevelsTaught) {
    this.gradeLevelsTaught = gradeLevelsTaught;
  }


  public School distance(Distance distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Distance getDistance() {
    return distance;
  }


  public void setDistance(Distance distance) {
    this.distance = distance;
  }


  public School geometry(Geometry geometry) {
    
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Geometry getGeometry() {
    return geometry;
  }


  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    School school = (School) o;
    return Objects.equals(this.id, school.id) &&
        Objects.equals(this.name, school.name) &&
        Objects.equals(this.assigned, school.assigned) &&
        Objects.equals(this.phone, school.phone) &&
        Objects.equals(this.website, school.website) &&
        Objects.equals(this.addressType, school.addressType) &&
        Objects.equals(this.address, school.address) &&
        Objects.equals(this.lowestGrade, school.lowestGrade) &&
        Objects.equals(this.highestGrade, school.highestGrade) &&
        Objects.equals(this.schoolType, school.schoolType) &&
        Objects.equals(this.schoolTypeDesc, school.schoolTypeDesc) &&
        Objects.equals(this.schoolSubType, school.schoolSubType) &&
        Objects.equals(this.schoolSubTypeDesc, school.schoolSubTypeDesc) &&
        Objects.equals(this.gender, school.gender) &&
        Objects.equals(this.genderDesc, school.genderDesc) &&
        Objects.equals(this.educationLevel, school.educationLevel) &&
        Objects.equals(this.educationLevelDesc, school.educationLevelDesc) &&
        Objects.equals(this.greatschools, school.greatschools) &&
        Objects.equals(this.ncesSchoolId, school.ncesSchoolId) &&
        Objects.equals(this.ncesDistrictId, school.ncesDistrictId) &&
        Objects.equals(this.ncesDataYear, school.ncesDataYear) &&
        Objects.equals(this.schoolRanking, school.schoolRanking) &&
        Objects.equals(this.students, school.students) &&
        Objects.equals(this.teachers, school.teachers) &&
        Objects.equals(this.status, school.status) &&
        Objects.equals(this.studentTeacherRatio, school.studentTeacherRatio) &&
        Objects.equals(this.choice, school.choice) &&
        Objects.equals(this.coextensiv, school.coextensiv) &&
        Objects.equals(this.schoolDistricts, school.schoolDistricts) &&
        Objects.equals(this.schoolProfile, school.schoolProfile) &&
        Objects.equals(this.gradeLevelsTaught, school.gradeLevelsTaught) &&
        Objects.equals(this.distance, school.distance) &&
        Objects.equals(this.geometry, school.geometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, assigned, phone, website, addressType, address, lowestGrade, highestGrade, schoolType, schoolTypeDesc, schoolSubType, schoolSubTypeDesc, gender, genderDesc, educationLevel, educationLevelDesc, greatschools, ncesSchoolId, ncesDistrictId, ncesDataYear, schoolRanking, students, teachers, status, studentTeacherRatio, choice, coextensiv, schoolDistricts, schoolProfile, gradeLevelsTaught, distance, geometry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class School {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    lowestGrade: ").append(toIndentedString(lowestGrade)).append("\n");
    sb.append("    highestGrade: ").append(toIndentedString(highestGrade)).append("\n");
    sb.append("    schoolType: ").append(toIndentedString(schoolType)).append("\n");
    sb.append("    schoolTypeDesc: ").append(toIndentedString(schoolTypeDesc)).append("\n");
    sb.append("    schoolSubType: ").append(toIndentedString(schoolSubType)).append("\n");
    sb.append("    schoolSubTypeDesc: ").append(toIndentedString(schoolSubTypeDesc)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    genderDesc: ").append(toIndentedString(genderDesc)).append("\n");
    sb.append("    educationLevel: ").append(toIndentedString(educationLevel)).append("\n");
    sb.append("    educationLevelDesc: ").append(toIndentedString(educationLevelDesc)).append("\n");
    sb.append("    greatschools: ").append(toIndentedString(greatschools)).append("\n");
    sb.append("    ncesSchoolId: ").append(toIndentedString(ncesSchoolId)).append("\n");
    sb.append("    ncesDistrictId: ").append(toIndentedString(ncesDistrictId)).append("\n");
    sb.append("    ncesDataYear: ").append(toIndentedString(ncesDataYear)).append("\n");
    sb.append("    schoolRanking: ").append(toIndentedString(schoolRanking)).append("\n");
    sb.append("    students: ").append(toIndentedString(students)).append("\n");
    sb.append("    teachers: ").append(toIndentedString(teachers)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    studentTeacherRatio: ").append(toIndentedString(studentTeacherRatio)).append("\n");
    sb.append("    choice: ").append(toIndentedString(choice)).append("\n");
    sb.append("    coextensiv: ").append(toIndentedString(coextensiv)).append("\n");
    sb.append("    schoolDistricts: ").append(toIndentedString(schoolDistricts)).append("\n");
    sb.append("    schoolProfile: ").append(toIndentedString(schoolProfile)).append("\n");
    sb.append("    gradeLevelsTaught: ").append(toIndentedString(gradeLevelsTaught)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
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

