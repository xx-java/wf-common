package com.zb.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class RabbitMQUtils {

    private Map<String, Object> args = new HashMap<>();

    @PostConstruct
    public void init(){
        // 设置该Queue的死信的信箱
        args.put("x-dead-letter-exchange", "deadLetterExchange");
        // 设置死信routingKey
        args.put("x-dead-letter-routing-key", "deadRoutingKey");
    }

    //声明一个死信交换机
    @Bean
    public TopicExchange deadLetterExchange() {
        return new TopicExchange(
                "deadLetterExchange",
                true,
                true);
    }

    //声明一个死信队列用来存放死信消息
    @Bean
    public Queue deadQueue() {
        return new Queue("dead.queue",
                true,
                false,
                true,
                null);
    }

    // 将死信队列和死信的交换机绑定
    @Bean
    public Binding bindingDead() {
        return BindingBuilder.bind(deadQueue()).
                to(deadLetterExchange()).
                with("deadRoutingKey");
    }

    @Bean
    TopicExchange topicExchange() {
        return new TopicExchange(
                "topicExchange",
                true,
                true);
    }


    /*自身业务开发需要提供的2个方法*/
    @Bean
    public Queue toUpdateGoodsQueue() {
        return new Queue("toUpdateGoodsQueue", true, false, true, args);
    }

    @Bean
    public Binding bindingToUpdateGoods() {
        return BindingBuilder.bind(toUpdateGoodsQueue()).to(topicExchange()).with("toUpdateGoodsQueue");
    }

}
