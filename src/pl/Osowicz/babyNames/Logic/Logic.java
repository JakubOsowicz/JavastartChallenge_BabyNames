package pl.Osowicz.babyNames.Logic;

import pl.Osowicz.babyNames.resources.Letters;
import pl.Osowicz.babyNames.resources.Names;

import java.util.*;

public class Logic {
    Reader reader = new Reader();
    ArrayList<Names> names = new ArrayList<>();

    public ArrayList<Names> convertToNamesObjects(ArrayList<String> namesStrings) {
        for (String nameString : namesStrings) {
            String[] parts = nameString.split(",");
            int yearOfBirth = Integer.parseInt(parts[0]);
            String gender = parts[1].toUpperCase();
            String ethnicity = parts[2].toUpperCase();
            String firstName = parts[3].toUpperCase();
            int count = Integer.parseInt(parts[4]);
            int rank = Integer.parseInt(parts[5]);
            names.add(new Names(yearOfBirth, gender, ethnicity, firstName, count, rank));
        }
        return names;
    }

    public void mostPopularNames() {
        // search duplicate. add count.value to first object with %firstName% and remove object with duplicate name
        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                if (names.get(i).getFirstName().equals(names.get(j).getFirstName())) {
                    // got  the duplicate element
                    names.get(i).setCount(names.get(i).getCount() + names.get(j).getCount());
                    names.remove(names.get(j));
                    j--;
                }
            }
        }
        names.sort(Names::compareTo);
    }

    int howManyNames = 10;

    public void mostPopularNamesPrinter() {
        System.out.println("Most popular names: ");
        for (int i = 0; i < howManyNames; i++) {
            System.out.println(names.get(i));
        }
    }

    String female = "Female";
    int femaleNameCount = 0;

    public void mostPopularFemaleName() {
        System.out.println("Most popular female name: ");
        for (int i = 0; i < names.size(); i++) {
            if (femaleNameCount < 1) {
                if (names.get(i).getGender().equalsIgnoreCase(female)) {
                    System.out.println(names.get(i));
                    femaleNameCount++;
                }
            }
        }
    }

    ArrayList<Letters> lettersList = new ArrayList<>();

    public ArrayList<Letters> convertNamesToLetterList() {
        for (int i = 0; i < names.size(); i++) {
            char firstLetter = names.get(i).getFirstName().charAt(0);
            String uppercaseFirstLetter = Character.toString(firstLetter).toUpperCase();
            lettersList.add(new Letters(uppercaseFirstLetter, 1));
        }
        return lettersList;
    }

    public void mostPopularStartLetters() {
        for (int i = 0; i < lettersList.size(); i++) {
            for (int j = i + 1; j < lettersList.size(); j++) {
                if (lettersList.get(i).getLetter().equals(lettersList.get(j).getLetter())) {
                    lettersList.get(i).setCount(lettersList.get(i).getCount() + lettersList.get(j).getCount());
                    lettersList.remove(lettersList.get(j));
                    j--;
                }
            }
        }
        lettersList.sort(Letters::compareTo);
    }

    int howManyLetters = 3;

    public void mostPopularStartLettersPrinter() {
        System.out.println("Most popular start letters: ");
        for (int i = 0; i < howManyLetters; i++) {
            System.out.println(lettersList.get(i));
        }
    }

    public ArrayList<Names> prepareList(){
        return convertToNamesObjects(reader.fileReader());
    }

    public void tenMostPopularNameFunction(){
        mostPopularNames();
        mostPopularNamesPrinter();
    }

    public void mostPopularFemaleNameFunction(){
        mostPopularFemaleName();
    }

    public void threeMostPopularLettersFunction(){
        convertNamesToLetterList();
        mostPopularStartLetters();
        mostPopularStartLettersPrinter();
    }
}
    //            Names imie = new Names(yearOfBirth, gender, ethnicity, firstName, count, rank);
//
//            if (names.size() == 0){
//                names.add(imie);
//            }
//
//
//            if (firstName.equals(imie.getFirstName())){
//                System.out.println("ahahahahaha");
//            }
//            for (int i = 0; i < names.size(); i++) {
//                if (firstName.equals(names.get(i).getFirstName())) {
//                    names.get(i).setCount(names.get(i).getCount() + count);
//                }
//                else if (!firstName.equals(names.get(i).getFirstName())){
//                    names.add(new Names(yearOfBirth, gender, ethnicity, firstName, count, rank));
//                }
//            }

//        Iterator<Names> namesInterator = names.iterator();
//        while (namesInterator.hasNext()){
//            ArrayList<Names> listaBezDuplikatow = new ArrayList<>();
//            Names iteratorNames = namesInterator.next();
//            String iteratorFirstName = iteratorNames.getFirstName();
//            for (int i = 0; i < names.size(); i++) {
//                if (!names.get(i).getFirstName().equals(iteratorFirstName)){
//                    listaBezDuplikatow.add(iteratorNames);
//                }
//                }
//            }
//        }

//    public void nameCounterAdder(ArrayList<Names> names) {
//        String firstName = null;
//        int nameCounter = 0;
//        for (int i = 0; i < names.size(); i++) {
//            if (firstName.equals(names.get(i).getFirstName())) {
//                nameCounter += names.get(i).getCount();
//            }
//        }
//    }

//    public void namesPrint() {
//        System.out.println();
//    }