package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailInformationResourceSupportedByIterator theEmailInformationResourceSupportedByIterator = (EmailInformationResourceSupportedByIterator)findAncestorWithClass(this, EmailInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theEmailInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

