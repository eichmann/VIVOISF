package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameListESIterator theJournal = (JournalNameListESIterator)findAncestorWithClass(this, JournalNameListESIterator.class);
			pageContext.getOut().print(theJournal.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

