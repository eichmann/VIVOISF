package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(areaPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaPopulationNotesIterator thearea = (areaPopulationNotesIterator)findAncestorWithClass(this, areaPopulationNotesIterator.class);
			pageContext.getOut().print(thearea.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing area for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

