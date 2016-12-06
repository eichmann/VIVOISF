package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameShortZHIterator theJournal = (JournalNameShortZHIterator)findAncestorWithClass(this, JournalNameShortZHIterator.class);
			pageContext.getOut().print(theJournal.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

