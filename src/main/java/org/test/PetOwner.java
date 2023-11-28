package org.test;

public class PetOwner { //тут мы определяем используемые переменные для указанного класса
    String nameOwner;
    String animalName;
    int animalAge;
    String typeAnimal;
    double orderPrice;

    public PetOwner (String nameOwner) { //здесь что надо обязательно будет передать в качестве аргумента
        this.nameOwner = nameOwner; // это для определения того, что переданный аргумент, это переменная
    }

    public void petName (String petName) { //определяем методы данного класса
        animalName = petName;
    }

    public void petAge (int petAge) { //опеределяем методы данного класса
        animalAge = petAge;
    }

    public void typePet (String typePet) {
        typeAnimal = typePet;
    }

    public void pricePet (double pricePet) {
        orderPrice = pricePet;
    }

    public void printInf () {
        System.out.println("Владелец Животного: " + nameOwner);
        System.out.println("Возраст животного: " + animalAge);
        System.out.println("Тип животного: " + typeAnimal);
        System.out.println("Сколько потратили рублей: " + orderPrice);
        System.out.println("Кличка животного: " + animalName);
    }

    public void typeOfAnimal () {
        if (typeAnimal.equals("cat")) {
            System.out.println("Наглая кошка!!!");
        }else if (typeAnimal.equals("dog")) {
            System.out.println("Какой жирненький песик");
        }else {
            System.out.println("Я других зверюх не знаю");
        }

    }
    public void anotherCycle () {
        switch (nameOwner) {
            case  "Вася": {
                System.out.println("Вася ты молодец");
                break;
            }
            case "Сумасшедшая кошатница из симпсонов": {
                System.out.println("Кормите своих питомцев лучше дамочка");
                break;
            }
            default: {
                System.out.println("Животным ничего не угражает");

            }

        }
    }
}
