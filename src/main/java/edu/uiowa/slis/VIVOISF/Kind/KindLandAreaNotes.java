package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(KindLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindLandAreaNotesIterator theKind = (KindLandAreaNotesIterator)findAncestorWithClass(this, KindLandAreaNotesIterator.class);
			pageContext.getOut().print(theKind.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

