/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.parser.antlr;

import java.util.Collections;
import java.util.Map;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
public class NullTokenDefProvider implements ITokenDefProvider {

	public Map<Integer, String> getTokenDefMap() {
		return Collections.emptyMap();
	}

}
