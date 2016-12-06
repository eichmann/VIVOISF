package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipNationalityZHIterator theAuthorship = (AuthorshipNationalityZHIterator)findAncestorWithClass(this, AuthorshipNationalityZHIterator.class);
			pageContext.getOut().print(theAuthorship.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

