<img width="488" height="157" alt="image" src="https://github.com/user-attachments/assets/f80ca68b-059b-4ed7-8500-7e1562cc24f6" /><br><br>
# 🧠 Evaluación Final – Desarrollo Orientado a Objetos I

## 👤

**Nombre completo:** Camilo Pinto

**Carrera:** Analista Programador

**Asignatura:** Desarrollo Orientado a Objetos I

**Proyecto:** Sistema de Gestión – Llanquihue Tour

<br><br><br><br>

# 📘 Descripción general del sistema

Este proyecto corresponde a la **Evaluación Final** de la asignatura **Desarrollo Orientado a Objetos I**.

El sistema fue desarrollado para representar la gestión básica de una agencia turística denominada **Llanquihue Tour**, integrando los principales conceptos estudiados durante el semestre.

Durante el desarrollo se implementaron principios de Programación Orientada a Objetos como encapsulamiento, composición, herencia, polimorfismo, interfaces, colecciones dinámicas, lectura de archivos de texto y validación mediante excepciones personalizadas.

<br><br><br><br>

# 🧱 Estructura del proyecto

```text
src/

│

├── app/

│   └── Main.java

│

├── model/

│   ├── Registrable.java

│   ├── Persona.java

│   ├── Cliente.java

│   ├── Empleado.java

│   ├── Proveedor.java

│   ├── Direccion.java

│   ├── Rut.java

│   ├── Tarjeta.java

│   ├── Producto.java

│   └── OrdenCompra.java

│

├── data/

│   └── GestorDatos.java

│

├── utils/

│   ├── LectorArchivos.java

│   └── RutInvalidoException.java

│

└── resources/

    └── productos.txt
```

<br><br><br><br>

# 📂 Descripción de las clases

<br><br>

## Persona

Clase base del sistema.

Contiene la información común de todas las personas registradas.

Implementa la interfaz **Registrable** y sirve como base para Cliente, Empleado y Proveedor.

<br><br><br><br>

## Cliente

Hereda de Persona.

Representa a los clientes de la agencia e incorpora información relacionada con sus puntos acumulados.

<br><br><br><br>

## Empleado

Hereda de Persona.

Representa al personal de la agencia incluyendo su cargo.

<br><br><br><br>

## Proveedor

Hereda de Persona.

Representa empresas proveedoras de servicios asociados al turismo.

<br><br><br><br>

## Direccion

Clase utilizada mediante composición para almacenar la dirección de una persona.

<br><br><br><br>

## Rut

Representa el RUT de una persona.

Su construcción valida la información mediante una excepción personalizada.

<br><br><br><br>

## Tarjeta

Almacena la información bancaria asociada a una persona.

<br><br><br><br>

## Producto

Representa un servicio turístico disponible para la venta.

Contiene código, nombre y precio.

<br><br><br><br>

## OrdenCompra

Administra los productos adquiridos por un cliente.

Permite agregar productos y calcular automáticamente el total de la compra.

<br><br><br><br>

## GestorDatos

Clase encargada de administrar las colecciones del sistema.

Utiliza ArrayList y HashMap para almacenar personas y productos.

Permite agregar, recorrer, buscar y mostrar la información almacenada.

<br><br><br><br>

## LectorArchivos

Lee un archivo de texto con productos y convierte cada registro en un objeto Producto utilizando BufferedReader.

<br><br><br><br>

## RutInvalidoException

Excepción personalizada utilizada para validar la creación de objetos Rut.

<br><br><br><br>

# ▶️ Instrucciones para ejecutar el proyecto

<br><br>

1. Clonar el repositorio desde GitHub.

2.

```bash
git clone https://github.com/USUARIO/LlanquihueTourFinal.git
```

3. Abrir el proyecto en IntelliJ IDEA.

4. Verificar que el archivo **productos.txt** se encuentre dentro de la carpeta **resources**.

5. Ejecutar la clase:

```
app/Main.java
```

6. Observar la ejecución del programa en consola.

<br><br><br><br>

# 🧪 Funcionalidades implementadas

- Encapsulamiento.
- Constructores.
- Getters y Setters.
- Métodos toString().
- Composición entre clases.
- Herencia.
- Interfaces.
- Polimorfismo.
- Sobrescritura de métodos.
- Colecciones ArrayList y HashMap.
- Uso de instanceof.
- Lectura de archivos de texto.
- Excepciones personalizadas.
- Organización modular mediante paquetes.

<br><br><br><br>

# 📌 Observaciones

Este proyecto integra los contenidos desarrollados durante toda la asignatura de Desarrollo Orientado a Objetos I, consolidando en una única aplicación los conceptos fundamentales de la Programación Orientada a Objetos aplicados en Java.

<br><br><br><br>

# 🧪 Prueba realizada

**Repositorio GitHub:**

https://github.com/USUARIO/LlanquihueTourFinal

**Fecha de entrega:** [Completar]
