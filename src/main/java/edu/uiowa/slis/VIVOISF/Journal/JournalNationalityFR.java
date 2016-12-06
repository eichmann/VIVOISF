package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNationalityFRIterator theJournal = (JournalNationalityFRIterator)findAncestorWithClass(this, JournalNationalityFRIterator.class);
			pageContext.getOut().print(theJournal.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

