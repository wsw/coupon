package com.wsw.coupon.repository;

import com.wsw.coupon.entity.Coupons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponsRepository extends JpaRepository<Coupons, String> {
}
