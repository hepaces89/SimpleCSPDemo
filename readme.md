# ReadMe for SimpleCSPDemo

## Intro
This repository contains experiments I did with CSP (Content Security Policy)

Currently there are two main examples:
 - CSP via the `<meta>` tag
 - CSP via http headers that are injected by a filter

## Installation/Running
### Prerequisites
- WebServer like Tomcat 8
- Java
- Eclipse compatible IDE

### Step 1
Clone down the code and import into Eclipse

### Step 2
Install code into Webserver

#### Important files
 - CSPReportHander.java : handles the CSP reports sent by the browser whenever a CSP issue is encountered
 - CSPFilter1.java : handles the injection of CSP headers for specified files
 - web.xml : configures the java files and tells them which url patterns to listen on

### Step 3
Explore `<meta>` based CSP features @ http://localhost:8080/SimpleCSPDemo/CSPDemoPages/CSPDemoPage1.html

### Step 4
Explore header based CSP features @ http://localhost:8080/SimpleCSPDemo/CSPDemoPages/CSPDemoPage2.html

### Step 5
Examine the web.xml configuration and the CSPFilter1.java Filter that inserts the CSP header as this is something you will need if you want to insert headers on the fly.
