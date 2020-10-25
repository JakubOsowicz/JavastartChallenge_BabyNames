package pl.Osowicz.babyNames.Main;

import pl.Osowicz.babyNames.Logic.Logic;

public class main {
    public static void main(String[] args) {
        Logic logic = new Logic();
        logic.prepareFullList();
        logic.removeDuplicateNamesFunction();
        System.out.println();
        logic.tenMostPopularNameFunction();
        System.out.println();
        logic.mostPopularFemaleNameFunction();
        System.out.println();
        logic.threeMostPopularLettersFunction();
    }
}