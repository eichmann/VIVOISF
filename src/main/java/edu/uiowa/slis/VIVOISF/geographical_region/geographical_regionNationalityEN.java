package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNationalityENIterator thegeographical_region = (geographical_regionNationalityENIterator)findAncestorWithClass(this, geographical_regionNationalityENIterator.class);
			pageContext.getOut().print(thegeographical_region.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

