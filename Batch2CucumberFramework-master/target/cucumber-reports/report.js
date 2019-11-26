$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HloginFunctinality.feature");
formatter.feature({
  "line": 2,
  "name": "login Funnctionality",
  "description": "",
  "id": "login-funnctionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TEC-201"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "test login",
  "description": "",
  "id": "login-funnctionality;test-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "launch web browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user input username\"\u003cuser\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User validate login \"\u003cpage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "login-funnctionality;test-login;",
  "rows": [
    {
      "cells": [
        "user",
        "password",
        "page"
      ],
      "line": 10,
      "id": "login-funnctionality;test-login;;1"
    },
    {
      "cells": [
        "Tester",
        "test",
        "Web Orders"
      ],
      "line": 11,
      "id": "login-funnctionality;test-login;;2"
    },
    {
      "cells": [
        "Tester",
        "1234",
        "Web Orders Login"
      ],
      "line": 12,
      "id": "login-funnctionality;test-login;;3"
    },
    {
      "cells": [
        "test",
        "test",
        "Web Orders Login"
      ],
      "line": 13,
      "id": "login-funnctionality;test-login;;4"
    },
    {
      "cells": [
        "test",
        "1234",
        "Web Orders Login"
      ],
      "line": 14,
      "id": "login-funnctionality;test-login;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1724395330,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "test login",
  "description": "",
  "id": "login-funnctionality;test-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TEC-201"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "launch web browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user input username\"Tester\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "password \"test\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User validate login \"Web Orders\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HloginSteps.launch_web_browser()"
});
formatter.result({
  "duration": 2560587841,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tester",
      "offset": 20
    }
  ],
  "location": "HloginSteps.user_input_username(String)"
});
formatter.result({
  "duration": 95061442,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 10
    }
  ],
  "location": "HloginSteps.password(String)"
});
formatter.result({
  "duration": 6411312814,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Web Orders",
      "offset": 21
    }
  ],
  "location": "HloginSteps.user_validate_login(String)"
});
formatter.result({
  "duration": 7458709,
  "status": "passed"
});
formatter.after({
  "duration": 82947104,
  "status": "passed"
});
formatter.before({
  "duration": 1069666813,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "test login",
  "description": "",
  "id": "login-funnctionality;test-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TEC-201"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "launch web browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user input username\"Tester\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "password \"1234\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User validate login \"Web Orders Login\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HloginSteps.launch_web_browser()"
});
formatter.result({
  "duration": 2466107563,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tester",
      "offset": 20
    }
  ],
  "location": "HloginSteps.user_input_username(String)"
});
formatter.result({
  "duration": 88314719,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 10
    }
  ],
  "location": "HloginSteps.password(String)"
});
formatter.result({
  "duration": 6180364064,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Web Orders Login",
      "offset": 21
    }
  ],
  "location": "HloginSteps.user_validate_login(String)"
});
formatter.result({
  "duration": 5498380,
  "status": "passed"
});
formatter.after({
  "duration": 83285416,
  "status": "passed"
});
formatter.before({
  "duration": 1010170532,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "test login",
  "description": "",
  "id": "login-funnctionality;test-login;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TEC-201"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "launch web browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user input username\"test\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "password \"test\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User validate login \"Web Orders Login\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HloginSteps.launch_web_browser()"
});
formatter.result({
  "duration": 2453538431,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 20
    }
  ],
  "location": "HloginSteps.user_input_username(String)"
});
formatter.result({
  "duration": 88940928,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 10
    }
  ],
  "location": "HloginSteps.password(String)"
});
formatter.result({
  "duration": 6182634542,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Web Orders Login",
      "offset": 21
    }
  ],
  "location": "HloginSteps.user_validate_login(String)"
});
formatter.result({
  "duration": 5634436,
  "status": "passed"
});
formatter.after({
  "duration": 81502772,
  "status": "passed"
});
formatter.before({
  "duration": 997355971,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "test login",
  "description": "",
  "id": "login-funnctionality;test-login;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@TEC-201"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "launch web browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user input username\"test\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "password \"1234\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User validate login \"Web Orders Login\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HloginSteps.launch_web_browser()"
});
formatter.result({
  "duration": 2462357297,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 20
    }
  ],
  "location": "HloginSteps.user_input_username(String)"
});
formatter.result({
  "duration": 82451570,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 10
    }
  ],
  "location": "HloginSteps.password(String)"
});
formatter.result({
  "duration": 6190533540,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Web Orders Login",
      "offset": 21
    }
  ],
  "location": "HloginSteps.user_validate_login(String)"
});
formatter.result({
  "duration": 5721836,
  "status": "passed"
});
formatter.after({
  "duration": 82656116,
  "status": "passed"
});
});