package edu.uiowa.slis.VIVOISF.BFO_0000031;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000031AgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000031AgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000031AgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000031AgriculturalAreaNotesIterator theBFO_0000031 = (BFO_0000031AgriculturalAreaNotesIterator)findAncestorWithClass(this, BFO_0000031AgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theBFO_0000031.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000031 for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000031 for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

