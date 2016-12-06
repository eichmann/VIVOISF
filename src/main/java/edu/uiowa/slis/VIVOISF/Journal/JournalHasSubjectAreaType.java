package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasSubjectAreaIterator theJournalHasSubjectAreaIterator = (JournalHasSubjectAreaIterator)findAncestorWithClass(this, JournalHasSubjectAreaIterator.class);
			pageContext.getOut().print(theJournalHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

