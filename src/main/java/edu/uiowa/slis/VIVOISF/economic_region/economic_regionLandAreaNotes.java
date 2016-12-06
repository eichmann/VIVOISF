package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionLandAreaNotesIterator theeconomic_region = (economic_regionLandAreaNotesIterator)findAncestorWithClass(this, economic_regionLandAreaNotesIterator.class);
			pageContext.getOut().print(theeconomic_region.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

