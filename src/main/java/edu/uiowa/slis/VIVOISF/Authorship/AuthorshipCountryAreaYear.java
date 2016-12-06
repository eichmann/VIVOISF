package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipCountryAreaYearIterator theAuthorship = (AuthorshipCountryAreaYearIterator)findAncestorWithClass(this, AuthorshipCountryAreaYearIterator.class);
			pageContext.getOut().print(theAuthorship.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

