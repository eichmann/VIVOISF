package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameListRUIterator theTerritory = (TerritoryNameListRUIterator)findAncestorWithClass(this, TerritoryNameListRUIterator.class);
			pageContext.getOut().print(theTerritory.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

