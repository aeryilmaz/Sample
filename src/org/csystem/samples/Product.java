package org.csystem.samples;

public class Product {
    private int m_id;
    private String m_name;
    private int m_stock;
    private double m_price;

    public Product()
    {

    }

    public Product(int id, String name, int stock, double price)
    {
        m_id = id;
        m_name = name;
        m_stock = stock;
        m_price = price;
    }

    public int getId()
    {
        return m_id;
    }

    public void setId(int id)
    {
        m_id = id;
    }

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        m_name = name;
    }

    public int getStock()
    {
        return m_stock;
    }

    public void setStock(int stock)
    {
        m_stock = stock;
    }

    public double getPrice()
    {
        return m_price;
    }

    public void setPrice(double price)
    {
        m_price = price;
    }

    public boolean equals(Object other)
    {
        if (!(other instanceof Product))
            return false;

        return ((Product)other).m_id == m_id;
    }

    public String toString()
    {
        return String.format("[%d]%s:%d * %.2f=%.2f", m_id, m_name, m_stock, m_price, m_price * m_stock);
    }
}
