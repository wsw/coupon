package com.wsw.coupon.controller;

import com.wsw.coupon.entity.CouponEntity;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.entity.ExportParams;
import org.jeecgframework.poi.excel.entity.vo.MapExcelConstants;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/excel")
public class ExcelController {

    @RequestMapping("/export")
    private void export (HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<CouponEntity> list = new ArrayList<>();

        CouponEntity coupon1 = new CouponEntity(
                "12345678",
                "初知男士外套冬季2017新款韩版潮流学生情侣棉衣棉袄子面包服宽松",
                "http://img.alicdn.com/bao/uploaded/i2/3517355762/TB1WasjjyqAXuNjy1XdXXaYcVXa_!!0-item_pic.jpg",
                new Date()
        );

        CouponEntity coupon2 = new CouponEntity(
                "1234278",
                "锄禾年货节豆浆粉350g*3豆粉即冲即饮速溶营养早餐即食冲饮42小包",
                "http://img.alicdn.com/bao/uploaded/i4/2676703333/TB1xHLJncbI8KJjy1zdXXbe1VXa_!!0-item_pic.jpg",
                new Date()
        );

        list.add(coupon1);
        list.add(coupon2);

        ExportParams exportParams = new ExportParams();

        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, CouponEntity.class, list);

        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("coupons","UTF-8") + ".xls");
        response.setCharacterEncoding("UTF-8");
        workbook.write(response.getOutputStream());
    }
}

