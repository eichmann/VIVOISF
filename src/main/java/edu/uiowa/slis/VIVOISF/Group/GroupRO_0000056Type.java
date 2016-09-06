package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupRO_0000056Iterator theGroupRO_0000056Iterator = (GroupRO_0000056Iterator)findAncestorWithClass(this, GroupRO_0000056Iterator.class);
			pageContext.getOut().print(theGroupRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

