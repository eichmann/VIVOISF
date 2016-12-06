package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameShortENIterator theAuthorship = (AuthorshipNameShortENIterator)findAncestorWithClass(this, AuthorshipNameShortENIterator.class);
			pageContext.getOut().print(theAuthorship.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

