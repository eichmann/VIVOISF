package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionHDINotesIterator theeconomic_region = (economic_regionHDINotesIterator)findAncestorWithClass(this, economic_regionHDINotesIterator.class);
			pageContext.getOut().print(theeconomic_region.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

