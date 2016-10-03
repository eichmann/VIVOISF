package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalLccnIterator theJournal = (JournalLccnIterator)findAncestorWithClass(this, JournalLccnIterator.class);
			pageContext.getOut().print(theJournal.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for lccn tag ");
		}
		return SKIP_BODY;
	}
}

