package edu.uiowa.slis.VIVOISF.Language;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LanguageUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LanguageUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(LanguageUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LanguageUrlIterator theLanguage = (LanguageUrlIterator)findAncestorWithClass(this, LanguageUrlIterator.class);
			pageContext.getOut().print(theLanguage.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Language for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Language for url tag ");
		}
		return SKIP_BODY;
	}
}

