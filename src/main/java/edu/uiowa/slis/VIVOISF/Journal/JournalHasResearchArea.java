package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			JournalHasResearchAreaIterator theJournalHasResearchAreaIterator = (JournalHasResearchAreaIterator)findAncestorWithClass(this, JournalHasResearchAreaIterator.class);
			pageContext.getOut().print(theJournalHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

