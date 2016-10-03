package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupHasMember extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupHasMember currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupHasMember.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupHasMemberIterator theGroupHasMemberIterator = (GroupHasMemberIterator)findAncestorWithClass(this, GroupHasMemberIterator.class);
			pageContext.getOut().print(theGroupHasMemberIterator.getHasMember());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for hasMember tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for hasMember tag ");
		}
		return SKIP_BODY;
	}
}

