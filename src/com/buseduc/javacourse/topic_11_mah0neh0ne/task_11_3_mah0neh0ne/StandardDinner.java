package com.buseduc.javacourse.topic_11_mah0neh0ne.task_11_3_mah0neh0ne;

public class StandardDinner extends DinnerBuilder{

    private Dinner dinner = new Dinner();

    @Override
    public void buildFirst() {
        dinner.Add("Soup");
    }

    @Override
    public void buildMain() {
        dinner.Add("Potato and steak");
    }

    @Override
    public void buildDesert() {
        dinner.Add("Cake and tea");
    }

    @Override
    public Dinner getDinner() {
        return dinner;
    }
}
