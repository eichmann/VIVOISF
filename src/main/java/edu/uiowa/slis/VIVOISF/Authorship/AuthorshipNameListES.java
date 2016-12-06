package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameListESIterator theAuthorship = (AuthorshipNameListESIterator)findAncestorWithClass(this, AuthorshipNameListESIterator.class);
			pageContext.getOut().print(theAuthorship.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

