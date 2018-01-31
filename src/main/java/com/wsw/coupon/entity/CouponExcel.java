package com.wsw.coupon.entity;

import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.io.Serializable;
import java.util.Date;

@Data
public class CouponExcel implements Serializable {
    @Excel(name = "商品id", isImportField = "true_st")
    private String goodsId;
    @Excel(name = "商品名称", isImportField = "true_st")
    private String goodsName;
    @Excel(name = "商品主图", isImportField = "true_st")
    private String goodsMainPicture;
    @Excel(name = "商品详情页链接地址", isImportField = "true_st")
    private String goodsDetailUrl;
    @Excel(name = "商品一级类目", isImportField = "true_st")
    private String goodsFirstCategory;
    @Excel(name = "淘宝客链接", isImportField = "true_st")
    private String extensionUrl;
    @Excel(name = "商品价格(单位：元)", isImportField = "true_st")
    private Float goodsPrice;
    @Excel(name = "商品月销量", isImportField = "true_st")
    private Integer goodsMonthlySales;
    @Excel(name = "收入比率(%)", isImportField = "true_st")
    private Float incomeRatio;
    @Excel(name = "佣金", isImportField = "true_st")
    private Float commission;
    @Excel(name = "卖家旺旺", isImportField = "true_st")
    private String sellerContact;
    @Excel(name = "卖家id", isImportField = "true_st")
    private String sellerId;
    @Excel(name = "店铺名称", isImportField = "true_st")
    private String shopName;
    @Excel(name = "平台类型", isImportField = "true_st")
    private String platformType;
    @Excel(name = "优惠券id", isImportField = "true_st")
    private String couponId;
    @Excel(name = "优惠券总量", isImportField = "true_st")
    private Integer couponTotal;
    @Excel(name = "优惠券剩余量", isImportField = "true_st")
    private Integer couponSurplus;
    @Excel(name = "优惠券面额", isImportField = "true_st")
    private String couponDenomination;
    @Excel(name = "优惠券开始时间", format = "yyyy-MM-DD", isImportField = "true_st")
    private Date couponStartTime;
    @Excel(name = "优惠券结束时间", format = "yyyy-MM-DD", isImportField = "true_st")
    private Date couponEndTime;

    @Excel(name = "优惠券链接", isImportField = "true_st")
    private String couponUrl;
    @Excel(name = "商品优惠券推广链接", isImportField = "true_st")
    private String goodsCouponExtensionUrl;

    public CouponExcel() {
    }
}
