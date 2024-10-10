package com.esteelauder.openapi.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.esteelauder.openapi.bean.ResponseData;
import com.esteelauder.openapi.domain.MobileFoodFacilityPermit;
import com.esteelauder.openapi.domain.req.MobileFoodFacilityPermitReq;
import com.esteelauder.openapi.model.vo.MobileFoodFacilityPermitVo;
import com.esteelauder.openapi.service.MobileFoodFacilityPermitService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *  mobile_food_facility_permit API
 *
 * @author gaoyuliang
 * @version 1.0
 * @date 2024/10/10 19:01
 */
@RestController
@Tag(name = "mobile_food_facility_permit")
@RequestMapping("/mobileFoodFacilityPermit")
@RequiredArgsConstructor
public class MobileFoodFacilityPermitController {
	@Autowired
	private MobileFoodFacilityPermitService mobileFoodFacilityPermitService;

	/**
	 * 根据id查询
	 *
	 * @param id
	 * @return MobileFoodFacilityPermitVo
	 */
	@Operation(summary = "根据id查询")
	@GetMapping("/get")
	public ResponseData<MobileFoodFacilityPermitVo> get(@RequestParam Long id) {
		return ResponseData.resp(() ->
			mobileFoodFacilityPermitService.getById(id)
		);
	}

	/**
	 * 根据location id查询
	 *
	 * @param locationId
	 * @return MobileFoodFacilityPermitVo
	 */
	@Operation(summary = "根据locationId查询")
	@GetMapping("/getByLocationId")
	public ResponseData<MobileFoodFacilityPermitVo> getByLocationId(@RequestParam Long locationId) {
		return ResponseData.resp(() ->
				mobileFoodFacilityPermitService.getByLocationId(locationId)
		);
	}

	/**
	 * 更新
	 *
	 * @param reqEntity
	 * @return MobileFoodFacilityPermitVo
	 */
	@Operation(summary = "更新")
	@PostMapping("/update")
	public ResponseData<Integer> update(@RequestBody MobileFoodFacilityPermitReq reqEntity) {
		return ResponseData.resp(() ->
				mobileFoodFacilityPermitService.update(reqEntity)
		);
	}

	/**
	 * 插入
	 *
	 * @param reqEntity
	 * @return MobileFoodFacilityPermitVo
	 */
	@Operation(summary = "插入")
	@PostMapping("/insert")
	public ResponseData<Integer> insert(@RequestBody MobileFoodFacilityPermitReq reqEntity) {
		return ResponseData.resp(() ->
				mobileFoodFacilityPermitService.insert(reqEntity)
		);
	}

	/**
	 * 删除
	 *
	 * @param id
	 * @return MobileFoodFacilityPermitVo
	 */
	@Operation(summary = "删除")
	@PostMapping("/delete")
	public ResponseData<Integer> delete(@RequestParam Long id) {
		return ResponseData.resp(() ->
				mobileFoodFacilityPermitService.delete(id)
		);
	}

	/**
	 * 分页查询
	 *
	 * @param page
	 * @return MobileFoodFacilityPermitVo
	 */
	@Operation(summary = "分页查询")
	@PostMapping("/list")
	public ResponseData<IPage> list(@RequestBody Page page) {
		return ResponseData.resp(() ->
				mobileFoodFacilityPermitService.list(page)
		);
	}
}