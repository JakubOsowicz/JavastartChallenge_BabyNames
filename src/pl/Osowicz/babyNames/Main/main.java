package pl.Osowicz.babyNames.Main;

import pl.Osowicz.babyNames.Logic.Logic;
import pl.Osowicz.babyNames.Logic.Reader;
import pl.Osowicz.babyNames.resources.Names;

public class main {
    public static void main(String[] args) {
        Logic logic = new Logic();
        logic.prepareList();
        System.out.println();
        logic.tenMostPopularNameFunction();
        System.out.println();
        logic.mostPopularFemaleNameFunction();
        System.out.println();
        logic.threeMostPopularLettersFunction();
    }
}
