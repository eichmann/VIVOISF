package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameOfficialZHIterator theTerritory = (TerritoryNameOfficialZHIterator)findAncestorWithClass(this, TerritoryNameOfficialZHIterator.class);
			pageContext.getOut().print(theTerritory.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

