package org.example;

public class Array {
        public int[] items;
        public int count = 0;


        private int index = 0;
        public Array(int length){
            items = new int[length];
        }

        public void print(){
            for(int i=0; i<this.count; i++){
                System.out.println(items[i]);
            }
        }

       public void insert(int value){
           if(items.length == count) {
               int[] newArray = new int[count*2];
               for(int i = 0; i<this.count; i++){
                   newArray[i] = items[i];
               }
               this.items = newArray;
           }
           this.items[this.count++] = value;
       }

       public void removeAt(int index){
            if(index < 0 || index >= count){
                throw new IllegalArgumentException();
            }
            for(int i = index; i<count-1; i++){
                this.items[i] = this.items[i+1];
            }
            this.items[count-1] = 0;
            count--;
       }

       public int indexOf(int searchValue){
            for(int i=0; i<this.count;i++){
                if(this.items[i] == searchValue){
                    return i;
                }
            }
            return -1;
       }

       public int returnMax(){
            int max = this.items[0];
            for(int i=1; i<this.count; i++){
                if(this.items[i] > max){
                    max = this.items[i];
                }
            }
            return max;
       }

       public void intersection(int[] secondArray){
            int[] result = new int[count];
            int index = 0;
            for(int i=0; i<secondArray.length; i++){
                for(int j=0; j<count; j++){
                    if(secondArray[i] == items[j]){
                        System.out.println(items[j]);
                    }
                }
            }
       }

        public void reverse(){
            int start = 0;
            int end = count-1;
            int temp = 0;
            while(start <end){
                temp = this.items[start];
                items[start] = items[end];
                items[end] = temp;
                start++;
                end--;
            }
            this.print();
        }

        public void insertAt(int value, int index){
            this.insert(items[count-1]);
            for(int i = count-1; i>index; i--){
                 items[i] = items[i-1];
            }
            items[index] = value;
        }

}

