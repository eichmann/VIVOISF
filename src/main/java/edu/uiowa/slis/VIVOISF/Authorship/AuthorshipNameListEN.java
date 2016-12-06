package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameListENIterator theAuthorship = (AuthorshipNameListENIterator)findAncestorWithClass(this, AuthorshipNameListENIterator.class);
			pageContext.getOut().print(theAuthorship.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

