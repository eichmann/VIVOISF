package edu.uiowa.slis.VIVOISF.Definition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DefinitionTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DefinitionTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(DefinitionTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DefinitionTranslatorIterator theDefinitionTranslatorIterator = (DefinitionTranslatorIterator)findAncestorWithClass(this, DefinitionTranslatorIterator.class);
			pageContext.getOut().print(theDefinitionTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Definition for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Definition for translator tag ");
		}
		return SKIP_BODY;
	}
}

