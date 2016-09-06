package edu.uiowa.slis.VIVOISF.Definition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DefinitionRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DefinitionRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(DefinitionRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DefinitionRO_0000056Iterator theDefinitionRO_0000056Iterator = (DefinitionRO_0000056Iterator)findAncestorWithClass(this, DefinitionRO_0000056Iterator.class);
			pageContext.getOut().print(theDefinitionRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Definition for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Definition for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

