package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNationalityRUIterator thegeographical_region = (geographical_regionNationalityRUIterator)findAncestorWithClass(this, geographical_regionNationalityRUIterator.class);
			pageContext.getOut().print(thegeographical_region.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

