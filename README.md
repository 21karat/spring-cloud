#### 注册中心：Eureka
注册中心，类似zookeeper配合dubbo时的作用,用来管理服务的url
#### 服务发现
#### 服务消费
#### 服务调用方式：ribbon+restTemplate，feign
这两种调用服务的方式有轮询负载的效果
#### 断路器：Hystrix
服务挂掉以后设置回调的方法，ribbon需要引入Hystrix依赖，feign是在ribbon上集成的，内部有断路器，但是需要在配置中开启
#### 路由网关：zuul
