# Exercise 8 – Packages and Interfaces (Task 2)

Author: Subhrajit Dey (77751)

## Description
This project extends the multi-level `Animal` class hierarchy from the previous lab with three interfaces.

## Interfaces
- **AnimalBehavior** – normal method `sleep()`, implemented by `Dog`, `Pigeon` and `Blowfish`.
- **AnimalMove** – default method `move()` that prints general movement info. All animals get it through `Animal`; `Dog`, `Pigeon` and `Blowfish` override it ("Dog run", "Pigeon fly", "Blowfish swim").
- **AnimalName** – static method `name(String name)`, called on the interface with `getName()` of each animal.

## Class hierarchy
- `Animal` (abstract)
  - `Mammal` → `Dog`
  - `Bird` → `Pigeon`
  - `Fish` → `Blowfish`

## How to run
Run `task2/Main.java`. It creates an `Animal[]` and an `AnimalBehavior[]` array and calls `sleep()`, `move()` and `name()` on their elements.
