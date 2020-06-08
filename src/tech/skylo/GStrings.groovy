package tech.skylo

def s = "Dhiman";
def s1 = "My name is ${s}"

def s3 = "The sum of 2 and 3 equals ${2 + 3}"

void printTestString(GString s2){
    println(s2)
    println( s2.class)
}

printTestString(s3);
//printTestString(s3);

def v = 'a'
char c = v;
void printCastedString(char c){
    println(c)
    println(c.class)
}

// todo: if we remove explicit cast, it will throw error
printCastedString(c)