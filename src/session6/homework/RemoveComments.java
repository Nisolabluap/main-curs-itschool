package session6.homework;

public class RemoveComments {

    public static void main(String[] args) {
        String myString = "//sadasdasd\n/*asadasd dasdasd */ SOME/* some text2 */ TEXT //Comment to remove \nSOME TEXT2\nSOME TEXT3/* delete*/\nSOME TEXT4";
        StringBuilder stringBuilder = new StringBuilder(myString);

        String result = stringBuilder.toString().replaceAll("//[^\\n]*", "");
        System.out.println(result);
        System.out.println();
        String withoutBlockComments = result.replaceAll("/\\*.*?\\*/", "");
        System.out.println(withoutBlockComments.trim());
    }
}