package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameOfficialAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameOfficialAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameOfficialAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameOfficialARIterator theAuthorship = (AuthorshipNameOfficialARIterator)findAncestorWithClass(this, AuthorshipNameOfficialARIterator.class);
			pageContext.getOut().print(theAuthorship.getNameOfficialAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameOfficialAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameOfficialAR tag ");
		}
		return SKIP_BODY;
	}
}

