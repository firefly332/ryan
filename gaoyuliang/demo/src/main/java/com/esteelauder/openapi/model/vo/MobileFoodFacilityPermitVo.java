/*
 *Project: coupon
 ****************************************************************
 * 版权所有@2024 冠德数智机器人  保留所有权利.
 ***************************************************************/
package com.esteelauder.openapi.model.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;
/**
 * mobile_food_facility_permit VO
 *
 * @author gaoyuliang
 * @version 1.0
 * @date 2024/10/10 19:01
 */
@Data
@Schema(description = "mobile_food_facility_permit-VO")
public class MobileFoodFacilityPermitVo {

	/**
	 * id
 	 */
	@Schema(description = "id")
	private Long id;
	/**
	 * locationid
 	 */
	@Schema(description = "locationid")
	private Long locationId;
	/**
	 * applicant
 	 */
	@Schema(description = "applicant")
	private String applicant;
	/**
	 * facility type
 	 */
	@Schema(description = "facility type")
	private Integer facilityType;
	/**
	 * cnn
 	 */
	@Schema(description = "cnn")
	private String cnn;
	/**
	 * location description
 	 */
	@Schema(description = "location description")
	private String locationDescription;
	/**
	 * address
 	 */
	@Schema(description = "address")
	private String address;
	/**
	 * block lot
 	 */
	@Schema(description = "block lot")
	private String blocklot;
	/**
	 * block
 	 */
	@Schema(description = "block")
	private String block;
	/**
	 * lot
 	 */
	@Schema(description = "lot")
	private String lot;
	/**
	 * permit
 	 */
	@Schema(description = "permit")
	private String permit;
	/**
	 * status
 	 */
	@Schema(description = "status")
	private Integer status;
	/**
	 * food items
 	 */
	@Schema(description = "food items")
	private Integer foodItems;
	/**
	 * X
 	 */
	@Schema(description = "X")
	private String x;
	/**
	 * Y
 	 */
	@Schema(description = "Y")
	private String y;
	/**
	 * latitude
 	 */
	@Schema(description = "latitude")
	private String latitude;
	/**
	 * longitude
 	 */
	@Schema(description = "longitude")
	private String longitude;
	/**
	 * schedule
 	 */
	@Schema(description = "schedule")
	private String schedule;
	/**
	 * dayshours
 	 */
	@Schema(description = "dayshours")
	private String dayshours;
	/**
	 * noisent
 	 */
	@Schema(description = "noisent")
	private String noisent;
	/**
	 * approved
 	 */
	@Schema(description = "approved")
	private Date approved;
	/**
	 * received
 	 */
	@Schema(description = "received")
	private String received;
	/**
	 * priorpermit
 	 */
	@Schema(description = "priorpermit")
	private Integer priorPermit;
	/**
	 * expirationdate
 	 */
	@Schema(description = "expirationdate")
	private Date expirationDate;
	/**
	 * location
 	 */
	@Schema(description = "location")
	private String location;
	/**
	 * fire prevention districts
 	 */
	@Schema(description = "fire prevention districts")
	private Integer firePreventionDistricts;
	/**
	 * police districts
 	 */
	@Schema(description = "police districts")
	private Integer policeDistricts;
	/**
	 * supervisor districts
 	 */
	@Schema(description = "supervisor districts")
	private Integer supervisorDistricts;
	/**
	 * zip codes
 	 */
	@Schema(description = "zip codes")
	private String zipCodes;
	/**
	 * neighborhoods
 	 */
	@Schema(description = "neighborhoods")
	private Integer neighborhoods;
	/**
	 * creater
 	 */
	@Schema(description = "creater")
	private String createdBy;
	/**
	 * updater
 	 */
	@Schema(description = "updater")
	private String updatedBy;
	/**
	 * create time
 	 */
	@Schema(description = "create time")
	private Date createdTime;
	/**
	 * update time
 	 */
	@Schema(description = "update time")
	private Date updatedTime;
}