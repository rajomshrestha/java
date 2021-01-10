public class Main {
    public static void main (String[] args){
    int operandFrist = Integer.parseInt(args[0]);
    int operandSecond = Integer.parseInt(args[1]);
    String operator = args[args.length-1];

    int result = 0;

    if(operator.equals("+")){
        result = operandFrist + operandSecond;
    }else if(operator.equals("-")){
        result = operandFrist - operandSecond;
    }else if(operator.equals("%")){
        result = operandSecond % operandFrist;
    }else if(operator.equals("*"))
    {
        result = operandFrist * operandSecond;
    }

    System.out.println(operandFrist + operator + operandSecond +"="+result);
}
}