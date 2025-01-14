@feature02
Feature: : Login de OWASP

  Background: :
     Given el usuario esta en la pagina de inicio "http://localhost:3000/#/login"
   # Given el usuario esta en la pagina de inicio "https://juice-shop.herokuapp.com/#/login"

  Scenario Outline: Login con credenciales validas
    When el usuario ingresa su "<usuario>" y "<clave>" valido
    And hago clic en el botón Login
    Then deberia tener acceso a su cuenta
    Examples:
  | usuario | clave   |
  | angelchavez_47@gmail.com| tingomaria2025|
  |juanperez@gmail.com | eljugador90      |
  | Perez@hotmail.com  | TingoMariaQa@$|
