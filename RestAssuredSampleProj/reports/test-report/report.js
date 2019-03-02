$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('feature\Cucu.feature');
formatter.feature({
  "line": 1,
  "name": "To test my cucumber test is running",
  "description": "",
  "id": "to-test-my-cucumber-test-is-running",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "cucumber setup",
  "description": "",
  "id": "to-test-my-cucumber-test-is-running;cucumber-setup",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "sample feature file is ready",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I run the feature file",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "run should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefni.givenStatment()"
});
formatter.result({
  "duration": 482120595,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefni.whenStatement()"
});
formatter.result({
  "duration": 134030,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefni.thenStatment()"
});
formatter.result({
  "duration": 120144,
  "status": "passed"
});
});