<h5 id="twentyninth">29. Design a login page using JSP and Servlet.</h5>
        <div class="container">
          <pre class="box">
            <code class="java">
              &lt;%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%&gt; 
              &lt;%@ page import="java.util.Date, java.text.SimpleDateFormat" %&gt;
              
              &lt;!DOCTYPE html&gt;
              &lt;html&gt;
                &lt;head&gt;
                  &lt;meta charset="UTF-8" /&gt;
                  &lt;title&gt;Login Page&lt;/title&gt;
                  &lt;link rel="stylesheet" href="./css/style.css" type="text/css" /&gt;
                &lt;/head&gt;
                &lt;body&gt;
                  &lt;div class="login-container"&gt;
                    &lt;form action="#" method="POST" class="login-form"&gt;
                      &lt;h1 class="title"&gt;Login&lt;/h1&gt;
                
                      &lt;div class="input-group"&gt;
                        &lt;label for="email"&gt;Email&lt;/label&gt;
                        &lt;input
                          type="email"
                          id="email"
                          name="email"
                          placeholder="Enter your email"
                          required
                        /&gt;
                      &lt;/div&gt;
                
                      &lt;div class="input-group"&gt;
                        &lt;label for="password"&gt;Password&lt;/label&gt;
                        &lt;input
                          type="password"
                          id="password"
                          name="password"
                          placeholder="Enter your password"
                          required
                        /&gt;
                      &lt;/div&gt;
                
                      &lt;button type="submit" class="login-btn"&gt;Login&lt;/button&gt;
                
                      &lt;p class="register-link"&gt;
                        Don&#39;t have an account? &lt;a href="#"&gt;Register here&lt;/a&gt;
                      &lt;/p&gt;
                    &lt;/form&gt;
                  &lt;/div&gt;
                  &lt;div class="footer"&gt;
                    &lt;hr /&gt;
                    &lt;%-- Get current year --%&gt;
                    &lt;%
                      Date currentDate = new Date();
                      SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
                      String currentYear = sdf.format(currentDate);
                    %&gt;
                    &lt;p&gt;© &lt;%= currentYear %&gt; All Rights Reserved.&lt;/p&gt;
                  &lt;/div&gt;
                &lt;/body&gt;
              &lt;/html&gt;
            </code>
            
              </pre>
          </div>