package cn.zs.wang.module.system.convert.notice;

import cn.zs.wang.framework.common.pojo.PageResult;
import cn.zs.wang.module.system.controller.admin.notice.vo.NoticeCreateReqVO;
import cn.zs.wang.module.system.controller.admin.notice.vo.NoticeRespVO;
import cn.zs.wang.module.system.controller.admin.notice.vo.NoticeUpdateReqVO;
import cn.zs.wang.module.system.dal.dataobject.notice.NoticeDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface NoticeConvert {

    NoticeConvert INSTANCE = Mappers.getMapper(NoticeConvert.class);

    PageResult<NoticeRespVO> convertPage(PageResult<NoticeDO> page);

    NoticeRespVO convert(NoticeDO bean);

    NoticeDO convert(NoticeUpdateReqVO bean);

    NoticeDO convert(NoticeCreateReqVO bean);

}
