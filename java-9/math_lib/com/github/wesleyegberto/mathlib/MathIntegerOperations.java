package com.github.wesleyegberto.mathlib;

import com.github.wesleyegberto.mathlib.impl.*;

/**
 * We can expose our implementation using a exported public interface
 */
public class MathIntegerOperations {
	public Operation<Integer, Integer> getAdditionOperation() {
		return new AdditionOperation();
	}

	public Operation<Integer, Integer> getSubtractionOperation() {
		return new SubtractionOperation();
	}
}