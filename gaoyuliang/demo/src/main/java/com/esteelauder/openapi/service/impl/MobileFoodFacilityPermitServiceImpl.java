package com.esteelauder.openapi.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.esteelauder.openapi.domain.MobileFoodFacilityPermit;
import com.esteelauder.openapi.domain.req.MobileFoodFacilityPermitReq;
import com.esteelauder.openapi.mapper.MobileFoodFacilityPermitMapper;
import com.esteelauder.openapi.model.vo.MobileFoodFacilityPermitVo;
import com.esteelauder.openapi.service.MobileFoodFacilityPermitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * mobile_food_facility_permit ServiceImpl
 *
 * @author gaoyuliang
 * @version 1.0
 * @date 2024/10/10 19:01
 */
@Service
public class MobileFoodFacilityPermitServiceImpl implements MobileFoodFacilityPermitService {
    @Autowired
    private MobileFoodFacilityPermitMapper mobileFoodFacilityPermitMapper;

    @Override
    public MobileFoodFacilityPermitVo getById(Long id) {
        LambdaQueryWrapper<MobileFoodFacilityPermit> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(MobileFoodFacilityPermit::getId, id);

        MobileFoodFacilityPermit mobileFoodFacilityPermit = mobileFoodFacilityPermitMapper.selectOne(wrapper);
        MobileFoodFacilityPermitVo mobileFoodFacilityPermitVo = new MobileFoodFacilityPermitVo();
        BeanUtil.copyProperties(mobileFoodFacilityPermit, mobileFoodFacilityPermitVo);
        return mobileFoodFacilityPermitVo;
    }

    @Override
    public MobileFoodFacilityPermitVo getByLocationId(Long locationId) {
        LambdaQueryWrapper<MobileFoodFacilityPermit> wrapper = Wrappers.lambdaQuery();
        wrapper.eq(MobileFoodFacilityPermit::getLocationId, locationId);

        MobileFoodFacilityPermit mobileFoodFacilityPermit = mobileFoodFacilityPermitMapper.selectOne(wrapper);
        if (Objects.isNull(mobileFoodFacilityPermit)) {
            return null;
        }
        MobileFoodFacilityPermitVo mobileFoodFacilityPermitVo = new MobileFoodFacilityPermitVo();
        BeanUtil.copyProperties(mobileFoodFacilityPermit, mobileFoodFacilityPermitVo);
        return mobileFoodFacilityPermitVo;
    }

    @Override
    public int update(MobileFoodFacilityPermitReq reqEntity) {
        LambdaUpdateWrapper<MobileFoodFacilityPermit> wrapper = Wrappers.lambdaUpdate();
        return mobileFoodFacilityPermitMapper.update(wrapper);
    }

    @Override
    public int insert(MobileFoodFacilityPermitReq reqEntity) {
        MobileFoodFacilityPermit entity = new MobileFoodFacilityPermit();
        BeanUtil.copyProperties(reqEntity, entity);
        return mobileFoodFacilityPermitMapper.insert(entity);
    }

    @Override
    public int delete(Long id) {
        return mobileFoodFacilityPermitMapper.deleteById(id);
    }

    @Override
    public IPage<MobileFoodFacilityPermit> list(IPage<MobileFoodFacilityPermit> page) {
        IPage<MobileFoodFacilityPermit> iPage = mobileFoodFacilityPermitMapper.selectPageVo(page);
        return iPage;
    }
}
