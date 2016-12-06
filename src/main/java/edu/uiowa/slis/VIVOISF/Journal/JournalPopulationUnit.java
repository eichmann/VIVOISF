package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalPopulationUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalPopulationUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalPopulationUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalPopulationUnitIterator theJournal = (JournalPopulationUnitIterator)findAncestorWithClass(this, JournalPopulationUnitIterator.class);
			pageContext.getOut().print(theJournal.getPopulationUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for populationUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for populationUnit tag ");
		}
		return SKIP_BODY;
	}
}

