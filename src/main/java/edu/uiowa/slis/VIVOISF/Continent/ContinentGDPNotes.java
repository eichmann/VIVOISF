package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentGDPNotesIterator theContinent = (ContinentGDPNotesIterator)findAncestorWithClass(this, ContinentGDPNotesIterator.class);
			pageContext.getOut().print(theContinent.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

