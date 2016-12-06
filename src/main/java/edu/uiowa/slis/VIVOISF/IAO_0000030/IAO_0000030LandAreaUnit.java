package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030LandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030LandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030LandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030LandAreaUnitIterator theIAO_0000030 = (IAO_0000030LandAreaUnitIterator)findAncestorWithClass(this, IAO_0000030LandAreaUnitIterator.class);
			pageContext.getOut().print(theIAO_0000030.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

