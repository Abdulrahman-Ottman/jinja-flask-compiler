package FlaskStatement;

public class Attribute extends Expression{
        public  Expression object;
        public  String attribute;

        public Attribute(Expression object, String attribute) {
            this.object = object;
            this.attribute = attribute;
        }


        @Override
        public String toString() {
            return object + "." + attribute;
        }
}
