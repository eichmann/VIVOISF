package edu.uiowa.slis.VIVOISF.IAO_0000003;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000003LandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000003LandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000003LandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000003LandAreaNotesIterator theIAO_0000003 = (IAO_0000003LandAreaNotesIterator)findAncestorWithClass(this, IAO_0000003LandAreaNotesIterator.class);
			pageContext.getOut().print(theIAO_0000003.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000003 for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000003 for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

