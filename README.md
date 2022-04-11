<h1>Diseño y Programación en Java:</h1> 
<h1>Abstracciones, Interfaces y Polimorfismo <img width="40px" src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white"> <img width=80px src="https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white"></h1>
<p><img width="250px" src="https://external-content.duckduckgo.com/iu/?u=http%3A%2F%2F4.bp.blogspot.com%2F-RzozJ2XkovY%2FUF2kfMEJRrI%2FAAAAAAAAAEw%2Fx3HWqc1cXW0%2Fs1600%2Fabstract_class_interfaces.png&f=1&nofb=1"></p>
<sub><strong>Taller #2 - SofkaU - CanterasNivel2 - @coronadoapps</strong></sub>

<h3>Introducción</h3>
<p>La programación orientada a objetos (POO) es un paradigma de programación que usa objetos para crear aplicaciones. Está basada en tres pilares fundamentales: herencia, polimorfismo, encapsulamiento.</p>
<p>Por otro lado se define el concepto de <strong>clase abstracta</strong> que no es más que una clase común la cual posee atributos, métodos, constructores y por lo menos un método abstracto. Una clase abstracta no puede ser instanciada, solo heredada.</p>

<h3>Tecnologías</h3>
Herramientas y tecnologías utilizadas para el desarrollo de esta actividad:
<ul>
  <li> JAVA Versión 8 Actualización 321 - Oracle
  <li> IntelliJ IDEA 2021.3.3 (Ultimate Edition)
</ul>

<h3>Enunciado de la actividad</h3>
<p>Se pide desarrollar una clase abstracta relacionado a los tipos de naves espaciales. En el siguiente enlace se puede encontrar la completa información necesaria para entender la actividad.</p>
<ul>
  <li><a target="_blank" href="https://moaramore.com/2016/05/14/clasificacion-de-las-naves-espaciales">Clasificación de las Naves Espaciales.</a></li>
</ul>

<h3>Estructura del diseño de la clase abstracta</h3>
<p>A continuación se muestra un ejemplo de la estructura correcta para el diseño de clases abstractas en Java bajo el paradigma de la programación orientada a objetos</p>

```
package com.sofka;

public abstract class Student{
  //attributes
  private String name;
  private int age;
  
  public abstract void goSchool(); //abstract method
  
}
```
