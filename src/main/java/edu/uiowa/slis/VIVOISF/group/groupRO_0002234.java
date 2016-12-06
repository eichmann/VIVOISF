package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(groupRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupRO_0002234Iterator thegroupRO_0002234Iterator = (groupRO_0002234Iterator)findAncestorWithClass(this, groupRO_0002234Iterator.class);
			pageContext.getOut().print(thegroupRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing group for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

