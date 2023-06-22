# 微服务 - Spring Cloud

### 微服务技术栈
![](./images/cloud.png)


### Eureka 服务管理
Eureka是Netflix开发的服务发现框架，本身是一个基于REST的服务，主要用于定位运行在AWS域中的中间层服务，以达到负载均衡和中间层服务故障转移的目的。

SpringCloud将它集成在其子项目spring-cloud-netflix中，以实现SpringCloud的服务发现功能

##### Eureka服务注册与发现
Eureka 采用了CS的设计架构，Eureka Server作为服务注册功能的服务器，它是服务注册的中心。而系统中的其他微服务，使用 Eureka 的客户端链接到
Eureka server并维持心跳连接。使开发人员可以通过Eureka serve来监控系统中各个微服务的运行状态.

在服务注册与发现中，有一个注册中心。当服务启动的时候，会把当前自己的服务器的信息，比如 服务地址、通讯地址等以别名方式注册到注册中心。另一方
（消费者｜服务提供者），以该别名的方式去注册中心上获取到实际的服务通讯地址，然后再实现本地RPC调用远程RPC。远程调用框架的核心设计思想：在于注册中心
，因为使用注册中心管理每个服务于服务之间的一个依赖关系（服务治理概念）。在任何RPC远程框架中，都会有一个注册中心（存放服务地址相关信息）

### Eureka 三种角色
* Eureka Server ：提供服务注册和发现等
* Service Provider：服务提供者：自身注册到Eureka Server，供消费端调用
* Service Consumer：服务消费方：从Eureka获取注册服务列表，从而能够消费服务

![img.png](./images/Eureka.png)

## zookeeper
ZooKeeper是一个集中式服务，用于维护配置信息、命名、提供分布式同步、提供组服务. 支持高度可靠的分布式协调.

### zookeeper 数据模型和分层命名空间
zookeeper 数据模型: 其实就是用来存储和处理数据的。类似于数据库系统。不过 zookeeper 的数据模型更像电脑中的文件系统，有一个根文件夹
（固定的根节点 / ），下面有很多字文件夹（可以在根节点创建多个子节点，支持逐级创建）
![](./images/zookeeper.png)

## consul
#### what is consul?
HashiCorp Consul is a service networking solution that enables teams to manage secure network connectivity between services and across on-prem and multi-cloud environments and runtimes. Consul offers service discovery, service mesh, traffic management, and automated updates to network infrastructure device. You can use these features individually or together in a single Consul deployment.

Consul 是一套开源的分布式服务发现和配置管理系统。由 HashiCorp 公司使用Go语言开发。

提供了微服务系统中的服务治理、配置中心、控制总线等。这些功能即可以单独使用，也可以一起使用构建全方位的服务网格。

#### 功能
服务发现 提供http 和 dns 两种发现方式
监控检测 支持多方式， http、tcp、docker、shell脚本定制化
KV存储 key、value 的存储方式
多数据中心 consul支持多数据中心
可视化web界面

## OpenFeign
### 简介

OpenFeign 提供了一种**声明式的远程调用接口**。

###  OpenFeign 能做什么

目的是为了简易HTTP客户端的编写。

之前在 笔记中介绍了 Ribbon + RestTemplate 的使用。Ribbon + RestTemplate 是多http请求做了封装处理，形成了模版化的调用。但是在实际的开发中，由于对服务依赖的调用可能不止一处，往往一个接口被多处调用，所以需要对每个微服务进行封装。鉴于此 Feign 在此基础上为我们提供了封装操作，由Feign 帮我门定义和实现依赖服务接口的定义。因此简化了我们的操作，只需要创建一个接口并使用注解的形式来配置它（比如Mapper接口上标注@Mapper注解，现在是在一个微服务接口上标注一个@FeignClient注解），就可以完成对服务接口的绑定，简化了Spring cloud Ribbon使用时候封装客户端的开发量

### 如何使用

Declarative REST Client: Feign creates a dynamic implementation of an interface decorated with JAX-RS or Spring MVC annotations

在主启动类上通过注解 @EnableFeignClients、 接口上通过注解 @FeignClient 实现

## Hystrix
### 一、Hystrix 简介

hystrix是Netlifx开源的一款容错框架，防雪崩利器，具备[服务降级](https://so.csdn.net/so/search?q=服务降级&spm=1001.2101.3001.7020)，服务熔断，依赖隔离，监控(Hystrix Dashboard)等功能。

<font color="red">Hystrix is no longer in active development, and is currently in maintenance mode.</font>

<font color="red">Hystrix 已经停更</font>

----

### 二、Hystrix 的作用

* 服务降级
* 服务熔断
* 服务限流

----

### 三、Hystrix使用场景

1. 服务超时
2. 服务宕机（服务崩掉、机房断电、服务故障等）
3. 线程打满
4. 高并发场景
5. 等等

----

### 四、功能点简介

#### 1、服务降级

服务降级是当服务器压力剧增的情况下，根据当前业务情况及流量对一些服务和页面有策略的降级，以此释放服务器资源以保证核心任务的正常运行

#### 2、服务熔断

某服务出现不可用或响应超时的情况时，为了防止整个系统出现雪崩，暂时停止对该服务的调用.

#### 3、服务降级VS服务熔断

相同点：

- 目标一致 都是从可用性和可靠性出发，为了防止系统崩溃；
- 用户体验类似 最终都让用户体验到的是某些功能暂时不可用；

不同点：

- 触发原因不同 服务熔断一般是某个服务（下游服务）故障引起，而服务降级一般是从整体负荷考虑

#### 4、服务限流

只允许指定数量的事务进入系统处理，超过的部分将被拒绝服务，排队或者降级处理