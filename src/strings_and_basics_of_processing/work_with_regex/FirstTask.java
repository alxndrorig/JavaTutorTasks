package strings_and_basics_of_processing.work_with_regex;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Aliaksandr Yamrom
 * @task Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
 * операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
 * отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.
 */
public class FirstTask {
    private static String sortColumnByTheSentences(String text) {
        /*
        Отсортировать столбцы по количеству предложений.
         */
        String[] sentences = text.split("\\n");
        for (int i = 0; i < sentences.length - 1; i++) {
            for (int j = i + 1; j < sentences.length; j++) {
                if (sentences[j].split("\\.").length > sentences[i].split("\\.").length) {
                    String temp = sentences[i];
                    sentences[i] = sentences[j];
                    sentences[j] = temp;
                }

            }
        }
        StringBuilder builder = new StringBuilder();
        for (String sentence : sentences) {
            builder.append(sentence).append("\n");
        }
        return builder.toString();
    }

     private static String sortingWord(String text) {
        /*
        В каждом предложении отсортировать слова по длине.
         */
        String[] paragraphs = text.split("\\n");
         for (int i = 0; i < paragraphs.length; i++) {
             paragraphs[i] = paragraphToSentences(paragraphs[i]);
         }
         return paragraphsToText(paragraphs);
     }

     private static String paragraphsToText(String[] array) {
        StringBuilder text = new StringBuilder();
         for (String string : array) {
             text.append(string);
         }
         text.deleteCharAt(text.length() - 1);
         return text.toString();
     }

    private static String paragraphToSentences(String text) {
        String[] sentences = text.split("((\\.\\s)|(\\.$))");

        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sortWordsInSentence(sentences[i].split("\\s"));
        }
        return sentencesToText(sentences);
    }

    private static String sortWordsInSentence(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].length() < array[i].length()) {
                    String temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return arrayToString(array);
    }

    private static String arrayToString(String[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (i < array.length - 1) builder.append(" ");
        }
        builder.append(".");
        return builder.toString();
    }

    private static String sentencesToText(String[] array) {
        StringBuilder finalText = new StringBuilder();
        for (String sentence: array) {
            finalText.append(sentence)
                    .append(" ");
        }
        finalText.deleteCharAt(finalText.length()-1);
        finalText.append("\n");
        return finalText.toString();
    }

    private static String sortByCharacter(String text) {
        String[] paragraphs = text.split("\\n");
        System.out.println("Введите символ");
        String a = new Scanner(System.in).next();
        char character = a.toLowerCase().charAt(a.length() - 1);

        for (int i = 0; i < paragraphs.length; i++) {
            paragraphs[i] = sortParagraphsByCharacter(paragraphs[i], character);
        }
        return paragraphsToText(paragraphs);
    }

    private static String sortParagraphsByCharacter(String string, char character) {
        String[] sentences = string.split("((\\.\\s)|(\\.$))");

        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sortLexemesInSentence(sentences[i].split("\\s"), character);
        }

        return sentencesToText(sentences);
    }

    private static String sortLexemesInSentence(String[] array, char character) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (howManyCharacters(array[j].toLowerCase(), character) > howManyCharacters(array[i].toLowerCase(), character)) {
                    String temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                } else if (howManyCharacters(array[i].toLowerCase(), character) == howManyCharacters(array[j].toLowerCase(), character)){
                    String[] sortArray = {array[i], array[j]};
                    Arrays.sort(sortArray);
                    array[i] = sortArray[0];
                    array[j] = sortArray[1];
                    }
                }
            }
        return arrayToString(array);
        }

    private static int howManyCharacters(String string, char ch) {
        if (string.indexOf(ch) == -1) return 0;
        else return string.split(String.valueOf(ch)).length;
    }

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet. Consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \nUt enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptat. Velit esse cillum dolore eu. Fugiat nulla pariatur. \nExcepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                1. Отсортировать столбцы по количеству предложений
                2. В каждом предложении отсортировать слова по длине.
                3. Отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенство - по алфавиту
                Сделайте свой выбор:""");

        switch (scanner.next()) {
            case "1":
                System.out.println(1 + " ");
                System.out.println(sortColumnByTheSentences(text));
                break;
            case "2":
                System.out.println(2 + " ");
                System.out.println(sortingWord(text));
                break;
            case "3":
        System.out.println(sortByCharacter(text));
                break;
            case "q":
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }


}
