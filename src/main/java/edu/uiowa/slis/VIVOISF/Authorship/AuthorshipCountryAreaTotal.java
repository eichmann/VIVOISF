package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipCountryAreaTotalIterator theAuthorship = (AuthorshipCountryAreaTotalIterator)findAncestorWithClass(this, AuthorshipCountryAreaTotalIterator.class);
			pageContext.getOut().print(theAuthorship.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

