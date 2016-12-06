package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupHasMaxLatitudeIterator thegroup = (groupHasMaxLatitudeIterator)findAncestorWithClass(this, groupHasMaxLatitudeIterator.class);
			pageContext.getOut().print(thegroup.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing group for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

