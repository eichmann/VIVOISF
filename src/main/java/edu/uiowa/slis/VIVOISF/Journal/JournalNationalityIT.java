package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNationalityITIterator theJournal = (JournalNationalityITIterator)findAncestorWithClass(this, JournalNationalityITIterator.class);
			pageContext.getOut().print(theJournal.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

