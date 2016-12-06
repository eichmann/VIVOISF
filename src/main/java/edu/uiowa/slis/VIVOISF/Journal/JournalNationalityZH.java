package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalNationalityZHIterator theJournal = (JournalNationalityZHIterator)findAncestorWithClass(this, JournalNationalityZHIterator.class);
			pageContext.getOut().print(theJournal.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

