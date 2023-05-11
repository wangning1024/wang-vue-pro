package cn.zs.wang.module.mp.mq.message;

import cn.zs.wang.framework.mq.core.pubsub.AbstractChannelMessage;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 公众号账号刷新 Message
 *
 * @author 芋道源码
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MpAccountRefreshMessage extends AbstractChannelMessage {

    @Override
    public String getChannel() {
        return "mp.account.refresh";
    }

}
