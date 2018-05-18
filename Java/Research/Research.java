public class Research {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hi research");
//		
//		Student student = new Student("Bob", 25);
//		student.breathe();
//		student.examine();
		
//		int bitmask = 0x000F;
//        int val = 0x2222;
//        System.out.println(val & bitmask);  // prints "2"
        
        int num0 = 10;  // 01010
        int num1 = 21;  // 10101
        System.out.println(num0 & num1);  // &
        System.out.println(num0 | num1);  // |
        System.out.println(num0 ^ num1);  // ^，异或运算符，相异为1，相同为0
        
        int num2 = 21 << 1;  // 移位，<<向左移，不足位则后面补0；>>向右移，最大移到都为0时
        System.out.println(num2);
        
        int num3 = 5;
        System.out.println(num3);
        int num4 = num3 << 2;
        System.out.println(num4);
        
        int num5 = 10;  // 01010
        int num6 = ~num5;  // ~，对值的补码进行取反，展示出来的都是原码
        System.out.println(num6);
	}

}
