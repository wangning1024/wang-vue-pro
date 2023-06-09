package cn.zs.wang.module.bpm.convert.oa;

import cn.zs.wang.module.bpm.controller.admin.oa.vo.BpmOALeaveCreateReqVO;
import cn.zs.wang.module.bpm.controller.admin.oa.vo.BpmOALeaveRespVO;
import cn.zs.wang.module.bpm.dal.dataobject.oa.BpmOALeaveDO;
import cn.zs.wang.framework.common.pojo.PageResult;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 请假申请 Convert
 *
 * @author 芋艿
 */
@Mapper
public interface BpmOALeaveConvert {

    BpmOALeaveConvert INSTANCE = Mappers.getMapper(BpmOALeaveConvert.class);

    BpmOALeaveDO convert(BpmOALeaveCreateReqVO bean);

    BpmOALeaveRespVO convert(BpmOALeaveDO bean);

    List<BpmOALeaveRespVO> convertList(List<BpmOALeaveDO> list);

    PageResult<BpmOALeaveRespVO> convertPage(PageResult<BpmOALeaveDO> page);

}
