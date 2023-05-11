package cn.zs.wang.module.mp.convert.tag;

import cn.zs.wang.framework.common.pojo.PageResult;
import cn.zs.wang.module.mp.controller.admin.tag.vo.MpTagRespVO;
import cn.zs.wang.module.mp.controller.admin.tag.vo.MpTagSimpleRespVO;
import cn.zs.wang.module.mp.controller.admin.tag.vo.MpTagUpdateReqVO;
import cn.zs.wang.module.mp.dal.dataobject.account.MpAccountDO;
import cn.zs.wang.module.mp.dal.dataobject.tag.MpTagDO;
import me.chanjar.weixin.mp.bean.tag.WxUserTag;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MpTagConvert {

    MpTagConvert INSTANCE = Mappers.getMapper(MpTagConvert.class);

    WxUserTag convert(MpTagUpdateReqVO bean);

    MpTagRespVO convert(WxUserTag bean);

    List<MpTagRespVO> convertList(List<WxUserTag> list);

    PageResult<MpTagRespVO> convertPage(PageResult<MpTagDO> page);

    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(source = "tag.id", target = "tagId"),
            @Mapping(source = "tag.name", target = "name"),
            @Mapping(source = "tag.count", target = "count"),
            @Mapping(source = "account.id", target = "accountId"),
            @Mapping(source = "account.appId", target = "appId"),
    })
    MpTagDO convert(WxUserTag tag, MpAccountDO account);

    List<MpTagSimpleRespVO> convertList02(List<MpTagDO> list);

}
