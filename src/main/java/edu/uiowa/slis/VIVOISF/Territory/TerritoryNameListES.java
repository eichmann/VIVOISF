package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameListESIterator theTerritory = (TerritoryNameListESIterator)findAncestorWithClass(this, TerritoryNameListESIterator.class);
			pageContext.getOut().print(theTerritory.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

