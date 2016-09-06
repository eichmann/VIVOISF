package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingGDPNotesIterator theself_governing = (self_governingGDPNotesIterator)findAncestorWithClass(this, self_governingGDPNotesIterator.class);
			pageContext.getOut().print(theself_governing.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

