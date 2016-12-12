package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryHasBorderWithType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryHasBorderWithType currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryHasBorderWithType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TerritoryHasBorderWithIterator theTerritoryHasBorderWithIterator = (TerritoryHasBorderWithIterator)findAncestorWithClass(this, TerritoryHasBorderWithIterator.class);
			pageContext.getOut().print(theTerritoryHasBorderWithIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for hasBorderWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for hasBorderWith tag ");
		}
		return SKIP_BODY;
	}
}

