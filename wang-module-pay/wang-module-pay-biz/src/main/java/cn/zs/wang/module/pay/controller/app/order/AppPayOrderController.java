package cn.zs.wang.module.pay.controller.app.order;

import cn.zs.wang.framework.common.pojo.CommonResult;
import cn.zs.wang.module.pay.controller.admin.order.vo.PayOrderSubmitRespVO;
import cn.zs.wang.module.pay.controller.app.order.vo.AppPayOrderSubmitReqVO;
import cn.zs.wang.module.pay.controller.app.order.vo.AppPayOrderSubmitRespVO;
import cn.zs.wang.module.pay.convert.order.PayOrderConvert;
import cn.zs.wang.module.pay.service.order.PayOrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

import static cn.zs.wang.framework.common.pojo.CommonResult.success;
import static cn.zs.wang.framework.common.util.servlet.ServletUtils.getClientIP;

@Tag(name = "用户 APP - 支付订单")
@RestController
@RequestMapping("/pay/order")
@Validated
@Slf4j
public class AppPayOrderController {

    @Resource
    private PayOrderService orderService;

    @PostMapping("/submit")
    @Operation(summary = "提交支付订单")
    public CommonResult<AppPayOrderSubmitRespVO> submitPayOrder(@RequestBody AppPayOrderSubmitReqVO reqVO) {
        PayOrderSubmitRespVO respVO = orderService.submitPayOrder(reqVO, getClientIP());
        return success(PayOrderConvert.INSTANCE.convert3(respVO));
    }

}
