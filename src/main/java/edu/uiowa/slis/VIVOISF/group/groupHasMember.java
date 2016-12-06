package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHasMember extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHasMember currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHasMember.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupHasMemberIterator thegroupHasMemberIterator = (groupHasMemberIterator)findAncestorWithClass(this, groupHasMemberIterator.class);
			pageContext.getOut().print(thegroupHasMemberIterator.getHasMember());
		} catch (Exception e) {
			log.error("Can't find enclosing group for hasMember tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hasMember tag ");
		}
		return SKIP_BODY;
	}
}

