package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(groupGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupGDPNotesIterator thegroup = (groupGDPNotesIterator)findAncestorWithClass(this, groupGDPNotesIterator.class);
			pageContext.getOut().print(thegroup.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing group for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

