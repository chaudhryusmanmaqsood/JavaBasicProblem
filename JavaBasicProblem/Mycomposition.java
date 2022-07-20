package JavaBasicProblem;

class  CarEngine{
    int gen;

    CarEngine(int gen){
        this.gen = gen;
        System.out.println("Car engine has started ");
    }
}
class Car {
    String modelName;
    float price;

    CarEngine carEngine;

    Car(String modelName, float price) {  // parametarized constrcuctor

        this.modelName = modelName;
        this.price = price;
        carEngine = new CarEngine(7);
//        carEngine.gen; should also be called
    }

    void show() {
        System.out.println(modelName);
        System.out.println(price);
        System.out.println(carEngine.gen);

    }


    public static void main(String[] args) {
        Car car = new Car("Honda", 12456);
        car.show();
    }
}












