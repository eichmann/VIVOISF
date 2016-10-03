package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteDistributorIterator theNoteDistributorIterator = (NoteDistributorIterator)findAncestorWithClass(this, NoteDistributorIterator.class);
			pageContext.getOut().print(theNoteDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for distributor tag ");
		}
		return SKIP_BODY;
	}
}

