package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeUrls().antMatchers("/**").hasRole("ADMIN").and()
			.formLogin().loginUrl("/login").loginProcessingUrl("/loginNotUsed").defaultSuccessUrl("/home").permitAll().and()
			.logout().logoutUrl("/logout").logoutSuccessUrl("/login").permitAll();
	}

	/*@Override
	protected void registerAuthentication(AuthenticationManagerBuilder auth)
			throws Exception {				
		auth.inMemoryAuthentication().withUser("admin")
				.password("adminasdf").roles("ADMIN");
	}
*/
	@Override
	public void configure(WebSecurity builder) throws Exception {
		builder.ignoring().antMatchers("/resources/**");
	}

}