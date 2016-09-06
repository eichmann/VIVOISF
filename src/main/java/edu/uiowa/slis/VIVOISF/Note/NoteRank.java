package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteRank currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NoteRankIterator theNote = (NoteRankIterator)findAncestorWithClass(this, NoteRankIterator.class);
			pageContext.getOut().print(theNote.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for rank tag ");
		}
		return SKIP_BODY;
	}
}

