package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardTranslatorIterator theStandardTranslatorIterator = (StandardTranslatorIterator)findAncestorWithClass(this, StandardTranslatorIterator.class);
			pageContext.getOut().print(theStandardTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for translator tag ");
		}
		return SKIP_BODY;
	}
}

