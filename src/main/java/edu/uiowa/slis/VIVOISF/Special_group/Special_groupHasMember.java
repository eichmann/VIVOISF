package edu.uiowa.slis.VIVOISF.Special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Special_groupHasMember extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Special_groupHasMember currentInstance = null;
	private static final Log log = LogFactory.getLog(Special_groupHasMember.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Special_groupHasMemberIterator theSpecial_groupHasMemberIterator = (Special_groupHasMemberIterator)findAncestorWithClass(this, Special_groupHasMemberIterator.class);
			pageContext.getOut().print(theSpecial_groupHasMemberIterator.getHasMember());
		} catch (Exception e) {
			log.error("Can't find enclosing Special_group for hasMember tag ", e);
			throw new JspTagException("Error: Can't find enclosing Special_group for hasMember tag ");
		}
		return SKIP_BODY;
	}
}

