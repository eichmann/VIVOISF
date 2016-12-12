package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryHasBorderWith extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryHasBorderWith currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryHasBorderWith.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TerritoryHasBorderWithIterator theTerritoryHasBorderWithIterator = (TerritoryHasBorderWithIterator)findAncestorWithClass(this, TerritoryHasBorderWithIterator.class);
			pageContext.getOut().print(theTerritoryHasBorderWithIterator.getHasBorderWith());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for hasBorderWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for hasBorderWith tag ");
		}
		return SKIP_BODY;
	}
}

