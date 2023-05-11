package cn.zs.wang.module.infra.convert.file;

import cn.zs.wang.framework.common.pojo.PageResult;
import cn.zs.wang.module.infra.controller.admin.file.vo.file.FileRespVO;
import cn.zs.wang.module.infra.dal.dataobject.file.FileDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FileConvert {

    FileConvert INSTANCE = Mappers.getMapper(FileConvert.class);

    FileRespVO convert(FileDO bean);

    PageResult<FileRespVO> convertPage(PageResult<FileDO> page);

}
