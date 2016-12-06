package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionPopulationTotalIterator thePostdocPosition = (PostdocPositionPopulationTotalIterator)findAncestorWithClass(this, PostdocPositionPopulationTotalIterator.class);
			pageContext.getOut().print(thePostdocPosition.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

