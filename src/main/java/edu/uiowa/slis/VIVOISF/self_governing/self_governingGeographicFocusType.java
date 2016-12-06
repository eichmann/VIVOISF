package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingGeographicFocusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingGeographicFocusType currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingGeographicFocusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingGeographicFocusIterator theself_governingGeographicFocusIterator = (self_governingGeographicFocusIterator)findAncestorWithClass(this, self_governingGeographicFocusIterator.class);
			pageContext.getOut().print(theself_governingGeographicFocusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

