package cn.zs.wang.module.bpm.dal.mysql.definition;

import cn.zs.wang.module.bpm.controller.admin.definition.vo.group.BpmUserGroupPageReqVO;
import cn.zs.wang.module.bpm.dal.dataobject.definition.BpmUserGroupDO;
import cn.zs.wang.framework.common.pojo.PageResult;
import cn.zs.wang.framework.mybatis.core.mapper.BaseMapperX;
import cn.zs.wang.framework.mybatis.core.query.LambdaQueryWrapperX;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户组 Mapper
 *
 * @author 芋道源码
 */
@Mapper
public interface BpmUserGroupMapper extends BaseMapperX<BpmUserGroupDO> {

    default PageResult<BpmUserGroupDO> selectPage(BpmUserGroupPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<BpmUserGroupDO>()
                .likeIfPresent(BpmUserGroupDO::getName, reqVO.getName())
                .eqIfPresent(BpmUserGroupDO::getStatus, reqVO.getStatus())
                .betweenIfPresent(BpmUserGroupDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(BpmUserGroupDO::getId));
    }

    default List<BpmUserGroupDO> selectListByStatus(Integer status) {
        return selectList(BpmUserGroupDO::getStatus, status);
    }

}
