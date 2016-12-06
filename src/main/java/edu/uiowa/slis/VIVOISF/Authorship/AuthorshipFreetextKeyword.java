package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipFreetextKeywordIterator theAuthorship = (AuthorshipFreetextKeywordIterator)findAncestorWithClass(this, AuthorshipFreetextKeywordIterator.class);
			pageContext.getOut().print(theAuthorship.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

