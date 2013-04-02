/*
 * Copyright 2011-2012 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.shell.converters;

import java.util.List;

import org.springframework.shell.converter.Converter;
import org.springframework.shell.core.Completion;
import org.springframework.shell.core.MethodTarget;
import org.springframework.stereotype.Component;

/**
 * {@link Converter} for {@link Float}.
 *
 * @author Stefan Schmidt
 * @since 1.0
 */
@Component
public class FloatConverter implements Converter<Float> {

	public Float convertFromText(final String value, final Class<?> requiredType, final String optionContext) {
		return new Float(value);
	}

	public boolean getAllPossibleValues(final List<Completion> completions, final Class<?> requiredType, final String existingData, final String optionContext, final MethodTarget target) {
		return false;
	}

	public boolean supports(final Class<?> requiredType, final String optionContext) {
		return Float.class.isAssignableFrom(requiredType) || float.class.isAssignableFrom(requiredType);
	}
}