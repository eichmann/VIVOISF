package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNationalityFRIterator thegeographical_region = (geographical_regionNationalityFRIterator)findAncestorWithClass(this, geographical_regionNationalityFRIterator.class);
			pageContext.getOut().print(thegeographical_region.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

