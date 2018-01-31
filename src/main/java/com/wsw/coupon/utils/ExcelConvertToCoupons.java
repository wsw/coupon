package com.wsw.coupon.utils;

import com.wsw.coupon.entity.CouponExcel;
import com.wsw.coupon.entity.Coupons;
import org.springframework.beans.BeanUtils;

public class ExcelConvertToCoupons {

    public Coupons ExcelConvertToCoupons(CouponExcel couponExcel) {
        Coupons coupons = new Coupons();
        BeanUtils.copyProperties(couponExcel, coupons);
        return coupons;
    }
}
