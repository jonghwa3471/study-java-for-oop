package ex1;

 class Ramyon {
    String ramyon = "라면";
    String water = "물";
    String onion = "파";
    void boilWater() {
        System.out.println(water + "을 끓인다.");
    }
    void cooking() {
        System.out.println(ramyon + "과 " + onion + "를 넣고 끓여 요리 완성. 맛있게 드세요!!!");
    }
}

class ToppingRamyon extends Ramyon {
    String topp;
    ToppingRamyon(String topp) {
        this.topp = topp;
    }
    void topping() {
        System.out.println(topp + "을 넣는다.");
    }
}



