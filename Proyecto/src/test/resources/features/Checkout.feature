@feature03

Feature: CHECKOUT
  Agregar Direccion
  Metodo de Pago
  Cesta de Pedido1
  Cesta de Pedido2

  @Direccion
  Scenario Outline: Agregar una nueva dirección de envío
    Given El usuario navega a la página "http://localhost:3000/#/login"
   # Given El usuario navega a la página "https://juice-shop.herokuapp.com/#/login"
    When Hace clic en el botón Add New Address
    And Rellena el formulario  "<country>" "<name>" "<mobileNumber>" "<zipCode>" "<address>" "<city>" "<state>"
    And Hace clic en el botón Submit
    Then La nueva dirección "<address>" aparece en la lista de direcciones.

    Examples:
       |country       | name       | mobileNumber | zipCode | address         | city         | state       |
       |United States | John Doe   | 1234567890   | 12345   | Santa Anita 456    | New York     | NY      |
       |Canada       | Jane Smith | 9876543210   | 54321   | San Alejandro 345 | Toronto      | ON         |

  @MetodoPago
  Scenario Outline: Agregar metodos de pago a la cuenta
    Given El usuario ingresa a la pagina web "http://localhost:3000/#/saved-payment-methods"
    #Given El usuario ingresa a la pagina web "https://juice-shop.herokuapp.com/#/saved-payment-methods"
    When Hace clic en el botón Add New card
    And Rellena el formulario  "<name>" "<cardNumber>" "<ExpiryMonth>" "<ExpiryYear>"
    And Hace clic en el botonSubmit
    Then El nuevo metodo de Pago "<address>" aparece en la lista de metodo de pago.

    Examples:
      | name         | cardNumber      | ExpiryMonth | ExpiryYear |
      | AngelChavez  | 1587156852682485| 5           | 2080 |
      | AngelChavez  | 1587156852682488|  2          | 2081 |

@Pedido1

Scenario Outline: Agregar un producto a la cesta utilizando la búsqueda
  Given que el usuario ha iniciado sesión con las credenciales "usuario" y "contraseña"
  And que el usuario está en la página principal de la tienda
  When el usuario busca "<producto>" en la barra de búsqueda
  #And selecciona el producto "<producto>"
  And lo agrega a la cesta
  And el producto "<producto>" debería estar en la cesta
  And luego da clic en chekout
  And El usuario selecciona la segunda dirección
  And El usuario selecciona el primer método de pago disponible
  And El usuario procede a completar el pedido
  Then El sistema confirma que el Pedido fue completado exitosamente
  Examples:
    | producto  |
    | Apple    |
    | Banana   |
    | Shirt     |


  @Pedido2
  Scenario: Agregar  productos aleatorios a la cesta y completar la orden
    Given  El usuario accede a la URL "http://localhost:3000/#/login"
    #Given  El usuario accede a la URL "https://juice-shop.herokuapp.com/#/login"
    When El usuario incie sesion con las credenciales "usuario" y "contraseña"
    And El usuario navega a la página de búsqueda en "http://localhost:3000/#/search"
    #And El usuario navega a la página de búsqueda en "https://juice-shop.herokuapp.com/#/search"
    And El usuario selecciona aleatoriamente producto del catalogo y los agrega a la cesta
    And El usuario selecciona la segunda dirección de envío
    And El usuario elige el primer método de pago disponible
    Then El sistema muestra una confirmación del pedido completado








