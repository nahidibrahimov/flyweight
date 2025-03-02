package dev.nahidibrahimov.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ErrorMessageFactory {

    public enum ErrorType {
        GenericSystemError, PageNotFound, InternalError
    }

    private static final ErrorMessageFactory INSTANCE = new ErrorMessageFactory();

    public static ErrorMessageFactory getInstance() {
        return INSTANCE;
    }

    private final Map<ErrorType, SystemErrorMessage> systemErrorMessages = new HashMap<>();

    private ErrorMessageFactory() {
        systemErrorMessages.put(
                ErrorType.GenericSystemError,
                new SystemErrorMessage(
                        "A generic error of type {code} occured. Please refer to:\n",
                        "https://doc.google.com/?error="
                )
        );

        systemErrorMessages.put(
                ErrorType.PageNotFound,
                new SystemErrorMessage(
                        "Page not found. An error of type {code} occured. Please refer to:\n",
                        "https://doc.google.com/?error="
                )
        );

    }

    public SystemErrorMessage getSystemErrorMessage(ErrorType errorType) {
        return systemErrorMessages.get(errorType);
    }

    public UserBannedErrorMessage getUserBannedErrorMessage(int caseId) {
        return new UserBannedErrorMessage(caseId);
    }

}
