package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryCodeUNIterator theTerritory = (TerritoryCodeUNIterator)findAncestorWithClass(this, TerritoryCodeUNIterator.class);
			pageContext.getOut().print(theTerritory.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

