package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingLandAreaTotalIterator theself_governing = (self_governingLandAreaTotalIterator)findAncestorWithClass(this, self_governingLandAreaTotalIterator.class);
			pageContext.getOut().print(theself_governing.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

