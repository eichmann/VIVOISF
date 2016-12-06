package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNationalityENIterator theContinent = (ContinentNationalityENIterator)findAncestorWithClass(this, ContinentNationalityENIterator.class);
			pageContext.getOut().print(theContinent.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

