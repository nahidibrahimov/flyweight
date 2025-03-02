package dev.nahidibrahimov.flyweight;

public class SystemErrorMessage implements ErrorMessage {

    private final String messageTemplate;
    private final String helpUrlBase;

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }

    @Override
    public String getMessage(int code) {
        return messageTemplate.replace("{code}", String.valueOf(code)) + helpUrlBase + code;
    }

}
