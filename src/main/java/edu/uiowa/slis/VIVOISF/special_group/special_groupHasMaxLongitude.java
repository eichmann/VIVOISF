package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupHasMaxLongitudeIterator thespecial_group = (special_groupHasMaxLongitudeIterator)findAncestorWithClass(this, special_groupHasMaxLongitudeIterator.class);
			pageContext.getOut().print(thespecial_group.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

