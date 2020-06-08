package tech.skylo

import tech.skylo.scopePackage.Numbers

void printF(boolean a){
    float x = a;
    println(x)
    println(a + "a")
}


// todo: when you will uncomment the below line, the code runs perfect. This shows that groovy is a dynamic language
//printF(true)

println("Hello!")

Numbers numbers = new Numbers();
numbers.setNumber(5);

println(numbers.getNumber())