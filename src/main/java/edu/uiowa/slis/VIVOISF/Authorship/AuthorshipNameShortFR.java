package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameShortFRIterator theAuthorship = (AuthorshipNameShortFRIterator)findAncestorWithClass(this, AuthorshipNameShortFRIterator.class);
			pageContext.getOut().print(theAuthorship.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

