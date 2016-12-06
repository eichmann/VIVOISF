package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupRO_0001025Iterator thespecial_groupRO_0001025Iterator = (special_groupRO_0001025Iterator)findAncestorWithClass(this, special_groupRO_0001025Iterator.class);
			pageContext.getOut().print(thespecial_groupRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

