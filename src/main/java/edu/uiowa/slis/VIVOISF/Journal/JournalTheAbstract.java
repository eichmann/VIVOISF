package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalTheAbstractIterator theJournal = (JournalTheAbstractIterator)findAncestorWithClass(this, JournalTheAbstractIterator.class);
			pageContext.getOut().print(theJournal.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

