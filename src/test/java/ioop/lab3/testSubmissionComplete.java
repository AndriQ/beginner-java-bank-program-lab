package ioop.lab3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class testSubmissionComplete {
    BankAccount ba = new BankAccount("Natwest", "Bob Smith", "Mr", 0);

    private static final ArrayList<String> BANKACCOUNT_METHOD_NAMES = new ArrayList<>(Arrays.asList(
            "processTransaction", "checkBank", "checkTitle", "checkTwoNames",
            "checkName", "getBank", "setBank", "getAccountHolderTitle",
            "setAccountHolderTitle", "getBalance", "setBalance", "getAccountHolderName",
            "setAccountHolderName", "getHighestStoredAmount"));

    private static final ArrayList<String> CREDITACCOUNT_METHOD_NAMES = new ArrayList<>(Arrays.asList(
            "processTransaction"));

    private static final ArrayList<String> BANK_METHOD_NAMES = new ArrayList<>(Arrays.asList(
            "handleTransaction", "addBankAccount", "removeBankAccount", "findIndexOfAccount", "getBankAccounts"));

    private static final ArrayList<String> CHILDRENSACCOUNT_METHOD_NAMES = new ArrayList<>(Arrays.asList(
            "processTransaction"));

    private static final ArrayList<String> DEBITACCOUNT_METHOD_NAMES = new ArrayList<>(Arrays.asList(
            "processTransaction"));

    private static final ArrayList<String> ACCOUNTMANAGEMENT_METHOD_NAMES = new ArrayList<>(Arrays.asList(
            "printFormattedAccount", "padLine", "fraudDetected"));

    private static final ArrayList<String> FIELD_NAMES = new ArrayList<>(Arrays.asList(
            "bank", "accountHolderName", "accountHolderTitle", "balance", "highestStoredAmount"));

    @Test
    public void testBankAccountHasCorrectMethods() {
        boolean flag = false;
        for (Method m : BankAccount.class.getDeclaredMethods()) {
            if (!BANKACCOUNT_METHOD_NAMES.contains(m.getName())) {
                if (m.getName().equals("main")) {
                    // Okay, fine
                } else if (Modifier.isPrivate(m.getModifiers())) {
                    // Also fine
                } else {
                    System.out.println("Unexpected method " + m.getName());
                    flag = true;
                }
            } else {
                BANKACCOUNT_METHOD_NAMES.remove(m.getName());
            }
        }
        if (!BANKACCOUNT_METHOD_NAMES.isEmpty()) {
            System.out.println("Method(s) missing from Monster: " + BANKACCOUNT_METHOD_NAMES);
            flag = true;
        }
        assertFalse(flag);
    }

    @Test
    public void testBankHasCorrectMethods() {
        boolean flag = false;
        for (Method m : Bank.class.getDeclaredMethods()) {
            if (!BANK_METHOD_NAMES.contains(m.getName())) {
                if (m.getName().equals("main")) {
                    // Okay, fine
                } else if (Modifier.isPrivate(m.getModifiers())) {
                    // Also fine
                } else {
                    System.out.println("Unexpected method " + m.getName());
                    flag = true;
                }
            } else {
                BANK_METHOD_NAMES.remove(m.getName());
            }
        }
        if (!BANK_METHOD_NAMES.isEmpty()) {
            System.out.println("Method(s) missing from Bank: " + BANK_METHOD_NAMES);
            flag = true;
        }
        assertFalse(flag);
    }

    @Test
    public void testCreditAccountHasCorrectMethods() {
        boolean flag = false;
        for (Method m : CreditAccount.class.getDeclaredMethods()) {
            if (!CREDITACCOUNT_METHOD_NAMES.contains(m.getName())) {
                if (m.getName().equals("main")) {
                    // Okay, fine
                } else if (Modifier.isPrivate(m.getModifiers())) {
                    // Also fine
                } else {
                    System.out.println("Unexpected method " + m.getName());
                    flag = true;
                }
            } else {
                CREDITACCOUNT_METHOD_NAMES.remove(m.getName());
            }
        }
        if (!CREDITACCOUNT_METHOD_NAMES.isEmpty()) {
            System.out.println("Method(s) missing from CreditAccount: " + BANKACCOUNT_METHOD_NAMES);
            flag = true;
        }
        assertFalse(flag);
    }

    @Test
    public void testDebitAccountHasCorrectMethods() {
        boolean flag = false;
        for (Method m : DebitAccount.class.getDeclaredMethods()) {
            if (!CREDITACCOUNT_METHOD_NAMES.contains(m.getName())) {
                if (m.getName().equals("main")) {
                    // Okay, fine
                } else if (Modifier.isPrivate(m.getModifiers())) {
                    // Also fine
                } else {
                    System.out.println("Unexpected method " + m.getName());
                    flag = true;
                }
            } else {
                DEBITACCOUNT_METHOD_NAMES.remove(m.getName());
            }
        }
        if (!DEBITACCOUNT_METHOD_NAMES.isEmpty()) {
            System.out.println("Method(s) missing from DebitAccount: " + BANKACCOUNT_METHOD_NAMES);
            flag = true;
        }
        assertFalse(flag);
    }

    @Test
    public void testAccountManagmentHasCorrectMethods() {
        boolean flag = false;
        for (Method m : AccountManagement.class.getDeclaredMethods()) {
            if (!ACCOUNTMANAGEMENT_METHOD_NAMES.contains(m.getName())) {
                if (m.getName().equals("main")) {
                    // Okay, fine
                } else if (Modifier.isPrivate(m.getModifiers())) {
                    // Also fine
                } else {
                    System.out.println("Unexpected method " + m.getName());
                    flag = true;
                }
            } else {
                ACCOUNTMANAGEMENT_METHOD_NAMES.remove(m.getName());
            }
        }
        if (!ACCOUNTMANAGEMENT_METHOD_NAMES.isEmpty()) {
            System.out.println("Method(s) missing from DebitAccount: " + ACCOUNTMANAGEMENT_METHOD_NAMES);
            flag = true;
        }
        assertFalse(flag);
    }

    @Test
    public void testChildrensAccountHasCorrectMethods() {
        boolean flag = false;
        for (Method m : DebitAccount.class.getDeclaredMethods()) {
            if (!CHILDRENSACCOUNT_METHOD_NAMES.contains(m.getName())) {
                if (m.getName().equals("main")) {
                    // Okay, fine
                } else if (Modifier.isPrivate(m.getModifiers())) {
                    // Also fine
                } else {
                    System.out.println("Unexpected method " + m.getName());
                    flag = true;
                }
            } else {
                CHILDRENSACCOUNT_METHOD_NAMES.remove(m.getName());
            }
        }
        if (!CHILDRENSACCOUNT_METHOD_NAMES.isEmpty()) {
            System.out.println("Method(s) missing from ChildrensAccount: " + CHILDRENSACCOUNT_METHOD_NAMES);
            flag = true;
        }
        assertFalse(flag);
    }

    @Test
    public void testBankAccountHasCorrectFields() {
        List<Field> foundFields = new ArrayList<>();
        for (Field f : BankAccount.class.getDeclaredFields()) {
            if (!FIELD_NAMES.contains(f.getName())) {
                Assert.fail("Unexpected field in BankAccount: " + f.getName());
            } else {
                foundFields.add(f);
                FIELD_NAMES.remove(f.getName());
            }
        }
        if (!FIELD_NAMES.isEmpty()) {
            Assert.fail("Field(s) missing from BankAccount: " + FIELD_NAMES);
        }

        List<String> notPrivateFields = new LinkedList<>();
        for (Field f : foundFields) {
            if (!Modifier.isPrivate(f.getModifiers())) {
                notPrivateFields.add(f.getName());
            }
        }

    }

    private boolean testBankAccountMethodSignature(String methodName, Class<?>[] paramTypes, Class<?> returnType) {
        try {
            Method m = BankAccount.class.getDeclaredMethod(methodName, paramTypes);
            if (!Modifier.isPublic(m.getModifiers())) {
                return false;
            }
            if (!m.getReturnType().equals(returnType)) {
                return false;
            }
            return true;
        } catch (NoSuchMethodException e) {
            return false; // Updated based on the method definition to correctly handle exception
        }
    }

    private boolean testAccountManagementMethodSignature(String methodName, Class<?>[] parameterTypes,
            Class<?> returnType) {
        try {
            Method method = AccountManagement.class.getDeclaredMethod(methodName, parameterTypes);
            return method.getReturnType().equals(returnType);
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

    @Test
    public void testBankMethodSignaturesCorrect() {
        List<String> wrongMethods = new LinkedList<>();

        // Test the handleTransaction method signature in Bank class
        if (!testBankMethodSignature(Bank.class, "handleTransaction",
                new Class[] { BankAccount.class, double.class, char.class }, void.class)) {
            wrongMethods.add("handleTransaction");
        }

        // Test the addBankAccount method signature in Bank class
        if (!testBankMethodSignature(Bank.class, "addBankAccount", new Class[] { BankAccount.class }, void.class)) {
            wrongMethods.add("addBankAccount");
        }

        // Test the removeBankAccount method signature in Bank class
        if (!testBankMethodSignature(Bank.class, "removeBankAccount", new Class[] { BankAccount.class }, void.class)) {
            wrongMethods.add("removeBankAccount");
        }

        // Test the findIndexOfAccount method signature in Bank class
        if (!testBankMethodSignature(Bank.class, "findIndexOfAccount", new Class[] { BankAccount.class }, int.class)) {
            wrongMethods.add("findIndexOfAccount");
        }

        // Test the getBankAccounts method signature in Bank class
        if (!testBankMethodSignature(Bank.class, "getBankAccounts", new Class[] {}, BankAccount[].class)) {
            wrongMethods.add("getBankAccounts");
        }

        // Check if any methods have incorrect signatures
        assertTrue("Methods with incorrect signatures: " + wrongMethods.toString(), wrongMethods.isEmpty());
    }

    @Test
    public void testBankAccountMethodSignaturesCorrect() {
        List<String> wrongMethods = new LinkedList<>();
        // Test the processTransaction method signature
        if (!testBankAccountMethodSignature("processTransaction", new Class[] { char.class, double.class },
                double.class)) {
            wrongMethods.add("processTransaction");
        }

        // Test the checkBank method signature
        if (!testBankAccountMethodSignature("checkBank", new Class[] { String.class }, boolean.class)) {
            wrongMethods.add("checkBank");
        }

        // Test the checkTitle method signature
        if (!testBankAccountMethodSignature("checkTitle", new Class[] { String.class }, boolean.class)) {
            wrongMethods.add("checkTitle");
        }

        // Test the checkTwoNames method signature
        if (!testBankAccountMethodSignature("checkTwoNames", new Class[0], boolean.class)) {
            wrongMethods.add("checkTwoNames");
        }

        // Test the checkName method signature
        if (!testBankAccountMethodSignature("checkName", new Class[] { String.class }, boolean.class)) {
            wrongMethods.add("checkName");
        }

        // Test getters and setters
        if (!testBankAccountMethodSignature("getBank", new Class[0], String.class)) {
            wrongMethods.add("getBank");
        }

        if (!testBankAccountMethodSignature("setBank", new Class[] { String.class }, void.class)) {
            wrongMethods.add("setBank");
        }

        if (!testBankAccountMethodSignature("getAccountHolderTitle", new Class[0], String.class)) {
            wrongMethods.add("getAccountHolderTitle");
        }

        if (!testBankAccountMethodSignature("setAccountHolderTitle", new Class[] { String.class }, void.class)) {
            wrongMethods.add("setAccountHolderTitle");
        }

        if (!testBankAccountMethodSignature("getBalance", new Class[0], double.class)) {
            wrongMethods.add("getBalance");
        }

        if (!testBankAccountMethodSignature("setBalance", new Class[] { double.class }, void.class)) {
            wrongMethods.add("setBalance");
        }

        if (!testBankAccountMethodSignature("getAccountHolderName", new Class[0], String.class)) {
            wrongMethods.add("getAccountHolderName");
        }

        if (!testBankAccountMethodSignature("setAccountHolderName", new Class[] { String.class }, void.class)) {
            wrongMethods.add("setAccountHolderName");
        }

        // Output or handle the wrong method signatures
        if (!wrongMethods.isEmpty()) {
            System.out.println("Methods with wrong signatures: " + wrongMethods);
            Assert.fail("Incorrect method declaration(s): " + wrongMethods.toString());
        } else {
            System.out.println("All method signatures are correct!");
        }
    }

    @Test
    public void testDebitAccountMethodSignaturesCorrect() {
        List<String> wrongMethods = new LinkedList<>();

        // Test the constructor signature in DebitAccount class
        if (!testDebitConstructorSignature(DebitAccount.class,
                new Class[] { String.class, String.class, String.class, double.class })) {
            wrongMethods.add("DebitAccount constructor");
        }

        // Test the processTransaction method signature in DebitAccount class
        if (!testDebitMethodSignature(DebitAccount.class, "processTransaction",
                new Class[] { char.class, double.class }, double.class)) {
            wrongMethods.add("processTransaction");
        }

        // Check if any methods or constructors have incorrect signatures
        assertTrue("Methods or constructors with incorrect signatures: " + wrongMethods.toString(),
                wrongMethods.isEmpty());
    }

    @Test
    public void testCreditAccountMethodSignaturesCorrect() {
        List<String> wrongMethods = new LinkedList<>();

        // Test the constructor signature in CreditAccount class
        if (!testCreditConstructorSignature(CreditAccount.class,
                new Class[] { String.class, String.class, String.class, double.class, double.class })) {
            wrongMethods.add("CreditAccount constructor");
        }

        // Test the processTransaction method signature in CreditAccount class
        if (!testCreditMethodSignature(CreditAccount.class, "processTransaction",
                new Class[] { char.class, double.class }, double.class)) {
            wrongMethods.add("processTransaction");
        }

        // Check if any methods or constructors have incorrect signatures
        assertTrue("Methods or constructors with incorrect signatures: " + wrongMethods.toString(),
                wrongMethods.isEmpty());
    }

    @Test
    public void testChildrensAccountMethodSignaturesCorrect() {
        List<String> wrongMethods = new LinkedList<>();

        // Test the constructor signature in ChildrensAccount class
        if (!testConstructorSignature(ChildrensAccount.class,
                new Class[] { String.class, String.class, String.class, double.class, double.class })) {
            wrongMethods.add("Constructor");
        }

        // Test the processTransaction method signature in ChildrensAccount class
        if (!testMethodSignature(ChildrensAccount.class, "processTransaction", new Class[] { char.class, double.class },
                double.class)) {
            wrongMethods.add("processTransaction");
        }

        // Check if any methods have incorrect signatures
        assertTrue("Methods with incorrect signatures: " + wrongMethods.toString(), wrongMethods.isEmpty());
    }

    @Test
    public void testAccountManagementMethodSignaturesCorrect() {
        List<String> wrongMethods = new LinkedList<>();

        // Test the printFormattedAccount method signature
        if (!testAccountManagementMethodSignature("printFormattedAccount", new Class[] { BankAccount.class },
                void.class)) {
            wrongMethods.add("printFormattedAccount");
        }

        // Test the fraudDetected method signature
        if (!testAccountManagementMethodSignature("fraudDetected", new Class[] { BankAccount.class, double.class },
                boolean.class)) {
            wrongMethods.add("fraudDetected");
        }

        // Check if any methods have incorrect signatures
        assertTrue("Methods with incorrect signatures: " + wrongMethods.toString(), wrongMethods.isEmpty());
    }

    private boolean testCreditConstructorSignature(Class<?> clazz, Class<?>[] parameterTypes) {
        try {
            clazz.getDeclaredConstructor(parameterTypes);
            return true;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

    private boolean testCreditMethodSignature(Class<?> clazz, String methodName, Class<?>[] parameterTypes,
            Class<?> returnType) {
        try {
            Method method = clazz.getDeclaredMethod(methodName, parameterTypes);
            return method.getReturnType().equals(returnType);
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

    private boolean testDebitConstructorSignature(Class<?> clazz, Class<?>[] parameterTypes) {
        try {
            clazz.getDeclaredConstructor(parameterTypes);
            return true;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

    private boolean testDebitMethodSignature(Class<?> clazz, String methodName, Class<?>[] parameterTypes,
            Class<?> returnType) {
        try {
            Method method = clazz.getDeclaredMethod(methodName, parameterTypes);
            return method.getReturnType().equals(returnType);
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

    private boolean testConstructorSignature(Class<?> clazz, Class<?>[] parameterTypes) {
        try {
            clazz.getDeclaredConstructor(parameterTypes);
            return true;
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

    private boolean testMethodSignature(Class<?> clazz, String methodName, Class<?>[] parameterTypes,
            Class<?> returnType) {
        try {
            Method method = clazz.getDeclaredMethod(methodName, parameterTypes);
            return method.getReturnType().equals(returnType);
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

    private boolean testBankMethodSignature(Class<?> clazz, String methodName, Class<?>[] parameterTypes,
            Class<?> returnType) {
        try {
            Method method = clazz.getDeclaredMethod(methodName, parameterTypes);
            return method.getReturnType().equals(returnType);
        } catch (NoSuchMethodException e) {
            return false;
        }
    }

}
