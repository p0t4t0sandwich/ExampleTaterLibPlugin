package com.example.example.api;

/** API wrapper class */
public class ExampleAPI {
    private final Data data;

    public ExampleAPI(String initSomeData) {
        this.data = new Data(initSomeData);
    }

    /**
     * Get some data
     *
     * @return Some data
     */
    public String getSomeData() {
        return this.data.someData;
    }

    /** Data used throughout the plugin via the API. */
    static class Data {
        String someData;

        Data(String someData) {
            this.someData = someData;
        }
    }
}
