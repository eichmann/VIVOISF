package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameListITIterator theTerritory = (TerritoryNameListITIterator)findAncestorWithClass(this, TerritoryNameListITIterator.class);
			pageContext.getOut().print(theTerritory.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

