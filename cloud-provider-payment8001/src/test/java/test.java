import com.dciwang.springcloud.entities.Payment;

import java.util.Optional;

/**
 * @Author DciWang
 * @Description TODO
 * @Date 2020/8/6 下午5:09
 * @Version 1.0
 */

public class test {
    public static void main(String[] args) {
        Optional<Payment> payment1=Optional.empty();
        Optional<Payment> payment=Optional.ofNullable(new Payment(1,"fefewf"));
        payment.ifPresent(u->
            System.out.println(u.getId()+u.getSerial())
        );
        payment1.ifPresent(u-> {
            System.out.println(u.getId()+u.getSerial());

        });

    }
}
