# JUEGO DE AVENTURA

Este proyecto fue realizado con [libGDX](https://libgdx.com/) generado con [gdx-liftoff](https://github.com/libgdx/gdx-liftoff).

Un proyecto de muestra que implementa un juego de plataformas 2D. Incluye lanzadores para cada plataforma y un juego pequeño pero jugable.

## Plataformas

- `core`: Módulo principal con la lógica de la aplicación compartida por todas las plataformas.
- `android`: Plataforma móvil Android. Requiere Android SDK.

## Gradle

Este proyecto utiliza [Gradle](https://gradle.org/) para gestionar dependencias.
Se incluyó el wrapper de Gradle, por lo que puedes ejecutar tareas de Gradle usando los comandos `gradlew.bat` o `./gradlew`.
Tareas y banderas útiles de Gradle:

- `--continue`: al usar esta bandera, los errores no detendrán la ejecución de las tareas.
- `--daemon`: gracias a esta bandera, se usará el daemon de Gradle para ejecutar las tareas elegidas.
- `--offline`: al usar esta bandera, se utilizarán los archivos de dependencias en caché.
- `--refresh-dependencies`: esta bandera fuerza la validación de todas las dependencias. Útil para versiones snapshot.
- `android:lint`: realiza la validación del proyecto Android.
- `build`: construye los fuentes y archivos de todos los proyectos.
- `cleanEclipse`: elimina los datos del proyecto Eclipse.
- `cleanIdea`: elimina los datos del proyecto IntelliJ.
- `clean`: elimina las carpetas `build`, que almacenan las clases compiladas y archivos construidos.
- `eclipse`: genera los datos del proyecto Eclipse.
- `idea`: genera los datos del proyecto IntelliJ.
- `test`: ejecuta pruebas unitarias (si las hay).

##Autor
- Erick Caiza
    -  Francisco Caero
