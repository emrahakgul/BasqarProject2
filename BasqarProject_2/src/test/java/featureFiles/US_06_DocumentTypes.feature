Feature: Document Types Page Functionality

  Background:
    Given Navigate to basqar

    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |

    Then User should login successfully

  Scenario:  View Document Types Page

    When User click on the elements in Document Types Page
      | setup         |
      | parameters    |
      | documentTypes |


  Scenario:  Create a Document

    When User click on the elements in Document Types Page
      | setup         |
      | parameters    |
      | documentTypes |
      | addButton     |
      | stage         |
      | option1       |

    And user click tab

    And Userr sending the keys
      | namebox | eakkk22 |

    And User click on the elements in Document Types Page

      | saveButton |


    Then Userr should see "successfully" message

  Scenario:  Edit a Document

    When User click on the elements in Document Types Page
      | setup         |
      | parameters    |
      | documentTypes |

    Then Userr "edit" "eakkk22"

    And Userr sending the keys
      | namebox | AKGdocument |

    And User click on the elements in Document Types Page
      | saveButton |

    Then Userr should see "succes" message

  Scenario:  Search and delete Document

    When User click on the elements in Document Types Page
      | setup         |
      | parameters    |
      | documentTypes |


    And Userr sending the keys
      | nameSearch | AKGdocument |

    When User click on the elements in Document Types Page
      | searchButton |

    Then Userr "delete" "AKGdocument"

    And User click on the elements in Document Types Page
      | yesButton |

    Then Userr should see "succes" message