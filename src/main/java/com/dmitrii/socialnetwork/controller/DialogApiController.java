package com.dmitrii.socialnetwork.controller;

import com.otus.api.DialogApi;
import com.otus.model.DialogMessage;
import com.otus.model.DialogUserIdSendPostRequest;
import jakarta.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-05-27T08:37:28.947588+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
@Controller
@RequestMapping("${openapi.socialNetwork.base-path:}")
public class DialogApiController implements DialogApi {

    private final NativeWebRequest request;

    @Autowired
    public DialogApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<List<DialogMessage>> dialogUserIdListGet(String userId) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> dialogUserIdSendPost(String userId, DialogUserIdSendPostRequest dialogUserIdSendPostRequest) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
