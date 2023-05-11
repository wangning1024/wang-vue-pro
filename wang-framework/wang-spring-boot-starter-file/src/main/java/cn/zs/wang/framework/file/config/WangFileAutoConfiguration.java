package cn.zs.wang.framework.file.config;

import cn.zs.wang.framework.file.core.client.FileClientFactory;
import cn.zs.wang.framework.file.core.client.FileClientFactoryImpl;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * 文件配置类
 *
 * @author 芋道源码
 */
@AutoConfiguration
public class WangFileAutoConfiguration {

    @Bean
    public FileClientFactory fileClientFactory() {
        return new FileClientFactoryImpl();
    }

}
