package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardTranslationOfIterator theStandardTranslationOfIterator = (StandardTranslationOfIterator)findAncestorWithClass(this, StandardTranslationOfIterator.class);
			pageContext.getOut().print(theStandardTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

