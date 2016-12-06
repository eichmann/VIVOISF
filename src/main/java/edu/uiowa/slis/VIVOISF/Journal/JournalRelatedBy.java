package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalRelatedByIterator theJournalRelatedByIterator = (JournalRelatedByIterator)findAncestorWithClass(this, JournalRelatedByIterator.class);
			pageContext.getOut().print(theJournalRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

