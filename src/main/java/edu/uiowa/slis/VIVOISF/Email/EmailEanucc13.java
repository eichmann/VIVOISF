package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailEanucc13Iterator theEmail = (EmailEanucc13Iterator)findAncestorWithClass(this, EmailEanucc13Iterator.class);
			pageContext.getOut().print(theEmail.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

