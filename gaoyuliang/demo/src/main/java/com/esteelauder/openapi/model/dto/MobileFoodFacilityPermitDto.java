package com.esteelauder.openapi.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
/**
 * mobile_food_facility_permit DTO
 *
 * @author gaoyuliang
 * @version 1.0
 * @date 2024/10/10 19:01
 */
@Data
@Schema(description = "mobile_food_facility_permit-DTO")
public class MobileFoodFacilityPermitDto {

	/**
	 * id
	 */
	@Schema(description = "id", requiredMode = Schema.RequiredMode.REQUIRED)
	@NotNull(message = "id不能为空")
	private Long id;
	/**
	 * locationid
 	 */
    @Schema(description = "locationid", requiredMode = Schema.RequiredMode.REQUIRED)
	@NotNull(message = "locationid不能为空")
	private Long locationId;
	/**
	 * applicant
 	 */
    @Schema(description = "applicant")
	@Length(max = 32)
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
	@Length(max = 10)
	private String cnn;
	/**
	 * location description
 	 */
    @Schema(description = "location description")
	@Length(max = 200)
	private String locationDescription;
	/**
	 * address
 	 */
    @Schema(description = "address")
	@Length(max = 50)
	private String address;
	/**
	 * block lot
 	 */
    @Schema(description = "block lot")
	@Length(max = 10)
	private String blocklot;
	/**
	 * block
 	 */
    @Schema(description = "block")
	@Length(max = 5)
	private String block;
	/**
	 * lot
 	 */
    @Schema(description = "lot")
	@Length(max = 5)
	private String lot;
	/**
	 * permit
 	 */
    @Schema(description = "permit")
	@Length(max = 15)
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
	@Length(max = 15)
	private String x;
	/**
	 * Y
 	 */
    @Schema(description = "Y")
	@Length(max = 15)
	private String y;
	/**
	 * latitude
 	 */
    @Schema(description = "latitude")
	@Length(max = 20)
	private String latitude;
	/**
	 * longitude
 	 */
    @Schema(description = "longitude")
	@Length(max = 20)
	private String longitude;
	/**
	 * schedule
 	 */
    @Schema(description = "schedule")
	@Length(max = 200)
	private String schedule;
	/**
	 * dayshours
 	 */
    @Schema(description = "dayshours")
	@Length(max = 50)
	private String dayshours;
	/**
	 * noisent
 	 */
    @Schema(description = "noisent")
	@Length(max = 32)
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
	@Length(max = 8)
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
	@Length(max = 50)
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
	@Length(max = 5)
	private String zipCodes;
	/**
	 * neighborhoods
 	 */
    @Schema(description = "neighborhoods")
	private Integer neighborhoods;
}