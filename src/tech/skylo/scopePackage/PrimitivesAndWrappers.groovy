package tech.skylo.scopePackage

Integer m = 5;

void fun(int n){
    print("Inside reference..")
    print(n)
}


// todo: below is the method Groovy actuall calls, because it autowraps everything reference to Object
void fun(Integer x){
    print("Inside primitive..")
    println(x)
}

fun(m)