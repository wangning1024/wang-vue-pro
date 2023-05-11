package cn.zs.wang.module.promotion.controller.admin.discount.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - 限时折扣活动 Response VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class DiscountActivityRespVO extends DiscountActivityBaseVO {

    @Schema(description = "活动编号", required = true, example = "1024")
    private Long id;

    @Schema(description = "活动状态", required = true, example = "1")
    @NotNull(message = "活动状态不能为空")
    private Integer status;

    @Schema(description = "创建时间", required = true)
    private LocalDateTime createTime;

}
