package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupHasAddressIterator thespecial_groupHasAddressIterator = (special_groupHasAddressIterator)findAncestorWithClass(this, special_groupHasAddressIterator.class);
			pageContext.getOut().print(thespecial_groupHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

