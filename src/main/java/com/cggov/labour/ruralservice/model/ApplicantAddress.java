package com.cggov.labour.ruralservice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApplicantAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-18T11:26:11.029615-04:00[America/New_York]")

public class ApplicantAddress   {
  @JsonProperty("district")
  private BigDecimal district;

  @JsonProperty("gramin")
  private Boolean gramin;

  @JsonProperty("shehri")
  private Boolean shehri;

  @JsonProperty("vidhansabhaArea")
  private BigDecimal vidhansabhaArea;

  @JsonProperty("vikasKhand")
  private BigDecimal vikasKhand;

  @JsonProperty("panchayat")
  private BigDecimal panchayat;

  @JsonProperty("ward")
  private BigDecimal ward;

  @JsonProperty("address")
  private String address;

  @JsonProperty("houseNo")
  private String houseNo;

  @JsonProperty("mobile1")
  private BigDecimal mobile1;

  @JsonProperty("mobile2")
  private BigDecimal mobile2;

  public ApplicantAddress district(BigDecimal district) {
    this.district = district;
    return this;
  }

  /**
   * Get district
   * @return district
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(max=3) 
  public BigDecimal getDistrict() {
    return district;
  }

  public void setDistrict(BigDecimal district) {
    this.district = district;
  }

  public ApplicantAddress gramin(Boolean gramin) {
    this.gramin = gramin;
    return this;
  }

  /**
   * Get gramin
   * @return gramin
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean getGramin() {
    return gramin;
  }

  public void setGramin(Boolean gramin) {
    this.gramin = gramin;
  }

  public ApplicantAddress shehri(Boolean shehri) {
    this.shehri = shehri;
    return this;
  }

  /**
   * Get shehri
   * @return shehri
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Boolean getShehri() {
    return shehri;
  }

  public void setShehri(Boolean shehri) {
    this.shehri = shehri;
  }

  public ApplicantAddress vidhansabhaArea(BigDecimal vidhansabhaArea) {
    this.vidhansabhaArea = vidhansabhaArea;
    return this;
  }

  /**
   * Get vidhansabhaArea
   * @return vidhansabhaArea
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(max=3) 
  public BigDecimal getVidhansabhaArea() {
    return vidhansabhaArea;
  }

  public void setVidhansabhaArea(BigDecimal vidhansabhaArea) {
    this.vidhansabhaArea = vidhansabhaArea;
  }

  public ApplicantAddress vikasKhand(BigDecimal vikasKhand) {
    this.vikasKhand = vikasKhand;
    return this;
  }

  /**
   * Get vikasKhand
   * @return vikasKhand
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(max=3) 
  public BigDecimal getVikasKhand() {
    return vikasKhand;
  }

  public void setVikasKhand(BigDecimal vikasKhand) {
    this.vikasKhand = vikasKhand;
  }

  public ApplicantAddress panchayat(BigDecimal panchayat) {
    this.panchayat = panchayat;
    return this;
  }

  /**
   * Get panchayat
   * @return panchayat
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(max=3) 
  public BigDecimal getPanchayat() {
    return panchayat;
  }

  public void setPanchayat(BigDecimal panchayat) {
    this.panchayat = panchayat;
  }

  public ApplicantAddress ward(BigDecimal ward) {
    this.ward = ward;
    return this;
  }

  /**
   * Get ward
   * @return ward
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(max=3) 
  public BigDecimal getWard() {
    return ward;
  }

  public void setWard(BigDecimal ward) {
    this.ward = ward;
  }

  public ApplicantAddress address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=200) 
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public ApplicantAddress houseNo(String houseNo) {
    this.houseNo = houseNo;
    return this;
  }

  /**
   * Get houseNo
   * @return houseNo
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=50) 
  public String getHouseNo() {
    return houseNo;
  }

  public void setHouseNo(String houseNo) {
    this.houseNo = houseNo;
  }

  public ApplicantAddress mobile1(BigDecimal mobile1) {
    this.mobile1 = mobile1;
    return this;
  }

  /**
   * Get mobile1
   * @return mobile1
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(max=10) 
  public BigDecimal getMobile1() {
    return mobile1;
  }

  public void setMobile1(BigDecimal mobile1) {
    this.mobile1 = mobile1;
  }

  public ApplicantAddress mobile2(BigDecimal mobile2) {
    this.mobile2 = mobile2;
    return this;
  }

  /**
   * Get mobile2
   * @return mobile2
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=10) 
  public BigDecimal getMobile2() {
    return mobile2;
  }

  public void setMobile2(BigDecimal mobile2) {
    this.mobile2 = mobile2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicantAddress applicantAddress = (ApplicantAddress) o;
    return Objects.equals(this.district, applicantAddress.district) &&
        Objects.equals(this.gramin, applicantAddress.gramin) &&
        Objects.equals(this.shehri, applicantAddress.shehri) &&
        Objects.equals(this.vidhansabhaArea, applicantAddress.vidhansabhaArea) &&
        Objects.equals(this.vikasKhand, applicantAddress.vikasKhand) &&
        Objects.equals(this.panchayat, applicantAddress.panchayat) &&
        Objects.equals(this.ward, applicantAddress.ward) &&
        Objects.equals(this.address, applicantAddress.address) &&
        Objects.equals(this.houseNo, applicantAddress.houseNo) &&
        Objects.equals(this.mobile1, applicantAddress.mobile1) &&
        Objects.equals(this.mobile2, applicantAddress.mobile2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(district, gramin, shehri, vidhansabhaArea, vikasKhand, panchayat, ward, address, houseNo, mobile1, mobile2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantAddress {\n");
    
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    gramin: ").append(toIndentedString(gramin)).append("\n");
    sb.append("    shehri: ").append(toIndentedString(shehri)).append("\n");
    sb.append("    vidhansabhaArea: ").append(toIndentedString(vidhansabhaArea)).append("\n");
    sb.append("    vikasKhand: ").append(toIndentedString(vikasKhand)).append("\n");
    sb.append("    panchayat: ").append(toIndentedString(panchayat)).append("\n");
    sb.append("    ward: ").append(toIndentedString(ward)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    houseNo: ").append(toIndentedString(houseNo)).append("\n");
    sb.append("    mobile1: ").append(toIndentedString(mobile1)).append("\n");
    sb.append("    mobile2: ").append(toIndentedString(mobile2)).append("\n");
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

