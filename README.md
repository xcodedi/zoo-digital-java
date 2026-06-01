# Zoo Digital

A Java Object-Oriented Programming (OOP) project developed to simulate a digital zoo. The application demonstrates core OOP concepts such as inheritance, abstraction, polymorphism, interfaces, upcasting, downcasting, static members, and command-line interaction.

---

## Project Overview

Zoo Digital is a console-based application that allows users to register and manage different animal species. Each animal belongs to a specific biological class and can perform behaviors according to its capabilities.

The project was designed as an academic exercise to practice and demonstrate advanced Object-Oriented Programming principles in Java.

---

## Features

* Register new animals
* List all registered animals
* List running animals
* List swimming animals
* List flying animals
* List predator animals
* Display total number of animals created
* Persistent in-memory animal collection during execution

---

## Object-Oriented Concepts Applied

### Abstraction

Abstract classes define common characteristics shared by all animals.

```java
Animal
Mamifero
Ave
Peixe
Reptil
```

### Inheritance

Specific animals inherit properties and behaviors from their biological groups.

Example:

```java
Gato extends Mamifero
Corvo extends Ave
Traira extends Peixe
Cobra extends Reptil
```

### Polymorphism

Animals can be manipulated through the common type:

```java
List<Animal>
```

Methods such as:

```java
emitirSom()
comer()
```

execute differently depending on the animal instance.

### Interfaces

Behavioral interfaces were implemented:

```java
Corrida
Nado
Voo
Predacao
```

Examples:

```java
Golfinho implements Nado, Predacao
Corvo implements Corrida, Voo, Predacao
Jacare implements Corrida, Nado, Predacao
```

### Upcasting

```java
Animal animal = new Gato("Milo", 3);
```

### Safe Downcasting

```java
if (animal instanceof Nado nadador) {
    nadador.nadar();
}
```

### Static Members

The Animal class maintains a static counter that tracks the total number of animals created.

```java
Animal.getContador();
```

---

##  Implemented Animals

### Mammals

* Dog (Cachorro)
* Cat (Gato)
* Dolphin (Golfinho)
* Opossum (Gambá)

### Birds

* Ostrich (Avestruz)
* Crow (Corvo)
* Duck (Pato)
* Penguin (Pinguim)

### Fish

* Ocean Sunfish (Peixe-Lua)
* Batfish (Peixe-Morcego)
* Pirarucu
* Traíra

### Reptiles

* Snake (Cobra)
* Alligator (Jacaré)
* Iguana
* Turtle (Tartaruga)

---

## Project Structure

```text
br.edu.atitus.diego_meira
│
├── animais
│   ├── Cachorro
│   ├── Gato
│   ├── Golfinho
│   ├── Corvo
│   ├── ...
│
├── especies
│   ├── Animal
│   ├── Mamifero
│   ├── Ave
│   ├── Peixe
│   └── Reptil
│
├── comportamentos
│   ├── Corrida
│   ├── Nado
│   ├── Voo
│   └── Predacao
│
└── app
    └── ZooDigitalApp
```

---

## Example Menu

```text
========== ZOO DIGITAL ==========

1 - Register Animal
2 - List All Animals
3 - List Running Animals
4 - List Swimming Animals
5 - List Flying Animals
6 - List Predator Animals
7 - Show Total Animals
0 - Exit
```

---

## Technologies

* Java
* Object-Oriented Programming
* Command Line Interface (CLI)

---

## Academic Goals

This project was developed to practice:

* Classes and Objects
* Constructors
* Encapsulation
* Inheritance
* Abstract Classes
* Interfaces
* Method Overriding
* Method Overloading
* Polymorphism
* Upcasting
* Downcasting
* Static Members
* Collections (`List`)
* Exception Handling

---
