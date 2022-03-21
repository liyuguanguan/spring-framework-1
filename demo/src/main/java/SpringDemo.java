import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @Descrition
 * @Author : guanliyu
 * @Date : 2022/3/21
 **/
@SuppressWarnings("ALL")
public class SpringDemo {

	public static void main(String[] args) {
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		HelloSpring helloSpring = (HelloSpring) xmlBeanFactory.getBean("helloSpring");
		System.out.println(helloSpring.getName());
	}
}
