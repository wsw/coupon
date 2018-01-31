package com.wsw.coupon.controller;

import com.wsw.coupon.VO.ResultVO;
import com.wsw.coupon.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @GetMapping("/search")
    private ResultVO search() {

        return ResultVOUtil.success();
    }
}
