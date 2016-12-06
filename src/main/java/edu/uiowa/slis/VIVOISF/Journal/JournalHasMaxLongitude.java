package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalHasMaxLongitudeIterator theJournal = (JournalHasMaxLongitudeIterator)findAncestorWithClass(this, JournalHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theJournal.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

