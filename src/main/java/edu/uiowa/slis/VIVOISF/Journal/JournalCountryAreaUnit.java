package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalCountryAreaUnitIterator theJournal = (JournalCountryAreaUnitIterator)findAncestorWithClass(this, JournalCountryAreaUnitIterator.class);
			pageContext.getOut().print(theJournal.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

