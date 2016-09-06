package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardTranslationOfIterator theStandardTranslationOfIterator = (StandardTranslationOfIterator)findAncestorWithClass(this, StandardTranslationOfIterator.class);
			pageContext.getOut().print(theStandardTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

