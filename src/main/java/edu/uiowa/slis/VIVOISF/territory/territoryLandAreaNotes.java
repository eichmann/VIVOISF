package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryLandAreaNotesIterator theterritory = (territoryLandAreaNotesIterator)findAncestorWithClass(this, territoryLandAreaNotesIterator.class);
			pageContext.getOut().print(theterritory.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

