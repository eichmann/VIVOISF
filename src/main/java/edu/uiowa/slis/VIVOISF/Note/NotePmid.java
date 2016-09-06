package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NotePmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NotePmid currentInstance = null;
	private static final Log log = LogFactory.getLog(NotePmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NotePmidIterator theNote = (NotePmidIterator)findAncestorWithClass(this, NotePmidIterator.class);
			pageContext.getOut().print(theNote.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for pmid tag ");
		}
		return SKIP_BODY;
	}
}

