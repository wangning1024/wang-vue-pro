package cn.zs.wang.module.pay.framework.web.config;

import cn.zs.wang.framework.swagger.config.WangSwaggerAutoConfiguration;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * pay 模块的 web 组件的 Configuration
 *
 * @author 芋道源码
 */
@Configuration(proxyBeanMethods = false)
public class PayWebConfiguration {

    /**
     * pay 模块的 API 分组
     */
    @Bean
    public GroupedOpenApi payGroupedOpenApi() {
        return WangSwaggerAutoConfiguration.buildGroupedOpenApi("pay");
    }

}
