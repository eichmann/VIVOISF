package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryRO_0002234Iterator theterritoryRO_0002234Iterator = (territoryRO_0002234Iterator)findAncestorWithClass(this, territoryRO_0002234Iterator.class);
			pageContext.getOut().print(theterritoryRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

