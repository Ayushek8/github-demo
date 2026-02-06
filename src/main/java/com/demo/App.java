package com.demo;

public class App {

    // ❌ Intentionally hardcoded secret for Gitleaks demo
    private static final String AWS_SECRET =
            "AKIA1234567890SECRETKEY";

    public static void main(String[] args) {
        System.out.println("Hello GitHub Actions Security Demo!");
    }
}
