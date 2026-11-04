package com.ceddie.skirmishai.core;

import arc.struct.Seq;
import mindustry.game.Team;

public final class AIRegistry {

    private static final Seq<AIController> controllers =
        new Seq<>();

    private AIRegistry() {
    }

    public static void register(Team team) {
        if (team == null || get(team) != null) {
            return;
        }

        controllers.add(new AIController(team));
    }

    public static AIController get(Team team) {
        for (AIController controller : controllers) {
            if (controller.getTeam() == team) {
                return controller;
            }
        }

        return null;
    }

    public static void unregister(Team team) {
        AIController controller = get(team);

        if (controller != null) {
            controllers.remove(controller, true);
        }
    }

    public static void update(float delta) {
        if (delta <= 0f) return;

        for (AIController controller : controllers) {
            controller.update(delta);
        }
    }

    public static void clear() {
        controllers.clear();
    }

    public static int size() {
        return controllers.size;
    }
}