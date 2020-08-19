package com.example.DadosJSON.domain;

import java.util.Arrays;

public class Base {

    private DadosRaw[] data;

    public  Base() {}

    public Base(DadosRaw[] data) {
        this.data = data;
    }

    public DadosRaw[] getData() {
        return data;
    }

    public void setData(DadosRaw[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Base{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
