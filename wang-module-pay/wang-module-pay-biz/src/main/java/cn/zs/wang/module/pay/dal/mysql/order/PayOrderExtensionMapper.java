package cn.zs.wang.module.pay.dal.mysql.order;

import cn.zs.wang.framework.mybatis.core.mapper.BaseMapperX;
import cn.zs.wang.module.pay.dal.dataobject.order.PayOrderExtensionDO;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PayOrderExtensionMapper extends BaseMapperX<PayOrderExtensionDO> {

    default PayOrderExtensionDO selectByNo(String no) {
        return selectOne(PayOrderExtensionDO::getNo, no);
    }

    default int updateByIdAndStatus(Long id, Integer status, PayOrderExtensionDO update) {
        return update(update, new LambdaQueryWrapper<PayOrderExtensionDO>()
                .eq(PayOrderExtensionDO::getId, id).eq(PayOrderExtensionDO::getStatus, status));
    }

}
