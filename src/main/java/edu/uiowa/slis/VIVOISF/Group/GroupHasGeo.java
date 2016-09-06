package edu.uiowa.slis.VIVOISF.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupHasGeo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GroupHasGeo currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupHasGeo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GroupHasGeoIterator theGroupHasGeoIterator = (GroupHasGeoIterator)findAncestorWithClass(this, GroupHasGeoIterator.class);
			pageContext.getOut().print(theGroupHasGeoIterator.getHasGeo());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for hasGeo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for hasGeo tag ");
		}
		return SKIP_BODY;
	}
}

