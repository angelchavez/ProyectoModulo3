@feature01
Feature: Registro de OWASP

  Scenario Outline: Registro de nuevos usuarios

      Given EL usuario esta en la pagina de inicio "http://localhost:3000/#/register"
    # Given EL usuario esta en la pagina de inicio "https://juice-shop.herokuapp.com/#/register"
    When  El usuario completa la informacion de registro "<Email>" "<Password>" "<Repeat Password>" "<Security Question>" "<Answer>"
    And   hago clic en el botón Register
    Then  El usuario deberia tener su cuenta creada

  Examples:

  | Email                     | Password             | Repeat Password    | Security Question   | Answer        |
  | angelchavez_47@gmail.com | tingomaria2025        | tingomaria2025   | Your favorite book? | donQuijote    |
  | juanperez@gmail.com       |  eljugador90          | eljugador90        | Your favorite book? | metamorfosis  |





