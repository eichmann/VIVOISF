package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameListFRIterator theTerritory = (TerritoryNameListFRIterator)findAncestorWithClass(this, TerritoryNameListFRIterator.class);
			pageContext.getOut().print(theTerritory.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

