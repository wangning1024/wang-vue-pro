package cn.zs.wang.framework.operatelog.config;

import cn.zs.wang.framework.operatelog.core.aop.OperateLogAspect;
import cn.zs.wang.framework.operatelog.core.service.OperateLogFrameworkService;
import cn.zs.wang.framework.operatelog.core.service.OperateLogFrameworkServiceImpl;
import cn.zs.wang.module.system.api.logger.OperateLogApi;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class WangOperateLogAutoConfiguration {

    @Bean
    public OperateLogAspect operateLogAspect() {
        return new OperateLogAspect();
    }

    @Bean
    public OperateLogFrameworkService operateLogFrameworkService(OperateLogApi operateLogApi) {
        return new OperateLogFrameworkServiceImpl(operateLogApi);
    }

}
