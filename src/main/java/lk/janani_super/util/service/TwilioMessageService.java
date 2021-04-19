package lk.janani_super.util.service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Service;


@Service
public class TwilioMessageService {
    // Find your Account Sid and Token at twilio.com/user/account
    public static final String ACCOUNT_SID = "AC4a1cb6c461dbc4884b395969797daac5";
    public static final String AUTH_TOKEN = "8a8161b987d2aeaab8105f99d723737fremove";


    public void sendSMS(String number, String messageBody) throws Exception{
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message
                .creator(new PhoneNumber(number), new PhoneNumber("+12027938235"),
                         messageBody)
                .create();

        System.out.println("Message "+message.getSid());
    }
}
