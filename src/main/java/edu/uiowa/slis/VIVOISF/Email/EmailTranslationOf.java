package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailTranslationOfIterator theEmailTranslationOfIterator = (EmailTranslationOfIterator)findAncestorWithClass(this, EmailTranslationOfIterator.class);
			pageContext.getOut().print(theEmailTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

