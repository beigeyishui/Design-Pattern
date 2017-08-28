package pattern.singleton;
/**
 * @author beigeyishui
 * Data 2017/8/28
 * 设计模式  ----	单例模式
 */
public class SingletonClass {
	//原始版本
	/*private static SingletonClass instance = null;
	
	private SingletonClass() {};
	
	public static SingletonClass getInstance() {
		if(instance == null) {
			instance  = new SingletonClass();
		}
		return instance;
	}*/
	
	//双重校验版本
	private volatile static SingletonClass instance = null;
	
	private SingletonClass() {};
	
	public SingletonClass getInstance(){
		if(instance == null) {
			synchronized (SingletonClass.class) {
				if(instance == null) {
					instance = new SingletonClass();
				}
			}
		}
		return instance;
	}
	

}
