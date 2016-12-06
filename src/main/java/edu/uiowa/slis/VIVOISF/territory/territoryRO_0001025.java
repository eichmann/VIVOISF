package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryRO_0001025Iterator theterritoryRO_0001025Iterator = (territoryRO_0001025Iterator)findAncestorWithClass(this, territoryRO_0001025Iterator.class);
			pageContext.getOut().print(theterritoryRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

