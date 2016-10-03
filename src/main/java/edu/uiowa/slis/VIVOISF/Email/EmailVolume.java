package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailVolumeIterator theEmail = (EmailVolumeIterator)findAncestorWithClass(this, EmailVolumeIterator.class);
			pageContext.getOut().print(theEmail.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for volume tag ");
		}
		return SKIP_BODY;
	}
}

