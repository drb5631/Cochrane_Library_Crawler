# Cochrane_Library_Crawler
A crawler to gather topic reviews on the cochrane Library website.<br />

To Start Crawler:<br />
1 - Go To https://www.cochranelibrary.com/<br />
2 - Open Dev-Tools -> Application -> Cookies<br />
3 - Copy JSESSIONID Value<br />
4 - Put copied value in HttpClientConnection -> getCochraneURL method -> BasicClientCookie clientCookie = new BasicClientCookie("JSESSIONID", "YOUR COOKIE VALUE HERE")<br />
5 - Run CochraneCrawlerStart.java
