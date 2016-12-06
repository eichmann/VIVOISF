package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalRank currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalRankIterator theJournal = (JournalRankIterator)findAncestorWithClass(this, JournalRankIterator.class);
			pageContext.getOut().print(theJournal.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for rank tag ");
		}
		return SKIP_BODY;
	}
}

