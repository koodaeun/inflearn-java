package basic.section07.koo;

public class Car {
    private static int num;
    private String name;

    public Car(String name) {
        System.out.println("차량 구입, 이름:"+name);
        this.name = name;
        num++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수:"+num);
    }
}