# Calculador de Promedios — Práctica de Git y Javadoc

## Descripción

Este proyecto corresponde a una actividad práctica de programación en Java.

La aplicación **Calculador de Promedios** permite ingresar los datos de un alumno, registrar sus notas, calcular un promedio y consultar un historial.

El proyecto entregado contiene algunos problemas que deberán ser identificados y corregidos.

Una vez que la aplicación funcione correctamente, se deberá documentar el código utilizando **Javadoc**.

---

# Objetivos

Durante esta actividad se trabajará con:

* Clonado de repositorios Git.
* Trabajo con un proyecto Java existente.
* Análisis y lectura de código.
* Identificación y corrección de errores.
* Pruebas de funcionamiento.
* Commits descriptivos.
* Uso de `git status`, `git diff`, `git add` y `git commit`.
* Sincronización con un repositorio remoto mediante `git push`.
* Documentación del código mediante Javadoc.
* Generación de documentación HTML.

---

# Parte 1 — Clonar el proyecto

Desde una terminal, clonar el repositorio:

```bash
git clone https://github.com/cerdanva/calculador-promedios-javadoc.git
```

Ingresar al proyecto:

```bash
cd calculador-promedios-javadoc
```

Comprobar el estado del repositorio:

```bash
git status
```

---

# Parte 2 — Analizar el proyecto

Antes de modificar el código, explorar la estructura del proyecto.

Identificar:

* Clase principal.
* Clase que representa al alumno.
* Clase responsable del cálculo del promedio.
* Controlador de la interfaz gráfica.
* Archivo FXML.
* Archivo `module-info.java`.
* Archivo `pom.xml`.

Responder:

1. ¿Qué responsabilidad tiene cada clase?
2. ¿Cómo se relacionan las clases?
3. ¿Qué función cumple `PromedioService`?
4. ¿Qué función cumple `PrimaryController`?
5. ¿Cómo se relaciona el controlador con el archivo FXML?

---

# Parte 3 — Detectar y corregir errores

El proyecto contiene diferentes problemas.

### Importante

**No se proporciona una lista de errores.**

El objetivo es desarrollar la capacidad de:

* Leer código.
* Interpretar mensajes de error.
* Analizar el comportamiento del programa.
* Formular hipótesis.
* Probar posibles soluciones.

Primero intentar ejecutar el proyecto y observar qué sucede.

Luego analizar el código y realizar las correcciones necesarias.

---

# Parte 4 — Pruebas

Una vez realizadas las correcciones, comprobar el funcionamiento de la aplicación.

Realizar como mínimo las siguientes pruebas:

| Prueba                          | Resultado esperado                   |
| ------------------------------- | ------------------------------------ |
| Tres notas válidas              | Se calcula el promedio               |
| Notas aprobatorias              | Se determina correctamente el estado |
| Notas desaprobatorias           | Se determina correctamente el estado |
| Nota 0                          | Debe ser aceptada                    |
| Nota 10                         | Debe ser aceptada                    |
| Nota menor que 0                | Debe rechazarse                      |
| Nota mayor que 10               | Debe rechazarse                      |
| Campo vacío                     | Debe gestionarse correctamente       |
| Texto donde se espera un número | Debe gestionarse correctamente       |

Registrar los resultados de las pruebas.

---

# Parte 5 — Git

Durante el desarrollo deberán utilizar Git para registrar los cambios.

Después de realizar las primeras correcciones:

```bash
git status
```

Analizar las modificaciones:

```bash
git diff
```

Agregar los cambios:

```bash
git add .
```

Crear un commit:

```bash
git commit -m "fix: corregir errores del calculador"
```

Enviar los cambios al repositorio remoto:

```bash
git push
```

Comprobar posteriormente en GitHub que el commit se encuentre disponible.

---

# Parte 6 — Documentación con Javadoc

Una vez que el programa funcione correctamente, comenzar la documentación.

Utilizar comentarios Javadoc:

```java
/**
 * Descripción de la clase o método.
 */
```

Documentar las clases principales del proyecto.

También deberán documentarse los métodos públicos relevantes.

Utilizar las etiquetas correspondientes cuando sean necesarias:

```text
@author
@version
@param
@return
@throws
```

### Ejemplo

```java
/**
 * Calcula el promedio de tres notas.
 *
 * @param nota1 primera nota
 * @param nota2 segunda nota
 * @param nota3 tercera nota
 * @return promedio de las tres notas
 */
```

La documentación debe explicar **qué hace el elemento y cuál es su propósito**, evitando escribir simplemente el nombre del método con otras palabras.

---

# Parte 7 — Generar Javadoc

Generar la documentación HTML del proyecto.

Comprobar que:

* Las clases aparezcan documentadas.
* Los métodos aparezcan documentados.
* Los parámetros estén correctamente descritos.
* Los valores de retorno estén documentados.
* Las excepciones estén documentadas cuando corresponda.

Explorar la documentación generada y comprobar cómo se presenta la información de las clases y métodos.

---

# Parte 8 — Segundo commit

Una vez finalizada la documentación:

```bash
git status
```

Revisar las modificaciones:

```bash
git diff
```

Agregar los archivos:

```bash
git add .
```

Crear un nuevo commit:

```bash
git commit -m "docs: agregar documentacion Javadoc"
```

Enviar los cambios:

```bash
git push
```

---

# Entrega

El repositorio remoto deberá contener:

* Proyecto Java corregido.
* Código documentado mediante Javadoc.
* Commits que permitan identificar las etapas del trabajo.
* Documentación generada.
* Registro de las pruebas realizadas.

## Reflexión final

Responder:

1. ¿Qué errores encontraste en el proyecto?
2. ¿Cómo identificaste cada uno?
3. ¿Qué herramientas utilizaste para comprobar las correcciones?
4. ¿Qué diferencia existe entre un comentario común y Javadoc?
5. ¿Qué información aporta `@param`?
6. ¿Qué información aporta `@return`?
7. ¿Cuándo utilizarías `@throws`?
8. ¿Por qué es importante documentar el código de un proyecto?

---

## Criterios de evaluación

Se tendrá en cuenta:

* Correcta clonación y configuración del proyecto.
* Capacidad para identificar errores.
* Corrección de los problemas encontrados.
* Funcionamiento de la aplicación.
* Calidad de las pruebas realizadas.
* Uso correcto de Git.
* Calidad de los mensajes de commit.
* Uso correcto de Javadoc.
* Claridad de la documentación.
* Capacidad para explicar las decisiones tomadas.
