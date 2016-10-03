package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalUri currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalUriIterator theJournal = (JournalUriIterator)findAncestorWithClass(this, JournalUriIterator.class);
			pageContext.getOut().print(theJournal.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for uri tag ");
		}
		return SKIP_BODY;
	}
}

