package cn.zs.wang.module.system.convert.mail;

import cn.zs.wang.framework.common.pojo.PageResult;
import cn.zs.wang.module.system.controller.admin.mail.vo.log.MailLogRespVO;
import cn.zs.wang.module.system.dal.dataobject.mail.MailLogDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MailLogConvert {

    MailLogConvert INSTANCE = Mappers.getMapper(MailLogConvert.class);

    PageResult<MailLogRespVO> convertPage(PageResult<MailLogDO> pageResult);

    MailLogRespVO convert(MailLogDO bean);

}
