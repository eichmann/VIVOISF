package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupHasAddressIterator theGroupHasAddressIterator = (GroupHasAddressIterator)findAncestorWithClass(this, GroupHasAddressIterator.class);
			pageContext.getOut().print(theGroupHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

