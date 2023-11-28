package org.test;

public class PetOwnerTest {
    public static void main (String[] arg) {
        PetOwner firstOwner = new PetOwner("Сумасшедшая кошатница из симпсонов");
        PetOwner secondOwner = new PetOwner("Богач");

        firstOwner.petAge(5);
        firstOwner.petName("Вася iz рекламы вискаса");
        firstOwner.pricePet(119090.99);
        firstOwner.typePet("Наглый кот");
        firstOwner.printInf();
        // можно создать локальную переменную из введенных при помощи: String testOwn = firstOwner.nameOwner;
        firstOwner.typeOfAnimal();
        firstOwner.anotherCycle();

        System.out.println("______________________________");

        secondOwner.petAge(1);
        secondOwner.petName("Камышик");
        secondOwner.pricePet(666.66);
        secondOwner.typePet("cat");
        secondOwner.printInf();
        secondOwner.typeOfAnimal();
        secondOwner.anotherCycle();

    }

}
