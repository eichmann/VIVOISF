package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNationalityARIterator theJournal = (JournalNationalityARIterator)findAncestorWithClass(this, JournalNationalityARIterator.class);
			pageContext.getOut().print(theJournal.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

