package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territoryHDINotesIterator theterritory = (territoryHDINotesIterator)findAncestorWithClass(this, territoryHDINotesIterator.class);
			pageContext.getOut().print(theterritory.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

