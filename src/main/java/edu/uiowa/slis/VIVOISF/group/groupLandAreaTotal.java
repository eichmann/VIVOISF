package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(groupLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupLandAreaTotalIterator thegroup = (groupLandAreaTotalIterator)findAncestorWithClass(this, groupLandAreaTotalIterator.class);
			pageContext.getOut().print(thegroup.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing group for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

