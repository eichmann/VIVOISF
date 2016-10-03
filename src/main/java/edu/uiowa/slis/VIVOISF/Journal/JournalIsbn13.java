package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalIsbn13Iterator theJournal = (JournalIsbn13Iterator)findAncestorWithClass(this, JournalIsbn13Iterator.class);
			pageContext.getOut().print(theJournal.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

