package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryRO_0002353Iterator theterritoryRO_0002353Iterator = (territoryRO_0002353Iterator)findAncestorWithClass(this, territoryRO_0002353Iterator.class);
			pageContext.getOut().print(theterritoryRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

