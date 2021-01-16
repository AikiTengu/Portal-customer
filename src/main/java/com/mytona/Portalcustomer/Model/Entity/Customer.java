package com.mytona.Portalcustomer.Model.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Customer")
public class Customer implements Serializable {

    @Id
    private int customerId;
    private int orderId;
    private String firstName;
    private String secondName;

}
