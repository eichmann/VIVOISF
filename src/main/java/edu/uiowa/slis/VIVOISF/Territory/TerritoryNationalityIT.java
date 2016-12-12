package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNationalityITIterator theTerritory = (TerritoryNationalityITIterator)findAncestorWithClass(this, TerritoryNationalityITIterator.class);
			pageContext.getOut().print(theTerritory.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

