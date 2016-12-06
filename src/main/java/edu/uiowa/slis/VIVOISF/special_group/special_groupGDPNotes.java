package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupGDPNotesIterator thespecial_group = (special_groupGDPNotesIterator)findAncestorWithClass(this, special_groupGDPNotesIterator.class);
			pageContext.getOut().print(thespecial_group.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

