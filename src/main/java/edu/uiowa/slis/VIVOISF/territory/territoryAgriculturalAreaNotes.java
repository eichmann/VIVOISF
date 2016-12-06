package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryAgriculturalAreaNotesIterator theterritory = (territoryAgriculturalAreaNotesIterator)findAncestorWithClass(this, territoryAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theterritory.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

