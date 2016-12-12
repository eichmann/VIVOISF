package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryValidUntil extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryValidUntil currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryValidUntil.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryValidUntilIterator theTerritory = (TerritoryValidUntilIterator)findAncestorWithClass(this, TerritoryValidUntilIterator.class);
			pageContext.getOut().print(theTerritory.getValidUntil());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for validUntil tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for validUntil tag ");
		}
		return SKIP_BODY;
	}
}

