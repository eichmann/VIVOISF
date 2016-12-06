package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupLandAreaNotesIterator thespecial_group = (special_groupLandAreaNotesIterator)findAncestorWithClass(this, special_groupLandAreaNotesIterator.class);
			pageContext.getOut().print(thespecial_group.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

