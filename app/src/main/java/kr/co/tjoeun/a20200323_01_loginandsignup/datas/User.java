package kr.co.tjoeun.a20200323_01_loginandsignup.datas;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

public class User implements Serializable {

    private int id;
    private String login_id;
    private String name;
    private String phone;
    private String memo;


//    JSONObject를 재룔로 넣으면 => User객체로 돌려주는 메쏘드 static
    public static User getUserFromJson(JSONObject object){
        User user = new User();

        try {
            user.id = object.getInt("id");
            user.login_id = object.getString("login_id");
            user.name = object.getString("name");
            user.phone = object.getString("phone");
            user.memo = object.getString("memo");

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return user;
    }

    public User() {
    }

    public User(int id, String login_id, String name, String phone, String memo) {
        this.id = id;
        this.login_id = login_id;
        this.name = name;
        this.phone = phone;
        this.memo = memo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin_id() {
        return login_id;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
