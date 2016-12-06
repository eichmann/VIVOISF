package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(groupRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupRO_0002353Iterator thegroupRO_0002353Iterator = (groupRO_0002353Iterator)findAncestorWithClass(this, groupRO_0002353Iterator.class);
			pageContext.getOut().print(thegroupRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing group for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

