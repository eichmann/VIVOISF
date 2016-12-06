package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(groupLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupLandAreaNotesIterator thegroup = (groupLandAreaNotesIterator)findAncestorWithClass(this, groupLandAreaNotesIterator.class);
			pageContext.getOut().print(thegroup.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing group for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

