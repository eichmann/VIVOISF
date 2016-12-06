package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameShortRUIterator theAuthorship = (AuthorshipNameShortRUIterator)findAncestorWithClass(this, AuthorshipNameShortRUIterator.class);
			pageContext.getOut().print(theAuthorship.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

