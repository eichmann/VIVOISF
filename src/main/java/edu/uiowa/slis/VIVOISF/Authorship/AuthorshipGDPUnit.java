package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipGDPUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipGDPUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipGDPUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipGDPUnitIterator theAuthorship = (AuthorshipGDPUnitIterator)findAncestorWithClass(this, AuthorshipGDPUnitIterator.class);
			pageContext.getOut().print(theAuthorship.getGDPUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for GDPUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for GDPUnit tag ");
		}
		return SKIP_BODY;
	}
}

