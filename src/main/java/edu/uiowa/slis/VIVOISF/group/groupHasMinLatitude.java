package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(groupHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			groupHasMinLatitudeIterator thegroup = (groupHasMinLatitudeIterator)findAncestorWithClass(this, groupHasMinLatitudeIterator.class);
			pageContext.getOut().print(thegroup.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing group for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

