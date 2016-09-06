package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardTranslatorIterator theStandardTranslatorIterator = (StandardTranslatorIterator)findAncestorWithClass(this, StandardTranslatorIterator.class);
			pageContext.getOut().print(theStandardTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for translator tag ");
		}
		return SKIP_BODY;
	}
}

