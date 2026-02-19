package _23_Singleton;

import java.util.Set;

// Setting 클래스에 싱글톤패턴을 적용시켜 주세요
public class Setting {
    // 싱글톤객체는 필드 가질 수 있음(상수 등) 상태변화가 없어야함
    private static final String API_KEY = "DEFAULT";
    private static final String DEV_MODE = "DEV";
    private static final String PRODUCTION = "PRODUCTION";

    private String appMode;

    private static Setting instance;
    private Setting() {}
    public static Setting getInstance() {
        if(instance == null) {
            instance = new Setting();
        }
        return instance;
    }


    public void toDev() {
        this.appMode = DEV_MODE;
    }







}
