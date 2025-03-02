package dev.nahidibrahimov.flyweight;

import java.time.Duration;

public class UserBannedErrorMessage implements ErrorMessage {

    private final int caseId;
    private final String remarks;
    private final Duration banDuration;
    private String message;

    public UserBannedErrorMessage(int caseId) {
        this.caseId = caseId;
        this.remarks = "You violated terms of use.";
        this.banDuration = Duration.ofDays(5);
        this.message = "You are banned. \nMore information: \n";
        this.message += caseId + " \n";
        this.message += remarks + " \n";
        this.message += "Banned for: " + banDuration.toHours() + " hours.\n";
    }

    @Override
    public String getMessage(int code) {
        return message;
    }

    public int getCaseId() {
        return caseId;
    }

}
