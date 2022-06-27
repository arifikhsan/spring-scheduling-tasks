package com.example.springschedulingtasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

import static java.lang.System.currentTimeMillis;

@Component
public class ScheduledTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000) // every 5 seconds
    // @Scheduled(cron = "0 1 * * * *") // every day at 1 am
    // @Scheduled(cron = "47 16 * * * *")
    // scheduled spring cron tidak sama dengan unix cron
    // https://stackoverflow.com/questions/30887822/spring-cron-vs-normal-cron


    // @Scheduled(cron = "0 52 8 * * *", zone = "Asia/Jakarta") // jam 8 pagi menit 52
    public void reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(currentTimeMillis()));
    }
}
