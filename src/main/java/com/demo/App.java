package com.demo;

public class App {

    // ❌ Intentionally hardcoded secret for Gitleaks demo
    private static final String AWS_SECRET =
            "AKIA1234567890SECRETKEY";
    // DEMO SECRET - DO NOT USE IN REAL CODE
    private static final String AWS_ACCESS_KEY_ID =
            "AKIAIOSFODNN7EXAMPLE";

    public static void main(String[] args) {
        System.out.println("Hello GitHub Actions Security Demo!");
    }
}
