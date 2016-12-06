package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalPopulationYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalPopulationYear currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalPopulationYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalPopulationYearIterator theJournal = (JournalPopulationYearIterator)findAncestorWithClass(this, JournalPopulationYearIterator.class);
			pageContext.getOut().print(theJournal.getPopulationYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for populationYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for populationYear tag ");
		}
		return SKIP_BODY;
	}
}

