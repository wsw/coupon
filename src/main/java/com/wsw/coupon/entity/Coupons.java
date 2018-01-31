package com.wsw.coupon.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Coupons {

    @Id
    private String goodsId;

    private String goodsName;

    @Column(length = 1000)
    private String goodsMainPicture;

    @Column(length = 1000)
    private String goodsDetailUrl;

    private String goodsFirstCategory;

    @Column(length = 1000)
    private String extensionUrl;

    private Float goodsPrice;

    private Integer goodsMonthlySales;

    private Float incomeRatio;

    private Float commission;

    private String sellerContact;

    private String sellerId;

    private String shopName;

    private String platformType;

    private String couponId;

    private Integer couponTotal;

    private Integer couponSurplus;

    private String couponDenomination;

    private Date couponStartTime;

    private Date couponEndTime;

    @Column(length = 1000)
    private String couponUrl;

    @Column(length = 1000)
    private String goodsCouponExtensionUrl;

    public Coupons() {
    }
}
