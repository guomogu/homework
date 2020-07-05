import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class homework {
	public static String run(String command) throws IOException {
		Scanner input = null;
		String result = "";
		Process process = null;
		try {
			process = Runtime.getRuntime().exec(command);
			try {
				//等待命令执行完成
				process.waitFor(10, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			InputStream is = process.getInputStream();
			input = new Scanner(is);
			while (input.hasNextLine()) {
				result += input.nextLine() + "\n";
			}
			result = command + "\n" + result; //加上命令本身，打印出来
		} finally {
			if (input != null) {
				input.close();
			}
			if (process != null) {
				process.destroy();
			}
		}
		return result;
	}
	
	public static String run(String[] command) throws IOException {
		Scanner input = null;
		String result = "";
		Process process = null;
		try {
			process = Runtime.getRuntime().exec(command);
			try {
				//等待命令执行完成
				process.waitFor(10, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			InputStream is = process.getInputStream();
			input = new Scanner(is);
			while (input.hasNextLine()) {
				result += input.nextLine() + "\n";
			}
		} finally {
			if (input != null) {
				input.close();
			}
			if (process != null) {
				process.destroy();
			}
		}
		return result;
	}
	public static void main(String[] args) {
		try {
			List<String> commandArr1 = new ArrayList<>();
			commandArr1.add("/bin/sh");
			commandArr1.add("-c");
			commandArr1.add("cat /proc/cpuinfo | grep name | cut -f2 -d: |uniq -c");
			String result1 = homework.run(commandArr1.toArray(new String[commandArr1.size()]));
			// String result= homework.run("ls");
			System.out.println("CPU model:");
			System.out.println(result1);
			List<String> commandArr2 = new ArrayList<>();
			commandArr2.add("/bin/sh");
			commandArr2.add("-c");
			commandArr2.add("cat /proc/meminfo | grep MemTotal");
			String result2 = homework.run(commandArr2.toArray(new String[commandArr2.size()]));
			System.out.println(result2);
			List<String> commandArr3 = new ArrayList<>();
			commandArr3.add("/bin/sh");
			commandArr3.add("-c");
			commandArr3.add("fdisk -l | grep Disk");
			String result3 = homework.run(commandArr3.toArray(new String[commandArr3.size()]));
			System.out.println("disk:");
			System.out.println(result3);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
    
