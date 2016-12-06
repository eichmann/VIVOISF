package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionPopulationYearIterator thePostdocPosition = (PostdocPositionPopulationYearIterator)findAncestorWithClass(this, PostdocPositionPopulationYearIterator.class);
			pageContext.getOut().print(thePostdocPosition.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

