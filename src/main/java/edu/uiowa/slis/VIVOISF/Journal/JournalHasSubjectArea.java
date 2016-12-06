package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasSubjectAreaIterator theJournalHasSubjectAreaIterator = (JournalHasSubjectAreaIterator)findAncestorWithClass(this, JournalHasSubjectAreaIterator.class);
			pageContext.getOut().print(theJournalHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

