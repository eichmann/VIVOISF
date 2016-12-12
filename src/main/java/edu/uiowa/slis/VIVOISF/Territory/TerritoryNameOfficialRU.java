package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameOfficialRUIterator theTerritory = (TerritoryNameOfficialRUIterator)findAncestorWithClass(this, TerritoryNameOfficialRUIterator.class);
			pageContext.getOut().print(theTerritory.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

