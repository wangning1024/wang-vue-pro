package cn.zs.wang.module.member.convert.user;

import cn.zs.wang.module.member.api.user.dto.MemberUserRespDTO;
import cn.zs.wang.module.member.controller.app.user.vo.AppUserInfoRespVO;
import cn.zs.wang.module.member.dal.dataobject.user.MemberUserDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    AppUserInfoRespVO convert(MemberUserDO bean);

    MemberUserRespDTO convert2(MemberUserDO bean);

    List<MemberUserRespDTO> convertList2(List<MemberUserDO> list);

}
