package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			non_self_governingLandAreaUnitIterator thenon_self_governing = (non_self_governingLandAreaUnitIterator)findAncestorWithClass(this, non_self_governingLandAreaUnitIterator.class);
			pageContext.getOut().print(thenon_self_governing.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

