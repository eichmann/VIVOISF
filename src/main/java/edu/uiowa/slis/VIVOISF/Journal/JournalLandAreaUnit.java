package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalLandAreaUnitIterator theJournal = (JournalLandAreaUnitIterator)findAncestorWithClass(this, JournalLandAreaUnitIterator.class);
			pageContext.getOut().print(theJournal.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

