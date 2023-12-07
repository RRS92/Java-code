package br.edu.ifpe.apoo.negocio;

public class ValidaCPFAdapter implements ICPFValidator {
    @Override
    public boolean isValidCPF(String CPF) {
        return ValidaCPF.isCPF(CPF);
    }
}
