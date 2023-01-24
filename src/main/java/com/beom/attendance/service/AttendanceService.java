package com.beom.attendance.service;



import com.slack.api.Slack;
import com.slack.api.methods.MethodsClient;
import com.slack.api.methods.request.chat.ChatPostMessageRequest;
import lombok.extern.slf4j.Slf4j;
import okhttp3.internal.http2.ErrorCode;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Optional;


@Slf4j
@Service
public class AttendanceService {

    @Value(value = "${slack.token}")
    String token;
    @Value(value = "${slack.channel}")
    String channel;
    public void sendSlackMessage(String username) throws Exception {
        String message = "writing_hand: *["+username+"]* 님이 업무 집중을 시작했어요!";
        System.out.println("test2");
        try{
            System.out.println(channel);
            System.out.println(token);
            MethodsClient methods = Slack.getInstance().methods(token);
            ChatPostMessageRequest request = ChatPostMessageRequest.builder()
                    .channel(channel)
                    .text(message)
                    .build();
            System.out.println("test1");
            methods.chatPostMessage(request);

        }catch (Exception e){
            throw new Exception("오류");
        }
    }



}
