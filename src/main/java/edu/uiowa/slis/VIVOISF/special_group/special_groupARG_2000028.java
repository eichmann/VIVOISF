package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupARG_2000028Iterator thespecial_groupARG_2000028Iterator = (special_groupARG_2000028Iterator)findAncestorWithClass(this, special_groupARG_2000028Iterator.class);
			pageContext.getOut().print(thespecial_groupARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

