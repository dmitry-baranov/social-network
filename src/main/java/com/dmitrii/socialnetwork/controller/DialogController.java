package com.dmitrii.socialnetwork.controller;

import com.example.api.DialogApiController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@RestController
public class DialogController extends DialogApiController {

    @Autowired
    public DialogController(NativeWebRequest request) {
        super(request);
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        // Ваша бизнес-логика здесь
        // Например, логирование или дополнительные проверки
        return super.getRequest();
    }

}
