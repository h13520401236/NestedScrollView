package com.heng.nestedscrollview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heng on 2018/12/18
 */
public class InitData {
    public static InitData instance;

    public static InitData getInstance() {
        if (instance == null) {
            synchronized (InitData.class) {
                if (instance == null) {
                    instance = new InitData();
                }
            }
        }
        return instance;
    }

    public List<String> integerList() {
        List<String> integerList = new ArrayList<>();
        integerList.add("剑一破");
        integerList.add("剑二空");
        integerList.add("剑三飞");
        integerList.add("剑四灭");
        integerList.add("剑五虚");
        integerList.add("剑六绝");
        integerList.add("剑七真");
        integerList.add("剑八玄");
        integerList.add("剑九轮回");
        integerList.add("剑十天葬");
        integerList.add("剑十一涅槃");
        integerList.add("剑十二心");
        integerList.add("剑一破");
        integerList.add("剑二空");
        integerList.add("剑三飞");
        integerList.add("剑四灭");
        integerList.add("剑五虚");
        integerList.add("剑六绝");
        integerList.add("剑七真");
        integerList.add("剑八玄");
        integerList.add("剑九轮回");
        integerList.add("剑十天葬");
        integerList.add("剑十一涅槃");
        integerList.add("剑十二心");
        integerList.add("剑一破");
        integerList.add("剑二空");
        integerList.add("剑三飞");
        integerList.add("剑四灭");
        integerList.add("剑五虚");
        integerList.add("剑六绝");
        integerList.add("剑七真");
        integerList.add("剑八玄");
        integerList.add("剑九轮回");
        integerList.add("剑十天葬");
        integerList.add("剑十一涅槃");
        integerList.add("剑十二心");
        return integerList;
    }
}
