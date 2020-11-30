package com.example.mfsp.controller;


import com.example.mfsp.entity.Orderform;
import com.example.mfsp.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DeleteOrderController {

    @Autowired
    private orderService orderService;

    @GetMapping("/deleteOrder")
    @ResponseBody
    public String deleteOrder(Orderform orderform){

//        Orderform orderform=new Orderform();
//        orderform.setOrderformid(orderformid);

//        orderform.toString();
        System.out.println("del"+ orderform.toString());
        if(orderform.getOrderformid()==null){
            System.out.println("orderform.getOrderformid()==null");
        }else {
            System.out.println("orderform.getOrderformid()==nonull");
            orderService.delete(orderform);

        }


        return "success";
    }

//    @GetMapping("/deleteOrderById")
//    @ResponseBody
//    public String deleteOrderById(@RequestParam("orderformid")  Integer orderformid){
//
//        Orderform orderform=new Orderform();
//        orderform.setOrderformid(orderformid);
//
//        System.out.println("del"+ orderform.toString());
//        if(orderform.getOrderformid()==null){
//            System.out.println("orderform.getOrderformid()==null");
//        }else {
//            System.out.println("orderform.getOrderformid()==nonull");
////            orderService.delete(orderform);
//
//        }
//
//
//        return "success";
//    }



}
