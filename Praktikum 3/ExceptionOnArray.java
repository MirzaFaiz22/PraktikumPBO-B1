public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayIntegers = new Integer[4];
        try{
            arrayIntegers[2] = 11;
            arrayIntegers[3] = 10;
        }catch
        (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code ...");
        }
    }
}

// array tidak boleh diisi lebih dari 3 karena aray sudah di set[4]