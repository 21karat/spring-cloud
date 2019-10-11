#### 注册中心：Eureka
注册中心，类似zookeeper配合dubbo时的作用,用来管理服务的url。<br>
注解@EnableEurekaServer: 启动一个服务注册中心。<br>

#### 服务注册发现
注解@EnableEurekaClient：表明自己是一个eurekaclient。(在服务提供端的启动类上)<br>
配置文件中注明自己的服务注册中心的地址。(eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/)<br>

#### 服务消费
配置文件指定服务的注册中心地址。<br>
@EnableDiscoveryClient：向服务中心注册。(启动类中)<br>
向程序的ioc注入一个bean: restTemplate。(启动类中)<br>
@LoadBalanced：表明这个restRemplate开启负载均衡的功能。(启动类中)<br>

#### 服务消费调用方式：ribbon+restTemplate，feign
这两种调用服务的方式有轮询负载的效果。<br>

#### 断路器：Hystrix
服务挂掉以后设置回调的方法，ribbon需要引入Hystrix依赖，feign是在ribbon上集成的，内部有断路器，但是需要在配置中开启。<br>
@HystrixCommand：注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法，熔断方法直接返回了一个字符串。<br>

#### 路由网关：zuul
根据不同url配置调用不同的服务。<br>
存在feign集成了hystrix，而hystrix默认的超时时间是1秒，<br>
如果我们的请求超过了1秒，那么就会报超时错误的问题，延长超时时间还是时有时无出现这个问题。<br>
@EnableZuulProxy：开启zuul的功能。<br>
zuul不仅只是路由，并且还能过滤，做一些安全验证。[实现类](https://github.com/21karat/spring-cloud/cloud-zuul/src/main/java/com/karat/cn/cloudzuul/filter/MyFilter.java) <br>

