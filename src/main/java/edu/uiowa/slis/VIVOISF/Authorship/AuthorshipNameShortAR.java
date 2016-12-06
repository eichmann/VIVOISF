package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameShortARIterator theAuthorship = (AuthorshipNameShortARIterator)findAncestorWithClass(this, AuthorshipNameShortARIterator.class);
			pageContext.getOut().print(theAuthorship.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

