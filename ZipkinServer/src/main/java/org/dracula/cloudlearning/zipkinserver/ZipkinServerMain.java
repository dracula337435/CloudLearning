package org.dracula.cloudlearning.zipkinserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import zipkin2.server.internal.EnableZipkinServer;
import zipkin2.server.internal.RegisterZipkinHealthIndicators;

/**
 * spring-boot 2.1 很诡异地不能启动zipkin-server，但是发现下载的可执行jar中用的是spring-boot 2.1.1
 * 于是仿照着其主类{@link zipkin.server.ZipkinServer}写一个主类
 * @author dk
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerMain {

    public static void main(String[] args){
        new SpringApplicationBuilder(ZipkinServerMain.class)
                .listeners(new RegisterZipkinHealthIndicators())
                .properties("spring.config.name=zipkin-server").run(args);
    }

}
