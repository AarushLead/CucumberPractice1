$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/JAVAWORKSPACE/CucumberPractice1/Features/hooks.feature");
formatter.feature({
  "line": 1,
  "name": "Test Hooks",
  "description": "",
  "id": "test-hooks",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2404400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "This is first scenario",
  "description": "",
  "id": "test-hooks;this-is-first-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@First"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "This is First step",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "This is second step",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "This is Third step",
  "keyword": "Then "
});
formatter.match({
  "location": "Hooks.this_is_First_step()"
});
formatter.result({
  "duration": 530266200,
  "status": "passed"
});
formatter.match({
  "location": "Hooks.this_is_second_step()"
});
formatter.result({
  "duration": 146600,
  "status": "passed"
});
formatter.match({
  "location": "Hooks.this_is_Third_step()"
});
formatter.result({
  "duration": 156400,
  "status": "passed"
});
formatter.after({
  "duration": 466900,
  "status": "passed"
});
formatter.before({
  "duration": 185000,
  "status": "passed"
});
formatter.before({
  "duration": 406200,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "This is second scenario",
  "description": "",
  "id": "test-hooks;this-is-second-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Second"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "This is First step",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "This is second step",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "This is Third step",
  "keyword": "Then "
});
formatter.match({
  "location": "Hooks.this_is_First_step()"
});
formatter.result({
  "duration": 153600,
  "status": "passed"
});
formatter.match({
  "location": "Hooks.this_is_second_step()"
});
formatter.result({
  "duration": 138200,
  "status": "passed"
});
formatter.match({
  "location": "Hooks.this_is_Third_step()"
});
formatter.result({
  "duration": 133400,
  "status": "passed"
});
formatter.after({
  "duration": 431400,
  "status": "passed"
});
formatter.after({
  "duration": 91000,
  "status": "passed"
});
formatter.before({
  "duration": 697400,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "This is third scenario",
  "description": "",
  "id": "test-hooks;this-is-third-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Third"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "This is First step",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "This is second step",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "This is Third step",
  "keyword": "Then "
});
formatter.match({
  "location": "Hooks.this_is_First_step()"
});
formatter.result({
  "duration": 1440500,
  "status": "passed"
});
formatter.match({
  "location": "Hooks.this_is_second_step()"
});
formatter.result({
  "duration": 116500,
  "status": "passed"
});
formatter.match({
  "location": "Hooks.this_is_Third_step()"
});
formatter.result({
  "duration": 449200,
  "status": "passed"
});
formatter.after({
  "duration": 104400,
  "status": "passed"
});
});