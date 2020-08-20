$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ssinha/eclipse-workspace/AmazonBDDFramework/src/main/java/com/qa/features/freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM application test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Free CRM homepage test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-homepage-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user logs into app",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Verifies Homepage title",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 15733186000,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 16633600,
  "error_message": "java.lang.NullPointerException\r\n\tat com.qa.stepdefinitions.HomepageSteps.user_is_on_login_page(HomepageSteps.java:25)\r\n\tat ✽.Then user is on login page(C:/Users/ssinha/eclipse-workspace/AmazonBDDFramework/src/main/java/com/qa/features/freecrm.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomepageSteps.user_logs_into_app()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomepageSteps.Verifies_Homepage_title()"
});
formatter.result({
  "status": "skipped"
});
});