package com.coco.study.spring5.unit1;

import com.coco.study.spring5.domain.Wangzz;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangzz
 * @date 2020年04月09日 13:48
 */

public class Demo {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Wangzz wangzz = context.getBean("wangzz", Wangzz.class);
        System.out.println(wangzz);
    }

}
