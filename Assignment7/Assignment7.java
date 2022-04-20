package com.java.Assignments.Assignment7;

interface Cyclee{
    public  void  cost();
}
class UniCycle implements  Cyclee{
    @Override
    public void cost() {
        System.out.println("Costs less");
    }
}
class BiCycle implements Cyclee{
    @Override
    public void cost() {
        System.out.println("Costs medium");
    }
}
class TriCycle implements  Cyclee{
    @Override
    public void cost() {
        System.out.println("Costs more");
    }
}
class Implementation {
    public  Cyclee knowCost(String str){
        if(str.equalsIgnoreCase("unicycle")) {
            return new UniCycle();
        }
        else if(str.equalsIgnoreCase("bicycle"))
            return new BiCycle();
        else if(str.equalsIgnoreCase("tricycle"))
            return new TriCycle();
        return null;
    }
}
public class Assignment74 {
    public static void main(String[] args) {
        Implementation obj=new Implementation();
        obj.knowCost("unicycle").cost();
        obj.knowCost("bicycle").cost();
        obj.knowCost("tricycle").cost();
    }
}