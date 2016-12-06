package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipCountryAreaUnitIterator theAuthorship = (AuthorshipCountryAreaUnitIterator)findAncestorWithClass(this, AuthorshipCountryAreaUnitIterator.class);
			pageContext.getOut().print(theAuthorship.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

