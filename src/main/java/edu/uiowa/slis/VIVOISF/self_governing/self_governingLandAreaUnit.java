package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingLandAreaUnitIterator theself_governing = (self_governingLandAreaUnitIterator)findAncestorWithClass(this, self_governingLandAreaUnitIterator.class);
			pageContext.getOut().print(theself_governing.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

