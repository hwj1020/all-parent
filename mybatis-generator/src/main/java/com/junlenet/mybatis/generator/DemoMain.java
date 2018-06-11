package com.junlenet.mybatis.generator;

import com.junlenet.mybatis.generator.model.TbDoctor;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 描述:
 * created by hwj on 2018/6/9 11:22
 */
public class DemoMain {

    public static void main(String[] args){
        try{
            SimpleDateFormat sdf_ymdhms = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat sdf_ym = new SimpleDateFormat("yyyy-MM");
            SimpleDateFormat sdf_ymd = new SimpleDateFormat("yyyy-MM-dd");
            Date endDate = sdf_ymd.parse("2100-12-31");

            Date startDate = sdf_ym.parse("1900-01");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(startDate);
            for(int i=1;i<=12*100;i++){
                System.out.print("当前时间:"+sdf_ymd.format(calendar.getTime()));
                int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
                if(maxDay < 31){
                    calendar.add(Calendar.MONTH,1);
                    System.out.println();
                    continue;
                }
                calendar.set(Calendar.DAY_OF_MONTH,maxDay);
                int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
                if(dayOfWeek == 1){
                    System.out.print("      周五周六周天 都有5次 ");
                }
                calendar.set(Calendar.DAY_OF_MONTH,1);
                calendar.add(Calendar.MONTH,1);
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static String test(){
        TbDoctor tbDoctor = new TbDoctor();
        tbDoctor.setCreateBy("hwj");
        return tbDoctor.toString();
    }
}
