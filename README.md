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
  /src/factory/factory_diagram.png
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
