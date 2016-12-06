package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNationalityRUIterator theJournal = (JournalNationalityRUIterator)findAncestorWithClass(this, JournalNationalityRUIterator.class);
			pageContext.getOut().print(theJournal.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

