package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameListRUIterator theAuthorship = (AuthorshipNameListRUIterator)findAncestorWithClass(this, AuthorshipNameListRUIterator.class);
			pageContext.getOut().print(theAuthorship.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

