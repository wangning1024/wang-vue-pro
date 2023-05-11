package cn.zs.wang.module.infra.dal.mysql.file;

import cn.zs.wang.framework.common.pojo.PageResult;
import cn.zs.wang.framework.mybatis.core.mapper.BaseMapperX;
import cn.zs.wang.framework.mybatis.core.query.LambdaQueryWrapperX;
import cn.zs.wang.module.infra.controller.admin.file.vo.config.FileConfigPageReqVO;
import cn.zs.wang.module.infra.dal.dataobject.file.FileConfigDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FileConfigMapper extends BaseMapperX<FileConfigDO> {

    default PageResult<FileConfigDO> selectPage(FileConfigPageReqVO reqVO) {
        return selectPage(reqVO, new LambdaQueryWrapperX<FileConfigDO>()
                .likeIfPresent(FileConfigDO::getName, reqVO.getName())
                .eqIfPresent(FileConfigDO::getStorage, reqVO.getStorage())
                .betweenIfPresent(FileConfigDO::getCreateTime, reqVO.getCreateTime())
                .orderByDesc(FileConfigDO::getId));
    }

}
