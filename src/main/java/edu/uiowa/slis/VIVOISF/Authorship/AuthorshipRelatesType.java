package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AuthorshipRelatesIterator theAuthorshipRelatesIterator = (AuthorshipRelatesIterator)findAncestorWithClass(this, AuthorshipRelatesIterator.class);
			pageContext.getOut().print(theAuthorshipRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for relates tag ");
		}
		return SKIP_BODY;
	}
}

