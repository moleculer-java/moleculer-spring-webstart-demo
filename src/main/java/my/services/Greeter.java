/**
 * THIS SOFTWARE IS LICENSED UNDER MIT LICENSE.<br>
 * <br>
 * Copyright 2019 Andras Berkes [andras.berkes@programmer.net]<br>
 * Based on Moleculer Framework for NodeJS [https://moleculer.services].
 * <br><br>
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:<br>
 * <br>
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.<br>
 * <br>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package my.services;

import org.springframework.stereotype.Controller;

import services.moleculer.service.Action;
import services.moleculer.service.Name;
import services.moleculer.service.Service;

/**
 * Simple Moleculer Service. This service is called by the
 * "my.commands.HelloCommand.java" (a custom, user-defined console command). URL
 * of this sample (when running the example on a local Netty server):<br>
 * <br>
 * http://localhost:3000/greeter.html
 */
@Name("greeter")
@Controller
public class Greeter extends Service {

	/**
	 * Simple action. Sample client-side code:
	 * 
	 * <pre>
	 * broker.call("greeter.hello", "name", "Tom").then(rsp -&gt; {
	 * 	logger.info(rsp.asString());
	 * });
	 * </pre>
	 */
	@Name("hello")
	public Action helloAction = ctx -> {
		return "Hello " + ctx.params.get("name", "Anonymous");
	};

}