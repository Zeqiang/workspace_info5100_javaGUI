/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Eric
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        long l = System.currentTimeMillis();//得到long类型当前时间
        Date date = new Date(l);//new日期对象
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//转换提日期输出格式
        System.out.println(dateFormat.format(date));
        
    }
    
}
