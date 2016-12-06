package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionLandAreaNotesIterator thegeographical_region = (geographical_regionLandAreaNotesIterator)findAncestorWithClass(this, geographical_regionLandAreaNotesIterator.class);
			pageContext.getOut().print(thegeographical_region.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

