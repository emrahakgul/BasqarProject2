Feature: Notation Keys Page Functionality

  Background:
    Given Navigate to basqar

    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |

    Then User should login successfully

  Scenario:  View Notation Keys Page

    When User clicks on the elements in Page
      | humanResources |
      | setup2         |
      | notationKeys   |

    Then user should confirm "notation" text

  Scenario:  Create a Notation Key

    When User clicks on the elements in Page
      | humanResources |
      | setup2         |
      | notationKeys   |
      | addButton      |

    And Userrr sending the keys
      | formnamebox  | ea12354 |
      | shortnamebox | eak     |
      | multiplerbox | 5       |

    When User clicks on the elements in Page

      | applyButton |


    Then Userrr should see "succes" message

  Scenario:  Edit a Notation Key

    When User clicks on the elements in Page
      | humanResources |
      | setup2         |
      | notationKeys   |


    And Userrr sending the keys
      | nameSearch | ea12354 |

    When User clicks on the elements in Page
      | searchButton |

    Then Userrr "edit" "ea12354"

    And Userrr sending the keys
      | formnamebox  | ea05 |
      | shortnamebox | eak2 |
      | multiplerbox | 2    |

    When User clicks on the elements in Page
      | applyButton |

    Then Userrr should see "succes" message


  Scenario:  Search a Notation Key

    When User clicks on the elements in Page
      | humanResources |
      | setup2         |
      | notationKeys   |


    And Userrr sending the keys
      | nameSearch | ea05 |

    When User clicks on the elements in Page
      | searchButton |

    Then  "ea05" should be visible


  Scenario:  Delete a Notation Key

    When User clicks on the elements in Page
      | humanResources |
      | setup2         |
      | notationKeys   |


    And Userrr sending the keys
      | nameSearch | ea05 |

    When User clicks on the elements in Page
      | searchButton |

    Then Userrr "delete" "ea05"

    And User clicks on the elements in Page
      | yesButton |

    Then Userrr should see "succes" message
