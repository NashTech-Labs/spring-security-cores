# spring-security-cores


### Clone the repo:

 - git clone git@github.com:knoldus/spring-security-cores.git


### Remediation

Set the "Access-Control-Allow-Origin" response header to allow access from trusted domains only. Do not allow access from arbitrary domains.

```
    HttpServletResponse response = (HttpServletResponse) res;
		HttpServletRequest request = (HttpServletRequest) req;
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		response.setHeader("Access-Control-Allow-Methods",
				"POST, GET, OPTIONS, DELETE");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
```
