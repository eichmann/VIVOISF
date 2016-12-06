package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipPopulationYearIterator theAuthorship = (AuthorshipPopulationYearIterator)findAncestorWithClass(this, AuthorshipPopulationYearIterator.class);
			pageContext.getOut().print(theAuthorship.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

