package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryAgriculturalAreaNotesIterator theTerritory = (TerritoryAgriculturalAreaNotesIterator)findAncestorWithClass(this, TerritoryAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theTerritory.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

