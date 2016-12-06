package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupRO_0002234Iterator thespecial_groupRO_0002234Iterator = (special_groupRO_0002234Iterator)findAncestorWithClass(this, special_groupRO_0002234Iterator.class);
			pageContext.getOut().print(thespecial_groupRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

