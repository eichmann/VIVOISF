package edu.uiowa.slis.VIVOISF.Territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TerritoryRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TerritoryRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(TerritoryRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			TerritoryRO_0001015Iterator theTerritoryRO_0001015Iterator = (TerritoryRO_0001015Iterator)findAncestorWithClass(this, TerritoryRO_0001015Iterator.class);
			pageContext.getOut().print(theTerritoryRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Territory for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Territory for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

