package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteHasTranslationIterator theNoteHasTranslationIterator = (NoteHasTranslationIterator)findAncestorWithClass(this, NoteHasTranslationIterator.class);
			pageContext.getOut().print(theNoteHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

