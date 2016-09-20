package edu.uiowa.slis.VIVOISF.Language;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LanguageHasLanguageInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LanguageHasLanguageInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LanguageHasLanguageInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LanguageHasLanguageInverseIterator theLanguageHasLanguageInverseIterator = (LanguageHasLanguageInverseIterator)findAncestorWithClass(this, LanguageHasLanguageInverseIterator.class);
			pageContext.getOut().print(theLanguageHasLanguageInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Language for hasLanguage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Language for hasLanguage tag ");
		}
		return SKIP_BODY;
	}
}

