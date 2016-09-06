package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingHasMaxLatitudeIterator theself_governing = (self_governingHasMaxLatitudeIterator)findAncestorWithClass(this, self_governingHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theself_governing.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

