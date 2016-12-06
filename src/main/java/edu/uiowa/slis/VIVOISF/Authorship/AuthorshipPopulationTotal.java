package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipPopulationTotalIterator theAuthorship = (AuthorshipPopulationTotalIterator)findAncestorWithClass(this, AuthorshipPopulationTotalIterator.class);
			pageContext.getOut().print(theAuthorship.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

