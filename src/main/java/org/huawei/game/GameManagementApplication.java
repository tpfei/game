package org.huawei.game;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableRedisRepositories
@EnableSwagger2
@MapperScan("org.huawei.game.mapper")
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class GameManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameManagementApplication.class, args);
	}
}
