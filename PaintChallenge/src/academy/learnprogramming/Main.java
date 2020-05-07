package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(getBucketCount(3., 6.45, 2.22, 10));
        System.out.println(getBucketCount(0.75, 0.75, 0.5));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        int needBuyBucket=0;
        double areatoPaint=0;
        if(width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0 ){ return -1;}
        else{
            areatoPaint=height*width;
            System.out.println(areatoPaint);
            System.out.println(areatoPaint/areaPerBucket);
            System.out.println(Math.round(areatoPaint/areaPerBucket));
            System.out.println(Math.round(areatoPaint/areaPerBucket)-(areatoPaint/areaPerBucket));
            if(Math.round(areatoPaint/areaPerBucket)-(areatoPaint/areaPerBucket)<0){
                needBuyBucket = (int)Math.round(areatoPaint/areaPerBucket-extraBuckets) +1;
                System.out.println(needBuyBucket);

            }else{needBuyBucket = (int)Math.round(areatoPaint/areaPerBucket-extraBuckets);
                }
            return  needBuyBucket;

        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        int needBuyBucket=0;
        double areatoPaint=0;
        if(width<=0 || height<=0 || areaPerBucket<=0){ return -1;}
        else{
            areatoPaint=height*width;
            needBuyBucket = (int)Math.round(areatoPaint/areaPerBucket);

            if(areatoPaint%areaPerBucket<0.5){
                needBuyBucket = (int)Math.round(areatoPaint/areaPerBucket) +1;

            }else{needBuyBucket = (int)Math.round(areatoPaint/areaPerBucket);}
            return  needBuyBucket;

        }
    }

    public static int getBucketCount(double area, double areaPerBucket){
        int needBuyBucket=0;
        double areatoPaint=0;
        if(area<=0 || areaPerBucket<=0){ return -1;}
        else{
            if(area%areaPerBucket<0.5){
                needBuyBucket = (int)Math.round(area/areaPerBucket) +1;

            }else{
                needBuyBucket = (int)Math.round(area/areaPerBucket);}
            return  needBuyBucket;

        }
    }



}
