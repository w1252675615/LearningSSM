# LearningSSM
学习web框架

#Mybatis的学习

ResultMap可以调用不同的TypeHanlder，实现Enum同时映射成字符串或是整形。
映射器的XML文件放在和映射器接口放在同样的包目录下就可以自动发现
Spring boot 的很多Mybatis配置可以在根目录下的properties文件下完成，例如别名
Spring boot 的Mapper注解很方便的实现映射借口，不需要写SqlSession方面的东西，暂时没发现他的缺点。很简单粗暴。