package edu.uiowa.slis.VIVOISF.BFO_0000008;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000008LandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000008LandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000008LandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000008LandAreaNotesIterator theBFO_0000008 = (BFO_0000008LandAreaNotesIterator)findAncestorWithClass(this, BFO_0000008LandAreaNotesIterator.class);
			pageContext.getOut().print(theBFO_0000008.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000008 for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000008 for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

