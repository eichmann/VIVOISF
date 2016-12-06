package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003GDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003GDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003GDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003GDPNotesIterator theIAO_0000003 = (IAO_0000003GDPNotesIterator)findAncestorWithClass(this, IAO_0000003GDPNotesIterator.class);
			pageContext.getOut().print(theIAO_0000003.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

