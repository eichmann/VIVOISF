package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupHasMaxLongitudeIterator thegroup = (groupHasMaxLongitudeIterator)findAncestorWithClass(this, groupHasMaxLongitudeIterator.class);
			pageContext.getOut().print(thegroup.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing group for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

