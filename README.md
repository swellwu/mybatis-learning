# mybatis-learning
# mybatis-generator
## 使用
在com.mybatis.generator包下
根据需要修改generatorConfig.xml文件，在此目录下打开cmd，执行：
`java -jar mybatis-generator-core-1.3.5.jar -config generatorConfig.xml -overwrite`
即可生成对应文件，注意***xml映射文件多次生成是追加模式，而不是直接替换***
