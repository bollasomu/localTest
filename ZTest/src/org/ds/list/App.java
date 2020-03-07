package org.ds.list;

class Super {
    public int index = 1;
}

class App extends Super {

	public int index = 0;
    
	public App(int index) {
        this.index = index;
    }

    public static void main(String args[]) {
        Super myApp = new App(10);
        System.out.println(myApp.index);
    }
}
