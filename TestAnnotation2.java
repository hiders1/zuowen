import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//限制此注解只能使用在属性上
@Target({ElementType.FIELD,ElementType.METHOD})
@interface MyAnnotation2{
    String name() default "小桃子";
    int age() default 18;
}

public class TestAnnotation2 {
    //在方法上使用自定义注解
    @MyAnnotation2    //！！！改为MyAnnotation2也不行
    public void getObjectInfo() {

    }
}
