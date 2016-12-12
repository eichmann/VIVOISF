package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNationalityRUIterator theTerritory = (TerritoryNationalityRUIterator)findAncestorWithClass(this, TerritoryNationalityRUIterator.class);
			pageContext.getOut().print(theTerritory.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

