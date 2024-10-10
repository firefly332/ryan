package com.esteelauder.openapi.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.esteelauder.openapi.domain.MobileFoodFacilityPermit;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * mobile_food_facility_permit Mapper
 *
 * @author gaoyuliang
 * @version 1.0
 * @date 2024/10/10 19:01
 */
public interface MobileFoodFacilityPermitMapper extends BaseMapper<MobileFoodFacilityPermit> {

    IPage<MobileFoodFacilityPermit> selectPageVo(IPage<MobileFoodFacilityPermit> page);

}
