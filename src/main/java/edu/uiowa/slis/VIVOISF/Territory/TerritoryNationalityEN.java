package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNationalityENIterator theTerritory = (TerritoryNationalityENIterator)findAncestorWithClass(this, TerritoryNationalityENIterator.class);
			pageContext.getOut().print(theTerritory.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

