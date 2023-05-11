package cn.zs.wang.module.promotion.convert.coupon;

import cn.zs.wang.framework.common.pojo.PageResult;
import cn.zs.wang.module.promotion.controller.admin.coupon.vo.template.CouponTemplateCreateReqVO;
import cn.zs.wang.module.promotion.controller.admin.coupon.vo.template.CouponTemplateRespVO;
import cn.zs.wang.module.promotion.controller.admin.coupon.vo.template.CouponTemplateUpdateReqVO;
import cn.zs.wang.module.promotion.dal.dataobject.coupon.CouponTemplateDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 优惠劵模板 Convert
 *
 * @author 芋道源码
 */
@Mapper
public interface CouponTemplateConvert {

    CouponTemplateConvert INSTANCE = Mappers.getMapper(CouponTemplateConvert.class);

    CouponTemplateDO convert(CouponTemplateCreateReqVO bean);

    CouponTemplateDO convert(CouponTemplateUpdateReqVO bean);

    CouponTemplateRespVO convert(CouponTemplateDO bean);

    PageResult<CouponTemplateRespVO> convertPage(PageResult<CouponTemplateDO> page);

}
