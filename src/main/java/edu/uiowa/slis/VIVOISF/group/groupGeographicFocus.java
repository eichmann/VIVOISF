package edu.uiowa.slis.VIVOISF.group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class groupGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static groupGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(groupGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			groupGeographicFocusIterator thegroupGeographicFocusIterator = (groupGeographicFocusIterator)findAncestorWithClass(this, groupGeographicFocusIterator.class);
			pageContext.getOut().print(thegroupGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing group for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing group for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

