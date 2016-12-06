package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupHDINotesIterator thespecial_group = (special_groupHDINotesIterator)findAncestorWithClass(this, special_groupHDINotesIterator.class);
			pageContext.getOut().print(thespecial_group.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

