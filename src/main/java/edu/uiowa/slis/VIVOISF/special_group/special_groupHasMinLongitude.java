package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupHasMinLongitudeIterator thespecial_group = (special_groupHasMinLongitudeIterator)findAncestorWithClass(this, special_groupHasMinLongitudeIterator.class);
			pageContext.getOut().print(thespecial_group.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

