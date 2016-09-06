package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupIAO_0000136Iterator theGroupIAO_0000136Iterator = (GroupIAO_0000136Iterator)findAncestorWithClass(this, GroupIAO_0000136Iterator.class);
			pageContext.getOut().print(theGroupIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

