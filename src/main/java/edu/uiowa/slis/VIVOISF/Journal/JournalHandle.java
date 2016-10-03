package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalHandleIterator theJournal = (JournalHandleIterator)findAncestorWithClass(this, JournalHandleIterator.class);
			pageContext.getOut().print(theJournal.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for handle tag ");
		}
		return SKIP_BODY;
	}
}

