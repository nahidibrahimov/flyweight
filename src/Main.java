import dev.nahidibrahimov.flyweight.ErrorMessageFactory;
import dev.nahidibrahimov.flyweight.SystemErrorMessage;
import dev.nahidibrahimov.flyweight.UserBannedErrorMessage;

public class Main {
    public static void main(String[] args) {

        SystemErrorMessage msg1 = ErrorMessageFactory.getInstance()
                .getSystemErrorMessage(ErrorMessageFactory.ErrorType.GenericSystemError);
        System.out.println(msg1.getMessage(500));

        UserBannedErrorMessage msg2 = ErrorMessageFactory.getInstance()
                .getUserBannedErrorMessage(421233);
        System.out.println(msg2.getMessage(403));

    }
}