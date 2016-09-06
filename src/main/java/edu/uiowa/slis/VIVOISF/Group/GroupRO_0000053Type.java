package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupRO_0000053Iterator theGroupRO_0000053Iterator = (GroupRO_0000053Iterator)findAncestorWithClass(this, GroupRO_0000053Iterator.class);
			pageContext.getOut().print(theGroupRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

