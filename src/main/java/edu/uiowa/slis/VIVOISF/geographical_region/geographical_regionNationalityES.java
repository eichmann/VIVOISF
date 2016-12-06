package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNationalityESIterator thegeographical_region = (geographical_regionNationalityESIterator)findAncestorWithClass(this, geographical_regionNationalityESIterator.class);
			pageContext.getOut().print(thegeographical_region.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

