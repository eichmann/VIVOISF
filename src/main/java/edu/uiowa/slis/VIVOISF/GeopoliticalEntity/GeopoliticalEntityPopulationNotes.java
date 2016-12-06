package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntityPopulationNotesIterator theGeopoliticalEntity = (GeopoliticalEntityPopulationNotesIterator)findAncestorWithClass(this, GeopoliticalEntityPopulationNotesIterator.class);
			pageContext.getOut().print(theGeopoliticalEntity.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

