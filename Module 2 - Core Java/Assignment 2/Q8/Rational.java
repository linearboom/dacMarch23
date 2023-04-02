class Rational{
    private int num;
    private int den;

    Rational(int num, int den){
        this.num = num;
        this.den = den;
    }
    Rational(){
        //Empty Contructor
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return this.den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public void reduce(){
        int min = this.num<this.den ? num : den;
        int i = 2; 
        while(i < min){
            if ((this.num % i == 0) && (this.den % i == 0)){
                this.num = this.num / i;
                this.den = this.den / i;
                continue;
            }else{
                i++;
            }
        }
    }

    public String toString(){
        return String.valueOf(this.num) +"\n" +"--" +  "\n" + String.valueOf(this.den);
    }
   } 
