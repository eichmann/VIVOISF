package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalPopulationTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalPopulationTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalPopulationTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalPopulationTotalIterator theJournal = (JournalPopulationTotalIterator)findAncestorWithClass(this, JournalPopulationTotalIterator.class);
			pageContext.getOut().print(theJournal.getPopulationTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for populationTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for populationTotal tag ");
		}
		return SKIP_BODY;
	}
}

