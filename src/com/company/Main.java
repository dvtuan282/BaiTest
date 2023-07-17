package com.company;

import java.util.*;

public class Main {
        public static Set<String> demSoLatin(String input) {
//            Bài này em đang sử dụng List có thể sử dụng map để lưu giá trị của từng chuLatin và key cua no
            List<String> chuLatin = new ArrayList<String>();
            chuLatin.add("aw");
            chuLatin.add("aa");
            chuLatin.add("dd");
            chuLatin.add("ee");
            chuLatin.add("oo");
            chuLatin.add("ow");
            chuLatin.add("w");
            int lenght = input.length();
            Set<String> output = new LinkedHashSet<String>();
            for (int i = 0; i < lenght - 1; i++) {
                String chuDuocTao = input.substring(i, i + 2);
                if (chuLatin.contains(chuDuocTao)) {
                    output.add(chuDuocTao);
                    i++; // bỏ qua cặp ký tự vừa tìm thấy
                } else if (chuLatin.contains(String.valueOf(input.charAt(i)))) {
                    output.add(String.valueOf(input.charAt(i)));
                }
            }

            return output;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("INPUT:");
            String input = sc.nextLine();
            Set<String> output = demSoLatin(input);
            System.out.println("Số lượng chữ:" + output.size() + output.toString());
        }


}
