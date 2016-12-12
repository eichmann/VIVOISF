package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TerritoryCodeISO2Iterator theTerritory = (TerritoryCodeISO2Iterator)findAncestorWithClass(this, TerritoryCodeISO2Iterator.class);
			pageContext.getOut().print(theTerritory.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

