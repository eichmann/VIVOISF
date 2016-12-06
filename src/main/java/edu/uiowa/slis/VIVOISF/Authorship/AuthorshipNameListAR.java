package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameListARIterator theAuthorship = (AuthorshipNameListARIterator)findAncestorWithClass(this, AuthorshipNameListARIterator.class);
			pageContext.getOut().print(theAuthorship.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

