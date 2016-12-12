package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameShortENIterator theTerritory = (TerritoryNameShortENIterator)findAncestorWithClass(this, TerritoryNameShortENIterator.class);
			pageContext.getOut().print(theTerritory.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

