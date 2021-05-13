package com.lnu.exer10;

public class NetworkTest {
	public static void main(String[] args) {
		Server server = new Server();
//		Network work = new Server();
		ProxyServer proxyServer = new ProxyServer(server);
		
		proxyServer.browse();
	}
}

interface Network{
	
	public abstract void browse();
}

//被代理类
class Server implements Network{

	@Override
	public void browse() {
		System.out.println("真实的服务器访问网络");
	}
}

//代理类
class ProxyServer implements Network{

	private Network work;//声明接口 Network work = Server server; Network work = new Server();
	
	//当前代理类的构造器 
	public ProxyServer(Network work) {//要传入实现类
		this.work = work;//对Network属性进行初始化
	}
	
	public void check() {
		System.out.println("联网之前的检查工作");
	}
	
	@Override
	public void browse() {
		check();
		work.browse();
	}
	
	
}












