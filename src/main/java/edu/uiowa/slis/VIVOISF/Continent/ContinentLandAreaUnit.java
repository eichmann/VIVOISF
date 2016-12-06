package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentLandAreaUnitIterator theContinent = (ContinentLandAreaUnitIterator)findAncestorWithClass(this, ContinentLandAreaUnitIterator.class);
			pageContext.getOut().print(theContinent.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

