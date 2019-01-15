package top.by.xs2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>Title: XiceosSwagger2Application</p>
 * <p>Description: 启动类
 * 		通过@EnableSwagger2注解来启用Swagger2
 * 		也可以在配置文件中配置启用Swagger2 {@link top.by.xs2.config.Swagger2Configuration}
 * </p>
 *
 * @author zwp
 * @date 2019/1/8 15:37
 */
@EnableSwagger2
@EnableTransactionManagement
@SpringBootApplication
public class XiceosSwagger2Application {

	public static void main(String[] args) {
		SpringApplication.run(XiceosSwagger2Application.class, args);
	}

}

