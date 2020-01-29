class Person {
    String name;
    int age;
    Person(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
Person getNameAndAge() {
    return new Person("John", 18)
}
Person person = getNameAndAge();
var name = person.name;
var age = person.age;