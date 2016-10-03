package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailHasTranslationIterator theEmailHasTranslationIterator = (EmailHasTranslationIterator)findAncestorWithClass(this, EmailHasTranslationIterator.class);
			pageContext.getOut().print(theEmailHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

