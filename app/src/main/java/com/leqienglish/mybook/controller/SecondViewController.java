package com.leqienglish.mybook.controller;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.leqienglish.mybook.R;
import com.leqienglish.mybook.entity.Greeting;
import com.leqienglish.mybook.fragment.SecondFrament;
import com.leqienglish.mybook.sf.LQService;
import com.leqienglish.mybook.util.LQHandler;

/**
 * Created by zhuqing on 2017/8/19.
 */

public class SecondViewController extends Controller<View> {
    private TextView textView;
    private Button button;
    public SecondViewController(View fragment) {
        super(fragment);
    }

    @Override
    public void init() {
        textView = this.getView().findViewById(R.id.second_text);
        button = this.getView().findViewById(R.id.second_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LQService.get("/greeting", Greeting.class, null, new LQHandler.Consumer<Greeting>() {
                    @Override
                    public void applay(Greeting o) {
                   if(o==null){

                       textView.setText("null");
                   }else{
                       textView.setText(o.toString());
                   }
                    }
                });
            }
        });
    }
}
