package com.example.testingcallhierarchy;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
        MyInterface a= () -> {};

        MyInterface b = new MyInterfaceImplA();
        MyInterfaceImplA c = new MyInterfaceImplA();
        var d = new MyInterfaceImplA();

        MyInterface e = new MyInterfaceImplB();
        MyInterfaceImplB f = new MyInterfaceImplB();
        var g = new MyInterfaceImplB();

        var h = new MyInterfaceImplC();


        a.hello();
        b.hello();
        c.hello();
        d.hello();
        e.hello();
        f.hello();
        g.hello();
	}

}
