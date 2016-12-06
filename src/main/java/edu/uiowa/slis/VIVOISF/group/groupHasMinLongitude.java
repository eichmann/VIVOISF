package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupHasMinLongitudeIterator thegroup = (groupHasMinLongitudeIterator)findAncestorWithClass(this, groupHasMinLongitudeIterator.class);
			pageContext.getOut().print(thegroup.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing group for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

