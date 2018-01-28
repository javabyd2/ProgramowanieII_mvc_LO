package com.sdabyd2.mvc;

import com.sdabyd2.mvc.controller.GiantController;
import com.sdabyd2.mvc.model.Fatigue;
import com.sdabyd2.mvc.model.GiantModel;
import com.sdabyd2.mvc.model.Health;
import com.sdabyd2.mvc.model.Norishment;
import com.sdabyd2.mvc.view.GiantView;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GiantModel giant1 = new GiantModel(
                Health.HEALTHY,
                Norishment.NOTHUNGRY,
                Fatigue.NO
        );
        GiantModel giant2 = new GiantModel(
                Health.HEALTHY,
                Norishment.NOTHUNGRY,
                Fatigue.NO
        );

        List<GiantModel> giantModels = new ArrayList<>();

        GiantView view = new GiantView();
        GiantController controller = new GiantController(
                giantModels, view
        );

        controller.updateView();

        controller.setHealth(Health.DEAD);
        controller.updateView();


    }
}
