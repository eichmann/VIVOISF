package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			special_groupLandAreaTotalIterator thespecial_group = (special_groupLandAreaTotalIterator)findAncestorWithClass(this, special_groupLandAreaTotalIterator.class);
			pageContext.getOut().print(thespecial_group.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

