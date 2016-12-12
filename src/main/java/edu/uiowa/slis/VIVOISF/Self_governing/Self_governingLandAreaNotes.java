package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingLandAreaNotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingLandAreaNotes currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingLandAreaNotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingLandAreaNotesIterator theSelf_governing = (Self_governingLandAreaNotesIterator)findAncestorWithClass(this, Self_governingLandAreaNotesIterator.class);
			pageContext.getOut().print(theSelf_governing.getLandAreaNotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for landAreaNotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for landAreaNotes tag ");
		}
		return SKIP_BODY;
	}
}

