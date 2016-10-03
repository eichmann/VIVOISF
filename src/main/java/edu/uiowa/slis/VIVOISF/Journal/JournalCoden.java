package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalCodenIterator theJournal = (JournalCodenIterator)findAncestorWithClass(this, JournalCodenIterator.class);
			pageContext.getOut().print(theJournal.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for coden tag ");
		}
		return SKIP_BODY;
	}
}

