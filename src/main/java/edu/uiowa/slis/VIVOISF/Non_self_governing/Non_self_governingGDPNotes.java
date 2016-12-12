package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Non_self_governingGDPNotesIterator theNon_self_governing = (Non_self_governingGDPNotesIterator)findAncestorWithClass(this, Non_self_governingGDPNotesIterator.class);
			pageContext.getOut().print(theNon_self_governing.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

