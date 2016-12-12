package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNationalityESIterator theTerritory = (TerritoryNationalityESIterator)findAncestorWithClass(this, TerritoryNationalityESIterator.class);
			pageContext.getOut().print(theTerritory.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

