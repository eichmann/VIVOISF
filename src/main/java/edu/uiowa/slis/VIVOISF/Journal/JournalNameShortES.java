package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameShortESIterator theJournal = (JournalNameShortESIterator)findAncestorWithClass(this, JournalNameShortESIterator.class);
			pageContext.getOut().print(theJournal.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

