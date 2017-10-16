package xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by dll on 2017/10/15.
 * @author
 */
public class MyAspectJ {

    /**
     * 前置增强
     */
    public void before(){
        System.out.println("前置增强==>");
    }
    /**
     *  前置增强
     */
    public void before(JoinPoint jp){
        System.out.println("前置增强==>"+jp);
    }


    public void afterReturning(String result){
        System.out.println("后置增强==>"+result);
    }


    /**
     *
     * @param pjp
     * @return
     * @throws Throwable
     */

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕增强1==>");
        Object  result=null;
        //执行目标方法
        result= pjp.proceed();
        System.out.println("环绕增强2==>");
        return  "小豆腐";
    }
    /**
     * 异常增强
     */
    public void afterThrowingTwo(Exception ex){
        System.out.println("异常增强2==>"+ex);
    }

    /**
     * 最终增强
     */

    public void after(){
        System.out.println("最终通知==>");
    }


    /**
     * 定义切入点 优点类似于mybatis中的sql片段
     */
    private  void  exeEat(){}  //别的切面无需获取
}
