package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Non_self_governingLandAreaUnitIterator theNon_self_governing = (Non_self_governingLandAreaUnitIterator)findAncestorWithClass(this, Non_self_governingLandAreaUnitIterator.class);
			pageContext.getOut().print(theNon_self_governing.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

