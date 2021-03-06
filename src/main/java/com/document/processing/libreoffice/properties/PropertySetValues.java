package com.document.processing.libreoffice.properties;

public enum PropertySetValues {
    CHAR_WEIGHT("CharWeight"),
    PARAGRAPH_ADJUSTMENT("ParaAdjust"),
    SEARCH_REGULAR_EXPRESSION("SearchRegularExpression");

    private String value;
    PropertySetValues(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
