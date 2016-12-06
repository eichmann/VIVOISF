package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNationalityARIterator thegeographical_region = (geographical_regionNationalityARIterator)findAncestorWithClass(this, geographical_regionNationalityARIterator.class);
			pageContext.getOut().print(thegeographical_region.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

