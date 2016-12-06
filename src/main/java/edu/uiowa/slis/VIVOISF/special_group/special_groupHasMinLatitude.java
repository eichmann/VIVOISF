package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupHasMinLatitudeIterator thespecial_group = (special_groupHasMinLatitudeIterator)findAncestorWithClass(this, special_groupHasMinLatitudeIterator.class);
			pageContext.getOut().print(thespecial_group.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

