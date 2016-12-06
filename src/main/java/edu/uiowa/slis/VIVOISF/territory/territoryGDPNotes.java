package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryGDPNotesIterator theterritory = (territoryGDPNotesIterator)findAncestorWithClass(this, territoryGDPNotesIterator.class);
			pageContext.getOut().print(theterritory.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

