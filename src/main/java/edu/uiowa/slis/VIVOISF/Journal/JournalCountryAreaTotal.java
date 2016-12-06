package edu.uiowa.slis.VIVOISF.Journal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class JournalCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static JournalCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(JournalCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			JournalCountryAreaTotalIterator theJournal = (JournalCountryAreaTotalIterator)findAncestorWithClass(this, JournalCountryAreaTotalIterator.class);
			pageContext.getOut().print(theJournal.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Journal for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Journal for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

