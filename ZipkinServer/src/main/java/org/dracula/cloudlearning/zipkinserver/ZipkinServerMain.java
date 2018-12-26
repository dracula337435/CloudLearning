package org.dracula.cloudlearning.zipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerMain {

    public static void main(String[] args){
        SpringApplication.run(ZipkinServerMain.class, args);
    }

}
