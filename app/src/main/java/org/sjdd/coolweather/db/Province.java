package org.sjdd.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by WCZ on 2017/5/22.
 */

public class Province extends DataSupport {
    private int id;
    private String name;
    private int code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
