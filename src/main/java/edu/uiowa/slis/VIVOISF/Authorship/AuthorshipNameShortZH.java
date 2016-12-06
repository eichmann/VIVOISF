package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameShortZHIterator theAuthorship = (AuthorshipNameShortZHIterator)findAncestorWithClass(this, AuthorshipNameShortZHIterator.class);
			pageContext.getOut().print(theAuthorship.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

