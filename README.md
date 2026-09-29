# Calculador de Promedios — Git, Depuración y Javadoc

## Descripción

En esta actividad trabajaremos sobre un proyecto Java existente denominado **Calculador de Promedios**.

El proyecto contiene diferentes problemas que deberán ser identificados y corregidos. Una vez solucionado el funcionamiento de la aplicación, se deberá documentar el código utilizando **Javadoc**.

Además, utilizaremos el proyecto para practicar un flujo de trabajo colaborativo con **Git y GitHub**.

> **Importante:** cada estudiante trabajará sobre su propia copia del repositorio. El repositorio original del docente no debe ser modificado directamente.

---

# Objetivos

Durante esta actividad se trabajará con:

* Git y GitHub.
* Fork de un repositorio.
* Clonado de repositorios.
* Trabajo con repositorios remotos.
* Análisis y lectura de código existente.
* Identificación y corrección de errores.
* Pruebas de funcionamiento.
* Commits.
* Uso de `git status`, `git diff`, `git add`, `git commit` y `git push`.
* Documentación mediante Javadoc.
* Generación de documentación HTML.
* Pull Requests.

---

# Parte 1 — Obtener tu propia copia del proyecto

El proyecto original se encuentra en:

**Repositorio del docente:**
https://github.com/cerdanva/calculador-promedios-javadoc

## 1. Crear un Fork

Desde GitHub, ingresar al repositorio y seleccionar:

**Fork → Create fork**

El Fork creará una copia del proyecto dentro de tu propia cuenta de GitHub.

Por ejemplo:

```text
Repositorio original:

cerdanva/calculador-promedios-javadoc

                 ↓ Fork

Tu repositorio:

TU-USUARIO/calculador-promedios-javadoc
```

### Importante

No trabajaremos directamente sobre:

```text
cerdanva/calculador-promedios-javadoc
```

Trabajarás sobre **tu propio Fork**.

---

# Parte 2 — Clonar tu Fork

Una vez creado el Fork, ingresar a tu repositorio y copiar la URL de clonación.

Desde Git Bash:

```bash
git clone URL-DE-TU-FORK
```

Por ejemplo:

```bash
git clone https://github.com/tuusuario/calculador-promedios-javadoc.git
```

Ingresar al proyecto:

```bash
cd calculador-promedios-javadoc
```

Comprobar el estado:

```bash
git status
```

Verificar el repositorio remoto:

```bash
git remote -v
```

Deberá aparecer la URL correspondiente a **tu usuario de GitHub**.

---

# Parte 3 — Analizar el proyecto

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

# Parte 4 — Detectar y corregir errores

El proyecto contiene diferentes problemas.

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

# Parte 5 — Probar la aplicación

Una vez realizadas las correcciones, comprobar el funcionamiento.

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

# Parte 6 — Registrar los cambios con Git

Después de corregir los errores, consultar el estado del repositorio:

```bash
git status
```

Revisar qué modificaciones se realizaron:

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

Enviar los cambios a **tu Fork**:

```bash
git push
```

> El `push` debe realizarse sobre tu propio repositorio, no sobre el repositorio del docente.

Comprobar en GitHub que el commit aparezca correctamente.

---

# Parte 7 — Documentar con Javadoc

Una vez que el programa funcione correctamente, comenzar la documentación.

Documentar las principales clases y métodos públicos del proyecto.

Utilizar comentarios Javadoc:

```java
/**
 * Descripción de la clase o método.
 */
```

Cuando corresponda, utilizar:

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

La documentación debe explicar **qué hace el elemento y cuál es su propósito**.

No se debe limitar a repetir el nombre del método.

---

# Parte 8 — Generar la documentación Javadoc

Generar la documentación HTML del proyecto.

Comprobar que:

* Las clases aparezcan documentadas.
* Los métodos aparezcan documentados.
* Los parámetros estén correctamente descritos.
* Los valores de retorno estén documentados.
* Las excepciones estén documentadas cuando corresponda.

Explorar la documentación generada.

---

# Parte 9 — Registrar la documentación con Git

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

Crear un segundo commit:

```bash
git commit -m "docs: agregar documentacion Javadoc"
```

Enviar los cambios a tu Fork:

```bash
git push
```

---

# Parte 10 — Crear un Pull Request

Una vez finalizado el trabajo, deberás solicitar que tus cambios sean incorporados al repositorio original mediante un **Pull Request (PR)**.

Desde tu repositorio en GitHub seleccionar:

**Contribute → Open pull request**

El Pull Request deberá tener como destino:

```text
Repositorio base:
cerdanva/calculador-promedios-javadoc

Rama:
main
```

Y como origen:

```text
Tu repositorio:
TU-USUARIO/calculador-promedios-javadoc

Rama:
main
```

### Título sugerido

```text
Corrección y documentación - Nombre Apellido
```

### Descripción

En la descripción del Pull Request indicar brevemente:

* Qué errores encontraste.
* Qué correcciones realizaste.
* Qué pruebas realizaste.
* Qué elementos documentaste mediante Javadoc.

---

# Flujo completo de trabajo

Durante la actividad seguiremos este flujo:

```text
        REPOSITORIO DEL DOCENTE
                  │
                  │ Fork
                  ↓
        REPOSITORIO DEL ALUMNO
                  │
                  │ git clone
                  ↓
              PC LOCAL
                  │
                  ├── Analizar
                  ├── Corregir
                  ├── Probar
                  ├── Documentar
                  │
                  ↓
             git commit
                  │
                  ↓
              git push
                  │
                  ↓
        REPOSITORIO DEL ALUMNO
                  │
                  │ Pull Request
                  ↓
        REPOSITORIO DEL DOCENTE
```

### Regla fundamental

**No realizar `push` directamente al repositorio del docente.**

Cada estudiante trabaja exclusivamente sobre su propio Fork y utiliza el Pull Request para entregar el trabajo.

---

# Entrega

La entrega se realizará mediante el Pull Request.

El trabajo deberá contener:

* Proyecto Java corregido.
* Código documentado mediante Javadoc.
* Commits que permitan identificar las etapas del trabajo.
* Pruebas realizadas.
* Documentación Javadoc generada, cuando corresponda.
* Pull Request correctamente configurado.

---

# Reflexión final

Responder:

1. ¿Qué errores encontraste en el proyecto?
2. ¿Cómo identificaste cada uno?
3. ¿Qué herramientas utilizaste para comprobar las correcciones?
4. ¿Qué diferencia existe entre un comentario común y Javadoc?
5. ¿Qué información aporta `@param`?
6. ¿Qué información aporta `@return`?
7. ¿Cuándo utilizarías `@throws`?
8. ¿Qué diferencia existe entre un repositorio y un Fork?
9. ¿Qué función cumple un Pull Request?
10. ¿Por qué es conveniente utilizar Git en un proyecto de desarrollo de software?

---

# Criterios de evaluación

Se tendrá en cuenta:

* Creación correcta del Fork.
* Clonado correcto del repositorio.
* Uso adecuado de Git.
* Identificación de los errores.
* Corrección de los problemas encontrados.
* Funcionamiento de la aplicación.
* Calidad de las pruebas.
* Calidad y claridad de los commits.
* Uso correcto de Javadoc.
* Calidad de la documentación.
* Correcta creación del Pull Request.
* Capacidad para explicar el trabajo realizado.
