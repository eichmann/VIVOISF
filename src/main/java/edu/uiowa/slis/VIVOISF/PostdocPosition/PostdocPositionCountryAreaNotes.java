package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionCountryAreaNotesIterator thePostdocPosition = (PostdocPositionCountryAreaNotesIterator)findAncestorWithClass(this, PostdocPositionCountryAreaNotesIterator.class);
			pageContext.getOut().print(thePostdocPosition.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

