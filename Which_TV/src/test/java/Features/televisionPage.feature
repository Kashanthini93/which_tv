Feature: Television Page Features

  
  @testing
  Scenario: User is able to filter the search 
    Given user is on television page
    When user select screen size 
    And user selects the maximum price 
    Then result is displayed

  Scenario: User is able to compare the Televisions 
    Given user is on television page 
    When user select a TV to compare 
    And user selects another TV to compare 
    And user selects the compare button 
    Then compare page is displayed 
    
  Scenario: User is able to navigate to different page
    Given user is on television page 
    When user select Best Buy Page 
    Then Best Buy Page is displayed 
    
	#Scenario: User is able to sort the results 
   # Given user is on television page
   # When user select screen size 
   # And user selects the maxium price 
   # And result is displayed
   # And user selects to sort by High to low price 
   
  #Scenario: User is able to  view information 
    #Given user is on television page 
    #When user hovers over the information icon
    #Then information is displayed 
    

    
