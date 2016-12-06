package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameShortITIterator theAuthorship = (AuthorshipNameShortITIterator)findAncestorWithClass(this, AuthorshipNameShortITIterator.class);
			pageContext.getOut().print(theAuthorship.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

