import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Otp {
	// Map<Long, String> storage = new HashMap<Long, String>();

	/**
	 * @param otp
	 * @param s
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	String Validaton(String otp, Stack<String> s, Date date) throws ParseException {
		String gp = date.toString();
		String gday = gp.substring(0, 3);
		String gmnt = gp.substring(4, 7);
		Integer gdte = Integer.parseInt(gp.substring(8, 10));
		Integer ghr = Integer.parseInt(gp.substring(11, 13));
		Integer gmm = Integer.parseInt(gp.substring(14, 16));
		Integer gss = Integer.parseInt(gp.substring(17, 19));
		Integer gyy = Integer.parseInt(gp.substring(24));
		String peekdate = s.peek().toString();
		String gotp = peekdate.substring(0, 4);
		String day = peekdate.substring(4, 7);
		String mnt = peekdate.substring(8, 11);
		Integer dte = Integer.parseInt(peekdate.substring(12, 14));
		Integer hr = Integer.parseInt(peekdate.substring(15, 17));
		Integer mm = Integer.parseInt(peekdate.substring(18, 20));
		Integer ss = Integer.parseInt(peekdate.substring(22, 23));
		Integer yy = Integer.parseInt(peekdate.substring(28));
		if (gotp == otp && gday.equals(day) && gmnt.equals(mnt) && (dte - gdte) == 0 && (ghr - hr) == 0
				&& ((gmm - mm) <= 2) || (gmm - mm) == 0)
			return "Validated Successfully";
		else
			return "EXPIRED " + peekdate.substring(4);

	}

	String generation(long mob) {

		Date date = new Date();
		String d = "";
		d += mob;
		if (d.substring(0, 2).equals("91") && d.substring(2).length() == 10) {
			String gp = new Random().nextInt(0000, 9999) + "" + date.toString();

			return gp;
		} else
			return mob + "Invalid Country-Code";
	}

	public static void main(String[] args) throws ParseException {
		Scanner re = new Scanner(System.in);
		System.out.println("Enter MOB with Country code");
		long mob = Long.parseLong(re.nextLine());
		String gotp = new Otp().generation(mob);
		Stack<String> s = new Stack<>();
		s.push(gotp);
		System.out.println("OTP GENERATED " + gotp.substring(0, 4) + gotp.substring(5));

		System.out.println("Enter Otp");
		String otp = re.nextLine();
		String result = new Otp().Validaton(otp, s, new Date());

		System.out.println(result);
	}
}
