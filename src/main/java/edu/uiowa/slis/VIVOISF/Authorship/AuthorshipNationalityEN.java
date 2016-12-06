package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNationalityENIterator theAuthorship = (AuthorshipNationalityENIterator)findAncestorWithClass(this, AuthorshipNationalityENIterator.class);
			pageContext.getOut().print(theAuthorship.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

