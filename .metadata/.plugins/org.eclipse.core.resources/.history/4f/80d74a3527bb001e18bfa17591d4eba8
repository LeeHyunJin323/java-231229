package p_Chapter15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D_IO04 {

// employee.txt
	
// John,5000
//jane,5500
//Peter,5200
//Lucy,6000
//David,4800
	
// employee.txt 파일을 읽고난 후 각 줄을 분석하여 직원의 이름과 월급을 분리
// 직원의 이름과 월급을 분리 , 평균 월급을 계산하고 출력
	public static void main(String[] args) {
		
		String fileName = "employee.txt";
		
		BufferedReader reader = null;
		
		int employeeCount = 0;
		int totalSalary = 0;
		
		try {
			reader = new BufferedReader(new FileReader(fileName));
			String line = null;
			
			while((reader.readLine())!= null) {
				String[] parts = line.split(",");
				String name = parts[0].trim();
				int salary = Integer.parseInt(parts[1].trim());
				
				
				totalSalary += salary;
				employeeCount++;
				
			}
			double average = (double) totalSalary/ employeeCount;
			
			System.out.println("평균 월급은 : " + average);
		}
		catch(IOException exception) {
			exception.printStackTrace();
		}finally {
			try {
				if(reader != null) {
					reader.close();
				}
			}catch(IOException exception) {
				exception.printStackTrace();
			}
		}
	}

}

