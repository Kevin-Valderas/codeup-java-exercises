class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String sayHello() {
        return String.format("Hello from %s!", name);
    }
    public String getName(){
        return name;
    }


    public static void main(String[] args) {
        Person person = new Person("John");
        System.out.println(person.sayHello());
    }
}

