package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryCodeFAOSTATIterator theTerritory = (TerritoryCodeFAOSTATIterator)findAncestorWithClass(this, TerritoryCodeFAOSTATIterator.class);
			pageContext.getOut().print(theTerritory.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

