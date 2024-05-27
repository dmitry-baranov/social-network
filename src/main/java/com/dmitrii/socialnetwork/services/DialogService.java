package com.dmitrii.socialnetwork.services;

import com.otus.model.DialogMessage;
import com.otus.model.DialogUserIdSendPostRequest;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DialogService {
    public List<DialogMessage> getDialogMessages(String userId) {
        return List.of();
    }

    public void sendDialogMessage(String userId, DialogUserIdSendPostRequest dialogUserIdSendPostRequest) {

    }
}
