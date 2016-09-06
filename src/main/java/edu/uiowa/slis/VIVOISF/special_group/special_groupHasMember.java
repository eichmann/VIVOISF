package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasMember extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasMember currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasMember.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupHasMemberIterator thespecial_groupHasMemberIterator = (special_groupHasMemberIterator)findAncestorWithClass(this, special_groupHasMemberIterator.class);
			pageContext.getOut().print(thespecial_groupHasMemberIterator.getHasMember());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasMember tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasMember tag ");
		}
		return SKIP_BODY;
	}
}

