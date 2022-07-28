/*
 * Copyright 2022 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.reportportal.junit5.features.skipped;

import com.epam.reportportal.junit5.AssumptionsTest;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(AssumptionsTest.AssumptionsTestExtension.class)
public class BeforeEachAssumptionFailedTest {

	@BeforeEach
	public void setup() {
		//noinspection ConstantConditions
		Assumptions.assumeFalse(true, "Test failed assumption");
	}

	@Test
	public void testBeforeEachAssumptionFailed() {
	}
}
