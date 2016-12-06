package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalHasMinLongitudeIterator theJournal = (JournalHasMinLongitudeIterator)findAncestorWithClass(this, JournalHasMinLongitudeIterator.class);
			pageContext.getOut().print(theJournal.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

