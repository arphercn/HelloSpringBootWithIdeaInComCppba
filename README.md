### spring-boot学习笔记  
参考<http://www.cppba.com/> <http://www.jianshu.com/p/887c22723e43>  
1.1 编写pom.xml,Idea加载依赖库,插件  
1.2 复制代码,调试Idea  
 参考DatabaseConfiguration.java,aplication.yml,CommonAction.java及Idea运行 mvn spring-boot:run后报错  
 修改aplication.xml内容  
  url: jdbc:mysql://localhost:3306/HelloSpringBootWithIdeaInComCppba  
 
  新建数据库HelloSpringBootWithIdeaInComCppba,新建表user字段username,password  
  运行mvn spring-boot:run 成功

