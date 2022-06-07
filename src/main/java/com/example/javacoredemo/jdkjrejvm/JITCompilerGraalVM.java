package com.example.javacoredemo.jdkjrejvm;

public class JITCompilerGraalVM {

//    normal compiler: $ java -XX:+UnlockExperimentalVMOptions -XX:+EnableJVMCI -XX:-UseJVMCICompiler
//    enable GraalVM compiler: $ java -XX:+UnlockExperimentalVMOptions -XX:+EnableJVMCI -XX:+UseJVMCICompiler

//     Count Uppercase
        static final int ITERATIONS = Math.max(Integer.getInteger("iterations", 1), 1);

        public void countUppercase(String args) {

            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Demo JIT compiler....");

            String sentence = String.join(" ", args);
            for (int iter = 0; iter < ITERATIONS; iter++) {
                if (ITERATIONS != 1) {
                    System.out.println("-- iteration " + (iter + 1) + " --");
                }
                long total = 0, start = System.currentTimeMillis(), last = start;
                for (int i = 1; i < 10_000_000; i++) {
                    total += sentence
                            .chars()
                            .filter(Character::isUpperCase)
                            .count();
                    if (i % 1_000_000 == 0) {
                        long now = System.currentTimeMillis();
                        System.out.printf("%d (%d ms)%n", i / 1_000_000, now - last);
                        last = now;
                    }
                }
                System.out.printf("total: %d (%d ms)%n", total, System.currentTimeMillis() - start);
            }
        }
}
