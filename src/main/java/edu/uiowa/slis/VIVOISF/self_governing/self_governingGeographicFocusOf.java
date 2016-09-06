package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingGeographicFocusOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingGeographicFocusOf currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingGeographicFocusOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingGeographicFocusOfIterator theself_governingGeographicFocusOfIterator = (self_governingGeographicFocusOfIterator)findAncestorWithClass(this, self_governingGeographicFocusOfIterator.class);
			pageContext.getOut().print(theself_governingGeographicFocusOfIterator.getGeographicFocusOf());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

