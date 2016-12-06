package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionAgriculturalAreaNotesIterator thegeographical_region = (geographical_regionAgriculturalAreaNotesIterator)findAncestorWithClass(this, geographical_regionAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(thegeographical_region.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

