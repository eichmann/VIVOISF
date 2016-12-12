package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameShortARIterator theTerritory = (TerritoryNameShortARIterator)findAncestorWithClass(this, TerritoryNameShortARIterator.class);
			pageContext.getOut().print(theTerritory.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

