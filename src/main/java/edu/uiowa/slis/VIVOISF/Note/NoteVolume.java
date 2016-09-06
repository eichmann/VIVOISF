package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteVolumeIterator theNote = (NoteVolumeIterator)findAncestorWithClass(this, NoteVolumeIterator.class);
			pageContext.getOut().print(theNote.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for volume tag ");
		}
		return SKIP_BODY;
	}
}

