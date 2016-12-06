package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AuthorshipPopulationUnitIterator theAuthorship = (AuthorshipPopulationUnitIterator)findAncestorWithClass(this, AuthorshipPopulationUnitIterator.class);
			pageContext.getOut().print(theAuthorship.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

