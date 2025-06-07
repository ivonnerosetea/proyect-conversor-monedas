# Conversor de Monedas en Java

## Tópicos

- [Descripción del proyecto](#descripción-del-proyecto)
- [Funcionalidades](#funcionalidades)
- [Aplicación](#aplicación)
- [Herramientas utilizadas](#herramientas-utilizadas)
- [Acceso al proyecto](#acceso-al-proyecto)
- [Créditos](#créditos)

---

## Descripción del proyecto

Aplicación de consola en Java que permite convertir valores entre distintas monedas usando una API externa para obtener tasas de cambio en tiempo real. Fue creada como ejercicio práctico para aplicar el consumo de servicios web, lógica y manejo de excepciones.

---

## Funcionalidades

- Menú interactivo en consola
- Conversión entre:
  - USD ↔ ARS (Peso argentino)
  - USD ↔ BRL (Real brasileño)
  - USD ↔ COP (Peso colombiano)
- Estilos y colores en consola (ANSI codes)
- Validación de entradas numéricas
- Manejo de errores de conexión y conversión

---

## Aplicación

El usuario selecciona la opción de conversión deseada, ingresa un monto, y la aplicación devuelve el resultado.

Ejemplo de salida:

<img width="795" alt="image" src="https://github.com/user-attachments/assets/c18ab1e5-f326-4e52-8aec-b7233893d037" />

---

## Herramientas utilizadas

- **Java 17**
- **Gson** – Para parsear JSON
- **exchangerate.host** – API pública de tipo de cambio
- **IntelliJ IDEA** – Para el desarrollo
- **Terminal Bash / Zsh** – Para ejecutar el programa

---

## Acceso al proyecto

Puedes clonar este repositorio con:
```bash
git clone https://github.com/tuusuario/conversor-monedas-java.git
cd conversor-monedas-java
```

---

## Créditos
Este proyecto utiliza la API gratuita de exchangerate.host para obtener tasas de cambio en tiempo real. Gracias a su equipo por proveer un servicio abierto y confiable para desarrolladores.

