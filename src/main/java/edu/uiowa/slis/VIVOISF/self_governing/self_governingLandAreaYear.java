package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingLandAreaYearIterator theself_governing = (self_governingLandAreaYearIterator)findAncestorWithClass(this, self_governingLandAreaYearIterator.class);
			pageContext.getOut().print(theself_governing.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

