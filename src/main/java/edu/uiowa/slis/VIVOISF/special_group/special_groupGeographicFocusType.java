package edu.uiowa.slis.VIVOISF.special_group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class special_groupGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static special_groupGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(special_groupGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			special_groupGeographicFocusIterator thespecial_groupGeographicFocusIterator = (special_groupGeographicFocusIterator)findAncestorWithClass(this, special_groupGeographicFocusIterator.class);
			pageContext.getOut().print(thespecial_groupGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing special_group for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing special_group for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

