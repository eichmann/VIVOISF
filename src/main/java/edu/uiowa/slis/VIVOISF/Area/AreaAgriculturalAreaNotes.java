package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaAgriculturalAreaNotesIterator theArea = (AreaAgriculturalAreaNotesIterator)findAncestorWithClass(this, AreaAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theArea.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

