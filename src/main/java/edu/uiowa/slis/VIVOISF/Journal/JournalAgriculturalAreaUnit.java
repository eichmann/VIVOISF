package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalAgriculturalAreaUnitIterator theJournal = (JournalAgriculturalAreaUnitIterator)findAncestorWithClass(this, JournalAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theJournal.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

