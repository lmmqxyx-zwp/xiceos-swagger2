package top.by.xs2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2Configuration {

    @Value("${xs2.base.package}")
    private String swagger2BasePackage;

    // 基本信息
    @Value("${xs2.swagger2.title}")
    private String title;
    @Value("${xs2.swagger2.description}")
    private String description;
    @Value("${xs2.swagger2.termsOfServiceUrl}")
    private String termsOfServiceUrl;
    @Value("${xs2.swagger2.contact}")
    private String contact;
    @Value("${xs2.swagger2.version}")
    private String version;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(this.apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(this.swagger2BasePackage))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 创建该API的基本信息（这些基本信息会展现在文档页面中）
     * 访问地址：http://项目实际地址/swagger-ui.html
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(title)
                .description(description)
                .termsOfServiceUrl(termsOfServiceUrl)
                .contact(contact)
                .version(version)
                .build();
    }
}
