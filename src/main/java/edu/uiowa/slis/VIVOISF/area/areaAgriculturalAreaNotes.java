package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(areaAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaAgriculturalAreaNotesIterator thearea = (areaAgriculturalAreaNotesIterator)findAncestorWithClass(this, areaAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(thearea.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing area for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

