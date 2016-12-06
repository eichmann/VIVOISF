package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(areaHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaHDINotesIterator thearea = (areaHDINotesIterator)findAncestorWithClass(this, areaHDINotesIterator.class);
			pageContext.getOut().print(thearea.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing area for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

