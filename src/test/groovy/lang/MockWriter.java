/*
 * Copyright 2003-2011 the original author or authors.
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
 */
package groovy.lang;

/**
 * A mock class for testing writer based code
 *
 * @author <a href="mailto:james@coredevelopers.net">James Strachan</a>
 * @version $Revision$
 */
public class MockWriter {

    private String output;

    public String getOutput() {
        String answer = output;
        output = null;
        return answer;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public void println() {
        setOutput("println()");
    }

    public void println(Object object) {
        setOutput("println(" + object + ")");
    }

    public void print(Object object) {
        setOutput("print(" + object + ")");
    }
}
