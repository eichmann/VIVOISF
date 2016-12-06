package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupPopulationNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupPopulationNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupPopulationNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupPopulationNotesIterator thespecial_group = (special_groupPopulationNotesIterator)findAncestorWithClass(this, special_groupPopulationNotesIterator.class);
			pageContext.getOut().print(thespecial_group.getPopulationNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for populationNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for populationNotes tag ");
		}
		return SKIP_BODY;
	}
}

