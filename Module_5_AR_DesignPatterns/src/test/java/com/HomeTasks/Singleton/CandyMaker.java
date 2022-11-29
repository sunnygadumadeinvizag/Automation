package com.HomeTasks.Singleton;

    public class CandyMaker {

        private static CandyMaker candyMaker=null;
        private boolean empty;
        private boolean boiled;

        private CandyMaker() {
            if(candyMaker!=null)
                throw new RuntimeException("Not correct way of calling me");
            empty = true;
            boiled = false;
        }

        public static CandyMaker getInstance(){
            if(candyMaker==null){
                synchronized (CandyMaker.class){
                    if(candyMaker==null)
                        candyMaker=new CandyMaker();
                }

            }
            return  candyMaker;
        }

        public void fill() {
            if (isEmpty()) {
                empty = false;
                boiled = false;

            }
        }

        public void drain() {
            if (!isEmpty() && isBoiled()) {

                empty = true;
            }
        }


        public void boil() {
            if (!isEmpty() && !isBoiled()) {

                boiled = true;
            }
        }

        public boolean isEmpty() {
            return empty;
        }

        public boolean isBoiled() {
            return boiled;
        }
    }

