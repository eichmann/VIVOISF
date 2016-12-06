package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNationalityITIterator thegeographical_region = (geographical_regionNationalityITIterator)findAncestorWithClass(this, geographical_regionNationalityITIterator.class);
			pageContext.getOut().print(thegeographical_region.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

