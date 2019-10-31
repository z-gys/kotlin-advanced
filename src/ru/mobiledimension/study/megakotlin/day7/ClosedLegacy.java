package ru.mobiledimension.study.megakotlin.day7;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class ClosedLegacy {
    static CompletionStage<Integer> doPart1() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 6;
        } );
    }

    static CompletionStage<Integer> doPart2() {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 7;
        } );
    }
}
