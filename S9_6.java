package U9_one_star;

public class S9_6 {
	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		sw.start();
		for(int i=0;i<100000;++i)
			for(int j=0;j<100000;++j)
		sw.stop();
		System.out.println(sw.getElapsedTime());
	}
}
class StopWatch{
	private long startTime;
	private long endTime;
	public StopWatch(){
        startTime=System.currentTimeMillis();
    }
	public void start() {
		startTime=System.currentTimeMillis();
	}
	public void stop() {
		endTime=System.currentTimeMillis();
	}
	public long getElapsedTime() {
		return endTime-startTime;
	}
	public long getStartTime() {
		return startTime;
	}
	public long getEndTime() {
		return endTime;
	}
}
