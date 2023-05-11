package cn.zs.wang.module.system.mq.producer.permission;

import cn.zs.wang.module.system.mq.message.permission.RoleMenuRefreshMessage;
import cn.zs.wang.framework.mq.core.RedisMQTemplate;
import cn.zs.wang.module.system.mq.message.permission.UserRoleRefreshMessage;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Permission 权限相关消息的 Producer
 */
@Component
public class PermissionProducer {

    @Resource
    private RedisMQTemplate redisMQTemplate;

    /**
     * 发送 {@link RoleMenuRefreshMessage} 消息
     */
    public void sendRoleMenuRefreshMessage() {
        RoleMenuRefreshMessage message = new RoleMenuRefreshMessage();
        redisMQTemplate.send(message);
    }

    /**
     * 发送 {@link UserRoleRefreshMessage} 消息
     */
    public void sendUserRoleRefreshMessage() {
        UserRoleRefreshMessage message = new UserRoleRefreshMessage();
        redisMQTemplate.send(message);
    }

}
