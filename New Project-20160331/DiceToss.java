import java.text.DecimalFormat;


public class Simulation1 {
    
    public Double number;
   
   static DecimalFormat df = new DecimalFormat("##.00");
    
    public static int face1 = 0;
    public static int face2 = 0;
    public static int face3 = 0;
    public static int face4 = 0;
    public static int face5 = 0;
    public static int face6 = 0;
    
//    public Rollingdice2(Double numb){
//        this.number = numb;
//    }
    
    public void roll(){
      this.number = Math.random();
    }
    
    public void getFace(){
       Double nmrb = this.number;
       
       if (nmrb>=0 && nmrb<0.1666) {
        //faceone = 1;
        face1 ++;
        
       } 
       else if (nmrb>=0.1666 && nmrb<0.3333){
         //facetwo = 2;
         face2 ++;
       }
        else if (nmrb>=0.3333 && nmrb<0.5000){
         //facethree = 3;
         face3 ++;
       } 
        else if (nmrb>=0.5000 && nmrb<0.6666){
         //facefour = 4;
         face4 ++;
       } 
        else if (nmrb>=0.6666 && nmrb<0.8333){
         //facefive = 5;
         face5 ++;
       }
        else {
         //facesix = 6;
         face6 ++;
       }
    }
        
       // public static void calcPercentage(){
              
       // }
        
//        public static void displayFace(){
           
//        }
       

    public static void main(String[] args) {
        Simulation1 rollit = new Simulation1();
        for( int freq=0; freq<=999; freq++)
        {
            rollit.roll();
            rollit.getFace();
       
        }
    //rollit.calcPercentage();    
   // rollit.displayFace();
            double faceone, facetwo, facethree, facefour ,facefive, facesix;
   
            faceone = ((double)face1/1000*100);
            facetwo = ((double)face2/1000*100);
            facethree = ((double)face3/1000*100);
            facefour = ((double)face4/1000*100);
            facefive = ((double)face5/1000*100);
            facesix = ((double)face6/1000*100);    
            
            System.out.println("The Face 1 :" + face1 + " with a percentage of:" + df.format(faceone) + "%");
            System.out.println("The Face 2 :" + face2 + " with a percentage of:" + df.format(facetwo) + "%");
            System.out.println("The Face 3 :" + face3 + " with a percentage of:" + df.format(facethree) + "%");
            System.out.println("The Face 4 :" + face4 + " with a percentage of:" + df.format(facefour) + "%");
            System.out.println("The Face 5 :" + face5 + " with a percentage of:" + df.format(facefive) + "%");
            System.out.println("The Face 6 :" + face6 + " with a percentage of:" + df.format(facesix) + "%");
    }
    
}
