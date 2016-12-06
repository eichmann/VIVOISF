package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipHasTitleIterator theAuthorshipHasTitleIterator = (AuthorshipHasTitleIterator)findAncestorWithClass(this, AuthorshipHasTitleIterator.class);
			pageContext.getOut().print(theAuthorshipHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

