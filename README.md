# mybatis-plus bug 重现

### 测试
启动项目访问
- http://localhost:8081/like (like)
- http://localhost:8081/equalTo (equalTo)

两者都为id 倒序返回结果不一样

错误
failed to concat orderBy from IPage, exception=null