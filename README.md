# swen746-assignment07
Implementing design patterns

## Factory Pattern
This pattern leverages shared interfaces and abstract methods to
defer obect instantiation to the children of the factory class.
In this example, the factory class is the abstract class 
`FlightSimulator`. Its concrete fields and methods are used by
its children `BirdFlightSimulator` and `PlaneFlightSimulator`, 
but each child is responsible for instantiating a `Flying` 
object. `Flying` is an interface defining methods `takeoff` and 
`land`, which must be implementing in concrete classes. `Bird`s
take off by flapping their wings and `Plane`s leave from an 
airport, but the action of `takeoff` is the same definition.
![class diagram for flight simulator factory pattern](
  /assets/factory_diagram.png
)

### Details
* `Bird` and `Plane` are *realizations* of the interface 
`Flying`.
* `Flying` is a *dependency* of `FlightSimulator`, since the
abstract method `create` will return a `Flying` object. 
* `BirdFlightSimulator` and `PlaneFlightSimulator` are 
*generalizations* (children) of `FlightSimulator`.


### Take-away
A major benefit of this pattern is that it is easily extendible.
To create a new `FlightSimulator`, one would only need to 
implement a new class (e.g. `Superhero`) that implements 
`Flying` and a new child of `FlightSimulator` (e.g. 
`SuperheroFlightSimulator`) with a concrete method `create()`.
Though it took more initial setup, there is less duplicate code.

## Refactor: Strategy
One limitation of this approach is that all flights are 
relatively short. It would be nice to add some variation for
the various flights. In this sense, we can create a `Flight` 
interface for various classes, using `Flying` as a context.
First, `Flying` will need to become an abstract class to keep 
track of the `Flying` context. We'll also need to give the 
context attribute a setter. 
![class diagram for flight simulator factory and strategy pattern](
  /assets/factory_and_strategy.png
)


### Details
* `ShortFlight`, `MeduimFlight` and `LongFlight` are 
*realizations* of the interface `Flight`.
* `Flying` and `Flight` is are *dependencies* of each other, 
since the abstract method `Flying` manages a `Flight` context 
and `Flight` will execute a `Flying` method. 
* To leverage inheritance for `Flight` contexts, `Flying` was 
made into an abstract class.
* `Flying` contructors needed to include a method to set the 
`Flight` context.
* The only `FlightSimulator` that needed to be modified was the 
instantiations within `TestFlightSimulator`.


### Take-away
A nice benefit of this implementation was that each `Flight` 
strategy was completely free of conidtional blocks. Each was 
succinctly written for its own use. This is extendible by being 
able to add new `Flight` strategies without the worry of how it 
could affect existing ones.

## Requirements
![requirements diagram for flight simulator](/assets/requirements_diagram.png)

### Description
A flight simulator is required to keep track of multiple flying objects and their flight patterns. Flights can be separated in short, medium or long flights; these details will be left to the Flying object. A Flying interface is used to standardize flying objects, for current and future developers to add additional objects.