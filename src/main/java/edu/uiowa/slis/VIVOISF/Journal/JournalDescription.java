package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalDescriptionIterator theJournal = (JournalDescriptionIterator)findAncestorWithClass(this, JournalDescriptionIterator.class);
			pageContext.getOut().print(theJournal.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for description tag ");
		}
		return SKIP_BODY;
	}
}

