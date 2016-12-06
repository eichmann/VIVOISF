package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(groupPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupPopulationNotesIterator thegroup = (groupPopulationNotesIterator)findAncestorWithClass(this, groupPopulationNotesIterator.class);
			pageContext.getOut().print(thegroup.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing group for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

