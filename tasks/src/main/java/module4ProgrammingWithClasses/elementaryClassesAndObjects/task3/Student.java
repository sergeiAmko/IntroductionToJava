package module4ProgrammingWithClasses.elementaryClassesAndObjects.task3;

public class Student {
    private String surname;
    private String initials;
    private int groupNumber;
    private int[] learningAchievement = new int[5];

    public Student(String surname, String initials, int groupNumber, int[] learningAchievement) {
        this.surname = surname;
        this.initials = initials;
        this.groupNumber = groupNumber;
        this.learningAchievement = learningAchievement;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getLearningAchievement() {
        return learningAchievement;
    }

    public void setLearningAchievement(int[] learningAchievement) {
        this.learningAchievement = learningAchievement;
    }


    public void printEvolutionMore10() {
        for (int learn : learningAchievement) {
            if (learn != 9 && learn != 10) {
                return;
            }
        }

        System.out.println(surname + "- " + groupNumber);
    }


}
