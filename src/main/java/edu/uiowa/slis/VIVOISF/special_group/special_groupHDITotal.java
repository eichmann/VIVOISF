package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupHDITotalIterator thespecial_group = (special_groupHDITotalIterator)findAncestorWithClass(this, special_groupHDITotalIterator.class);
			pageContext.getOut().print(thespecial_group.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

