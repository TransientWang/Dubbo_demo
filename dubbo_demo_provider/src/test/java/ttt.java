import com.dao.Student;
import com.service.impl.HelloServiceImpl;
import org.junit.Test;

/**
 * @author 王扶摇
 * @Title: ttt
 * @ProjectName Dubbo_demo
 * @Description: TODO
 * @date 2018/7/16 9:49
 */
public class ttt {
    @Test
    public void ss(){
        HelloServiceImpl helloService = new HelloServiceImpl();
        Student student =helloService.hello("李岳杰");
        System.out.println(student.getCollege());

    }
}
