package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupBFO_0000050Iterator thespecial_groupBFO_0000050Iterator = (special_groupBFO_0000050Iterator)findAncestorWithClass(this, special_groupBFO_0000050Iterator.class);
			pageContext.getOut().print(thespecial_groupBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

