package cn.zs.wang.framework.idempotent.config;

import cn.zs.wang.framework.idempotent.core.aop.IdempotentAspect;
import cn.zs.wang.framework.idempotent.core.keyresolver.impl.DefaultIdempotentKeyResolver;
import cn.zs.wang.framework.idempotent.core.keyresolver.impl.ExpressionIdempotentKeyResolver;
import cn.zs.wang.framework.idempotent.core.keyresolver.IdempotentKeyResolver;
import cn.zs.wang.framework.idempotent.core.redis.IdempotentRedisDAO;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import cn.zs.wang.framework.redis.config.WangRedisAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.List;

@AutoConfiguration(after = WangRedisAutoConfiguration.class)
public class WangIdempotentConfiguration {

    @Bean
    public IdempotentAspect idempotentAspect(List<IdempotentKeyResolver> keyResolvers, IdempotentRedisDAO idempotentRedisDAO) {
        return new IdempotentAspect(keyResolvers, idempotentRedisDAO);
    }

    @Bean
    public IdempotentRedisDAO idempotentRedisDAO(StringRedisTemplate stringRedisTemplate) {
        return new IdempotentRedisDAO(stringRedisTemplate);
    }

    // ========== 各种 IdempotentKeyResolver Bean ==========

    @Bean
    public DefaultIdempotentKeyResolver defaultIdempotentKeyResolver() {
        return new DefaultIdempotentKeyResolver();
    }

    @Bean
    public ExpressionIdempotentKeyResolver expressionIdempotentKeyResolver() {
        return new ExpressionIdempotentKeyResolver();
    }

}
