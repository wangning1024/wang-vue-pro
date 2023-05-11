package cn.zs.wang.module.promotion.dal.mysql.banner;

import cn.zs.wang.framework.common.pojo.PageResult;
import cn.zs.wang.framework.mybatis.core.mapper.BaseMapperX;
import cn.zs.wang.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.zs.wang.module.promotion.controller.admin.banner.vo.BannerPageReqVO;
import cn.zs.wang.module.promotion.dal.dataobject.banner.BannerDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Banner Mapper
 *
 * @author xia
 */
@Mapper
public interface BannerMapper extends BaseMapperX<BannerDO> {

    default PageResult<BannerDO> selectPage(BannerPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<BannerDO>()
                .likeIfPresent(BannerDO::getTitle, reqVO.getTitle())
                .eqIfPresent(BannerDO::getStatus, reqVO.getStatus())
                .betweenIfPresent(BannerDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(BannerDO::getSort));
    }

}
