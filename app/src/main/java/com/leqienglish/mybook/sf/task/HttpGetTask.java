package com.leqienglish.mybook.sf.task;

import com.leqienglish.mybook.sf.LQService;
import com.leqienglish.mybook.util.LQHandler;

import org.springframework.web.client.RestTemplate;

import java.util.Map;

public  class HttpGetTask<T> extends HttpTask<T> {

    public HttpGetTask(String path, Class<T> claz, LQHandler.Consumer<T> consumer, Map<String, ?> variables) {
        super(path, claz, consumer, variables);
    }

    @Override
    protected T getT(RestTemplate restTemplate) {
       return restTemplate.getForObject(this.getPath(), this.getClaz(),this.getVariables());
    }


}