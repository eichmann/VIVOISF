package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupHasMaxLatitudeIterator thespecial_group = (special_groupHasMaxLatitudeIterator)findAncestorWithClass(this, special_groupHasMaxLatitudeIterator.class);
			pageContext.getOut().print(thespecial_group.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

