package alexander.ivanov.jsonsanitizer.type.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.ANNOTATION_TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ComplexField {
    //Class<? extends ComplexType<?>> value();
    //Field<ComplexType<?>> value();
    CommonField value()/*default @CommonField(ComplexType.class)*/;
}
