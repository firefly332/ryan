package com.esteelauder.openapi.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.esteelauder.openapi.entity.BasicEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("mobile_food_facility_permit")
public class MobileFoodFacilityPermit extends BasicEntity {
    /**
     * id
     */
//    private Long id;
    /**
     * locationid
     */
    private Long locationId;
    /**
     * applicant
     */
    private String applicant;
    /**
     * facility type
     */
    private Integer facilityType;
    /**
     * cnn
     */
    private String cnn;
    /**
     * location description
     */
    private String locationDescription;
    /**
     * address
     */
    private String address;
    /**
     * block lot
     */
    private String blocklot;
    /**
     * block
     */
    private String block;
    /**
     * lot
     */
    private String lot;
    /**
     * permit
     */
    private String permit;
    /**
     * status
     */
    private Integer status;
    /**
     * food items
     */
    private Integer foodItems;
    /**
     * X
     */
    private String x;
    /**
     * Y
     */
    private String y;
    /**
     * latitude
     */
    private String latitude;
    /**
     * longitude
     */
    private String longitude;
    /**
     * schedule
     */
    private String schedule;
    /**
     * dayshours
     */
    private String dayshours;
    /**
     * noisent
     */
    private String noisent;
    /**
     * approved
     */
    private Date approved;
    /**
     * received
     */
    private String received;
    /**
     * priorpermit
     */
    private Integer priorPermit;
    /**
     * expirationdate
     */
    private Date expirationDate;
    /**
     * location
     */
    private String location;
    /**
     * fire prevention districts
     */
    private Integer firePreventionDistricts;
    /**
     * police districts
     */
    private Integer policeDistricts;
    /**
     * supervisor districts
     */
    private Integer supervisorDistricts;
    /**
     * zip codes
     */
    private String zipCodes;
    /**
     * neighborhoods
     */
    private Integer neighborhoods;
    /**
     * creater
     */
    private String createdBy;
    /**
     * updater
     */
    private String updatedBy;
    /**
     * create time
     */
    private Date createdTime;
    /**
     * update time
     */
    private Date updatedTime;
}