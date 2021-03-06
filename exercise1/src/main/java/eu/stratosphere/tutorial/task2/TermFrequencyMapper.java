/***********************************************************************************************************************
 *
 * Copyright (C) 2013 by the Stratosphere project (http://stratosphere.eu)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 **********************************************************************************************************************/
package eu.stratosphere.tutorial.task2;

import eu.stratosphere.pact.common.stubs.Collector;
import eu.stratosphere.pact.common.stubs.MapStub;
import eu.stratosphere.pact.common.type.PactRecord;

/**
 * This mapper computes the term frequency for each term in a document.
 * <p>
 * The term frequency of a term in a document is the number of times the term occurs in the respective document. If a
 * document contains a term three times, the term has a term frequency of 3 (for this document).
 * <p>
 * Example:
 * 
 * <pre>
 * Document 1: "Big Big Big Data"
 * Document 2: "Hello Big Data"
 * </pre>
 * 
 * The term frequency of "Big" in document 1 is 3 and 1 in document 2.
 * <p>
 * The map method will be called independently for each document.
 */
public class TermFrequencyMapper extends MapStub {

	// ----------------------------------------------------------------------------------------------------------------

	/**
	 * Splits the document into terms and emits a PactRecord (docId, term, tf) for each term of the document.
	 * <p>
	 * Each input document has the format "docId, document contents".
	 */
	@Override
	public void map(PactRecord record, Collector<PactRecord> collector) {
		// Implement your solution here
	}
}