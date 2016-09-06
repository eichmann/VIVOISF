package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingHasMinLatitudeIterator theself_governing = (self_governingHasMinLatitudeIterator)findAncestorWithClass(this, self_governingHasMinLatitudeIterator.class);
			pageContext.getOut().print(theself_governing.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

