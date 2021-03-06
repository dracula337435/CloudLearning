# CloudLearning
主要是学习spring-cloud

## 启动顺序
1. ConfigServer  
1. EurekaServer  
1. EurekaClient1或EurekaClient2或ZuulGateway   

## 各模块

### EurekaServer
Eureka Server 注册中心  
目前使用9080端口  
测试ConfigurationProperties[http://localhost:9080/testConfigurationProperties](http://localhost:9080/testConfigurationProperties)  
测试链接[http://localhost:9080/test](http://localhost:9080/test)  
测试配置中心链接[http://localhost:9080/testConfig](http://localhost:9080/testConfig)返回配置中“application”的值  

### EurekaClient1
Eureka Client 服务提供者  
目前使用9081端口  
测试链接[http://localhost:9081/testClient1](http://localhost:9081/testClient1)，随机等待0-4秒再返回  

### EurekaClient2
Eureka Client 服务使用者  
目前使用9082端口  
测试链接（使用RestTemplate）[http://localhost:9082/restTemplate2to1](http://localhost:9082/restTemplate2to1)  
测试链接（使用Feign）[http://localhost:9082/feign2to1](http://localhost:9082/feign2to1)  
经过hystrix的，[http://localhost:9082/testCircuitBreaker2To1](http://localhost:9082/testCircuitBreaker2To1)  

### ConfigServer
config 配置服务器  
目前使用8888端口  
配置来自自己的github-repo [CloudLearning-Config](https://github.com/dracula337435/CloudLearning-Config)  

### Zuul
网关服务器  
目前使用9090端口  
自动配置的按service-id的反向代理  
下述2个链接，注意访问的是gateway，中间一层是service-id  
测试链接，通过gateway的1，[http://localhost:9090/eurekaclient1/testClient1](http://localhost:9090/eurekaclient1/testClient1)  
测试链接，通过gateway的2，[http://localhost:9090/eurekaclient2/feign2to1](http://localhost:9090/eurekaclient2/feign2to1)  

## 主要技术点

* gradle
* spring-boot
* spring-cloud  
eureka server & client  
config server & client  
zuul gateway  
sleuth & zipkin
hystrix
