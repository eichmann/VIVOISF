package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalPmidIterator theJournal = (JournalPmidIterator)findAncestorWithClass(this, JournalPmidIterator.class);
			pageContext.getOut().print(theJournal.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for pmid tag ");
		}
		return SKIP_BODY;
	}
}

