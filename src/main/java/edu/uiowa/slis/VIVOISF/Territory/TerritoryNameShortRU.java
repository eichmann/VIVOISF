package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameShortRUIterator theTerritory = (TerritoryNameShortRUIterator)findAncestorWithClass(this, TerritoryNameShortRUIterator.class);
			pageContext.getOut().print(theTerritory.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

