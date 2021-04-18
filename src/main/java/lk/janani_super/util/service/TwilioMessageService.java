package lk.janani_super.util.service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Service;


@Service
public class TwilioMessageService {
    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "AC4a1cb6c461dbc4884b395969797daac5";
    public static final String AUTH_TOKEN = "d2849ade979ee26c199565e5c6c12f83";


    public void sendSMS(String number, String messageBody) throws Exception{
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message
                .creator(new PhoneNumber(number), new PhoneNumber("+12027938235"),
                         messageBody)
                .create();

        System.out.println("Message "+message.getSid());
    }
}
