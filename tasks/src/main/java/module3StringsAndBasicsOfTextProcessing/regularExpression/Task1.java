package module3StringsAndBasicsOfTextProcessing.regularExpression;


import java.io.FileWriter;
import java.io.IOException;
import java.lang.String;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.CharSequence.compare;

public class Task1 {

    static String nameInput = "text.txt";
    static String paths = "tasks\\src\\main\\java\\";
    static String outSortParagraphs = "out_sort_paragraphs.txt";
    static String outSortWordsOnSentence = "out_sort_words_on_sentence";
    static String outSortWordsByNumberOfOccurrences = "out_sort_words_by_number_of_occurrences";


    public static void main(String[] args) {

        String message = "Input number of list\n" +
                "1- Отсортировать абзацы по количеству предложений\n" +
                "2- Отсортировать внутри предложения слова по длине\n" +
                "3- Отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства - по алфавиту";
        String inputLetter = "Input letter for sorting words";
        String input = "";

        Path pathInputFile = Paths.get(paths, nameInput);

        try {
            input = Files.readString(pathInputFile, Charset.forName("windows-1251"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        int choice = getIntValue(message);
        switch (choice) {
            case 1:

                switch1(input);
                break;

            case 2:

                switch2(input);
                break;

            case 3:
                String letter = getChar(inputLetter);
                switch3(input, letter);
                break;
        }


    }

    private static void switch1(String input) {
        String sSortParagraphs;

        sSortParagraphs = sortParagraphsByNumberSentences(input);

        try (FileWriter fileWriter = new FileWriter(paths + outSortParagraphs)) {
            fileWriter.append(sSortParagraphs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void switch2(String input) {

        String sSortWordsOnSentence;

        sSortWordsOnSentence = sortWordsInSentence(input);

        try (FileWriter fileWriter = new FileWriter(paths + outSortWordsOnSentence)) {
            fileWriter.append(sSortWordsOnSentence);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void switch3(String input, String letter) {

        StringBuilder stringBuilderSentences = new StringBuilder();

        String[] sentences = splitOnSentences(input);

        for (int i = 0; i < sentences.length; i++) {

            stringBuilderSentences.append(sortTokenByNumberOfOccurencesLetterDescending(sentences[i], letter));
            stringBuilderSentences.append(sentences[i].charAt(sentences[i].length() - 1));
            stringBuilderSentences.append("\n");

        }

        try (FileWriter fileWriter = new FileWriter(paths + outSortWordsByNumberOfOccurrences)) {

            fileWriter.append(stringBuilderSentences.toString());

        } catch (IOException e) {

            e.printStackTrace();

        }
    }


    private static String getString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        while (true) {
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            }
        }
    }

    private static String getChar(String message) {
        String s="ss";
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        while (s.length()!=1) {
            if (scanner.hasNextLine()) {
                s= scanner.nextLine();
            }
            if (s.length()!=1){
                System.out.println("Input one char");
            }
        }
        return s;
    }

    private static int getIntValue(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else if (scanner.hasNext()) {
                System.out.println("You have entered an invalid number, input real number");
                scanner.next();
            }
        }

    }

    private static void printStringArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();
    }


    private static String[] splitOnParagraphs(String sInput) {
        return sInput.split("\n");
    }

    private static String[] splitOnSentences(String paragraphInput) {
//        return paragraphInput.split("[!.?]");
        return paragraphInput.split("(?<=\\b[.!?])");
    }

    private static String[] splitSentenceOnWords(String sentenceInput) {
        int i = 0;
        String[] out;
        String[] strings = new String[sentenceInput.length()];

        Pattern pattern = Pattern.compile("(?U)(\\w+)");
        Matcher matcher = pattern.matcher(sentenceInput);

        while (matcher.find()) {
            strings[i] = matcher.group();
            i++;
        }

        out = new String[i];

        for (int j = 0; j < i; j++) {
            out[j] = strings[j];
        }

        return out;
    }

    private static char[] splitWordOnLetters(String wordInput) {
        return wordInput.toCharArray();
    }


    private static String sortParagraphsByNumberSentences(String text) {
        String[] paragraphs = splitOnParagraphs(text);
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < paragraphs.length; i++) {

            int maxIndex = maxCountSentencesOnParagraphStartingAtIndex(paragraphs, i);

            if (countSentencesOnParagraph(paragraphs[i]) < countSentencesOnParagraph(paragraphs[maxIndex])) {
                String r = paragraphs[i];
                paragraphs[i] = paragraphs[maxIndex];
                paragraphs[maxIndex] = r;
            }

            stringBuilder.append(paragraphs[i]);

        }

        return stringBuilder.toString();


    }

    private static int maxCountSentencesOnParagraphStartingAtIndex(String[] a, int start) {
        int maxValue = countSentencesOnParagraph(a[start]);
        int maxIndex = start;

        if (a.length - 1 == start) {
            return start;
        }

        for (int i = start + 1; i < a.length; i++) {
            if (countSentencesOnParagraph(a[i]) > maxValue) {
                maxValue = a[i].length();
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    private static int countSentencesOnParagraph(String paragraph) {
        return splitOnSentences(paragraph).length;
    }


    private static String sortWordsInSentence(String text) {
        String[] sentences = splitOnSentences(text);
        StringBuilder sentencesWithSortWords = new StringBuilder();

        for (int i = 0; i < sentences.length; i++) {

            String[] words = splitSentenceOnWords(sentences[i]);

            for (int j = 0; j < words.length; j++) {

                int maxIndex = maxLengthOfWordOnSentence(words, j);

                if (words[j].length() < words[maxIndex].length()) {
                    String r = words[j];
                    words[j] = words[maxIndex];
                    words[maxIndex] = r;
                }

                if (j < words.length - 1) {
                    sentencesWithSortWords.append(words[j] + " ");
                } else {
                    sentencesWithSortWords.append(words[j]);
                }
            }

            sentencesWithSortWords.append(sentences[i].charAt(sentences[i].length() - 1));


        }
        return sentencesWithSortWords.toString();

    }

    private static int maxLengthOfWordOnSentence(String[] words, int start) {
        int maxValueLength = words[start].length();
        int maxIndex = start;

        if (words.length - 1 == start) {
            return start;
        }

        for (int i = start + 1; i < words.length; i++) {
            if (words[i].length() > maxValueLength) {
                maxValueLength = words[i].length();
                maxIndex = i;
            }

        }
        return maxIndex;

    }


    private static String sortTokenByNumberOfOccurencesLetterDescending(String inputSentence, String inputLetter) {

        StringBuilder sentenceOut = new StringBuilder();
        String[] words = splitSentenceOnWords(inputSentence);

        while (true) {
            boolean isIncreasingNot = true;

            for (int i = 1; i < words.length; i++) {

                if (countSearchLettersInWord(words[i], inputLetter) > countSearchLettersInWord(words[i - 1], inputLetter)) {

                    String r = words[i];
                    words[i] = words[i - 1];
                    words[i - 1] = r;
                    int k = i - 1;

                    while (k > 0) {
                        if (countSearchLettersInWord(words[k - 1], inputLetter) > countSearchLettersInWord(words[k], inputLetter)) {
                            String p = words[k];
                            words[k] = words[k - 1];
                            words[k - 1] = p;
                        }
                        k--;
                    }

                    isIncreasingNot = false;

                } else if (countSearchLettersInWord(words[i], inputLetter) == countSearchLettersInWord(words[i - 1], inputLetter)) {

                    if (compare(words[i], words[i - 1]) > 0) {
                        String r = words[i];
                        words[i] = words[i - 1];
                        words[i - 1] = r;
                        int k = i - 1;

                        while (k > 0 &&
                                countSearchLettersInWord(words[k], inputLetter) == countSearchLettersInWord(words[k - 1], inputLetter)) {

                            if (compare(words[k], words[k - 1]) > 0) {
                                String p = words[k];
                                words[k] = words[k - 1];
                                words[k - 1] = p;
                            }
                            k--;
                        }
                    }

                }

            }
            if (isIncreasingNot) {
                break;
            }
        }

        for (String s : words) {
            sentenceOut.append(s + " ");
        }

        return sentenceOut.toString();
    }

    private static int countSearchLettersInWord(String word, String letter) {
        Pattern pattern = Pattern.compile(letter);

        Matcher matcher = pattern.matcher(word);
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }


}
