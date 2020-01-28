var name = "John"
var lastName = "Smith"
var text = "My name is: " + name + " " + lastName;
var text2 = fmt.Sprintf("My names is: %s %s", name, lastName)
var otherText = "My name is: " + name[2:len(name)]