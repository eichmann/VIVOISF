package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameListARIterator theTerritory = (TerritoryNameListARIterator)findAncestorWithClass(this, TerritoryNameListARIterator.class);
			pageContext.getOut().print(theTerritory.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

