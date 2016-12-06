package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNameOfficialENIterator theAuthorship = (AuthorshipNameOfficialENIterator)findAncestorWithClass(this, AuthorshipNameOfficialENIterator.class);
			pageContext.getOut().print(theAuthorship.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

