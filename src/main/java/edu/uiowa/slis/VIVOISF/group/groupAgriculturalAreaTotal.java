package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(groupAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupAgriculturalAreaTotalIterator thegroup = (groupAgriculturalAreaTotalIterator)findAncestorWithClass(this, groupAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(thegroup.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing group for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

