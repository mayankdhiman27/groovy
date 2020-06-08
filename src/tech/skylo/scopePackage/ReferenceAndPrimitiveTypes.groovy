package tech.skylo.scopePackage

class A implements Comparable{
    String name;
    Long id;

    @Override
    int compareTo(Object o) {
        return 0
    }

}

class Main{
    static void main(String[] args) {
        A a = new A()
        a.setName("Dhiman")
        a.setId(5L)

        A b = new A()
        b.setName("Mayank")
        b.setId(1L)

        println(a.equals(b))
        println(a.compareTo(b) == 0)
        println(a.is(b))

        // only identity is checked, because we have used this for Objects
        println(a == b)

        Integer x = 5;
        Integer y = 6;

        // euqality is checked, because it is used with Primitive type
        println(x == y)

        // same as above
        println(x.equals(y))

        // groovy also allows === operator
        println(a === b)
    }
}