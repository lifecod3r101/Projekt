package com.developer.speed.m_pos.Main_Menu;

public class MenuLayoutCardProperty
{
    protected static String menuItem;
    public MenuLayoutCardProperty(){}
    public MenuLayoutCardProperty(String menuItem)
    {
        MenuLayoutCardProperty.menuItem = menuItem;
    }

    public String getMenuItem()
    {
        return menuItem;
    }

    public void setMenuItem(String menuItem)
    {
        MenuLayoutCardProperty.menuItem = menuItem;
    }
}

