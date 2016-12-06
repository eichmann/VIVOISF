package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingAgriculturalAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingAgriculturalAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingAgriculturalAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingAgriculturalAreaNotesIterator theThing = (ThingAgriculturalAreaNotesIterator)findAncestorWithClass(this, ThingAgriculturalAreaNotesIterator.class);
			pageContext.getOut().print(theThing.getAgriculturalAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for agriculturalAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for agriculturalAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

