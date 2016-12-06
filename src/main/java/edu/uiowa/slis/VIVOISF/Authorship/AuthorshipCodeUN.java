package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipCodeUNIterator theAuthorship = (AuthorshipCodeUNIterator)findAncestorWithClass(this, AuthorshipCodeUNIterator.class);
			pageContext.getOut().print(theAuthorship.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

