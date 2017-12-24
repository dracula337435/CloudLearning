# CloudLearning
主要是学习spring-cloud

## 各模块

### EurekaServer
Eureka Server 注册中心
目前使用9080端口
测试链接[http://localhost:9080/test](http://localhost:9080/test)

### EurekaClient1
Eureka Client 服务提供者
目前使用9081端口
测试链接[http://localhost:9081/testClient1](http://localhost:9081/testClient1)

### EurekaClient2
Eureka Client 服务使用者
目前使用9082端口
测试链接（使用RestTemplate）[http://localhost:9082/restTemplate2to1](http://localhost:9082/restTemplate2to1)
测试链接（使用Feign）[http://localhost:9082/feign2to1](http://localhost:9082/feign2to1)

## 主要技术点

* gradle
* spring-boot
* spring-cloud
