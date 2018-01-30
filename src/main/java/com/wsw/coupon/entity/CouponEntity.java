package com.wsw.coupon.entity;

import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.io.Serializable;
import java.util.Date;

@Data
public class CouponEntity implements Serializable {
    /**
     * id
     */
    @Excel(name = "商品id")
    private String goodsId;

    @Excel(name = "商品名称")
    private String goodsName;

    @Excel(name = "商品主图")
    private String goodsMainPicture;

    @Excel(name = "优惠券开始时间", format = "yyyy-MM-DD")
    private Date startDate;

    public CouponEntity(String goodsId, String goodsName, String goodsMainPicture, Date startDate) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsMainPicture = goodsMainPicture;
        this.startDate = startDate;
    }
}
