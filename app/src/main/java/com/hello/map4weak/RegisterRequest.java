package com.hello.map4weak;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    //서버 url 설정(php파일 연동)
    final static  private String URL="https://yewon-txuxl.run.goorm.io/yewon/Register.php";
    private Map<String,String>map;

    public RegisterRequest(String userID, String userPassword, String userName, int userAge,int userHak,String userMajor,Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);//위 url에 post방식으로 값을 전송

        map=new HashMap<>();
        map.put("userID",userID);
        map.put("userPassword",userPassword);
        map.put("userName",userName);
        map.put("userAge",userAge+"");
        map.put("userHak",userHak+"");
        map.put("userMajor",userMajor);
    }

    @Override
    protected Map<String, String> getParams() {
        return map;
    }
}
