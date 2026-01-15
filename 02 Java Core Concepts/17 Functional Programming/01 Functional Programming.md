Functions as First-Class
Immutable Data
Pure Functions
Functional Interfaces


Lambda Expression
    () -> {}
    toPrint -> System.out.println(toPrint);
    (a, b) -> a + b;
    (a, b) -> {
        int sum = a + b;
        System.out.println(sum)
    }


Stream 
    Element Sequence
    Functional Operations
    No Storage
    Efficiency
    One-Time Use
    Parallel Capable

    Filter And Reducing
        stream.forEach
        stream.filter
        stream.reduce
        

Functional Interface
    Single Abstract Method
    Lambda Capability
    @FunctionalInterface Annotation
    Comman Example :: Predicate, Consumer, BinaryOperator, Rannable, Callable, Comparator


Method References
    List<Integer> numbers = List.of(1,2,3,4,5,6,7);
    Normal Method
    numbers.stram()
        .filter(num -> num % 2 == 1)
        .forEach(num -> System.out.println(num));
    
    Method Reference
    numbers.stream()
        .filter(num -> num % 2 == 1)
        .forEach(System.out::println)
    
    numbers.stream()
        .reduce(0, (a,b) -> a + b);

        .reduce(0, Integer::sum);
        
Optional Class
    Optoinal.empty();
    Optional.of("Java")
    Optional.ofNullable(null);
    
    optionalOf.isPresent()
    optionalOf.get()
    optionalEmpty.orElse()

Terminal Operations
    Max, Min, Collect to List
    
Intermediate Operations
    Sort, Distinct, Map