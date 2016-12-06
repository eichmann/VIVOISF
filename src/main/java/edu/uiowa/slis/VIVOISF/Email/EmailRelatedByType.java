package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailRelatedByIterator theEmailRelatedByIterator = (EmailRelatedByIterator)findAncestorWithClass(this, EmailRelatedByIterator.class);
			pageContext.getOut().print(theEmailRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

