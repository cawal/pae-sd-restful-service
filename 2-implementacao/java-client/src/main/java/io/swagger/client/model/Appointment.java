/*
 * MyClinic API
 * My nice API to give to other developers
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Patient;
import io.swagger.client.model.Physician;

/**
 * Appointment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-14T20:18:46.451Z")
public class Appointment {
  @SerializedName("id")
  private String id = null;

  @SerializedName("physician")
  private Physician physician = null;

  @SerializedName("patient")
  private Patient patient = null;

  @SerializedName("date")
  private String date = null;

  public Appointment id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique global id of this appontment.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique global id of this appontment.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Appointment physician(Physician physician) {
    this.physician = physician;
    return this;
  }

   /**
   * Get physician
   * @return physician
  **/
  @ApiModelProperty(example = "null", value = "")
  public Physician getPhysician() {
    return physician;
  }

  public void setPhysician(Physician physician) {
    this.physician = physician;
  }

  public Appointment patient(Patient patient) {
    this.patient = patient;
    return this;
  }

   /**
   * Get patient
   * @return patient
  **/
  @ApiModelProperty(example = "null", value = "")
  public Patient getPatient() {
    return patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public Appointment date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Appointment appointment = (Appointment) o;
    return Objects.equals(this.id, appointment.id) &&
        Objects.equals(this.physician, appointment.physician) &&
        Objects.equals(this.patient, appointment.patient) &&
        Objects.equals(this.date, appointment.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, physician, patient, date);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Appointment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    physician: ").append(toIndentedString(physician)).append("\n");
    sb.append("    patient: ").append(toIndentedString(patient)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
