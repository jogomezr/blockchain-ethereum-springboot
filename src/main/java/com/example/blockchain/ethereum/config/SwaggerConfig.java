package com.example.blockchain.ethereum.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Configuration to enable Swagger2 console.
 * 
 * @author jagomez.rodriguez
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends DelegatingWebMvcConfiguration {

	private static final String SWAGGER_BASE_PACKAGE = "com.example.blockchain.ethereum.web";
	private static final String SWAGGER_REGEX_PATHS = "/.*";
	
	@Bean
	public Docket api() {

		return new Docket(DocumentationType.SWAGGER_2)
				.select()
					.apis(RequestHandlerSelectors.basePackage(SWAGGER_BASE_PACKAGE))
					.paths(regex(SWAGGER_REGEX_PATHS))
					.build()
				.useDefaultResponseMessages(false)
				.apiInfo(getMetadata()).forCodeGeneration(true);

	}
	
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {

		registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");

	}
	
	/**
	 * Returns API metadata
	 * 
	 * @return instance of {@link ApiInfo} with metadata
	 */
	private ApiInfo getMetadata() {

		return new ApiInfoBuilder()
				.title("Ethereum DApp Example API")
				.description("This is a sample contract to manage users, initiatives and proposals against an ethereum smart contract")
				.version("1.0")
				.build();

	}
}
