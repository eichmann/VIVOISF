package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteContributorListIterator theNoteContributorListIterator = (NoteContributorListIterator)findAncestorWithClass(this, NoteContributorListIterator.class);
			pageContext.getOut().print(theNoteContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

