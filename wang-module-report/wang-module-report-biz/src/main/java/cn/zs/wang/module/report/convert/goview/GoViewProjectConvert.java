package cn.zs.wang.module.report.convert.goview;

import cn.zs.wang.framework.common.pojo.PageResult;
import cn.zs.wang.module.report.controller.admin.goview.vo.project.GoViewProjectCreateReqVO;
import cn.zs.wang.module.report.controller.admin.goview.vo.project.GoViewProjectRespVO;
import cn.zs.wang.module.report.controller.admin.goview.vo.project.GoViewProjectUpdateReqVO;
import cn.zs.wang.module.report.dal.dataobject.goview.GoViewProjectDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface GoViewProjectConvert {

    GoViewProjectConvert INSTANCE = Mappers.getMapper(GoViewProjectConvert.class);

    GoViewProjectDO convert(GoViewProjectCreateReqVO bean);

    GoViewProjectDO convert(GoViewProjectUpdateReqVO bean);

    GoViewProjectRespVO convert(GoViewProjectDO bean);

    PageResult<GoViewProjectRespVO> convertPage(PageResult<GoViewProjectDO> page);

}
