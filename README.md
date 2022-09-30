# Java-Advanced-Feature
Maven project generted with com.a9ski:quick-start archetype


# Development guide
1. Install pre-commit (https://pre-commit.com/)
2. Install the pr-commit hook by executing `pre-commit install` inside project directory
3. Run against all files in the project: `pre-commit run --all-files`

# Lambda Expression
A lambda expression in Java has these elements.
1. No Name - As it is anonymous function there is no name needed
2. Parameter List - Parameter is required 
3. Body - Body is the main part of the function
4. No Return Type - Lambda Expression does not require return type to mention. The Java 8+ Compiler is able to infer the return type by checking the code

# Functional Interface
1. A functional interface in Java is an interface that contains only a single abstract method which is unimplemented.
2. A functional interface can contain default and static methods which do have an implementation, in addition to the single unimplemented method. 
Some of the Functional Interfaces in Java 8 + 
a) Consumer  - DoubleConsumer, IntConsumer, LongConsumer and BiConsumer
b) Supplier  - DoubleSupplier, IntSupplier and LongSupplier
c) Function  - BiFunction, UnaryOperator and BinaryOperator 
d) Predicate - DoublePredicate, IntPredicate, LongPredicate and BiPredicate