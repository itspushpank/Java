public interface Exam {

 void  conductExam();

 default void  guidelines(){
     System.out.println("Exam Guidelines: ------ Read all instructions on the question paper carefully.");
 }

 static void display(){
     System.out.println(
             "There is two modes of Examination.\n1.Offline Examination\n2.Online Examination."
     );
 }
}
