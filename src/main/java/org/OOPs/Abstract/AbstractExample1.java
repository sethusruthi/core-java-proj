package org.OOPs.Abstract;

abstract class ReportGenerator{
    public abstract void generateReport();
}
class ExcelReport extends ReportGenerator{
    @Override
    public void generateReport(){
        System.out.println("Generating excel report");
    }
}
class PdfReport extends ReportGenerator{
    @Override
    public void generateReport(){
        System.out.println("Generating pdf report");
    }
}
class CsvReport extends ReportGenerator{
    @Override
    public void generateReport(){
        System.out.println("Generating csv report");
    }
}
class ImageReport extends ReportGenerator{
    @Override
    public void generateReport(){
        System.out.println("Generating image report");
    }
}

abstract class Ab1{
    abstract void show1();
    abstract void show2();
    void show3(){
        System.out.println("Show3");
    }
}
abstract class Ab2 extends Ab1{
    //since we did not override all the methods from super class after inheriting we made this class also as abstract
    @Override
    void show1() {
        System.out.println("Show1");
    }
}
class Ab3 extends Ab2{
    @Override
    void show2() {
        System.out.println("Show2");
    }
}
public class AbstractExample1 {

    public static void main(String[] args) {

        ReportGenerator r = getReportGenerator(ReportType.IMAGE);
        r.generateReport();
    }
    public static ReportGenerator getReportGenerator(ReportType type){
        return switch (type) {
            case EXCEL -> new ExcelReport();
            case PDF -> new PdfReport();
            case CSV -> new CsvReport();
            case IMAGE -> new ImageReport();
        };
    }
}