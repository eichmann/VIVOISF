package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryGDPNotesIterator theTerritory = (TerritoryGDPNotesIterator)findAncestorWithClass(this, TerritoryGDPNotesIterator.class);
			pageContext.getOut().print(theTerritory.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

