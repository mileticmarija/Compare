package Support;



public class CompareMethodClass {

 //public void compareRAM(String ram1,String ram2){
 //    if (!ram1.equals(ram2)){
 //        System.out.println("Razlike , item1: " + ram1 + " item2: " + ram2);
 //    }
 //}

 //public void compareInteran(String interna1,String interna2){
 //    if (!interna1.equals(interna2)){
 //        System.out.println("Razlike , item1: " + interna1 + " item2: " + interna2);
 //    }
 //}
 //public void compareKamera(String cam1,String cam2){
 //    if (!cam1.equals(cam2)){
 //        System.out.println("Razlike , item1: " + cam1 + " item2: " + cam2);
 //    }
 //}
 //public void compareCena(String c1,String c2){
 //    if (!c1.equals(c2)){
 //        System.out.println("Razlike , item1: " + c1 + " item2: " + c2);
 //    }
 //}

 //public void compare(String ram1,String ram2,String interna1,String interna2,String cam1,String cam2,String c1,String c2){
 //    compareRAM(ram1,ram2);
 //    compareInteran(interna1,interna2);
 //    compareKamera(cam1,cam2);
 //    compareCena(c1,c2);
 //}

    public void compare1(String item1, String item1Name, String item2, String item2Name){
        if (!item1.equals(item2)){
            System.out.println("Razlike - "+item1Name+" : "+item1+" --- "+" "+item2Name+" : "+item2);
        }
    }
}
