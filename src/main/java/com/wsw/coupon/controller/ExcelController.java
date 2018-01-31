package com.wsw.coupon.controller;

import com.wsw.coupon.entity.CouponExcel;
import com.wsw.coupon.entity.Coupons;
import com.wsw.coupon.repository.CouponsRepository;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.jeecgframework.poi.excel.entity.ImportParams;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/excel")
public class ExcelController {

    @RequestMapping("/export")
    private void export (HttpServletRequest request, HttpServletResponse response) throws IOException {
//        List<CouponExcel> list = new ArrayList<>();
//
//        CouponExcel coupon1 = new CouponExcel(
//                "12345678",
//                "初知男士外套冬季2017新款韩版潮流学生情侣棉衣棉袄子面包服宽松",
//                "http://img.alicdn.com/bao/uploaded/i2/3517355762/TB1WasjjyqAXuNjy1XdXXaYcVXa_!!0-item_pic.jpg",
//                new Date()
//        );
//
//        CouponExcel coupon2 = new CouponExcel(
//                "1234278",
//                "锄禾年货节豆浆粉350g*3豆粉即冲即饮速溶营养早餐即食冲饮42小包",
//                "http://img.alicdn.com/bao/uploaded/i4/2676703333/TB1xHLJncbI8KJjy1zdXXbe1VXa_!!0-item_pic.jpg",
//                new Date()
//        );
//
//        list.add(coupon1);
//        list.add(coupon2);
//
//        ExportParams exportParams = new ExportParams();
//
//        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, CouponExcel.class, list);
//
//        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode("coupons","UTF-8") + ".xls");
//        response.setCharacterEncoding("UTF-8");
//        workbook.write(response.getOutputStream());
    }

    @Autowired
    private CouponsRepository couponsRepository;


    @RequestMapping("import")
    public String port () throws FileNotFoundException {
        ImportParams params = new ImportParams();
        params.setLastOfInvalidRow(10);
        List<CouponExcel> list = ExcelImportUtil.importExcel(ResourceUtils.getFile("classpath:coupon.xls"),
                CouponExcel.class, params);


        for(int i = 0 ; i < list.size() ; i++) {
            Coupons coupons = new Coupons();
            BeanUtils.copyProperties(list.get(i), coupons);
            couponsRepository.save(coupons);
        }

        return "success";
    }
}

