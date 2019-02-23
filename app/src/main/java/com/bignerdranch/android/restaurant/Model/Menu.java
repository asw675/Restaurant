package com.bignerdranch.android.restaurant.Model;

import java.util.List;

public class Menu {

    /**
     * count : 38
     * next : null
     * previous : null
     * results : [{"dishes_number":1,"dishes_name":"小葱拌豆腐","dishes_img":"http://120.78.174.70:8000/dishes/static/1.jpg","dishes_price":3,"dishes_cursine":1,"dishes_taste":1,"dishes_healthy":100,"dishes_hot":1},{"dishes_number":2,"dishes_name":"土豆炖肉","dishes_img":"http://120.78.174.70:8000/dishes/static/2.jpg","dishes_price":5,"dishes_cursine":3,"dishes_taste":2,"dishes_healthy":60,"dishes_hot":0},{"dishes_number":3,"dishes_name":"古老肉","dishes_img":"http://120.78.174.70:8000/dishes/static/3.jpg","dishes_price":5,"dishes_cursine":2,"dishes_taste":3,"dishes_healthy":50,"dishes_hot":0},{"dishes_number":4,"dishes_name":"香酥鸡腿","dishes_img":"http://120.78.174.70:8000/dishes/static/4.jpg","dishes_price":5,"dishes_cursine":3,"dishes_taste":3,"dishes_healthy":30,"dishes_hot":0},{"dishes_number":5,"dishes_name":"枣香小肉","dishes_img":"http://120.78.174.70:8000/dishes/static/5.jpg","dishes_price":5,"dishes_cursine":3,"dishes_taste":3,"dishes_healthy":50,"dishes_hot":0},{"dishes_number":6,"dishes_name":"乡村辣子鸡","dishes_img":"http://120.78.174.70:8000/dishes/static/6.jpg","dishes_price":5,"dishes_cursine":5,"dishes_taste":3,"dishes_healthy":40,"dishes_hot":0},{"dishes_number":7,"dishes_name":"清蒸蛋饺","dishes_img":"http://120.78.174.70:8000/dishes/static/7.jpg","dishes_price":3,"dishes_cursine":1,"dishes_taste":3,"dishes_healthy":80,"dishes_hot":0},{"dishes_number":8,"dishes_name":"清炒鸡片","dishes_img":"http://120.78.174.70:8000/dishes/static/8.jpg","dishes_price":5,"dishes_cursine":2,"dishes_taste":3,"dishes_healthy":70,"dishes_hot":0},{"dishes_number":9,"dishes_name":"土豆烧牛肉","dishes_img":"http://120.78.174.70:8000/dishes/static/9.jpg","dishes_price":6,"dishes_cursine":3,"dishes_taste":3,"dishes_healthy":70,"dishes_hot":1},{"dishes_number":10,"dishes_name":"面拖大排","dishes_img":"http://120.78.174.70:8000/dishes/static/10.jpg","dishes_price":5,"dishes_cursine":3,"dishes_taste":3,"dishes_healthy":40,"dishes_hot":0},{"dishes_number":11,"dishes_name":"梅菜扣肉","dishes_img":"http://120.78.174.70:8000/dishes/static/11.jpg","dishes_price":5,"dishes_cursine":4,"dishes_taste":3,"dishes_healthy":50,"dishes_hot":0},{"dishes_number":12,"dishes_name":"椒盐排条","dishes_img":"http://120.78.174.70:8000/dishes/static/12.jpg","dishes_price":5,"dishes_cursine":5,"dishes_taste":3,"dishes_healthy":30,"dishes_hot":0},{"dishes_number":13,"dishes_name":"酱鸭","dishes_img":"http://120.78.174.70:8000/dishes/static/13.jpg","dishes_price":5,"dishes_cursine":3,"dishes_taste":3,"dishes_healthy":50,"dishes_hot":0},{"dishes_number":14,"dishes_name":"酱鸡腿","dishes_img":"http://120.78.174.70:8000/dishes/static/14.jpg","dishes_price":5,"dishes_cursine":3,"dishes_taste":3,"dishes_healthy":50,"dishes_hot":0},{"dishes_number":15,"dishes_name":"红烧鱼片","dishes_img":"http://120.78.174.70:8000/dishes/static/15.jpg","dishes_price":5,"dishes_cursine":3,"dishes_taste":3,"dishes_healthy":60,"dishes_hot":0},{"dishes_number":16,"dishes_name":"红烧狮子头","dishes_img":"http://120.78.174.70:8000/dishes/static/16.jpg","dishes_price":5,"dishes_cursine":3,"dishes_taste":3,"dishes_healthy":40,"dishes_hot":0},{"dishes_number":17,"dishes_name":"瓜条鸡柳","dishes_img":"http://120.78.174.70:8000/dishes/static/17.jpg","dishes_price":2.5,"dishes_cursine":2,"dishes_taste":3,"dishes_healthy":10,"dishes_hot":0},{"dishes_number":18,"dishes_name":"白菜肉丝","dishes_img":"http://120.78.174.70:8000/dishes/static/18.jpg","dishes_price":3,"dishes_cursine":2,"dishes_taste":2,"dishes_healthy":80,"dishes_hot":0},{"dishes_number":19,"dishes_name":"豆皮肉丝","dishes_img":"http://120.78.174.70:8000/dishes/static/19.jpg","dishes_price":3,"dishes_cursine":3,"dishes_taste":2,"dishes_healthy":70,"dishes_hot":0},{"dishes_number":20,"dishes_name":"番茄炒蛋","dishes_img":"http://120.78.174.70:8000/dishes/static/20.jpg","dishes_price":3,"dishes_cursine":2,"dishes_taste":2,"dishes_healthy":100,"dishes_hot":0},{"dishes_number":21,"dishes_name":"方腿腐竹","dishes_img":"http://120.78.174.70:8000/dishes/static/21.jpg","dishes_price":3,"dishes_cursine":1,"dishes_taste":2,"dishes_healthy":100,"dishes_hot":0},{"dishes_number":22,"dishes_name":"豆干肉丝","dishes_img":"http://120.78.174.70:8000/dishes/static/22.jpg","dishes_price":4,"dishes_cursine":3,"dishes_taste":2,"dishes_healthy":60,"dishes_hot":0},{"dishes_number":23,"dishes_name":"青笋炒肉片","dishes_img":"http://120.78.174.70:8000/dishes/static/23.jpg","dishes_price":4,"dishes_cursine":3,"dishes_taste":2,"dishes_healthy":80,"dishes_hot":0},{"dishes_number":24,"dishes_name":"肉末粉丝","dishes_img":"http://120.78.174.70:8000/dishes/static/24.jpg","dishes_price":3.5,"dishes_cursine":3,"dishes_taste":2,"dishes_healthy":50,"dishes_hot":0},{"dishes_number":25,"dishes_name":"莴笋炒蛋","dishes_img":"http://120.78.174.70:8000/dishes/static/25.jpg","dishes_price":2.5,"dishes_cursine":2,"dishes_taste":2,"dishes_healthy":80,"dishes_hot":0},{"dishes_number":26,"dishes_name":"西芹炒肉","dishes_img":"http://120.78.174.70:8000/dishes/static/26.jpg","dishes_price":3.5,"dishes_cursine":3,"dishes_taste":2,"dishes_healthy":75,"dishes_hot":0},{"dishes_number":27,"dishes_name":"鱼香肉丝","dishes_img":"http://120.78.174.70:8000/dishes/static/27.jpg","dishes_price":4.5,"dishes_cursine":4,"dishes_taste":2,"dishes_healthy":65,"dishes_hot":1},{"dishes_number":28,"dishes_name":"白切鸡","dishes_img":"http://120.78.174.70:8000/dishes/static/28.jpg","dishes_price":5,"dishes_cursine":3,"dishes_taste":3,"dishes_healthy":70,"dishes_hot":0},{"dishes_number":29,"dishes_name":"冬瓜肉片","dishes_img":"http://120.78.174.70:8000/dishes/static/29.jpg","dishes_price":3.5,"dishes_cursine":2,"dishes_taste":2,"dishes_healthy":75,"dishes_hot":0},{"dishes_number":30,"dishes_name":"红烧肉","dishes_img":"http://120.78.174.70:8000/dishes/static/30.jpg","dishes_price":6,"dishes_cursine":4,"dishes_taste":3,"dishes_healthy":50,"dishes_hot":0},{"dishes_number":31,"dishes_name":"猪红","dishes_img":"http://120.78.174.70:8000/dishes/static/31.jpg","dishes_price":2,"dishes_cursine":2,"dishes_taste":2,"dishes_healthy":60,"dishes_hot":0},{"dishes_number":32,"dishes_name":"咖喱土豆","dishes_img":"http://120.78.174.70:8000/dishes/static/32.jpg","dishes_price":3,"dishes_cursine":2,"dishes_taste":1,"dishes_healthy":80,"dishes_hot":0},{"dishes_number":33,"dishes_name":"麻辣豆腐","dishes_img":"http://120.78.174.70:8000/dishes/static/33.jpg","dishes_price":3,"dishes_cursine":5,"dishes_taste":1,"dishes_healthy":60,"dishes_hot":0},{"dishes_number":34,"dishes_name":"三色土豆丝","dishes_img":"http://120.78.174.70:8000/dishes/static/34.jpg","dishes_price":3,"dishes_cursine":2,"dishes_taste":1,"dishes_healthy":80,"dishes_hot":0},{"dishes_number":35,"dishes_name":"酸菜肥肠","dishes_img":"http://120.78.174.70:8000/dishes/static/35.jpg","dishes_price":4.5,"dishes_cursine":3,"dishes_taste":2,"dishes_healthy":60,"dishes_hot":0},{"dishes_number":36,"dishes_name":"蒜香黄豆芽","dishes_img":"http://120.78.174.70:8000/dishes/static/36.jpg","dishes_price":2.5,"dishes_cursine":2,"dishes_taste":1,"dishes_healthy":80,"dishes_hot":0},{"dishes_number":37,"dishes_name":"香辣海带丝","dishes_img":"http://120.78.174.70:8000/dishes/static/37.jpg","dishes_price":2.5,"dishes_cursine":5,"dishes_taste":1,"dishes_healthy":60,"dishes_hot":0},{"dishes_number":38,"dishes_name":"小青菜","dishes_img":"http://120.78.174.70:8000/dishes/static/38.jpg","dishes_price":1,"dishes_cursine":1,"dishes_taste":1,"dishes_healthy":100,"dishes_hot":0}]
     */

