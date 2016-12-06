package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			economic_regionNationalityRUIterator theeconomic_region = (economic_regionNationalityRUIterator)findAncestorWithClass(this, economic_regionNationalityRUIterator.class);
			pageContext.getOut().print(theeconomic_region.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

