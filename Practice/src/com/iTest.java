package com;

public interface iTest {
public void aa();
default void bb() {
	System.out.println("bb-interface");
}
static void cc()
{
	System.out.println("cc-interface");
}


}
