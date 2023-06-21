package com.jeffcail.ribbonrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName RibbonRule
 * @Description TODO
 * @Author cc
 * @Date 2023/6/22 12:24 上午
 * @Version 1.0
 */
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule(); // 定义为随机规则
    }

}
