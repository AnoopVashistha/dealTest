/**
 * 
 */
package com.sg.dealProject.config;

/**
 * @author Anoop
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.sg.dealProject.controller")).paths(regex("/*.*"))
				.build();
	}
}
