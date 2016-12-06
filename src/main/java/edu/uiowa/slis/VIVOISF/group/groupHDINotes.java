package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupHDINotesIterator thegroup = (groupHDINotesIterator)findAncestorWithClass(this, groupHDINotesIterator.class);
			pageContext.getOut().print(thegroup.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing group for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

