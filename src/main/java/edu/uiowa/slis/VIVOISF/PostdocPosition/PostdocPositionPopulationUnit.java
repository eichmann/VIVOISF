package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionPopulationUnitIterator thePostdocPosition = (PostdocPositionPopulationUnitIterator)findAncestorWithClass(this, PostdocPositionPopulationUnitIterator.class);
			pageContext.getOut().print(thePostdocPosition.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

