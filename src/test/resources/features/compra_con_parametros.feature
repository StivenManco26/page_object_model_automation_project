#language:es

Característica: Compra de productos
  Yo como usuario de Saucedemo
  Quiero agregar productos al carrito
  Para realizar la compra de estos

  Antecedentes: Login exitoso
    Dado que el usuario se encuentra en la pagina
    Cuando el usuario ingrese sus credenciales
    |usuario |standard_user|
    |clave|secret_sauce|
    Entonces el usuario deberia ingresar al ecommerce

  Escenario: Comprar un producto
    Dado que el usuario agrega el producto Sauce Labs Backpack al carrito
    Cuando se dirige al carrito de compras para iniciar el checkout
    Y ingresa sus datos para finalizar la compra
    Entonces el usuario deberia ver el mensaje de gracias por su orden