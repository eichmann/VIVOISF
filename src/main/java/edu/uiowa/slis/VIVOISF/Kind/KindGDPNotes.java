package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindGDPNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindGDPNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(KindGDPNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindGDPNotesIterator theKind = (KindGDPNotesIterator)findAncestorWithClass(this, KindGDPNotesIterator.class);
			pageContext.getOut().print(theKind.getGDPNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for GDPNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for GDPNotes tag ");
		}
		return SKIP_BODY;
	}
}

