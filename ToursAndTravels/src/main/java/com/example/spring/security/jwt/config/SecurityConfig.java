package com.example.spring.security.jwt.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

import com.example.spring.security.jwt.filter.JwtAuthenticationFilter;
import com.example.spring.security.jwt.util.JwtAuthenticationEntryPoint;

@Configuration
public class SecurityConfig {
//	@Autowired
//	UserDetailsService userDetailsService;

    @Autowired
    private JwtAuthenticationEntryPoint point;
    @Autowired
    private JwtAuthenticationFilter filter;
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, HandlerMappingIntrospector introspector) throws Exception {

       // http.csrf(csrf -> csrf.disable())
//    	http.csrf(csrf->csrf.disable()).cors(cors->cors.disable())
//                .authorizeHttpRequests(req->{
//                	req.requestMatchers("/api/vl/addresses/**", "/users","/users/**").hasRole("ADMIN")
//                	.requestMatchers("/api/vl/addresses").permitAll()
//                	.requestMatchers("/auth/login","swagger-ui.html", "swagger-ui/**","/v3/api-docs/**").permitAll()
//                	.anyRequest().authenticated();
//                })
//                .exceptionHandling(ex -> ex.authenticationEntryPoint(point))
//                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
//        return http.build();
//        MvcRequestMatcher.Builder mvcMatcherBuilder = new MvcRequestMatcher.Builder(introspector);
//        return http.cors().and().csrf(AbstractHttpConfigurer::disable)
//				.authorizeHttpRequests(auth -> 
//						auth
//						//.requestMatchers(mvcMatcherBuilder.pattern("/users/**")).permitAll()
//						//.requestMatchers(mvcMatcherBuilder.pattern("/users")).permitAll()
//						.requestMatchers(HttpMethod.POST, "/users").hasRole("ADMIN")
//						.requestMatchers(HttpMethod.POST, "/uth/login").permitAll()
//						.anyRequest()
//						.authenticated())
//				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//				.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class)
//				.userDetailsService(userDetailsService).build();
//   

    	
    	 http.cors().and().csrf(csrf -> csrf.disable())
         .authorizeHttpRequests(auth->
         		auth.
         			requestMatchers("/auth/login").permitAll()
         			.requestMatchers("/users").permitAll()
        		 	.anyRequest().authenticated()
        		 	)
         			.exceptionHandling(ex -> ex.authenticationEntryPoint(point))
					.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
			http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
			return http.build();
 
    }
    @Bean
	CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowCredentials(true);
		// configuration.setAllowedOrigins(Arrays.asList("http://192.168.137.6:3000")); 
		configuration.addAllowedOriginPattern("*");
		// 	configuration.setAllowedMethods(Arrays.asList("GET", "HEAD", "POST", "PUT"));
		configuration.setAllowedMethods(Arrays.asList("*"));
		configuration.setAllowedHeaders(Arrays.asList("*"));
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
	}

}
