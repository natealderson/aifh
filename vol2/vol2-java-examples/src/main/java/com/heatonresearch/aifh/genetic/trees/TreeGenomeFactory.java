/*
 * Artificial Intelligence for Humans
 * Volume 2: Nature Inspired Algorithms
 * Java Version
 * http://www.aifh.org
 * http://www.jeffheaton.com
 *
 * Code repository:
 * https://github.com/jeffheaton/aifh
 *
 * Copyright 2014 by Jeff Heaton
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For more information on Heaton Research copyrights, licenses
 * and trademarks visit:
 * http://www.heatonresearch.com/copyright
 */
package com.heatonresearch.aifh.genetic.trees;

import com.heatonresearch.aifh.evolutionary.genome.Genome;
import com.heatonresearch.aifh.evolutionary.genome.GenomeFactory;

/**
 * Created with IntelliJ IDEA.
 * User: jheaton
 * Date: 5/4/14
 * Time: 3:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class TreeGenomeFactory implements GenomeFactory {

    private EvaluateTree eval;

    public TreeGenomeFactory(EvaluateTree theEval) {
        this.eval = theEval;
    }

    @Override
    public Genome factor() {
        return new TreeGenome(this.eval);
    }

    @Override
    public Genome factor(final Genome other) {
        TreeGenome result = new TreeGenome(this.eval);
        result.copy(other);
        return result;
    }
}
