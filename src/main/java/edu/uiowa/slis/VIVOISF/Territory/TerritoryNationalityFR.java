package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNationalityFRIterator theTerritory = (TerritoryNationalityFRIterator)findAncestorWithClass(this, TerritoryNationalityFRIterator.class);
			pageContext.getOut().print(theTerritory.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

