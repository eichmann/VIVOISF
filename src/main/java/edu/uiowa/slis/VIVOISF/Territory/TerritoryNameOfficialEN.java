package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameOfficialENIterator theTerritory = (TerritoryNameOfficialENIterator)findAncestorWithClass(this, TerritoryNameOfficialENIterator.class);
			pageContext.getOut().print(theTerritory.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

