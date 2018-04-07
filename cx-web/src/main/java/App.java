import java.io.IOException;

import org.cx.domain.CustomerDto;
import org.cx.service.ICustomerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:spring.xml" });

        context.start();
        ICustomerService customerService = (ICustomerService) context.getBean("customerService");

        CustomerDto customerDto = new CustomerDto();
        customerDto.setName("Shawn");
        customerDto.setAge(Integer.valueOf(30));
        customerService.sayHello(customerDto);
        System.out.println(customerService.selfIntroduce(customerDto));
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
