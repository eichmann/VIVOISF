package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingGeographicFocusOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingGeographicFocusOf currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingGeographicFocusOf.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingGeographicFocusOfIterator theself_governing = (self_governingGeographicFocusOfIterator)findAncestorWithClass(this, self_governingGeographicFocusOfIterator.class);
			pageContext.getOut().print(theself_governing.getGeographicFocusOf());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for geographicFocusOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for geographicFocusOf tag ");
		}
		return SKIP_BODY;
	}
}

