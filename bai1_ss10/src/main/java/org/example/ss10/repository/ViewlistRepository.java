package org.example.ss10.repository;

import org.example.ss10.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class ViewlistRepository implements IViewlistRepository {

    private static List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer("Nguyễn Văn A", "1990-10-12", "Đà Nẵng",
                "https://i.pravatar.cc/100?img=1"));
        customers.add(new Customer("Trần Thị B", "1995-05-20", "Huế",
                "https://i.pravatar.cc/100?img=2"));
        customers.add(new Customer("Lê Văn C", "1988-03-05", "Quảng Nam",
                "https://i.pravatar.cc/100?img=3"));
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }
}
