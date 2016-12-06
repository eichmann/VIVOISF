package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionGDPNotesIterator theeconomic_region = (economic_regionGDPNotesIterator)findAncestorWithClass(this, economic_regionGDPNotesIterator.class);
			pageContext.getOut().print(theeconomic_region.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

