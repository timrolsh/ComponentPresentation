# Component Pattern

* This repository is contains a lesson, quiz, a Greenfoot game, and Unity game about the component object pattern, made for Software Engineering Patterns

## Component Itself

* Individual component of larger piece of software, can be:
  * Software package
  * Web service
  * Web resource
  * Module
* Component encapsulates/contains set of related functionality and data
* Components communicate with each other through interfaces
  * Each component has a provided interface, other components can use that interface
* Substitutable
  * Components can be replaced with other components that provide the same interface
  * Implementation details are not important, what's important is the interface and the component following its interface
* Reusable
  * You can have multiple components of the same interface and reuse them, for instance if you have a mob in a game, you can have multiple mobs that all follow the same interface and have the same behavior, and it is easy for you to create that over and over again
  * Prefabs in Unity allow for this reusability functionality
* Components scale to a system with many of them called an application server, and then those application servers scale to allow for distributed computing, the basis for how our internet is able to work so efficiently and reliably today
* Different models for components, most iconic ones are from Microsoft (COM, .NET) but the concept for a component is the same
