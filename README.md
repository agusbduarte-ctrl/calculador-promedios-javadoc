# Calculador de Promedios — Git, Depuración y Javadoc

## Objetivo

En esta actividad vamos a trabajar con un proyecto Java que contiene **errores intencionales**.

El objetivo es practicar:

* Git y GitHub.
* Depuración y corrección de errores.
* Pruebas del programa.
* Documentación con Javadoc.
* Fork y Pull Request.

---

## 1. Crear tu Fork

Ingresá al repositorio del profesor:

https://github.com/cerdanva/calculador-promedios-javadoc

Creá un **Fork** para tener una copia del proyecto en tu propia cuenta de GitHub.

> **Importante:** no trabajes directamente sobre el repositorio del profesor.

---

## 2. Clonar el proyecto

Cloná **tu Fork** en tu computadora:

```bash
git clone URL-DE-TU-FORK
```

Ingresá a la carpeta del proyecto y verificá:

```bash
git status
git remote -v
```

---

## 3. Analizar y corregir

Abrí el proyecto en tu IDE.

Analizá el código y **detectá por tu cuenta los errores existentes**.

Deberás:

* Corregir los errores.
* Comprobar que el programa funcione correctamente.
* Realizar las pruebas necesarias.

No se proporciona una lista de errores: **parte de la actividad consiste en encontrarlos y comprenderlos.**

---

## 4. Registrar las correcciones

Cuando hayas terminado:

```bash
git status
git diff
git add .
git commit -m "fix: corregir errores del calculador"
git push
```

---

## 5. Agregar Javadoc

Documentá las clases y métodos principales utilizando Javadoc.

Utilizá, cuando corresponda:

```java
@author
@version
@param
@return
@throws
```

Generá la documentación HTML de Javadoc y verificá que se genere correctamente.

Luego registrá los cambios:

```bash
git add .
git commit -m "docs: agregar documentacion Javadoc"
git push
```

---

## 6. Crear el Pull Request

Desde tu repositorio de GitHub, creá un **Pull Request** hacia:

**Repositorio:** `cerdanva/calculador-promedios-javadoc`
**Rama:** `main`

Título sugerido:

```text
Corrección y documentación - Nombre Apellido
```

En la descripción indicá brevemente:

* Qué errores encontraste.
* Qué correcciones realizaste.
* Qué pruebas ejecutaste.
* Qué documentaste con Javadoc.

---

## Flujo de trabajo

```text
Repositorio del profesor
          ↓
         Fork
          ↓
     Mi GitHub
          ↓
        Clone
          ↓
   Mi computadora
          ↓
 Corregir + Probar
          ↓
      Commit + Push
          ↓
     Mi GitHub
          ↓
   Pull Request
          ↓
      Profesor
```

## Entrega

En **Google Classroom** entregá el enlace a tu **Pull Request**.

### Recordá

**Fork** → copia el repositorio en tu GitHub.
**Clone** → descarga tu repositorio a tu computadora.
**Push** → sube tus cambios a tu GitHub.
**Pull Request** → solicita la revisión de tus cambios.
