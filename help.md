Profiles:
1) @Profile: to specify profile for specific bean/class
2) @ActiveProfiles : over test to specify profile
3) Run project with -Dspring.profiles.active=test
4) as a context param in web.xml: 
<context-param>
<param-name>spring.profiles.active</param-name>
<param-value>dev</param-value>
</context-param>
5) In webapplicationInitializer: onStartUp(ctx): ctx.setInitParameter("spring.profiles.active","dev");



    @Profile("dev") 
    
Only present in dev environment, not also on prod

	@Profile("test")
Only for test env

	@Profile("!test")
For env other than test

	<beans profile="test">
	</beans>

	Priority Order
1) Web.xml context-param (highest preference)
2) WebApplicationInitializer
3) JVM system property
4) Environment variable
5) Maven profile

	

