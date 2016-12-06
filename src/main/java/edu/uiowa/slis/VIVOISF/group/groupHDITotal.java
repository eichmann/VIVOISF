package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupHDITotalIterator thegroup = (groupHDITotalIterator)findAncestorWithClass(this, groupHDITotalIterator.class);
			pageContext.getOut().print(thegroup.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing group for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

