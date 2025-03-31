package JavaConversion;

public class ObjToString {
    public static void main(String[] args) {
        Object obj = "Arjun";
        String str = String.valueOf(obj);
        System.out.println(str);
    }
}

//Yes! ✅ You have correctly converted an `Object` to a `String` in your Java code. Here's why:



//```
//        ### **Why This Works?**
//        - `obj` holds a `String` (`"Arjun"`), but it's declared as `Object`.
//        - `String.valueOf(obj)` internally calls `obj.toString()`, which works fine because `obj` is already a `String`.
//        - So, `str` correctly holds `"Arjun"` and prints it.
//
//### **Alternative Ways to Convert Object to String**
//        #### **1. Using `toString()` Method**
//        ```java
//String str = obj.toString();
//```
//        ✔ Works if `obj` is not `null`
//        ❌ Throws `NullPointerException` if `obj` is `null`.
//
//        #### **2. Using Type Casting**
//        ```java
//String str = (String) obj;
//```
//        ✔ Works because `obj` is actually a `String` at runtime.
//        ❌ Throws `ClassCastException` if `obj` is not a `String`.
//
//        #### **3. Using `Objects.toString()` (Safe for `null`)**
//        ```java
//import java.util.Objects;
//String str = Objects.toString(obj, "default value");
//```
//        ✔ **Handles `null` safely** – returns `"default value"` if `obj` is `null`.
//
//        ### **Conclusion**
//Your approach using `String.valueOf(obj)` is ✅ **safe and correct** because:
//        - It handles `null` (returns `"null"` instead of throwing an exception).
//        - It correctly converts an object to a `String`.
//
//Great job! 🚀 Let me know if you have any other questions! 😊