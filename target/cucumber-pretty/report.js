$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/calculateBMI.feature");
formatter.feature({
  "line": 1,
  "name": "BMI Calculation",
  "description": "Calculating the BMI of 5 users",
  "id": "bmi-calculation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Calculate BMI for multiple persons",
  "description": "",
  "id": "bmi-calculation;calculate-bmi-for-multiple-persons",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Calculator net page is open",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click on BMICalculator link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "BMICalculator page opened successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "we enter value as DataTable and calculate BMI",
  "rows": [
    {
      "cells": [
        "10",
        "127",
        "40"
      ],
      "line": 10
    },
    {
      "cells": [
        "30",
        "156",
        "70"
      ],
      "line": 11
    },
    {
      "cells": [
        "25",
        "152",
        "55"
      ],
      "line": 12
    },
    {
      "cells": [
        "20",
        "160",
        "45"
      ],
      "line": 13
    },
    {
      "cells": [
        "35",
        "160",
        "70"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "scenarioStepDefinition.calculator_net_page_is_open()"
});
formatter.result({
  "duration": 10479868700,
  "status": "passed"
});
formatter.match({
  "location": "scenarioStepDefinition.user_click_on_BMICalculator_link()"
});
formatter.result({
  "duration": 1946262200,
  "status": "passed"
});
formatter.match({
  "location": "scenarioStepDefinition.bmicalculator_page_opened_successfully()"
});
formatter.result({
  "duration": 117849200,
  "status": "passed"
});
formatter.match({
  "location": "scenarioStepDefinition.we_enter_value_as_DataTable_and_calculate_BMI(DataTable)"
});
formatter.result({
  "duration": 13591557100,
  "status": "passed"
});
formatter.match({
  "location": "scenarioStepDefinition.close_browser()"
});
formatter.result({
  "duration": 909829200,
  "status": "passed"
});
});