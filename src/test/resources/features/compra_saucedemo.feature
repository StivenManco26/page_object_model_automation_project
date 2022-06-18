#language:es

  Característica: Compra de productos
    Yo como usuario de Saucedemo
    Quiero agregar productos al carrito
    Para realizar la compra de estos

    Antecedentes: Login exitoso
      Dado que el usuario se encuentra en la pagina
      Cuando el usuario ingrese sus credenciales
      Entonces el usuario deberia ingresar al ecommerce

    Escenario: Comprar un producto
      Dado que el usuario agrega un producto al carrito
      Cuando se dirige al carrito de compras para iniciar el checkout
      Y ingresa sus datos para finalizar la compra
      Entonces el usuario debería ver el mensaje de gracias por su orden