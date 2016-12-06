package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameShortESIterator theAuthorship = (AuthorshipNameShortESIterator)findAncestorWithClass(this, AuthorshipNameShortESIterator.class);
			pageContext.getOut().print(theAuthorship.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

