package edu.uiowa.slis.VIVOISF.Note;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NoteDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NoteDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(NoteDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NoteDistributorIterator theNoteDistributorIterator = (NoteDistributorIterator)findAncestorWithClass(this, NoteDistributorIterator.class);
			pageContext.getOut().print(theNoteDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Note for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Note for distributor tag ");
		}
		return SKIP_BODY;
	}
}

