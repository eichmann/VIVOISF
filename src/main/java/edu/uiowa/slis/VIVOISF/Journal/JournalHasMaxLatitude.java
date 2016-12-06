package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalHasMaxLatitudeIterator theJournal = (JournalHasMaxLatitudeIterator)findAncestorWithClass(this, JournalHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theJournal.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

