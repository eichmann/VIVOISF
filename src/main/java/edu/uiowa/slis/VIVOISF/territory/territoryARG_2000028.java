package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territoryARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territoryARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(territoryARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			territoryARG_2000028Iterator theterritoryARG_2000028Iterator = (territoryARG_2000028Iterator)findAncestorWithClass(this, territoryARG_2000028Iterator.class);
			pageContext.getOut().print(theterritoryARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

