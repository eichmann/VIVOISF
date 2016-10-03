package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmailFeaturesIterator theEmailFeaturesIterator = (EmailFeaturesIterator)findAncestorWithClass(this, EmailFeaturesIterator.class);
			pageContext.getOut().print(theEmailFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for features tag ");
		}
		return SKIP_BODY;
	}
}

