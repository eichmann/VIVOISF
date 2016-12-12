package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryCodeUNDPIterator theTerritory = (TerritoryCodeUNDPIterator)findAncestorWithClass(this, TerritoryCodeUNDPIterator.class);
			pageContext.getOut().print(theTerritory.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

