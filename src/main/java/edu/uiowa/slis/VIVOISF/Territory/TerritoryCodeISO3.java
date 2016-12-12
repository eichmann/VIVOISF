package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryCodeISO3Iterator theTerritory = (TerritoryCodeISO3Iterator)findAncestorWithClass(this, TerritoryCodeISO3Iterator.class);
			pageContext.getOut().print(theTerritory.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

