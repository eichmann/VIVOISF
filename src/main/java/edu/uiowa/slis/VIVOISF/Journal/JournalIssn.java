package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalIssn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalIssn currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalIssn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalIssnIterator theJournal = (JournalIssnIterator)findAncestorWithClass(this, JournalIssnIterator.class);
			pageContext.getOut().print(theJournal.getIssn());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for issn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for issn tag ");
		}
		return SKIP_BODY;
	}
}

