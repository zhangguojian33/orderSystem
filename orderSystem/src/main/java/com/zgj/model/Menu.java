package com.zgj.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Menu implements Serializable {
    private Integer id;

    private Date menudate;

    private String menutype;

    private String menu;

    private BigDecimal price;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMenudate() {
        return menudate;
    }

    public void setMenudate(Date menudate) {
        this.menudate = menudate;
    }

    public String getMenutype() {
        return menutype;
    }

    public void setMenutype(String menutype) {
        this.menutype = menutype == null ? null : menutype.trim();
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu == null ? null : menu.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}