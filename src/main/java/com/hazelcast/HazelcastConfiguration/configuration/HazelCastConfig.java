package com.hazelcast.HazelcastConfiguration.configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.EvictionPolicy;
import com.hazelcast.config.MapConfig;
import com.hazelcast.config.MaxSizeConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.constraints.Max;


@Configuration
public class HazelCastConfig {
    @Bean
    public Config hazelCastConfig(){
        Config config= new Config()
                .setInstanceName("hazelcast-instance")
                .addMapConfig(
                        new MapConfig()
                                .setName("employees")
                                .setMaxSizeConfig(new MaxSizeConfig(200, MaxSizeConfig.MaxSizePolicy.FREE_HEAP_SIZE))
                                .setEvictionPolicy(EvictionPolicy.LRU)
                                .setTimeToLiveSeconds(20));
                   config.setInstanceName("hazelcast-instance1")
                           .addMapConfig(
                                   new MapConfig()
                                   .setName("employee_search")
                                   .setMaxSizeConfig(new MaxSizeConfig(200, MaxSizeConfig.MaxSizePolicy.FREE_HEAP_SIZE))
                                   .setEvictionPolicy(EvictionPolicy.LRU)
                                   .setTimeToLiveSeconds(30)

                           );

        return config;
    }
}
