package cn.zs.wang.module.system.controller.admin.socail.vo;

import cn.zs.wang.module.system.enums.social.SocialTypeEnum;
import cn.zs.wang.framework.common.validation.InEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Schema(description = "管理后台 - 社交绑定 Request VO，使用 code 授权码")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SocialUserBindReqVO {

    @Schema(description = "社交平台的类型,参见 UserSocialTypeEnum 枚举值", required = true, example = "10")
    @InEnum(SocialTypeEnum.class)
    @NotNull(message = "社交平台的类型不能为空")
    private Integer type;

    @Schema(description = "授权码", required = true, example = "1024")
    @NotEmpty(message = "授权码不能为空")
    private String code;

    @Schema(description = "state", required = true, example = "9b2ffbc1-7425-4155-9894-9d5c08541d62")
    @NotEmpty(message = "state 不能为空")
    private String state;

}