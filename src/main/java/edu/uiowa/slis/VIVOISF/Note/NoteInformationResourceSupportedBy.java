package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteInformationResourceSupportedByIterator theNoteInformationResourceSupportedByIterator = (NoteInformationResourceSupportedByIterator)findAncestorWithClass(this, NoteInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theNoteInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

