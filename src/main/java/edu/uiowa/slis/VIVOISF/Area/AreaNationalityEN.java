package edu.uiowa.slis.VIVOISF.Area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AreaNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AreaNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AreaNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AreaNationalityENIterator theArea = (AreaNationalityENIterator)findAncestorWithClass(this, AreaNationalityENIterator.class);
			pageContext.getOut().print(theArea.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Area for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Area for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

