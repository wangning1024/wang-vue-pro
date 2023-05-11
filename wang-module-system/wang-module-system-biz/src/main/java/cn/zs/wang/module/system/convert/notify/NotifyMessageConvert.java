package cn.zs.wang.module.system.convert.notify;

import cn.zs.wang.framework.common.pojo.PageResult;
import cn.zs.wang.module.system.controller.admin.notify.vo.message.NotifyMessageRespVO;
import cn.zs.wang.module.system.dal.dataobject.notify.NotifyMessageDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 站内信 Convert
 *
 * @author xrcoder
 */
@Mapper
public interface NotifyMessageConvert {

    NotifyMessageConvert INSTANCE = Mappers.getMapper(NotifyMessageConvert.class);

    NotifyMessageRespVO convert(NotifyMessageDO bean);

    List<NotifyMessageRespVO> convertList(List<NotifyMessageDO> list);

    PageResult<NotifyMessageRespVO> convertPage(PageResult<NotifyMessageDO> page);


}
