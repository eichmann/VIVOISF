package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityCountryAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityCountryAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityCountryAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityCountryAreaNotesIterator theGeopoliticalEntity = (GeopoliticalEntityCountryAreaNotesIterator)findAncestorWithClass(this, GeopoliticalEntityCountryAreaNotesIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getCountryAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for countryAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for countryAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

