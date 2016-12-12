package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryNameShortITIterator theTerritory = (TerritoryNameShortITIterator)findAncestorWithClass(this, TerritoryNameShortITIterator.class);
			pageContext.getOut().print(theTerritory.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

