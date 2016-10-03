package edu.uiowa.slis.VIVOISF.Email;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmailERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmailERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmailERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmailERO_0000045Iterator theEmail = (EmailERO_0000045Iterator)findAncestorWithClass(this, EmailERO_0000045Iterator.class);
			pageContext.getOut().print(theEmail.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Email for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Email for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

