/*
Andrew Rowe, 251276493, arowe54@uwo.ca
Lab8, Task1
Description:
Creates 2 instances of ProductionWorker and prints their names, employee numbers, the date they were hired, which shift
they work, and their hourly pay rate.
 */
public class Task1Demo {
    public static void main(String[] args){
        ProductionWorker workerOne = new ProductionWorker("John Smith", "123-A", "11-15-2005", 1,
                16.50);
        ProductionWorker workerTwo = new ProductionWorker("Joan Jones", "222-L", "12-12-2005", 2,
                18.50);
        System.out.println(workerOne);
        System.out.println(workerTwo);
    }
}
