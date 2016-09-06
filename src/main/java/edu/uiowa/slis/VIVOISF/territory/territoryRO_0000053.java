package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryRO_0000053 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryRO_0000053 currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryRO_0000053.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryRO_0000053Iterator theterritoryRO_0000053Iterator = (territoryRO_0000053Iterator)findAncestorWithClass(this, territoryRO_0000053Iterator.class);
			pageContext.getOut().print(theterritoryRO_0000053Iterator.getRO_0000053());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

