package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNationalityENIterator theJournal = (JournalNationalityENIterator)findAncestorWithClass(this, JournalNationalityENIterator.class);
			pageContext.getOut().print(theJournal.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

