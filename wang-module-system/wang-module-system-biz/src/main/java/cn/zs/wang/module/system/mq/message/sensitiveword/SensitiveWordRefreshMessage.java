package cn.zs.wang.module.system.mq.message.sensitiveword;

import cn.zs.wang.framework.mq.core.pubsub.AbstractChannelMessage;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 敏感词的刷新 Message
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SensitiveWordRefreshMessage extends AbstractChannelMessage {

    @Override
    public String getChannel() {
        return "system.sensitive-word.refresh";
    }

}
