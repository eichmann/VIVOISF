package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameListITIterator theAuthorship = (AuthorshipNameListITIterator)findAncestorWithClass(this, AuthorshipNameListITIterator.class);
			pageContext.getOut().print(theAuthorship.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

