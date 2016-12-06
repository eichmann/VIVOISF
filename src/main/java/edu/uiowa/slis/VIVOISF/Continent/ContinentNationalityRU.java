package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNationalityRUIterator theContinent = (ContinentNationalityRUIterator)findAncestorWithClass(this, ContinentNationalityRUIterator.class);
			pageContext.getOut().print(theContinent.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

