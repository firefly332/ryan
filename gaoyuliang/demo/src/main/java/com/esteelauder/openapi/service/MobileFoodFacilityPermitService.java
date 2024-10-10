package com.esteelauder.openapi.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.esteelauder.openapi.domain.MobileFoodFacilityPermit;
import com.esteelauder.openapi.domain.req.MobileFoodFacilityPermitReq;
import com.esteelauder.openapi.model.vo.MobileFoodFacilityPermitVo;

import java.util.List;

/**
 * mobile_food_facility_permit Service
 *
 * @author gaoyuliang
 * @version 1.0
 * @date 2024/10/10 19:01
 */
public interface MobileFoodFacilityPermitService {

    MobileFoodFacilityPermitVo getById(Long id);

    MobileFoodFacilityPermitVo getByLocationId(Long id);

    int update(MobileFoodFacilityPermitReq reqEntity);

    int insert(MobileFoodFacilityPermitReq reqEntity);

    int delete(Long id);

    IPage<MobileFoodFacilityPermit> list(IPage<MobileFoodFacilityPermit> page);
}
