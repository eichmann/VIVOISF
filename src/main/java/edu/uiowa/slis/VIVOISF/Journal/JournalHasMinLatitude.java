package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalHasMinLatitudeIterator theJournal = (JournalHasMinLatitudeIterator)findAncestorWithClass(this, JournalHasMinLatitudeIterator.class);
			pageContext.getOut().print(theJournal.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

