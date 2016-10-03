package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalIsbn10Iterator theJournal = (JournalIsbn10Iterator)findAncestorWithClass(this, JournalIsbn10Iterator.class);
			pageContext.getOut().print(theJournal.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

