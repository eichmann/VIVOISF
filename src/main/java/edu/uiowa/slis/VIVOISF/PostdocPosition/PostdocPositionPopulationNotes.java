package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionPopulationNotesIterator thePostdocPosition = (PostdocPositionPopulationNotesIterator)findAncestorWithClass(this, PostdocPositionPopulationNotesIterator.class);
			pageContext.getOut().print(thePostdocPosition.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

