## spring-boot学习笔记  
参考<http://www.cppba.com/> <http://www.jianshu.com/p/887c22723e43>  
### 1.1 编写pom.xml,Idea加载依赖库,插件  
### 1.2 复制代码,调试Idea  
 参考DatabaseConfiguration.java,aplication.yml,CommonAction.java及Idea运行 mvn spring-boot:run后报错  
 修改aplication.xml内容  
  url: jdbc:mysql://localhost:3306/HelloSpringBootWithIdeaInComCppba  
 
  新建数据库HelloSpringBootWithIdeaInComCppba,新建表user字段username,password  
  运行mvn spring-boot:run 成功  
### 2. 添加自定义fiter,代码中添加注释  
 在Idea配置tomcat,现在成功,可以通过Idea启动,然后chrome浏览  
##### 2.1 启动spring-boot总结:  
- 在根目录cmd或Idea命令行 mvn spring-boot:run  
- 点击Idea的run




