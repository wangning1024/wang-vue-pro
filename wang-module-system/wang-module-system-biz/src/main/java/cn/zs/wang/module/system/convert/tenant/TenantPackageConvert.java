package cn.zs.wang.module.system.convert.tenant;

import cn.zs.wang.framework.common.pojo.PageResult;
import cn.zs.wang.module.system.controller.admin.permission.vo.role.RoleSimpleRespVO;
import cn.zs.wang.module.system.controller.admin.tenant.vo.packages.TenantPackageCreateReqVO;
import cn.zs.wang.module.system.controller.admin.tenant.vo.packages.TenantPackageRespVO;
import cn.zs.wang.module.system.controller.admin.tenant.vo.packages.TenantPackageSimpleRespVO;
import cn.zs.wang.module.system.controller.admin.tenant.vo.packages.TenantPackageUpdateReqVO;
import cn.zs.wang.module.system.dal.dataobject.tenant.TenantPackageDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * 租户套餐 Convert
 *
 * @author 芋道源码
 */
@Mapper
public interface TenantPackageConvert {

    TenantPackageConvert INSTANCE = Mappers.getMapper(TenantPackageConvert.class);

    TenantPackageDO convert(TenantPackageCreateReqVO bean);

    TenantPackageDO convert(TenantPackageUpdateReqVO bean);

    TenantPackageRespVO convert(TenantPackageDO bean);

    List<TenantPackageRespVO> convertList(List<TenantPackageDO> list);

    PageResult<TenantPackageRespVO> convertPage(PageResult<TenantPackageDO> page);

    List<TenantPackageSimpleRespVO> convertList02(List<TenantPackageDO> list);

}
