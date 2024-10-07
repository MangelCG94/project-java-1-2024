# CRUD en Java de modelo Customer sobre un ArrayList

## Descripción
Desarrolla un CRUD en Java para un modelo Customer utilizando un ArrayList y una interfaz de consola en Visual Studio Code.
## Contexto
Puedes crear directamente los archivos java sin necesidad de crear un proyecto Java o Maven.

Opcionalmente, si así lo prefieres, puedes crear un proyecto de Java con ayuda de Visual Studio Code siguiendo estas instrucciones:
- Clic derecho en el explorador de archivos de Visual Studio Code
- New Java Project
- No build tools
- Seleccionar la carpeta donde se generará el proyecto /workspace/
- Elegir un nombre de proyecto: crud o demo por ejemplo
## Criterios de evaluación
> **Implementación correcta del modelo Customer**:
La clase Customer debe tener los campos id, nombre, apellido y email con sus respectivos getters y setters, y un método toString sobrescrito.
*Peso: 20%*

> **Interacción con el usuario en la clase Main**:
La clase Main debe proporcionar un menú de opciones para realizar operaciones CRUD por consola y manejar entradas inválidas adecuadamente utilizando Scanner.
*Peso: 40%*

> **Funcionalidad del repositorio CustomerRepository**
El CustomerRepository debe implementar correctamente las operaciones CRUD utilizando un ArrayList<Customer>.
*Peso: 40%*
## Requisitos
Desarrollar una aplicación en Java que implemente un CRUD (Create, Read, Update, Delete) para un modelo ``Customer`` utilizando una lista (``ArrayList``). El proyecto debe cumplir con los siguientes requisitos:
1. Crear una clase ``Customer`` con los campos ``id``, ``nombre``, ``apellido`` y ``email``.
2.  Implementar las operaciones CRUD en una clase ``CustomerRepository`` que gestione una lista de clientes.
3. Crear una clase ``Main`` que permita interactuar con el servicio de clientes a través de la consola.
4. Utilizar buenas prácticas de programación, incluyendo encapsulamiento, manejo de excepciones y comentarios adecuados.
5. Estructurar el proyecto en múltiples archivos según corresponda para mantener un código limpio y modular.
## Instrucciones
**Crear el proyecto en Visual Studio Code:**

- Abre Visual Studio Code y crea una nueva carpeta para el proyecto.
- Dentro de esta carpeta, crea una subcarpeta llamada src para los archivos fuente de Java.

**Definir el modelo Customer:**

- En la carpeta ``src``, crea un archivo llamado ``Customer.java``.
- Define la clase ``Customer`` con los campos ``id``, ``nombre``, ``apellido`` y ``email``.
- Implementa los métodos getters y setters para cada campo.
- Sobrescribe el método ``toString`` para una representación legible del objeto ``Customer``.

**Implementar el repositorio CustomerRepository:**

- En la carpeta ``src``, crea un archivo llamado ``CustomerRepository.java``.
- Define la clase ``CustomerRepository`` que contenga un ``ArrayList<Customer>``.
- Implementa los métodos para las operaciones CRUD:
  - ``save(Customer customer)``
  - ``findById(Long id)``
  - ``update(Long id, Customer updatedCustomer)``
  - ``delete(Long id)``
  - ``findAll()``

**Crear la clase ``Main`` para la interacción con el usuario:**

- En la carpeta ``src``, crea un archivo llamado ``Main.java``.
- Implementa un menú en la consola que permita al usuario seleccionar las operaciones CRUD.
- Utiliza un objeto scanner para poder leer de consola las opciones y la información necesaria: ``Scanner scanner = new Scanner(System.in)``.
- Utiliza un bucle ``while`` para mantener la interacción hasta que el usuario decida salir.
- Maneja las excepciones adecuadamente para entradas inválidas.

**Compilar y ejecutar el proyecto:**
- En Visual Studio Code, ejecuta el archivo que tiene el método main para verificar que cada opción CRUD funciona correctamente.
## Tecnologías
 **Java**