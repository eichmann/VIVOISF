package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentLandAreaNotesIterator theContinent = (ContinentLandAreaNotesIterator)findAncestorWithClass(this, ContinentLandAreaNotesIterator.class);
			pageContext.getOut().print(theContinent.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

