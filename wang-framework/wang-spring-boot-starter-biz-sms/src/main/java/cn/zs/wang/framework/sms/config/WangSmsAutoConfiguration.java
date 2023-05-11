package cn.zs.wang.framework.sms.config;

import cn.zs.wang.framework.sms.core.client.SmsClientFactory;
import cn.zs.wang.framework.sms.core.client.impl.SmsClientFactoryImpl;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * 短信配置类
 *
 * @author 芋道源码
 */
@AutoConfiguration
public class WangSmsAutoConfiguration {

    @Bean
    public SmsClientFactory smsClientFactory() {
        return new SmsClientFactoryImpl();
    }

}
