package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalFreetextKeywordIterator theJournal = (JournalFreetextKeywordIterator)findAncestorWithClass(this, JournalFreetextKeywordIterator.class);
			pageContext.getOut().print(theJournal.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

