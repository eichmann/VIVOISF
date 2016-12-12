package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNationalityARIterator theTerritory = (TerritoryNationalityARIterator)findAncestorWithClass(this, TerritoryNationalityARIterator.class);
			pageContext.getOut().print(theTerritory.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

