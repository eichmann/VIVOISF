package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalLandAreaTotalIterator theJournal = (JournalLandAreaTotalIterator)findAncestorWithClass(this, JournalLandAreaTotalIterator.class);
			pageContext.getOut().print(theJournal.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

