package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameListENIterator theTerritory = (TerritoryNameListENIterator)findAncestorWithClass(this, TerritoryNameListENIterator.class);
			pageContext.getOut().print(theTerritory.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

