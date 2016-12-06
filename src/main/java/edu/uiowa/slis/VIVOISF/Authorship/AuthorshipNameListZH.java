package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameListZHIterator theAuthorship = (AuthorshipNameListZHIterator)findAncestorWithClass(this, AuthorshipNameListZHIterator.class);
			pageContext.getOut().print(theAuthorship.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

