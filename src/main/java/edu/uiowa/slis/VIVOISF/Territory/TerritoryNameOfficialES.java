package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameOfficialESIterator theTerritory = (TerritoryNameOfficialESIterator)findAncestorWithClass(this, TerritoryNameOfficialESIterator.class);
			pageContext.getOut().print(theTerritory.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

