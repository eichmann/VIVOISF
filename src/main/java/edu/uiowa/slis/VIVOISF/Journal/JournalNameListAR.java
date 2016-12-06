package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNameListARIterator theJournal = (JournalNameListARIterator)findAncestorWithClass(this, JournalNameListARIterator.class);
			pageContext.getOut().print(theJournal.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

