package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(groupRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupRO_0001025Iterator thegroupRO_0001025Iterator = (groupRO_0001025Iterator)findAncestorWithClass(this, groupRO_0001025Iterator.class);
			pageContext.getOut().print(thegroupRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing group for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}
