package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(areaGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaGDPNotesIterator thearea = (areaGDPNotesIterator)findAncestorWithClass(this, areaGDPNotesIterator.class);
			pageContext.getOut().print(thearea.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing area for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

