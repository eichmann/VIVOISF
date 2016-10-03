package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailFeaturesIterator theEmailFeaturesIterator = (EmailFeaturesIterator)findAncestorWithClass(this, EmailFeaturesIterator.class);
			pageContext.getOut().print(theEmailFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for features tag ");
		}
		return SKIP_BODY;
	}
}

