package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentAgriculturalAreaNotesIterator theContinent = (ContinentAgriculturalAreaNotesIterator)findAncestorWithClass(this, ContinentAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theContinent.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

