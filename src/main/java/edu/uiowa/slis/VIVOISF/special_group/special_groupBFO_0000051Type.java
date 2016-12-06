package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupBFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupBFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupBFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupBFO_0000051Iterator thespecial_groupBFO_0000051Iterator = (special_groupBFO_0000051Iterator)findAncestorWithClass(this, special_groupBFO_0000051Iterator.class);
			pageContext.getOut().print(thespecial_groupBFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

