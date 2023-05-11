package cn.zs.wang.framework.tenant.core.job;

import cn.hutool.core.collection.CollUtil;
import cn.zs.wang.framework.quartz.core.handler.JobHandler;
import cn.zs.wang.framework.tenant.core.context.TenantContextHolder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
@TenantJob // 标记多租户
public class TestJob implements JobHandler {

    private final List<Long> tenantIds = new CopyOnWriteArrayList<>();

    @Override
    public String execute(String param) throws Exception {
        tenantIds.add(TenantContextHolder.getTenantId());
        return "success";
    }

    public List<Long> getTenantIds() {
        CollUtil.sort(tenantIds, Long::compareTo);
        return tenantIds;
    }
}
