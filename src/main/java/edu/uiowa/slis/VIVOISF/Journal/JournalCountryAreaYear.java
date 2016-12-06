package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalCountryAreaYearIterator theJournal = (JournalCountryAreaYearIterator)findAncestorWithClass(this, JournalCountryAreaYearIterator.class);
			pageContext.getOut().print(theJournal.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

