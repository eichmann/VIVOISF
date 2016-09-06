package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalIdentifierIterator theJournal = (JournalIdentifierIterator)findAncestorWithClass(this, JournalIdentifierIterator.class);
			pageContext.getOut().print(theJournal.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for identifier tag ");
		}
		return SKIP_BODY;
	}
}

