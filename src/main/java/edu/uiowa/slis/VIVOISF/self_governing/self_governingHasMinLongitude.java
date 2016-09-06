package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingHasMinLongitudeIterator theself_governing = (self_governingHasMinLongitudeIterator)findAncestorWithClass(this, self_governingHasMinLongitudeIterator.class);
			pageContext.getOut().print(theself_governing.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

