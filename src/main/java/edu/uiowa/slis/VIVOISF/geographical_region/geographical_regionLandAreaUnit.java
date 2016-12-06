package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionLandAreaUnitIterator thegeographical_region = (geographical_regionLandAreaUnitIterator)findAncestorWithClass(this, geographical_regionLandAreaUnitIterator.class);
			pageContext.getOut().print(thegeographical_region.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

