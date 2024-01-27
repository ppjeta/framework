FROM newharbor.aciga.com.cn/basic/tomcat:openjdk8

RUN ln -snf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo Asia/Shanghai > /etc/timezone

ADD target/application.demo.start-1.0.0.jar /application.demo.start-1.0.0.jar

#EXPOSE 8080

ENTRYPOINT ["java","-jar","application.demo.start-1.0.0.jar"]
