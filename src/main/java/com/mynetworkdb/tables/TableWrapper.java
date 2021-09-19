package com.mynetworkdb.tables;

import com.amazonaws.services.dynamodbv2.document.Table;

public class TableWrapper {
    Table table;

    public TableWrapper(Table table) {
        this.table = table;
    }

    public void insertNewElement() {}

    public void describeTable() {}
}
