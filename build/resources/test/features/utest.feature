#Autor: Felipe Beltran

@successfulCreation
Feature: user registers Utest
  As a user, Felipe want to register on the Utest platform, fill out the Utest registration form
  @scenario
  Scenario: user registration
    Given that Felipe wants to belong to the professional network for testers Utest
      |creator      |
      |felipe   |
    When he fills in the registration form
      |creator      |firstName    |lastName      |email            |birthMonth|birthDay|birthYear |languages |city   |postalCode |country |computer |version |languageOS |mobileDevice |modelMobile |mobileOperatingSystem  |newPassword|
      |felipe   |andres felipe|beltran valero|prucvbeba3@gghjuslktr.com|November  |25      |1990      |spanish   |bogota |111161     |colombia |windows |10      |spanish    |xiaomi       |redmi 2     |android 4              |Choucair1.|
    Then he successfully registers by observing the tittle!
      |welcomeMessage      |
      |Welcome to the world's largest community of freelance software testers!|