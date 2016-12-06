package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionAgriculturalAreaNotesIterator theeconomic_region = (economic_regionAgriculturalAreaNotesIterator)findAncestorWithClass(this, economic_regionAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theeconomic_region.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

