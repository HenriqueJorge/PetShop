package br.com.cesed.bd2.petshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket detalheApi() {

		Docket docket = new Docket(DocumentationType.SWAGGER_2);

		docket.select().apis(RequestHandlerSelectors.basePackage("br.com.cesed.bd2.petshop")).paths(PathSelectors.any())
				.build().apiInfo(this.informacoesApi().build());

		return docket;
	}

	private ApiInfoBuilder informacoesApi() {

		ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

		apiInfoBuilder.title("API REST PETSHOP");
		apiInfoBuilder.description("Api para genciamento de petshop.");
		apiInfoBuilder.version("1.3");
		apiInfoBuilder
				.termsOfServiceUrl("Termo de uso: Deve ser usada para estudos.");
		apiInfoBuilder.license("Licen�a - Open Source");
		apiInfoBuilder.licenseUrl("");
		apiInfoBuilder.contact(this.contato());

		return apiInfoBuilder;

	}

	private Contact contato() {

		return new Contact(null,null, null);
	}

}
