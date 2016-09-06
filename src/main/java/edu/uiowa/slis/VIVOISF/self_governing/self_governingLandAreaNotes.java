package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingLandAreaNotesIterator theself_governing = (self_governingLandAreaNotesIterator)findAncestorWithClass(this, self_governingLandAreaNotesIterator.class);
			pageContext.getOut().print(theself_governing.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

