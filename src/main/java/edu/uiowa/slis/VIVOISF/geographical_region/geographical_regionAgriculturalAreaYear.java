package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionAgriculturalAreaYearIterator thegeographical_region = (geographical_regionAgriculturalAreaYearIterator)findAncestorWithClass(this, geographical_regionAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(thegeographical_region.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

