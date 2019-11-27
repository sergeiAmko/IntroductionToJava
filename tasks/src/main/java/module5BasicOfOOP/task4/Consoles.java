package module5BasicOfOOP.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static module5BasicOfOOP.Service.getIntValue;

public class Consoles {

    private TreasuresUtil treasuresUtil;

    public Consoles(TreasuresUtil treasuresUtil) {
        this.treasuresUtil = treasuresUtil;
    }

    public List selectAmountOfTreasure(double amount) {

        if (amount <= 0) {
            return Collections.EMPTY_LIST;
        }

        List<Treasure> treasuresInner=new ArrayList<>();
        Treasure treasureProm;

        while (Double.compare(amount,treasuresUtil.min().getCost())>=0) {

            treasureProm=getTreasure("Choice the treasure");

            if (amount-treasureProm.getCost()>=0){
                treasuresInner.add(treasureProm);
                amount-=treasureProm.getCost();
            }else {
                System.out.println("Doesn't enough money, choice other treasure");
            }

        }

        return treasuresInner;

    }

    private Treasure getTreasure(String message) {


        System.out.println(message);

        int i = 1;
        for (Treasure treasure : treasuresUtil.treasures) {
            System.out.print((i++) + "- " + treasure.getName() + "= ");
            System.out.println(treasure.getCost());
        }

        int choice = getIntValue("Choice the treasure", 1, treasuresUtil.treasures.size());

        return treasuresUtil.treasures.get(choice - 1);


    }




}
