package cn.zs.wang.module.system.api.logger;

import cn.zs.wang.module.system.api.logger.dto.OperateLogCreateReqDTO;

import javax.validation.Valid;

/**
 * 操作日志 API 接口
 *
 * @author 芋道源码
 */
public interface OperateLogApi {

    /**
     * 创建操作日志
     *
     * @param createReqDTO 请求
     */
    void createOperateLog(@Valid OperateLogCreateReqDTO createReqDTO);

}
