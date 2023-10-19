package com.example.spring.config;

import org.hibernate.annotations.Comments;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.ExposureConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.example.spring.addresses.model.Address;
//@Configuration
public class RestConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration restConfig,
      CorsRegistry cors) {
        ExposureConfiguration config = restConfig.getExposureConfiguration();
//        config.forDomainType(Address.class).withItemExposure((metadata, httpMethods) ->
//          httpMethods.disable(HttpMethod.POST));

        
//        config.forDomainType(Comments.class).withItemExposure((metadata, httpMethods) -> httpMethods.disable(HttpMethod.PUT)
//                        .disable(HttpMethod.PATCH).disable(HttpMethod.POST).disable(HttpMethod.DELETE))
//                .withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(HttpMethod.PUT)
//                        .disable(HttpMethod.PATCH).disable(HttpMethod.POST).disable(HttpMethod.DELETE));
    }
    
}