    private int count;
    private Object next;
    private Object previous;
    private List<ResultsBean> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = next;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * dishes_number : 1
         * dishes_name : 小葱拌豆腐
         * dishes_img : http://120.78.174.70:8000/dishes/static/1.jpg
         * dishes_price : 3.0
         * dishes_cursine : 1
         * dishes_taste : 1
         * dishes_healthy : 100
         * dishes_hot : 1
         */

        private int dishes_number;
        private String dishes_name;
        private String dishes_img;
        private double dishes_price;
        private int dishes_cursine;
        private int dishes_taste;
        private int dishes_healthy;
        private int dishes_hot;

        public int getDishes_number() {
            return dishes_number;
        }

        public void setDishes_number(int dishes_number) {
            this.dishes_number = dishes_number;
        }

        public String getDishes_name() {
            return dishes_name;
        }

        public void setDishes_name(String dishes_name) {
            this.dishes_name = dishes_name;
        }

        public String getDishes_img() {
            return dishes_img;
        }

        public void setDishes_img(String dishes_img) {
            this.dishes_img = dishes_img;
        }

        public double getDishes_price() {
            return dishes_price;
        }

        public void setDishes_price(double dishes_price) {
            this.dishes_price = dishes_price;
        }

        public int getDishes_cursine() {
            return dishes_cursine;
        }

        public void setDishes_cursine(int dishes_cursine) {
            this.dishes_cursine = dishes_cursine;
        }

        public int getDishes_taste() {
            return dishes_taste;
        }

        public void setDishes_taste(int dishes_taste) {
            this.dishes_taste = dishes_taste;
        }

        public int getDishes_healthy() {
            return dishes_healthy;
        }

        public void setDishes_healthy(int dishes_healthy) {
            this.dishes_healthy = dishes_healthy;
        }

        public int getDishes_hot() {
            return dishes_hot;
        }

        public void setDishes_hot(int dishes_hot) {
            this.dishes_hot = dishes_hot;
        }
    }
}
