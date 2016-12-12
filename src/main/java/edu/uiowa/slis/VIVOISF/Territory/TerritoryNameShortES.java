package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameShortESIterator theTerritory = (TerritoryNameShortESIterator)findAncestorWithClass(this, TerritoryNameShortESIterator.class);
			pageContext.getOut().print(theTerritory.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

