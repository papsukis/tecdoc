package com.admaroc.tecdoc.tecdoc.model;

import java.util.List;

public class FormView {
    private String form;
    private List<String> listForm;

    public FormView() {
    }

    public FormView(String form, List<String> listForm) {
        this.form = form;
        this.listForm = listForm;
    }


    public FormView(List<String> listForm) {
        this.listForm = listForm;
    }

    public List<String> getListForm() {
        return listForm;
    }

    public void setListForm(List<String> listForm) {
        this.listForm = listForm;
    }

    public FormView(String form) {
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }
}
