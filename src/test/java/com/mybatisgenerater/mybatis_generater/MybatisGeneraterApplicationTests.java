package com.mybatisgenerater.mybatis_generater;

import com.fn.dao.mapper.CategoryMapper;
import com.fn.dao.mapper.ProductMapper;
import com.fn.model.Category;
import com.fn.model.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisGeneraterApplicationTests {

    @Autowired
    CategoryMapper categoryMapper;
    @Autowired
    ProductMapper productMapper;

    @Test
    public void contextLoads() {
        System.out.println("测试================多对一");
        List<Product> ps = productMapper.listProduct();
        for (Product p : ps) {
            System.out.println(p);
        }
    }

    /**
     * 测试一对多的关系映射（一个分类对应多个产品）
     */
    @Test
    public void test2() {
        System.out.println("测试===========一对多的关系");
        List<Category> cs = categoryMapper.listCategory();
        for (Category c : cs) {
            System.out.println(c);
            List<Product> ps = c.getProducts();
            for (Product p : ps) {
                System.out.println("\t"+p);
            }
        }
    }

}

