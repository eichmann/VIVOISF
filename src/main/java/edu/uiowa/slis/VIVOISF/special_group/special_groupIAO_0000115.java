package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupIAO_0000115 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupIAO_0000115 currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupIAO_0000115.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupIAO_0000115Iterator thespecial_group = (special_groupIAO_0000115Iterator)findAncestorWithClass(this, special_groupIAO_0000115Iterator.class);
			pageContext.getOut().print(thespecial_group.getIAO_0000115());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for IAO_0000115 tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for IAO_0000115 tag ");
		}
		return SKIP_BODY;
	}
}

