package pl.perfectsource.kogito.bugs.threads;

import java.util.Random;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SlowService {

    public String waitForMe() throws InterruptedException {
        Random random = new Random();
        int rnd = random.ints(5, 15).findFirst().getAsInt();
        System.out.println("Will wait for: " + rnd + " secs...");
        Thread.sleep(rnd*1000);
        return "" + rnd;

    }
}
